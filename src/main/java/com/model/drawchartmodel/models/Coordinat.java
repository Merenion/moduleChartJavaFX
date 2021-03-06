package com.model.drawchartmodel.models;

public class Coordinat {

    private float x;
    private float y;

    public Coordinat(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "["+getX()+";"+getY()+"]";
    }
}
