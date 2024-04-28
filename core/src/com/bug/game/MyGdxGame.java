package com.bug.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.math.Rectangle;

public class MyGdxGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture flyImage;
	private Music bgMusic;
	private OrthographicCamera camera;
	
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

		//Init batch
		batch = new SpriteBatch();

	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 1, 4, 1);
	}
	
	@Override
	public void dispose () {
		return;
	}
}
