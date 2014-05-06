package com.ThreeSquadIndie.FermiumCraft.items;

import com.ThreeSquadIndie.FermiumCraft.FermiumCraft;
import com.ThreeSquadIndie.FermiumCraft.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Dethsanius on 12.03.14, project is forge package are com.ThreeSquadIndie.FermiumCraft.items.
 */
public class ItemFermiumNugget extends Item {
    public ItemFermiumNugget() {
        maxStackSize = 64;
        setCreativeTab(FermiumCraft.tabFermium);
        setUnlocalizedName("fermiumNugget");
        setTextureName(Reference.ItemFermiumNugget);
    }
}