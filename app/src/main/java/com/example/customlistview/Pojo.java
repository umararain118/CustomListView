package com.example.customlistview;

public class Pojo {

    private int image;
    private String title;
    private String description;

    public Pojo(int image, String title, String description){

        this.image =image;
        this.title = title;
        this.description = description;

    }

    public int getImage(){
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


