package Notes.Core.Presentation.Queries.Controllers;

import Notes.Core.Presentation.Queries.Views.Presenter;

public abstract class Controller {

    public <T extends Presenter> void view(T presener){
        
    }

}
