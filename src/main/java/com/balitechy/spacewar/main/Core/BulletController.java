package com.balitechy.spacewar.main.Core;


import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import com.balitechy.spacewar.main.view.Interfaces.IBulletRender;

public class BulletController {
    private final List<Bullet> bullets = new ArrayList<>();
    private final IBulletRender bulletRenderer;

    public BulletController(IBulletRender bulletRenderer){
        this.bulletRenderer = bulletRenderer;
    }

    public void addBullet(double x, double y){
        bullets.add(new Bullet(x, y, bulletRenderer));
    }

    public void tick(){
        bullets.removeIf(b -> { b.tick(); return !b.isVisible(); });
    }

    public void render(Graphics g){
        for (Bullet b : bullets) b.render(g);
    }

    public List<Bullet> getBullets(){ return bullets; }
}
