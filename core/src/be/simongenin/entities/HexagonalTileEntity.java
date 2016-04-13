package be.simongenin.entities;

import be.simongenin.HexagonalWorld;
import be.simongenin.components.HexagonalBoardComponent;
import be.simongenin.components.TextureComponent;
import be.simongenin.components.TransformComponent;
import be.simongenin.enums.TexturePriority;
import be.simongenin.textures.TextureLoader;
import be.simongenin.utils.PixelTransform;
import com.badlogic.ashley.core.Entity;


/**
 * Représente une case hexagonal
 */
public class HexagonalTileEntity extends Entity {

    /*
        Components
    */
    private TextureComponent textureComponent;
    private TransformComponent transformComponent;
    private HexagonalBoardComponent hexagonalBoardComponent;


    public HexagonalTileEntity(HexagonalWorld world, int row, int column) {
        super();

        textureComponent = new TextureComponent();
        transformComponent = new TransformComponent();
        hexagonalBoardComponent = new HexagonalBoardComponent();

        textureComponent.texture = TextureLoader.loadTileTexture("grass");
        textureComponent.priority = TexturePriority.TILE_BACKGROUND;

        PixelTransform pixelTransform = world.getTransformFromPosition(row, column);
        transformComponent.x = pixelTransform.x;
        transformComponent.y = pixelTransform.y;
        transformComponent.r = 0;

        add(textureComponent);
        add(transformComponent);
        add(hexagonalBoardComponent);

    }


}
