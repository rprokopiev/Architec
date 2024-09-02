package DataBase;

import Notes.Core.Infrastructure.Persistance.Database;

public class NotesDatabase implements Database{

    private NotesTable notesTable = new NotesTable();

    public NotesTable getNotesTable() {
        if (notesTable == null){
            notesTable = new NotesTable();
        }
        return notesTable;
    }

}
