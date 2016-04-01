package be.simongenin.components;

import com.badlogic.ashley.core.Component;

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

}
