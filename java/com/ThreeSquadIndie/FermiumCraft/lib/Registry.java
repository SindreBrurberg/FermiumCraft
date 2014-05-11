package com.ThreeSquadIndie.FermiumCraft.lib;

import com.ThreeSquadIndie.FermiumCraft.entity.EntityFermiumStar;
import com.ThreeSquadIndie.FermiumCraft.entity.TileEntityFabricator;
import com.ThreeSquadIndie.FermiumCraft.worldGen.OreGen;
import com.ThreeSquadIndie.FermiumCraft.blocks.ModBlocks;
import com.ThreeSquadIndie.FermiumCraft.items.ModItems;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Dethsanius on 12.03.14, project is forge package are com.ThreeSquadIndie.FermiumCraft.lib.
 */
public class Registry {

    public static void gameInit() {
        // Items
        GameRegistry.registerItem(ModItems.itemFermiumAxe, "Fermium Axe", Reference.MODID);
        GameRegistry.registerItem(ModItems.itemFermiumHoe, "Fermium Hoe", Reference.MODID);
        GameRegistry.registerItem(ModItems.itemFermiumIngot, "Fermium Ingot", Reference.MODID);
        GameRegistry.registerItem(ModItems.itemFermiumNugget, "Fermium Nugget", Reference.MODID);
        GameRegistry.registerItem(ModItems.itemFermiumPickaxe, "Fermium Pickaxe", Reference.MODID);
        GameRegistry.registerItem(ModItems.itemFermiumShovel, "Fermium Shovel", Reference.MODID);
        GameRegistry.registerItem(ModItems.itemFermiumSword, "Fermium Sword", Reference.MODID);
        GameRegistry.registerItem(ModItems.itemFermiumStar_Hard, "Hard Fermium Star", Reference.MODID);
        GameRegistry.registerItem(ModItems.itemFermiumCatalysisStar_Hard, "Hard Fermium Catalysis Star", Reference.MODID);
        GameRegistry.registerItem(ModItems.itemFermiumStar_Soft, "Soft Fermium Star", Reference.MODID);
        GameRegistry.registerItem(ModItems.itemFermiumCatalysisStar_Soft, "Soft Fermium Catalysis Star", Reference.MODID);
        //Blocks
        GameRegistry.registerBlock(ModBlocks.blockFermiumOre, "fermiumOre");
        GameRegistry.registerBlock(ModBlocks.blockFabricator, "fabricator");
        GameRegistry.registerBlock(ModBlocks.blockFermiumBlock, "fermiumBlock");
        //Entity
        EntityRegistry.registerModEntity(EntityFermiumStar.class, "FermiumStarHard", 10, Reference.MODID, 120, 3, true);
        GameRegistry.registerTileEntity(TileEntityFabricator.class, "tileEntityFabricator");
        //WorldGen
        GameRegistry.registerWorldGenerator(new OreGen(), 0);
    }

    public static void recepieInit(){
        //Shaped
        //Items
        GameRegistry.addRecipe(new ItemStack(ModItems.itemFermiumIngot), "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemFermiumNugget));
        GameRegistry.addRecipe(new ItemStack(ModItems.itemFermiumPickaxe), "XXX", " Y ", " Y ", 'X', new ItemStack(ModItems.itemFermiumIngot), 'Y', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.itemFermiumHoe), " XX", " Y ", " Y ", 'X', new ItemStack(ModItems.itemFermiumIngot), 'Y', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.itemFermiumShovel), " X ", " Y ", " Y ", 'X', new ItemStack(ModItems.itemFermiumIngot), 'Y', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.itemFermiumSword), " X ", " X ", " Y ", 'X', new ItemStack(ModItems.itemFermiumIngot), 'Y', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.itemFermiumAxe), "XX ", "XY ", " Y ", 'X', new ItemStack(ModItems.itemFermiumIngot), 'Y', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.itemFermiumStar_Soft), "AXB", "ZYZ", "CXD", 'X', new ItemStack(Items.slime_ball), 'Y', new ItemStack(Blocks.end_stone), 'Z', new ItemStack(ModItems.itemFermiumIngot), 'A', new ItemStack(Items.ender_pearl), 'B', new ItemStack(Items.diamond), 'C', new ItemStack(Items.golden_apple), 'D', new ItemStack(Items.ender_eye));
        GameRegistry.addRecipe(new ItemStack(ModItems.itemFermiumCatalysisStar_Soft), "YXY", "XZX", "YXY", 'X', new ItemStack(ModItems.itemFermiumStar_Soft), 'Y', new ItemStack(Items.slime_ball), 'Z', new ItemStack(ModItems.itemFermiumIngot));
        //Blocks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockFermiumBlock), "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemFermiumIngot));

        //Shapeless
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemFermiumNugget, 9), new ItemStack(ModItems.itemFermiumIngot));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemFermiumIngot, 9), new ItemStack(ModBlocks.blockFermiumBlock));

        //Smelting
        GameRegistry.addSmelting(ModBlocks.blockFermiumOre, new ItemStack(ModItems.itemFermiumIngot), 2F);
        GameRegistry.addSmelting(ModItems.itemFermiumCatalysisStar_Soft, new ItemStack(ModItems.itemFermiumCatalysisStar_Hard), 2F);
        GameRegistry.addSmelting(ModItems.itemFermiumStar_Soft, new ItemStack(ModItems.itemFermiumStar_Hard), 2F);
    }
}
