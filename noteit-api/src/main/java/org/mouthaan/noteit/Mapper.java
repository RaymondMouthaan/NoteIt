package org.mouthaan.noteit;

import org.mouthaan.noteit.api.viewmodel.NoteViewModel;
import org.mouthaan.noteit.api.viewmodel.NotebookViewModel;
import org.mouthaan.noteit.db.NotebookRepository;
import org.mouthaan.noteit.model.Note;
import org.mouthaan.noteit.model.Notebook;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Component that handles all mappings in this project
 * - entity to view model
 * - view model to entity
 * <p>
 * All mappings are handled here, but in production code this is not the
 * best approach. You can take a look at ModelMapper project or at least split mapping classes
 * across many files.
 */

@Component
public class Mapper {
    private NotebookRepository notebookRepository;

    public Mapper(NotebookRepository notebookRepository) {
        this.notebookRepository = notebookRepository;
    }

    public NoteViewModel convertToNoteViewModel(Note entity) {
        NoteViewModel viewModel = new NoteViewModel();
        viewModel.setTitle(entity.getTitle());
        viewModel.setId(entity.getId().toString());
        viewModel.setLastModifiedOn(entity.getLastModifiedOn());
        viewModel.setText(entity.getText());
        viewModel.setNotebookId(entity.getNotebookId());

        return viewModel;
    }

    public Note convertToNoteEntity(NoteViewModel viewModel) {
        Notebook notebook = this.notebookRepository.findById(UUID.fromString(viewModel.getNotebookId())).get();
        Note entity = new Note(viewModel.getId(), viewModel.getTitle(), viewModel.getText(), notebook);

        return entity;
    }

    public NotebookViewModel convertToNotebookViewModel(Notebook entity) {
        NotebookViewModel viewModel = new NotebookViewModel();
        viewModel.setId(entity.getId().toString());
        viewModel.setName(entity.getName());
        viewModel.setNumberOfNotes(entity.getNumberOfNotes());

        return viewModel;
    }

    public Notebook convertToNotebookEntity(NotebookViewModel viewModel) {
        Notebook entity = new Notebook(viewModel.getId(), viewModel.getName());

        return entity;
    }
}
