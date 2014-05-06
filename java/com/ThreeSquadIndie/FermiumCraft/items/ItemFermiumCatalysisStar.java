package com.ThreeSquadIndie.FermiumCraft.items;

import com.ThreeSquadIndie.FermiumCraft.FermiumCraft;
import com.ThreeSquadIndie.FermiumCraft.lib.Materials;
import com.ThreeSquadIndie.FermiumCraft.lib.MultiTool;
import com.ThreeSquadIndie.FermiumCraft.lib.Reference;
import net.minecraft.item.Item.ToolMaterial;

/**
 * Created by Dethsanius on 13.03.14, project is forge package are com.ThreeSquadIndie.FermiumCraft.items.
 */
public class ItemFermiumCatalysisStar extends MultiTool {
    public ItemFermiumCatalysisStar(ToolMaterial toolMaterial) {
        super(toolMaterial);
        maxStackSize = 1;
        setCreativeTab(FermiumCraft.tabFermium);
        setUnlocalizedName("fermiumCatalysisStar");
        setTextureName(Reference.ItemFermiumCatalysisStar);
    }
}
