package com.ThreeSquadIndie.FermiumCraft;

import com.ThreeSquadIndie.FermiumCraft.blocks.ModBlocks;
import com.ThreeSquadIndie.FermiumCraft.items.ModItems;
import com.ThreeSquadIndie.FermiumCraft.lib.Reference;
import com.ThreeSquadIndie.FermiumCraft.lib.Registry;
import com.ThreeSquadIndie.FermiumCraft.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Haxer on 09.02.14.
 */
@Mod(modid = Reference.MODID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class FermiumCraft {

    @Mod.Instance(value = Reference.MODID)
    public static FermiumCraft instance;

    @SidedProxy(clientSide= Reference.clientSide, serverSide= Reference.serverSide)
    public static CommonProxy proxy;

    public static CreativeTabs tabFermium = new CreativeTabs("tabFermium") {

        public ItemStack getIconItemStack() { return new ItemStack(ModItems.itemFermiumIngot, 1, 0); }

        @Override
        public Item getTabIconItem() {
            return ModItems.itemFermiumIngot;
        }
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModBlocks.init();
        Registry.gamePreInit();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        proxy.registerRenderers();
        Registry.recepieInit();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        Registry.guiPostInit();
    }
}
