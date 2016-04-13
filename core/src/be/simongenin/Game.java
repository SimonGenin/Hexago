package be.simongenin;

import be.simongenin.systems.RenderingSystem;
import be.simongenin.utils.CursorManager;
import com.badlogic.ashley.core.Engine;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class Game extends ApplicationAdapter {

	Engine engine;
	HexagonalWorld world;

	@Override
	public void create () {
		engine = new Engine();

		engine.addSystem(new RenderingSystem());

		world = new HexagonalWorld(engine);

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		engine.update(Gdx.graphics.getDeltaTime());
		CursorManager.isHoveringTile(world.map[0][0]);

	}

	@Override
	public void resize(int width, int height) {
		RenderingSystem rs = engine.getSystem(RenderingSystem.class);
		rs.onresize(width, height);
	}
}
