package be.simongenin.textures;

import be.simongenin.exceptions.TextureNotFoundException;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/*
    Cette classe permet de charger des textures depuis
    les atlas.
 */
public class TextureLoader {

    /**
     * Permet de charger la texture d'une tile
     *
     * @param textureName
     * @return
     */
    public static TextureRegion loadTileTexture(String textureName) {

        TextureAtlas atlas = null;
        TextureAtlas.AtlasRegion region = null;

        atlas = TextureAtlases.tileAtlas;
        region = atlas.findRegion(textureName);

        if (region == null) {
            throw new TextureNotFoundException("Texture name : " + textureName + "\nIn : tileAtlas");
        }

        return region;
    }



}
