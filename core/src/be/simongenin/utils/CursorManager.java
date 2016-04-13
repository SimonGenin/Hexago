package be.simongenin.utils;

import be.simongenin.entities.HexagonalTileEntity;

/**
 * Gere le curseur
 */
public class CursorManager {

    public static boolean isHoveringTile(HexagonalTileEntity tileEntity) {

        return HexagonUtils.contains(tileEntity);

        /**
         * TODO Regarder du coté de la camera.
         * Elle contient sans doute les transformations a apporter.
         */

    }



}
