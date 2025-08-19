package com.balitechy.spacewar.main.view.vector;

import java.awt.Color;
import java.awt.Graphics;
import com.balitechy.spacewar.main.view.Interfaces.IPlayerRender;
import com.balitechy.spacewar.main.view.Interfaces.PlayerState;

public class VectorPlayerRenderer implements IPlayerRender {
    @Override
    public void render(Graphics g, PlayerState s) {
        g.setColor(Color.BLACK);
        int x = (int) s.getX(), y = (int) s.getY();
        int[] xs = { x, x + 12, x - 12 };
        int[] ys = { y - 18, y + 18, y + 18 };
        g.drawPolygon(xs, ys, 3);
        g.drawLine(x, y + 18, x, y + 10);
    }
}