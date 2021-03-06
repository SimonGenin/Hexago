package be.simongenin.entities;

import be.simongenin.components.TextureComponent;
import be.simongenin.components.TransformComponent;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class ExampleEntity extends Entity {

    private TextureComponent textureComponent;
    private TransformComponent transformComponent;

    public ExampleEntity(TextureRegion texture, int x, int y) {

        super();

        textureComponent = new TextureComponent();
        transformComponent = new TransformComponent();

        textureComponent.texture = texture;
        transformComponent.x = x;
        transformComponent.y = y;

        add(textureComponent);
        add(transformComponent);

    }

}
