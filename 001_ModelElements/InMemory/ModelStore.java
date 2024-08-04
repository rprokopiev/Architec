import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {

    private List<ModelChangeObserver> observers = new ArrayList<>();

    private List<PoligonalModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    
    public List<Scene> getScenes() {
        return scenes;
    }

    public Scene getScena(int id){
        Scene result = new Scene();
        for (Scene scene : scenes) {
            if (id == scene.getId()){
                result = scene;
            }
        }
        return result;
    }

    public void add(PoligonalModel model){
        models.add(model);
        notifyChange();
    }
    
    @Override
    public void notifyChange() {
        for (ModelChangeObserver observer: observers){
            observer.applyUpdateModel();
        }        
    }

    @Override
    public void RegisterModelChanger(ModelChangeObserver o) {
        observers.add(o);        
    }

    @Override
    public void RemovalModelChanger(ModelChangeObserver o) {
        observers.remove(0);        
    }
    
    
}
