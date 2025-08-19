package com.balitechy.spacewar.main.Factory.impl;

import com.balitechy.spacewar.main.Factory.GameRenderFactory;
import com.balitechy.spacewar.main.view.Interfaces.*;
import com.balitechy.spacewar.main.view.sprite.*;

public class SpriteRendererFactory implements GameRenderFactory {
    @Override
    public IPlayerRender createPlayerRenderer(){ return new SpritePlayerRenderer(); }

    @Override 
    public IBulletRender createBulletRenderer(){ return new SpriteBulletRenderer(); }
    @Override 
    public IBackgroundRender createBackgroundRenderer(){ return new BitmapBackgroundRenderer(); }
}