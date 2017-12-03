package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img;
	private float xa, ya;
	private float x = 120, y = 30;
	private float xScreen, yScreen;

	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		xa = ya = 5.0f;

		xScreen = Gdx.graphics.getWidth();
		yScreen = Gdx.graphics.getHeight();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, x, y);
		batch.end();

		if( x + img.getWidth() >= xScreen || x < 0.0f)
			xa = -xa;
		if( y + img.getHeight() >= yScreen || y < 0.0f)
			ya = -ya;

		x += xa;
		y += ya;
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
