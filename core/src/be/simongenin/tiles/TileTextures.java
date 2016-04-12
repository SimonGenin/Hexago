package be.simongenin.tiles;

import be.simongenin.textures.TextureLoader;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Contient toutes les textures pour les tiles
 */
public class TileTextures {

    public static TextureRegion TILE_TEXTURE_GRASS = TextureLoader.loadTileTexture("grass");
    public static TextureRegion TILE_TEXTURE_STONE = TextureLoader.loadTileTexture("stone");
    public static TextureRegion TILE_TEXTURE_DIRT = TextureLoader.loadTileTexture("dirt");
    public static TextureRegion TILE_TEXTURE_SAND = TextureLoader.loadTileTexture("sand");

}
