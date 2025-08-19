package com.balitechy.spacewar.main.view.vectorcolor;

import java.awt.Color;
import java.awt.Graphics;

import com.balitechy.spacewar.main.view.Interfaces.BulletState;
import com.balitechy.spacewar.main.view.Interfaces.IBulletRender;

public class ColorfulVectorBulletRenderer implements IBulletRender {
    @Override
    public void render(Graphics g, BulletState s) {
        int x = (int) s.getX(), y = (int) s.getY();
        g.setColor(new Color(255, 140, 0));
        g.fillRect(x - 2, y, 4, s.getHeight());
        g.setColor(new Color(255, 230, 100));
        g.drawRect(x - 2, y, 4, s.getHeight());
    }
}
