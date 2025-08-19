package com.balitechy.spacewar.main.Factory.impl;

import com.balitechy.spacewar.main.Factory.GameRenderFactory;
import com.balitechy.spacewar.main.view.Interfaces.*;
import com.balitechy.spacewar.main.view.vectorcolor.*;

public class ColorfulVectorRendererFactory implements GameRenderFactory {
    @Override 
    public IPlayerRender createPlayerRenderer(){ return new ColorfulVectorPlayerRenderer(); }
    @Override 
    public IBulletRender createBulletRenderer(){ return new ColorfulVectorBulletRenderer(); }
    @Override public IBackgroundRender
    createBackgroundRenderer(){ return new ColorfulVectorBackgroundRenderer(); }
}