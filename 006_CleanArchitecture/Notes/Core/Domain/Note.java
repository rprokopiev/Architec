package Notes.Core.Domain;

import java.util.Date;

public class Note {

    @Override
    public String toString() {
        return "Note [id=" + id + ", title=" + title + ", details=" + details + "]";
    }
    //region Contructors
    public Note(int id, int userId, String title, String details, Date creationDate) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.details = details;
        this.creationDate = creationDate;
    }
    //endregion

    //region Private Fields
    private int id;
    private int userId;
    private String title;
    private String details;
    private Date creationDate;
    private Date editDate;
    //endregion

    //region Public Getters and Setters (Properties)
    public int getId() {
        return id;
    }
    public int getUserId() {
        return userId;
    }
    public String getTitle() {
        return title;
    }
    public String getDetails() {
        return details;
    }
    public Date getCreationDate() {
        return creationDate;
    }
    public Date getEditDate() {
        return editDate;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }
    //endregion
    

    

}
