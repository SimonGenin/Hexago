package be.simongenin.components;

import be.simongenin.enums.TexturePriority;
import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Component pour les textures.
 * Tout élément ayant un texture devra être équiper de ce component
 */
public class TextureComponent implements Component {

    public TextureRegion texture = null;
    public TexturePriority priority = TexturePriority.BACKGROUND;

}
