package be.simongenin.textures;

import be.simongenin.exceptions.TextureNotFoundException;
import com.badlogic.gdx.graphics.Texture;
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
     * @param textureName Nom de la texture
     * @return la texture (sous forme de textureRegion)
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

    public static TextureRegion loadTextureFromAssets(String texturePath) {
        return new TextureRegion(new Texture("textures/" + texturePath));
    }



}
