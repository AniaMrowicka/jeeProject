package model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class ItemModel {
    private Integer id;
    private NotesType type;
    private LocalDateTime creationDate;
    private LocalDateTime modificationDate;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NotesType getType() {
        return type;
    }

    public void setType(NotesType type) {
        this.type = type;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(LocalDateTime modificationDate) {
        this.modificationDate = modificationDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemModel)) return false;
        ItemModel itemModel = (ItemModel) o;
        return id.equals(itemModel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}