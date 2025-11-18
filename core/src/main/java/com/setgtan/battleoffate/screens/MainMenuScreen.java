package com.setgtan.battleoffate.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.setgtan.battleoffate.BattleOfFate;

public class MainMenuScreen extends BaseScreen {

    private BattleOfFate game;
    private GlyphLayout layout = new GlyphLayout();

    public MainMenuScreen(BattleOfFate game) {
        this.game = game;
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        viewport.apply();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();

        String title = "Battle Of Fate";
        layout.setText(game.font, title);

        float x = (1280 - layout.width) / 2;
        float y = 500;

        game.font.draw(batch, title, x, y);
        game.font.draw(batch, "Press ENTER to start training", 300, 200);
        batch.end();

        if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER)) {
            game.setScreen(new TrainingScreen(game));
        }
    }
}
