package be.simongenin.components;

import com.badlogic.ashley.core.Component;

/**
 * Represente la position en pixel d'une entité et son
 * degré de rotation
 */
public class TransformComponent implements Component {

    public float x = 0f;
    public float y = 0f;
    public float r = 0f;

}
