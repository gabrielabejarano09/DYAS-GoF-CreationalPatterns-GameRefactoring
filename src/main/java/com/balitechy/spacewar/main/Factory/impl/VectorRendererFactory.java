package com.balitechy.spacewar.main.Factory.impl;

import com.balitechy.spacewar.main.Factory.GameRenderFactory;
import com.balitechy.spacewar.main.view.Interfaces.*;
import com.balitechy.spacewar.main.view.vector.*;

public class VectorRendererFactory implements GameRenderFactory {
    @Override 
    public IPlayerRender createPlayerRenderer(){ return new VectorPlayerRenderer(); }
    @Override 
    public IBulletRender createBulletRenderer(){ return new VectorBulletRenderer(); }
    @Override 
    public IBackgroundRender createBackgroundRenderer(){ return new VectorBackgroundRenderer(); }
}

