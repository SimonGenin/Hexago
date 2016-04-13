package be.simongenin.components;

import be.simongenin.enums.TileEnvironment;
import com.badlogic.ashley.core.Component;

import static be.simongenin.enums.TileEnvironment.GRASS;


/**
 * Simple indicateur permettant de dire qu'une entité
 * équipée de ce composant est hexagonale.
 */
public class HexagonalBoardComponent implements Component {

    /**
     * Taille en pixel d'une case
     */
    public int height = 140;
    public int width = 120;

    public TileEnvironment environment = GRASS;

}
