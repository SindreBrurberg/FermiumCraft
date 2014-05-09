package com.ThreeSquadIndie.FermiumCraft.items;

import com.ThreeSquadIndie.FermiumCraft.FermiumCraft;
import com.ThreeSquadIndie.FermiumCraft.lib.Reference;
import net.minecraft.item.ItemFood;

/**
 * Created by Dethsanius on 12.03.14, project is forge package are com.ThreeSquadIndie.FermiumCraft.items.
 */
public class ItemFermiumStar_Soft extends ItemFood {
    public ItemFermiumStar_Soft(int par1, float par2, boolean par3) {
        super(par1, par2, par3);
        maxStackSize = 64;
        setCreativeTab(FermiumCraft.tabFermium);
        setUnlocalizedName("fermiumStar_Soft");
        setTextureName(Reference.ItemFermiumStar_Soft);
    }

}
