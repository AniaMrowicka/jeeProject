package dto;

import model.NotesType;

public class ItemCreateDto {
    private String content;
    private NotesType type;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public NotesType getType() {
        return type;
    }

    public void setType(NotesType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ItemCreateDto{" +
                "content='" + content + '\'' +
                ", type=" + type +
                '}';
    }
}
