import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {

    private List<ModelChangeObserver> observers = new ArrayList<>();

    private List<PoligonalModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    
    
    public ModelStore(List<PoligonalModel> models, List<Flash> flashes, List<Scene> scenes, List<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.scenes = scenes;
        this.cameras = cameras;
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

    public List<ModelChangeObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<ModelChangeObserver> observers) {
        this.observers = observers;
    }

    public List<PoligonalModel> getModels() {
        return models;
    }

    public void setModels(List<PoligonalModel> models) {
        this.models = models;
    }

    public List<Flash> getFlashes() {
        return flashes;
    }

    public void setFlashes(List<Flash> flashes) {
        this.flashes = flashes;
    }

    public List<Scene> getScenes() {
        return scenes;
    }

    public void setScenes(List<Scene> scenes) {
        this.scenes = scenes;
    }

    public List<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(List<Camera> cameras) {
        this.cameras = cameras;
    }

    

    
}
