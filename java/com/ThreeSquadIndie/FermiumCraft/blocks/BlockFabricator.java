package com.ThreeSquadIndie.FermiumCraft.blocks;

import com.ThreeSquadIndie.FermiumCraft.FermiumCraft;
import com.ThreeSquadIndie.FermiumCraft.entity.TileEntityFabricator;
import com.ThreeSquadIndie.FermiumCraft.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Dethsanius on 11.05.2014, project is 1.7.2 package are com.ThreeSquadIndie.FermiumCraft.blocks.
 */
public class BlockFabricator extends BlockContainer {
    public BlockFabricator(Material matt) {
        super(matt);
        setHardness(4.0F); // 33% harder than diamond
        setBlockName("fabricator");
        setHarvestLevel("pickaxe", 1);
        setCreativeTab(FermiumCraft.tabFermium);
        setBlockTextureName(Reference.ItemFabricator);
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return new TileEntityFabricator();
    }

    //You don't want the normal render type, or it wont render properly.
    @Override
    public int getRenderType() {
        return -1;
    }

    //It's not an opaque cube, so you need this.
    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    //It's not a normal block, so you need this too.
    public boolean renderAsNormalBlock() {
        return false;
    }

    @SideOnly(Side.CLIENT)
    //This is the icon to use for showing the block in your hand.
    public void registerIcons(IIconRegister icon) {
        this.blockIcon = icon.registerIcon(Reference.MODID + ":FermiumStar_Hard");
    }
}
