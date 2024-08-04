import java.util.List;


public class Scene {

    private static int counter = 10000;

    private int id;
    private List<PoligonalModel> models;
    private List<Flash> flashes;

    {
        id = ++counter;
    }

    public Scene() {
    }

    public Scene(List<PoligonalModel> models) {
        this.models = models;
    }
 
    public Scene(List<PoligonalModel> models, List<Flash> flashes) {
        this.models = models;
        this.flashes = flashes;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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

    
    
}
