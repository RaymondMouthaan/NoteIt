package org.mouthaan.noteit.api;

/*
Requests can be tested using the built in HTTP Rest Client. Use the
examples found in 'noteit.http' file.
 */

import org.mouthaan.noteit.Mapper;
import org.mouthaan.noteit.api.viewmodel.NotebookViewModel;
import org.mouthaan.noteit.db.NotebookRepository;
import org.mouthaan.noteit.model.Notebook;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.ValidationException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/notebooks")
@CrossOrigin
public class NotebookController {
    private NotebookRepository notebookRepository;
    private Mapper mapper;

    public NotebookController(NotebookRepository notebookRepository, Mapper mapper) {
        this.notebookRepository = notebookRepository;
        this.mapper = mapper;
    }

    @GetMapping("/all")
    public List<Notebook> all() {
        var allCategories = this.notebookRepository.findAll();
        return allCategories;
    }

    @PostMapping
    public Notebook save(@RequestBody NotebookViewModel notebookViewModel, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ValidationException();
        }

        var notebookEntity = this.mapper.convertToNotebookEntity(notebookViewModel);

        // save notebook instance to db
        this.notebookRepository.save(notebookEntity);

        return notebookEntity;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        this.notebookRepository.deleteById(UUID.fromString(id));
    }
}
