package org.mouthaan.noteit.api.viewmodel;

import javax.validation.constraints.NotNull;

public class NotebookViewModel {

    private String id;

    @NotNull
    private String name;

    private int numberOfNotes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfNotes() {
        return numberOfNotes;
    }

    public void setNumberOfNotes(int numberOfNotes) {
        this.numberOfNotes = numberOfNotes;
    }
}
