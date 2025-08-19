package com.balitechy.spacewar.main.view.sprite;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.balitechy.spacewar.main.view.Interfaces.BulletState;
import com.balitechy.spacewar.main.view.Interfaces.IBulletRender;

public class SpriteBulletRenderer implements IBulletRender {

    private final BufferedImage bulletImg;

    public SpriteBulletRenderer() {
        try {
            SpritesImageLoader loader = new SpritesImageLoader("sprites.png");
            loader.loadImage();
            bulletImg = loader.getImage(35, 52, 6, 12);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo cargar el sprite de la bala", e);
        }
    }

    @Override
    public void render(Graphics g, BulletState s) {
        g.drawImage(bulletImg, (int) s.getX(), (int) s.getY(), null);
    }
}