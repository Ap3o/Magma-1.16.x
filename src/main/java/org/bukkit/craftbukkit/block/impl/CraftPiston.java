/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.block.impl;

import net.minecraft.block.PistonBlock;

public final class CraftPiston extends org.bukkit.craftbukkit.block.data.CraftBlockData implements org.bukkit.block.data.type.Piston, org.bukkit.block.data.Directional {

    public CraftPiston() {
        super();
    }

    public CraftPiston(net.minecraft.block.BlockState state) {
        super(state);
    }

    // org.bukkit.craftbukkit.block.data.type.CraftPiston

    private static final net.minecraft.state.BooleanProperty EXTENDED = getBoolean(PistonBlock.class, "extended");

    @Override
    public boolean isExtended() {
        return get(EXTENDED);
    }

    @Override
    public void setExtended(boolean extended) {
        set(EXTENDED, extended);
    }

    // org.bukkit.craftbukkit.block.data.CraftDirectional

    private static final net.minecraft.state.EnumProperty<?> FACING = getEnum(PistonBlock.class, "facing");

    @Override
    public org.bukkit.block.BlockFace getFacing() {
        return get(FACING, org.bukkit.block.BlockFace.class);
    }

    @Override
    public void setFacing(org.bukkit.block.BlockFace facing) {
        set(FACING, facing);
    }

    @Override
    public java.util.Set<org.bukkit.block.BlockFace> getFaces() {
        return getValues(FACING, org.bukkit.block.BlockFace.class);
    }
}