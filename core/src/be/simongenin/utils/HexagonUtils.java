package be.simongenin.utils;


import be.simongenin.ashley_utils.Mappers;
import be.simongenin.components.TransformComponent;
import be.simongenin.entities.HexagonalTileEntity;
import com.badlogic.gdx.math.Polygon;

public class HexagonUtils {

    public static Polygon shape = new Polygon(new float[]{0, -70, 60, -36, 60, 36, 0, 70, -60, 36, -60, -36});

    public static boolean contains(HexagonalTileEntity tileEntity) {

        TransformComponent transform = Mappers.transformComponents.get(tileEntity);

        System.out.println("X : " + transform.x);
        System.out.println("Y : " + transform.y);

        return false;
    }

}
