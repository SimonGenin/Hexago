package be.simongenin.ashley_utils;

import be.simongenin.components.TextureComponent;
import be.simongenin.components.TransformComponent;
import com.badlogic.ashley.core.ComponentMapper;

public class Mappers {

    public static ComponentMapper<TransformComponent> transformComponents = ComponentMapper.getFor(TransformComponent.class);
    public static ComponentMapper<TextureComponent> textureComponents = ComponentMapper.getFor(TextureComponent.class);

}
