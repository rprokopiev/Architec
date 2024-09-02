package Notes.Core.Application.Interfaces;

import java.util.Collection;
import java.util.Optional;
/*
 * General inteface to fit the aim of various needs.
 */

public interface Editor<T, TId> {
    /*
     * T and TId - abstract arguments, to be speified in 
     * particular interfaces
     */

    boolean add(T item);
    boolean edit(T item);
    boolean remove(T item);
    
    Optional<T> getById(TId id);

    Collection<T> getAll();

}
