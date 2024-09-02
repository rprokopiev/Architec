package Notes.Core.Application;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import Notes.Core.Application.Interfaces.NoteEditor;
import Notes.Core.Application.Interfaces.NotesDatabaseContext;
import Notes.Core.Application.Interfaces.NotesPresenter;
import Notes.Core.Domain.Note;

public class ConcreteNoteEditor implements NoteEditor{
    
    private final NotesDatabaseContext dbContext;  
    private final NotesPresenter notesPresenter;  

    public ConcreteNoteEditor(NotesDatabaseContext dbContext, NotesPresenter notesPresenter) {
        this.dbContext = dbContext;
        this.notesPresenter = notesPresenter;
    }

    @Override
    public void printAll() {
        notesPresenter.printAll(getAll());
    }

    @Override
    public boolean add(Note item) {
        dbContext.getAll().add(item);
        return dbContext.saveChanges();
    }

    @Override
    public boolean edit(Note item) {
        if (item == null){
            return false;
        }
        Optional<Note> note = getById((item.getId()));
        if (note.isEmpty()){
            return false;
        }
        note.get().setTitle(item.getTitle());
        note.get().setDetails(item.getDetails());
        note.get().setEditDate(new Date());
        return dbContext.saveChanges();
    }

    @Override
    public Collection<Note> getAll() {
        return dbContext.getAll();
    }

    @Override
    public Optional<Note> getById(Integer id) {
        // return dbContext.getAll().stream().filter(p -> p.getAll() == id).findFirst();
        return null;
    }

    @Override
    public boolean remove(Note item) {
        dbContext.getAll().remove(item);
        return dbContext.saveChanges();
    }

    

}
