package com.ThreeSquadIndie.FermiumCraft.items;

import com.ThreeSquadIndie.FermiumCraft.lib.Materials;
import com.ThreeSquadIndie.FermiumCraft.lib.MultiTool;
import com.ThreeSquadIndie.FermiumCraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;

/**
 * Created by Dethsanius on 13.03.14, project is forge package are com.ThreeSquadIndie.FermiumCraft.items.
 */
public class ItemFermiumCatalysisStar extends ItemTool {
    public ItemFermiumCatalysisStar(ToolMaterial matt) {
        super(4.0F,matt);
        this.setHarvestLevel("pickaxe", 6);
        this.setUnlocalizedName("fermiumCatalysisStar");
        this.setTextureName(Reference.ItemFermiumCatalysisStar);
    }
}
