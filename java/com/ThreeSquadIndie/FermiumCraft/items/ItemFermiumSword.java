package com.ThreeSquadIndie.FermiumCraft.items;

import com.ThreeSquadIndie.FermiumCraft.FermiumCraft;
import com.ThreeSquadIndie.FermiumCraft.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * Created by Dethsanius on 13.03.14, project is forge package are com.ThreeSquadIndie.FermiumCraft.items.
 */
public class ItemFermiumSword extends ItemSword {
    public ItemFermiumSword(ToolMaterial toolMaterial) {
        super(toolMaterial);
        maxStackSize = 1;
        setCreativeTab(FermiumCraft.tabFermium);
        setUnlocalizedName("fermiumSword");
        setTextureName(Reference.ItemFermiumSword);
    }
}
