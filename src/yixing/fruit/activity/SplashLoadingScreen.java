package yixing.fruit.activity;

import yixing.fruit.basic.Assets;
import android.util.Log;

import com.jordan.framework.Game;
import com.jordan.framework.Graphics;
import com.jordan.framework.Screen;
import com.jordan.framework.Graphics.ImageFormat;

//it loads the splash to display on the actual loading screen
public class SplashLoadingScreen extends Screen {
	public SplashLoadingScreen(Game game) {
		super(game);
	}

	@Override
	public void update(float deltaTime) {
		Graphics g = game.getGraphics();
		Assets.splash = g.newImage("splash.png", ImageFormat.RGB565);
		Log.d("debug", "splash load");
		game.setScreen(new LoadingScreen(game));
    }

	@Override
	public void paint(float deltaTime) {
		Log.d("debug", "splash paint");
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}

	@Override
	public void backButton() {

	}
}