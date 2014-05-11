package com.ThreeSquadIndie.FermiumCraft.proxy;

import com.ThreeSquadIndie.FermiumCraft.entity.EntityFermiumStar;
import com.ThreeSquadIndie.FermiumCraft.entity.TileEntityFabricator;
import com.ThreeSquadIndie.FermiumCraft.items.ModItems;
import com.ThreeSquadIndie.FermiumCraft.render.RenderFabricator;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;

/**
 * Created by Dethsanius on 12.03.14, project is forge package are com.ThreeSquadIndie.FermiumCraft.proxy.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(EntityFermiumStar.class, new RenderSnowball(ModItems.itemFermiumStar_Hard));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFabricator.class, new RenderFabricator());
        // This is for rendering entities and so forth later on
    }

}