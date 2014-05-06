package com.ThreeSquadIndie.FermiumCraft.lib;

import com.ThreeSquadIndie.FermiumCraft.blocks.ModBlocks;
import com.ThreeSquadIndie.FermiumCraft.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
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
        GameRegistry.registerItem(ModItems.itemFermiumStar, "Fermium Star", Reference.MODID);
        GameRegistry.registerItem(ModItems.itemFermiumCatalysisStar, "Fermium Catalysis Star", Reference.MODID);

        //Blocks
        GameRegistry.registerBlock(ModBlocks.blockFermiumOre, "fermiumOre");
    }

    public static void recepieInit(){
        //Shaped
        GameRegistry.addRecipe(new ItemStack(ModItems.itemFermiumIngot), "XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.itemFermiumNugget));
        GameRegistry.addRecipe(new ItemStack(ModItems.itemFermiumPickaxe), "XXX", " Y ", " Y ", 'X', new ItemStack(ModItems.itemFermiumIngot), 'Y', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.itemFermiumHoe), " XX", " Y ", " Y ", 'X', new ItemStack(ModItems.itemFermiumIngot), 'Y', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.itemFermiumShovel), " X ", " Y ", " Y ", 'X', new ItemStack(ModItems.itemFermiumIngot), 'Y', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.itemFermiumSword), " X ", " X ", " Y ", 'X', new ItemStack(ModItems.itemFermiumIngot), 'Y', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.itemFermiumAxe), "XX ", "XY ", " Y ", 'X', new ItemStack(ModItems.itemFermiumIngot), 'Y', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.itemFermiumCatalysisStar), "YXY", "XXX", "YXY", 'X', new ItemStack(ModItems.itemFermiumStar), 'Y', new ItemStack(Items.slime_ball));

        //Shapeless
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemFermiumNugget, 9), new ItemStack(ModItems.itemFermiumIngot));

        //Smelting
        GameRegistry.addSmelting(ModBlocks.blockFermiumOre, new ItemStack(ModItems.itemFermiumIngot), 2F);
    }
}
