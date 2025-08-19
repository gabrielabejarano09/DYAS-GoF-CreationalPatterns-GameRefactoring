package com.balitechy.spacewar.main.view.sprite;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import com.balitechy.spacewar.main.view.Interfaces.IPlayerRender;
import com.balitechy.spacewar.main.view.Interfaces.PlayerState;

public class SpritePlayerRenderer implements IPlayerRender {
    private final BufferedImage playerImg;

    public SpritePlayerRenderer() {
        try {
            SpritesImageLoader loader = new SpritesImageLoader("sprites.png");
            loader.loadImage();
            playerImg = loader.getImage(210, 300, 70, 52);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo cargar el sprite del player", e);
        }
    }

    @Override
    public void render(Graphics g, PlayerState s) {
        g.drawImage(playerImg, (int)s.getX(), (int)s.getY(), null);
    }
}
