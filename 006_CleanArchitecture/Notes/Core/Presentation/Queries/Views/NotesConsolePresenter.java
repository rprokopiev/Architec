package Notes.Core.Presentation.Queries.Views;

import java.util.Collection;

import Notes.Core.Application.Interfaces.NotesPresenter;
import Notes.Core.Domain.Note;

public class NotesConsolePresenter implements NotesPresenter{

    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note : notes) {
            System.out.println(note);
        }
        
    }

    

}
