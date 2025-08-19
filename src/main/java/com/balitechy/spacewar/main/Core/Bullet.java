package com.balitechy.spacewar.main.Core;

import java.awt.Graphics;
import com.balitechy.spacewar.main.view.Interfaces.*;


public class Bullet {
    public static final int WIDTH = 6;
    public static final int HEIGHT = 12;

    private double x, y, velY = -6.0;
    private final IBulletRender renderer;

    public Bullet(double x, double y, IBulletRender renderer){
        this.x = x; this.y = y; this.renderer = renderer;
    }

    public void tick(){ y += velY; }

    public void render(Graphics g){
        renderer.render(g, new BulletState(x, y, WIDTH, HEIGHT));
    }

    public boolean isVisible(){ return y + HEIGHT > 0; }
}
