package be.simongenin.ashley_utils;

import be.simongenin.components.TextureComponent;
import be.simongenin.components.TransformComponent;
import com.badlogic.ashley.core.Family;

public class Families {

    public static Family renderableEntities = Family.all(TextureComponent.class, TransformComponent.class).get();

}
