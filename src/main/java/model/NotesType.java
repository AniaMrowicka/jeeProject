package model;

public enum NotesType {
    SCAN("scan"), PHOTO("photo"), NOTES("notes"), RECEIPT("receipt");

    public String name;

    NotesType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
