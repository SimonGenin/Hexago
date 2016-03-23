package be.simongenin;

import be.simongenin.entities.ExampleEntity;
import be.simongenin.systems.RenderingSystem;
import com.badlogic.ashley.core.Engine;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Game extends ApplicationAdapter {

	Engine engine;
	
	@Override
	public void create () {
		engine = new Engine();

		engine.addSystem(new RenderingSystem());

		Texture t = new Texture("badlogic.jpg");

		ExampleEntity entity = new ExampleEntity(new TextureRegion(t), 0, 0);
		engine.addEntity(entity);

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		engine.update(Gdx.graphics.getDeltaTime());

	}

	@Override
	public void resize(int width, int height) {
		RenderingSystem rs = engine.getSystem(RenderingSystem.class);
		rs.onresize(width, height);
	}
}
