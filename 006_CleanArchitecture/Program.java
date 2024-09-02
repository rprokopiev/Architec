import DataBase.NotesDatabase;
import Notes.Core.Application.ConcreteNoteEditor;
import Notes.Core.Infrastructure.Persistance.NotesDbContext;
import Notes.Core.Presentation.Queries.Controllers.NotesController;
import Notes.Core.Presentation.Queries.Views.NotesConsolePresenter;

public class Program {
    public static void main(String[] args) {
        NotesController controller = new NotesController(
            new ConcreteNoteEditor(
                new NotesDbContext(new NotesDatabase()), 
                new NotesConsolePresenter()
            ));
        controller.routeGetAll();
    }
}
