package com.balitechy.spacewar.main.view.Interfaces;

public class BulletState {
    private final double x, y;
    private final int width, height; 

    public BulletState(double x, double y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
}
