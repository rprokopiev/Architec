/*
 * DATABASE LAYER
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class EditorDatabase implements Database {

    private Random random = new Random();

    private final ProjectFile projectFile;
    private Collection<Entity> entities;
    

    public EditorDatabase(ProjectFile projectFile) {
        this.projectFile = projectFile;
        load();
    }

    @Override
    public void load() {
        // TODO загрузка всех сущностей проекта (моедли, текстуры и т.д.)
        
    }

    @Override
    public void save() {
        // TODO сохранение всех сущностей проекта (моедли, текстуры и т.д.)
        
    }

    public Collection<Entity> getAll(){
        if (entities == null){
            entities = new ArrayList<>();
            int entCount = random.nextInt(5,11);
            for (int i = 0; i< entCount; i++){
                generateModelAndTextures();
            }
        }
        return entities;
    }

    private void generateModelAndTextures(){
        Model3D model3d = new Model3D();
        int txCount = random.nextInt(3);
        for (int i=0; i<txCount; i++){
            Texture texture = new Texture();
            model3d.getTextures().add(texture);
            entities.add(texture);
        }
        entities.add(model3d);
    }

    
}
