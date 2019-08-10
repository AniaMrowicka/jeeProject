package dto;

import model.NotesType;

import java.time.LocalDateTime;

public class ItemDTO {
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
    public String toString() {
        return "ItemDTO{" +
                "id=" + id +
                ", type=" + type +
                ", creationDate=" + creationDate +
                ", modificationDate=" + modificationDate +
                ", content='" + content + '\'' +
                '}';
    }
}
