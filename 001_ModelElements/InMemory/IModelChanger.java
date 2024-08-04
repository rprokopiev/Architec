

public interface IModelChanger {

    // Notifies about the change
    void notifyChange();

    void RegisterModelChanger(ModelChangeObserver o);

    void RemovalModelChanger(ModelChangeObserver o);

}
