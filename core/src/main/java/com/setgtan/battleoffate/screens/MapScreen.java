package com.setgtan.battleoffate.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.Align;
import com.setgtan.battleoffate.BattleOfFate;

public class MapScreen extends BaseScreen {

    private BattleOfFate game;


    public MapScreen(BattleOfFate game) {
        this.game = game;


        Label.LabelStyle titleStyle = new Label.LabelStyle();
        titleStyle.font = game.font;

        Label title = new Label("Your wacky walloping Map!!", titleStyle);
        title.setFontScale(3.2f);
        title.setAlignment(Align.center);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        viewport.apply();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        game.font.draw(batch, "Map screen, ts doesnt work", 350, 300);
        game.font.draw(batch, "Press ESC to return", 350, 200);
        batch.end();

        if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
            game.setScreen(new MainMenuScreen(game));
        }
    }
}
