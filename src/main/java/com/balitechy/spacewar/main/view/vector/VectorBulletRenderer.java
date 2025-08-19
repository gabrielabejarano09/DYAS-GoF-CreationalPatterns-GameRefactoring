package com.balitechy.spacewar.main.view.vector;

import java.awt.Color;
import java.awt.Graphics;

import com.balitechy.spacewar.main.view.Interfaces.BulletState;
import com.balitechy.spacewar.main.view.Interfaces.IBulletRender;

public class VectorBulletRenderer implements IBulletRender {
    @Override
    public void render(Graphics g, BulletState s) {
        g.setColor(Color.BLACK);
        int x = (int) s.getX(), y = (int) s.getY();
        g.drawLine(x, y, x, y + s.getHeight());
    }
}