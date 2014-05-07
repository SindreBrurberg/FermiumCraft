package com.ThreeSquadIndie.FermiumCraft.items;

import com.ThreeSquadIndie.FermiumCraft.FermiumCraft;
import com.ThreeSquadIndie.FermiumCraft.lib.Reference;
import net.minecraft.item.Item;

/**
 * Created by Dethsanius on 13.03.14, project is forge package are com.ThreeSquadIndie.FermiumCraft.items.
 */
public class ItemFermiumCatalysisStar_Soft extends Item {
    public ItemFermiumCatalysisStar_Soft() {
        super();
        maxStackSize = 1;
        setCreativeTab(FermiumCraft.tabFermium);
        setUnlocalizedName("fermiumCatalysisStar_Soft");
        setTextureName(Reference.ItemFermiumCatalysisStar_Soft);
    }
}
