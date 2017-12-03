package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class MyGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private float xa, ya;
	private float x = 120, y = 130;
	private float xScreen, yScreen;

	private ShapeRenderer shapeRenderer;
	private OrthographicCamera camera;

	public void create () {
		batch = new SpriteBatch();
		xa = ya = 5.0f;

		xScreen = Gdx.graphics.getWidth();
		yScreen = Gdx.graphics.getHeight();

		shapeRenderer = new ShapeRenderer();
		camera = new OrthographicCamera(xScreen , yScreen);

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.2f, 0.2f, 0.21f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.setProjectionMatrix(camera.combined);

		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.setColor(0.6f, 0.7f, 1, 1);
		shapeRenderer.circle(x, y, 50.0f);
		shapeRenderer.setColor(1f, 1f, 1, 1);
		shapeRenderer.rect(200, 165, 30, 30);
		shapeRenderer.end();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		shapeRenderer.dispose();
	}
}
