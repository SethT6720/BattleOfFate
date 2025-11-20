package com.setgtan.battleoffate.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.Align;
import com.setgtan.battleoffate.BattleOfFate;

public class MainMenuScreen extends BaseScreen {

    private BattleOfFate game;

    public MainMenuScreen(BattleOfFate game) {
        this.game = game;

        Label.LabelStyle titleStyle = new Label.LabelStyle();
        titleStyle.font = game.font;

        Label title = new Label("Battle Of Fate", titleStyle);
        title.setFontScale(2.2f);
        title.setAlignment(Align.center);


        TextButton startButton = new TextButton("Start Training", skin);
        TextButton settingsButton = new TextButton("Settings", skin);
        TextButton quitButton = new TextButton("Quit", skin);
        TextButton mapButton = new TextButton("Map", skin);

        startButton.addListener(event -> {
           if (startButton.isPressed()) {
               game.setScreen(new TrainingScreen(game));
           }
           return false;
        });

        mapButton.addListener(event -> {
            if (mapButton.isPressed()) {
                game.setScreen(new MapScreen(game));
            }
            return false;
        });


        quitButton.addListener(event -> {
            if (quitButton.isPressed()) {
                Gdx.app.exit();
            }
            return false;
        });

        table.add(title).padBottom(40).row();
        table.add(startButton).width(300).height(60).padBottom(15).row();
        table.add(mapButton).width(300).height(60).padBottom(15).row();
        table.add(settingsButton).width(300).height(60).padBottom(15).row();
        table.add(quitButton).width(300).height(60);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0f, 0f, 0.15f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act(delta);
        stage.draw();
    }

}
