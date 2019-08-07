package model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="item")
public class ItemEntity {

    @Id
    @GeneratedValue
    @Column(name= "id_item", nullable = false)
    private Integer id;
    @Column(name="type")
    private NotesType type;
    @Column(name="creation_date", nullable = false)
    private LocalDateTime creationDate;
    @Column(name="modification_date", nullable = false)
    private LocalDateTime modificationDate;
    @Column(name="content")
    private String content;

    public ItemEntity() {
    }

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
}
