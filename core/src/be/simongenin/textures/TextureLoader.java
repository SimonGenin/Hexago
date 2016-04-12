package be.simongenin.textures;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/*
    Cette classe permet de charger des textures depuis
    les atlas.
 */
public class TextureLoader {

    /**
     * Permet de charger la texture d'une case
     *
     * @param textureName
     * @return
     */
    public static TextureRegion loadTileTexture(String textureName) {

        TextureAtlas atlas = null;
        TextureAtlas.AtlasRegion region = null;

        atlas = TextureAtlases.tileAtlas;
        region = atlas.findRegion(textureName);

        return region;
    }

    /**
     * Permet de charger la texture d'un item
     *
     * @param textureName
     * @return
     */
    public static TextureRegion loadItemTexture(String textureName) {

        TextureAtlas atlas = null;
        TextureAtlas.AtlasRegion region = null;

        atlas = TextureAtlases.itemAtlas;
        region = atlas.findRegion(textureName);

        return region;
    }

}
