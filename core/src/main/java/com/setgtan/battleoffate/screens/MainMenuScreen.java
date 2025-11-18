package com.setgtan.battleoffate.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.setgtan.battleoffate.BattleOfFate;

public class MainMenuScreen extends BaseScreen {

    private BattleOfFate game;

    public MainMenuScreen(BattleOfFate game) {
        this.game = game;
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        game.font.draw(batch, "Battle Of Fate", 350, 300);
        game.font.draw(batch, "Press ENTER to start training", 300, 200);
        batch.end();

        if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER)) {
            game.setScreen(new TrainingScreen(game));
        }
    }
}
