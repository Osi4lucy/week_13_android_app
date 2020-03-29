package com.solomon.imagerecyclerapp.dataStorage;

public class ImageStorage {
    public String [] title;
    public String [] description;
    public int [] images;

    public ImageStorage(String[] title, String[] description, int[] images) {
        this.title = title;
        this.description = description;
        this.images = images;
    }
}