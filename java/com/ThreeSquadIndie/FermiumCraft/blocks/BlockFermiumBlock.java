package com.ThreeSquadIndie.FermiumCraft.blocks;

import com.ThreeSquadIndie.FermiumCraft.FermiumCraft;
import com.ThreeSquadIndie.FermiumCraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by Dethsanius on 11.05.2014, project is 1.7.2 package are com.ThreeSquadIndie.FermiumCraft.blocks.
 */
public class BlockFermiumBlock extends Block {

    public BlockFermiumBlock(Material material) {
        super(material);
        setHardness(4.0F); // 33% harder than diamond
        setBlockName("fermiumBlock");
        setHarvestLevel("pickaxe", 3);
        setCreativeTab(FermiumCraft.tabFermium);
        setBlockTextureName(Reference.BlockFermiumBlock);
    }

    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par1World.isRemote)
        {
            return true;
        }
        else
        {
            par5EntityPlayer.displayGUIWorkbench(par2, par3, par4);
            return true;
        }
    }
}