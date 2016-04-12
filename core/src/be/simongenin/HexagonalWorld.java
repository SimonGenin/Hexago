package be.simongenin;

import be.simongenin.entities.HexagonalTileEntity;
import be.simongenin.entities.TileItemEntity;
import be.simongenin.utils.PixelTransform;
import com.badlogic.ashley.core.Engine;

/**
 * Représente le monde hexagonal
 */
public class HexagonalWorld {

    public static final int HEXA_TILE_HEIGHT = 140;
    public static final int HEXA_TILE_WIDTH = 120;

    public static final int WORLD_HEIGHT = 5;
    public static final int WORLD_WIDTH = 5;

    // Mesure pour emboiter verticalement les hexagones
    public static final int HEXA_POSITION_DIFFERENCE = 36;

    private HexagonalTileEntity[][] map;

    public HexagonalWorld(Engine engine) {
        map = new HexagonalTileEntity[WORLD_HEIGHT][WORLD_WIDTH];
        generateBasicTestWorld(engine);
    }

    /**
     * Methode de test afin de générer un monde basic
     *
     * @param engine
     */
    private void generateBasicTestWorld(Engine engine) {
        for (int i = 0; i < WORLD_HEIGHT; i++) {
            for (int j = 0; j < WORLD_WIDTH; j++) {
                if (i % 2 == 0) {
                    map[i][j] = new HexagonalTileEntity(this, i, j);
                } else {
                    TileItemEntity itemEntity = new TileItemEntity();
                    engine.addEntity(itemEntity);
                    map[i][j] = new HexagonalTileEntity(this, i, j, itemEntity);
                }
                engine.addEntity(map[i][j]);
            }
        }
    }

    /**
     * Récupere le transform en fonction d'un index dans le monde.
     *
     * @param row
     * @param column
     * @return
     */
    public PixelTransform getTransformFromPosition(int row, int column) {

        int x = (column * HEXA_TILE_WIDTH + (HEXA_TILE_WIDTH / 2)) - (WORLD_WIDTH * HEXA_TILE_WIDTH)/2;
        int y = (row * HEXA_TILE_HEIGHT + (HEXA_TILE_HEIGHT / 2)) - (WORLD_HEIGHT * HEXA_TILE_HEIGHT)/2;
        y = -y;

        // Bouge chaque ligne paire vers la droite pour emboiter les hexas
        if (row % 2 == 0) {
            x += (HEXA_TILE_WIDTH / 2);
        }

        // Remonte chaque colonne afin de les emboiter
        if (row != 0) {
            y += HEXA_POSITION_DIFFERENCE * row;
        }

        // Recentre les mesures apres tout ces déplacements
        y-= WORLD_HEIGHT/2 * HEXA_POSITION_DIFFERENCE - HEXA_POSITION_DIFFERENCE/2;
        x-= (HEXA_TILE_WIDTH / 2)/2;

        PixelTransform t = new PixelTransform();
        t.r = 0;
        t.x = x;
        t.y = y;

        return t;

    }

}
