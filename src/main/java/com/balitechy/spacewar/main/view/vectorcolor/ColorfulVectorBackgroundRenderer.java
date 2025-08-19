package com.balitechy.spacewar.main.view.vectorcolor;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import com.balitechy.spacewar.main.view.Interfaces.IBackgroundRender;

public class ColorfulVectorBackgroundRenderer implements IBackgroundRender {
    private final Random rnd = new Random();

    @Override
    public void render(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        // Gradiente espacial
        g2.setPaint(new GradientPaint(0,0, new Color(10,10,30), 0,600, new Color(0,0,0)));
        g2.fillRect(0, 0, 2000, 2000);

        // Planeta
        g2.setColor(new Color(120,120,200));
        g2.fillOval(40, 40, 140, 140);
        g2.setColor(new Color(200,200,255));
        g2.drawOval(40, 40, 140, 140);

        // Estrellas
        g2.setColor(new Color(255,255,200));
        for (int i=0;i<120;i++){
            int x = 20 + rnd.nextInt(760);
            int y = 20 + rnd.nextInt(560);
            g2.fillRect(x, y, 2, 2);
        }
    }
}