package com.bug.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		return;
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 1, 1);
	}
	
	@Override
	public void dispose () {
		return;
	}
}
