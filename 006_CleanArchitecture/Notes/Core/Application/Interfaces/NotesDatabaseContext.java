package Notes.Core.Application.Interfaces;

import java.util.Collection;

import Notes.Core.Domain.Note;

public interface NotesDatabaseContext {

    // to show all records
    Collection<Note> getAll();

    // saving changes made 
    boolean saveChanges();


}
