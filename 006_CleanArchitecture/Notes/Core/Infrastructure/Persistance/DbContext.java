package Notes.Core.Infrastructure.Persistance;

public abstract class DbContext {

    protected Database database;

    public DbContext(Database database) {
        this.database = database;
    }

    protected abstract void onModelCreating(ModelBuilder builder);

    public boolean saveChanges() {
        // TODO: save changes in DB
        return true;
    }

}