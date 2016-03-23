package be.simongenin.systems;

import be.simongenin.ashley_utils.Families;
import be.simongenin.ashley_utils.Mappers;
import be.simongenin.components.TextureComponent;
import be.simongenin.components.TransformComponent;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.systems.IteratingSystem;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Logger;

import java.util.Comparator;

public class RenderingSystem extends IteratingSystem {

    /**
     * Entities stuff
     */
    private Array<Entity> renderQueue;
    private Comparator<Entity> comparator;

    /**
     * Camera stuff
     */
    private OrthographicCamera camera;
    private SpriteBatch batch;

    /**
     * Debugging stuff
     */
    private Logger logger;

    public RenderingSystem() {
        super(Families.renderableEntities);

        logger = new Logger(this.getClass().getSimpleName());
        renderQueue = new Array<Entity>();
        batch = new SpriteBatch();
        camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        /**
         * Ce comparateur permet de savoir la priorité des
         * textures.
         * Ou sinon, nous pourions par exemple avoir un cas ou notre
         * personnage serait dessiner derriere un mur par exemple.
         */
        comparator = new Comparator<Entity>() {
            @Override
            public int compare(Entity e1, Entity e2) {

                TextureComponent tcE1 = Mappers.textureComponents.get(e1);
                TextureComponent tcE2 = Mappers.textureComponents.get(e2);

                if (tcE1.priority.value > tcE2.priority.value)
                    return 1;
                else if (tcE1.priority.value < tcE2.priority.value)
                    return -1;
                else return 0;

            }
        };

    }

    @Override
    public void update(float deltaTime) {
        super.update(deltaTime);

        renderQueue.sort(comparator);
        camera.update();

        batch.setProjectionMatrix(camera.combined);
        batch.begin();

        for (Entity entity : renderQueue) {

            TransformComponent transformComponent = Mappers.transformComponents.get(entity);
            TextureComponent textureComponent = Mappers.textureComponents.get(entity);

            if (textureComponent == null) {
                logger.error("Pas de texture (null) pour " + entity.getClass().getSimpleName());
                continue;
            }

            batch.draw(
                    textureComponent.texture,
                    transformComponent.x - (textureComponent.texture.getRegionWidth() / 2),
                    transformComponent.y - (textureComponent.texture.getRegionHeight() / 2),
                    transformComponent.x,
                    transformComponent.y,
                    textureComponent.texture.getRegionWidth(),
                    textureComponent.texture.getRegionHeight(),
                    1,
                    1,
                    transformComponent.r
            );

        }

        batch.end();

        renderQueue.clear();

    }

    @Override
    protected void processEntity(Entity entity, float deltaTime) {
        renderQueue.add(entity);
    }

    public void onresize(int width, int height) {

        camera.viewportWidth = width;
        camera.viewportHeight = height;
        camera.update();

    }

}
