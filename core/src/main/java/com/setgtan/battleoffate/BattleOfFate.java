package com.setgtan.battleoffate;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.setgtan.battleoffate.screens.MainMenuScreen;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class BattleOfFate extends Game {

    public BitmapFont font;

    @Override
    public void create() {
        font = new BitmapFont();
        setScreen(new MainMenuScreen(this));
    }

    @Override
    public void dispose() {
        font.dispose();
        super.dispose();
    }
}
