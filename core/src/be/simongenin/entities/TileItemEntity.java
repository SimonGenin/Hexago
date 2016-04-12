package be.simongenin.entities;

import be.simongenin.components.TextureComponent;
import be.simongenin.components.TransformComponent;
import be.simongenin.enums.TexturePriority;
import be.simongenin.items.ItemTextures;
import com.badlogic.ashley.core.Entity;

/**
 * Represente tous les objets sur les tiles
 */
public class TileItemEntity extends Entity {

    private TextureComponent textureComponent;
    // Ce transform se doit d'être relatif à chaque tile
    private TransformComponent transformComponent;

    public TileItemEntity() {
        super();

        textureComponent = new TextureComponent();
        transformComponent = new TransformComponent();

        textureComponent.texture = ItemTextures.ITEM_TEXTURE_ARCHWAY;
        textureComponent.priority = TexturePriority.ITEMS;

        add(textureComponent);
        add(transformComponent);

    }

}
