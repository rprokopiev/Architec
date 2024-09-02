package Notes.Core.Infrastructure.Persistance;

import java.util.ArrayList;
import java.util.Collection;

import DataBase.NotesDatabase;
import DataBase.NotesRecord;
import Notes.Core.Application.Interfaces.NotesDatabaseContext;
import Notes.Core.Domain.Note;
import Notes.Core.Infrastructure.Persistance.Configurations.NoteConfiguration;

public class NotesDbContext extends DbContext implements NotesDatabaseContext{

    public NotesDbContext(Database database){
        super(database);
    }

    

    @Override
    public Collection<Note> getAll() {
        Collection<Note> notesList = new ArrayList<>();
        for (NotesRecord record : ((NotesDatabase)database).getNotesTable().getNotesRecords()) {
            notesList.add(new Note(
                record.getId(), 
                record.getUserId(), 
                record.getTitle(), 
                record.getDetails(), 
                record.getCreationDate()
            ));
            
        }
        return notesList;
    }



    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
        
    }

    

}
