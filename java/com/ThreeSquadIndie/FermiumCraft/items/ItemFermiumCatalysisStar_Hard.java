package com.ThreeSquadIndie.FermiumCraft.items;

import com.ThreeSquadIndie.FermiumCraft.FermiumCraft;
import com.ThreeSquadIndie.FermiumCraft.lib.MultiTool;
import com.ThreeSquadIndie.FermiumCraft.lib.Reference;

/**
 * Created by Dethsanius on 13.03.14, project is forge package are com.ThreeSquadIndie.FermiumCraft.items.
 */
public class ItemFermiumCatalysisStar_Hard extends MultiTool {
    public ItemFermiumCatalysisStar_Hard(ToolMaterial toolMaterial) {
        super(toolMaterial);
        maxStackSize = 1;
        setCreativeTab(FermiumCraft.tabFermium);
        setUnlocalizedName("fermiumCatalysisStar_Hard");
        setTextureName(Reference.ItemFermiumCatalysisStar_Hard);
    }
}
