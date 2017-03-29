package com.rashi.mediaplayerdemo;

/**
 * Created by Admin on 28-03-2017.
 */

public class FilesBean {

    int image;
    String title;

    public FilesBean() {
    }

    public FilesBean(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
