package com.ThreeSquadIndie.FermiumCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Dethsanius on 12.03.14, project is forge package are com.ThreeSquadIndie.FermiumCraft.blocks.
 */
public class ModBlocks {
    public static Block blockFermiumOre;
    public static Block blockFabricator;
    public static Block blockFermiumBlock;

    public static void init(){
        blockFermiumOre = new BlockFermiumOre(Material.rock);
        blockFabricator = new BlockFabricator(Material.rock);
        blockFermiumBlock = new BlockFermiumBlock(Material.rock);
    }
}
