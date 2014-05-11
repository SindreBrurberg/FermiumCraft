package com.ThreeSquadIndie.FermiumCraft.items;

import com.ThreeSquadIndie.FermiumCraft.FermiumCraft;
import com.ThreeSquadIndie.FermiumCraft.lib.MultiTool;
import com.ThreeSquadIndie.FermiumCraft.lib.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

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

    @Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
        ChatComponentText text = new ChatComponentText("derp");
        if(!world.isRemote){
            player.setHealth(20);
            player.closeScreen();
            player.addChatMessage(text);
        }
        return itemstack;
    }
}
