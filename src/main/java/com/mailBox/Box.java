package com.mailBox;

public class Box {
    float length;
    float width;
    int height;

    public Box(float length, float width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate(float length,  float width, int height) {
        boolean box = false;
        if (this.length >= length && this.width >= width && this.height >= height) {
            box = true;
        }
        return box;
    }



}
