import java.util.Date;

public class ItemModel {
 private int id;
 private String type;
 private Date creationDate;
 private Date modificationDate;
 private String content;

    public ItemModel(int id, String type, Date creationDate, Date modificationDate, String content) {
        this.id = id;
        this.type = type;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
