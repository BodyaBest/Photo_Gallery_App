package task.model;

import java.io.Serializable;

public class Image implements Serializable {

    private String picture;
    private String name;

    public Image() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Image(String name, String picture) {
        this.name = name;
        this.picture = picture;
    }
}