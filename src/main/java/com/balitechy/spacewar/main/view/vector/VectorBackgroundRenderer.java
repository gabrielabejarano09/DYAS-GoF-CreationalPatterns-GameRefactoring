package com.balitechy.spacewar.main.view.vector;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import com.balitechy.spacewar.main.view.Interfaces.IBackgroundRender;

public class VectorBackgroundRenderer implements IBackgroundRender {
    private final Random rnd = new Random();

    @Override
    public void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 2000, 2000);
        g.setColor(Color.BLACK);
        // “Asteroide” simple
        g.drawOval(30, 30, 120, 120);
        // estrellas
        for (int i=0;i<80;i++){
            int x = 20 + rnd.nextInt(760);
            int y = 20 + rnd.nextInt(560);
            g.fillRect(x, y, 1, 1);
        }
    }
}

