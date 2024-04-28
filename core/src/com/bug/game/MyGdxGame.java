package com.bug.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.Input;

public class MyGdxGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture flyImage;
	private Music bgMusic;
	private OrthographicCamera camera;
	private Rectangle player;
	
	@Override
	public void create () {
		// Load images
		flyImage = new Texture(Gdx.files.internal("fly.png"));

		// Load sounds
		bgMusic = Gdx.audio.newMusic(Gdx.files.internal("bgm.mp3"));

		// Play music
		bgMusic.setLooping(true);
		bgMusic.play();

		// Init camera
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);

		// Init batch
		batch = new SpriteBatch();

		// Init objects
		player = new Rectangle();
		player.x = 400 - 64/2;
		player.y = 50;
		player.width = 64;
		player.height = 64;
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 1, 4, 1);

		camera.update();

		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.draw(flyImage, player.x, player.y);
		batch.end();

		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
		player.x -= 200 * Gdx.graphics.getDeltaTime();
		}

		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
		player.x += 200 * Gdx.graphics.getDeltaTime();
		}
	}
	
	@Override
	public void dispose () {
		return;
	}
}
