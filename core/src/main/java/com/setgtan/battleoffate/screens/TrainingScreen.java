package com.setgtan.battleoffate.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.setgtan.battleoffate.BattleOfFate;

public class TrainingScreen extends BaseScreen {

    private BattleOfFate game;

    public TrainingScreen(BattleOfFate game) {
        this.game = game;
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        game.font.draw(batch, "Training Area (WIP)", 350, 300);
        game.font.draw(batch, "Press ESC to return", 350, 200);
        batch.end();

        if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
            game.setScreen(new MainMenuScreen(game));
        }
    }
}
