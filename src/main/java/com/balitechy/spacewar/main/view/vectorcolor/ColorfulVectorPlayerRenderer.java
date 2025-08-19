package com.balitechy.spacewar.main.view.vectorcolor;
import java.awt.Color;
import java.awt.Graphics;

import com.balitechy.spacewar.main.view.Interfaces.IPlayerRender;
import com.balitechy.spacewar.main.view.Interfaces.PlayerState;

public class ColorfulVectorPlayerRenderer implements IPlayerRender {
    @Override
    public void render(Graphics g, PlayerState s) {
        int x = (int) s.getX(), y = (int) s.getY();
        int[] xs = { x, x + 12, x - 12 };
        int[] ys = { y - 18, y + 18, y + 18 };

        g.setColor(new Color(40, 180, 255));
        g.fillPolygon(xs, ys, 3);

        g.setColor(new Color(0, 60, 120));
        g.drawPolygon(xs, ys, 3);

        g.setColor(new Color(255, 220, 0));
        g.drawLine(x, y + 18, x, y + 10);
    }
}