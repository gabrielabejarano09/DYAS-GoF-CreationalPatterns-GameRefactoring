package com.balitechy.spacewar.main.Factory;

import com.balitechy.spacewar.main.view.Interfaces.*;

public interface GameRenderFactory {

    IPlayerRender createPlayerRenderer();

    IBulletRender createBulletRenderer();

    IBackgroundRender createBackgroundRenderer();
}
