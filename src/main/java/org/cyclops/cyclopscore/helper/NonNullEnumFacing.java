package org.cyclops.cyclopscore.helper;

import net.minecraft.util.EnumFacing;

import javax.annotation.Nullable;

public enum NonNullEnumFacing {
    DOWN(EnumFacing.DOWN),
    UP(EnumFacing.UP),
    NORTH(EnumFacing.NORTH),
    SOUTH(EnumFacing.SOUTH),
    WEST(EnumFacing.WEST),
    EAST(EnumFacing.EAST),
    UNKNOWN(null);

    private EnumFacing facing;

    NonNullEnumFacing(EnumFacing facing) {
        this.facing = facing;
    }

    @Nullable
    public EnumFacing getEnumFacing(){
        return facing;
    }

    public static NonNullEnumFacing getNonNull(EnumFacing facing){
        switch (facing){
            case DOWN: return NonNullEnumFacing.DOWN;
            case UP: return NonNullEnumFacing.UP;
            case NORTH: return NonNullEnumFacing.NORTH;
            case SOUTH: return NonNullEnumFacing.SOUTH;
            case EAST: return NonNullEnumFacing.EAST;
            case WEST: return NonNullEnumFacing.WEST;
            default: return NonNullEnumFacing.UNKNOWN;
        }
    }
}
