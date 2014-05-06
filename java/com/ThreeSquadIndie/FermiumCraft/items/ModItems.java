package com.ThreeSquadIndie.FermiumCraft.items;

import com.ThreeSquadIndie.FermiumCraft.lib.Materials;
import net.minecraft.item.*;

/**
 * Created by Dethsanius on 12.03.14, project is forge package are com.ThreeSquadIndie.FermiumCraft.items.
 */
public class ModItems {
    public static ItemAxe itemFermiumAxe;
    public static Item itemFermiumHoe;
    public static Item itemFermiumIngot;
    public static Item itemFermiumNugget;
    public static Item itemFermiumPickaxe;
    public static Item itemFermiumShovel;
    public static Item itemFermiumStar;
    public static Item itemFermiumCatalysisStar;
    public static Item itemFermiumSword;

    public static void init() {
        itemFermiumAxe = new ItemFermiumAxe(Materials.fermiuamMaterial);
        itemFermiumHoe = new ItemFermiumHoe(Materials.fermiuamMaterial);
        itemFermiumIngot = new ItemFermiumIngot();
        itemFermiumNugget = new ItemFermiumNugget();
        itemFermiumPickaxe = new ItemFermiumPickaxe(Materials.fermiuamMaterial);
        itemFermiumShovel = new ItemFermiumShovel(Materials.fermiuamMaterial);
        itemFermiumStar = new ItemFermiumStar();
        itemFermiumCatalysisStar = new ItemFermiumCatalysisStar(Materials.fermiuamMaterial);
        itemFermiumSword = new ItemFermiumSword(Materials.fermiuamMaterial);
    }
}
