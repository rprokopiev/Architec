import java.util.Collection;

/*
 * Интерфейс DataAccessLayer
 */

public interface DatabaseAccess {

    void addEntity(Entity entity);
    void removeEntity(Entity entity);

    Collection<Texture> getAllTextures();
    Collection<Model3D> getAllModels();


}
