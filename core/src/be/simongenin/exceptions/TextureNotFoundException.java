package be.simongenin.exceptions;

/**
 * Exception à lancer quand un texture ne peut pas etre chargé
 * car elle n'existe pas
 */
public class TextureNotFoundException extends RuntimeException {
    public TextureNotFoundException() { super(); }
    public TextureNotFoundException(String s) { super(s); }
}
