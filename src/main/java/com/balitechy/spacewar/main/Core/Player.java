package com.balitechy.spacewar.main.Core;

import java.awt.Graphics;
import com.balitechy.spacewar.main.view.Interfaces.*;


public class Player {
    public static final int WIDTH = 56;
    public static final int HEIGHT = 28;

    private double x, y, velX, velY;
    private final IPlayerRender renderer;
    private final BulletController bullets;

    public Player(double x, double y, BulletController bullets, IPlayerRender renderer){
        this.x = x; this.y = y;
        this.bullets = bullets;
        this.renderer = renderer;
    }

    public void tick(){
        x += velX; y += velY;
    }

    public void render(Graphics g){
        renderer.render(g, new PlayerState(x, y, WIDTH, HEIGHT));
    }

    public void shoot(){
        double bx = x + (WIDTH/2.0) - 3;
        double by = y - 18;
        bullets.addBullet(bx, by);
    }

    // getters/setters básicos
    public void setVelX(double v){ this.velX = v; }
    public void setVelY(double v){ this.velY = v; }
    public double getX(){ return x; }
    public double getY(){ return y; }
}
