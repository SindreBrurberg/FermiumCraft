package com.ThreeSquadIndie.FermiumCraft.items;

import com.ThreeSquadIndie.FermiumCraft.FermiumCraft;
import com.ThreeSquadIndie.FermiumCraft.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

/**
 * Created by Dethsanius on 12.03.14, project is forge package are com.ThreeSquadIndie.FermiumCraft.items.
 */
public class ItemFermiumAxe extends ItemAxe {
    public ItemFermiumAxe(ToolMaterial toolMaterial) {
        super(toolMaterial);
        maxStackSize = 1;
        setCreativeTab(FermiumCraft.tabFermium);
        setUnlocalizedName("fermiumAxe");
        setTextureName(Reference.ItemFermiumAxe);
    }
}
