import java.util.Collection;
/*
 * Интерфейс Business Logical Layer.
 */

public interface BusinessLogicalLayer {

    Collection<Model3D> getAllModels();

    Collection<Texture> getAllTextures();

    void renderModel(Model3D model);

    void renderAllModel();

}
