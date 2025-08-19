package com.balitechy.spacewar.main.view.sprite;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Dimension;

import com.balitechy.spacewar.main.view.Interfaces.IBackgroundRender;

public class BitmapBackgroundRenderer implements IBackgroundRender {
    private final Image bg = SpritesImageLoader.load("/bg.png");

    @Override
    public void render(Graphics g) {
        // Escala simple al tamaño del canvas
        Dimension d = g.getClipBounds() != null ? g.getClipBounds().getSize() : new Dimension(800,600);
        g.drawImage(bg, 0, 0, d.width, d.height, null);
    }
}