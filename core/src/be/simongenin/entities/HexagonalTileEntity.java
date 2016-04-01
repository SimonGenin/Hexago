package be.simongenin.entities;

import be.simongenin.components.HexagonalBoardComponent;
import be.simongenin.components.TextureComponent;
import be.simongenin.components.TransformComponent;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Représente une case hexagonal
 */
public class HexagonalTileEntity extends Entity {

    private TextureComponent textureComponent;
    private TransformComponent transformComponent;
    private HexagonalBoardComponent hexagonalBoardComponent;

    public HexagonalTileEntity() {
        super();

        textureComponent = new TextureComponent();
        transformComponent = new TransformComponent();
        hexagonalBoardComponent = new HexagonalBoardComponent();

        // TODO texture management
        Texture texture = new Texture("test.png");
        textureComponent.texture = new TextureRegion(texture, hexagonalBoardComponent.width, hexagonalBoardComponent.height);

        // TODO position management
        transformComponent.x = 0;
        transformComponent.y = 0;
        transformComponent.r = 0;

        add(textureComponent);
        add(transformComponent);
        add(hexagonalBoardComponent);

    }

}
