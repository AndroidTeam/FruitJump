package yixing.fruit.activity;

import yixing.fruit.basic.Assets;
import android.util.Log;

import com.jordan.framework.Game;
import com.jordan.framework.Graphics;
import com.jordan.framework.Graphics.ImageFormat;
import com.jordan.framework.Screen;

//where all the images are loaded
public class LoadingScreen extends Screen {
	public LoadingScreen(Game game) {
		super(game);
	}

	@Override
	public void update(float deltaTime) {

        //makes sure the screen lasts 3 seconds
        long startTime = System.currentTimeMillis();

        Assets.loadImages(game);
        
        //Graphics g = game.getGraphics();
		//Assets.splash= g.newImage("splash.png", ImageFormat.RGB565);
		//game.getGraphics().drawImage(Assets.splash, 0, 0);

        long t = (System.currentTimeMillis() - startTime);
        try {
            if (t < 3000)
                Thread.sleep(3000 - t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		Log.d("debug", "about to go to gamescreen");

		game.setScreen(new GameScreen(game));
	}

	@Override
	public void paint(float deltaTime) {
		//Graphics g = game.getGraphics();
		game.getGraphics().drawImage(Assets.splash, 0, 0);
		Log.d("debug", "load screen draw");
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