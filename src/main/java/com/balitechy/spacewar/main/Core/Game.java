package com.balitechy.spacewar.main.Core;


import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;

import com.balitechy.spacewar.main.Factory.GameRenderFactory;
import com.balitechy.spacewar.main.Factory.impl.ColorfulVectorRendererFactory;
import com.balitechy.spacewar.main.Factory.impl.SpriteRendererFactory;
import com.balitechy.spacewar.main.Factory.impl.VectorRendererFactory;
import com.balitechy.spacewar.main.view.Interfaces.IBackgroundRender;

public class Game extends Canvas implements Runnable {
    private Thread thread;
    private volatile boolean running = false;

    private final GameRenderFactory factory;
    private Player player;
    private BulletController bullets;
    private IBackgroundRender background;

    public Game(GameRenderFactory factory){
        this.factory = factory;
        init();
    }

    private void init(){
        bullets = new BulletController(factory.createBulletRenderer());
        player = new Player(300, 520, bullets, factory.createPlayerRenderer());
        background = factory.createBackgroundRenderer();

        addKeyListener(new InputHandler(player));
        setFocusable(true);
    }

    public synchronized void start(){
        if (running) return;
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop(){
        running = false;
        try { thread.join(); } catch (InterruptedException ignored) {}
    }

    @Override
    public void run(){
        JFrame frame = new JFrame("Space War 2D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        requestFocus();

        while (running){
            tick();
            render();
            try { Thread.sleep(16); } catch (InterruptedException ignored) {}
        }
    }

    private void tick(){
        player.tick();
        bullets.tick();
    }

    private void render(){
        BufferStrategy bs = getBufferStrategy();
        if (bs == null){ createBufferStrategy(3); return; }
        Graphics g = bs.getDrawGraphics();
        background.render(g);
        player.render(g);
        bullets.render(g);
        g.dispose();
        bs.show();
    }

    public static void main(String[] args) {
        GameRenderFactory factory = new SpriteRendererFactory();
        //GameRenderFactory factory = new VectorRendererFactory();
        //GameRenderFactory factory = new ColorfulVectorRendererFactory();
        new Game(factory).start();
    }
}
