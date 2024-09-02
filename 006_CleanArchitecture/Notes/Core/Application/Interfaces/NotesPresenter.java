package Notes.Core.Application.Interfaces;

import java.util.Collection;

import Notes.Core.Domain.Note;

public interface NotesPresenter {

    void printAll(Collection<Note> notes);
}
