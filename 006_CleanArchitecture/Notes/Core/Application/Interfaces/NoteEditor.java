package Notes.Core.Application.Interfaces;

import Notes.Core.Domain.Note;

/*
 * interfact for Note application only.
 */

public interface NoteEditor extends Editor<Note, Integer> {
/*
 * Instead of <T, TId> - Note specific agrument are shown. 
 * It allows to not overwrite all the Editor methods.
 */
    void printAll();

}
