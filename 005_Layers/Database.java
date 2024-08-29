/*
 * Data base interface
 */

import java.util.Collection;

public interface Database {

    void load();

    void save();

    Collection<Entity> getAll();

}
