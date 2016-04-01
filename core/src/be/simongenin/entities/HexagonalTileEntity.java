package be.simongenin.entities;

import be.simongenin.HexagonalWorld;
import be.simongenin.components.HexagonalBoardComponent;
import be.simongenin.components.TextureComponent;
import be.simongenin.components.TransformComponent;
import be.simongenin.utils.PixelTransform;
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

    public HexagonalTileEntity(HexagonalWorld world, int row, int column) {
        super();

        textureComponent = new TextureComponent();
        transformComponent = new TransformComponent();
        hexagonalBoardComponent = new HexagonalBoardComponent();

        // TODO texture management
        Texture texture = new Texture("test.png");
        textureComponent.texture = new TextureRegion(texture, hexagonalBoardComponent.width, hexagonalBoardComponent.height);

        PixelTransform pixelTransform = world.getTransformFromPosition(row, column);
        transformComponent.x = pixelTransform.x;
        transformComponent.y = pixelTransform.y;
        transformComponent.r = 0;

        add(textureComponent);
        add(transformComponent);
        add(hexagonalBoardComponent);

    }

}
