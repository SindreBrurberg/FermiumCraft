package com.ThreeSquadIndie.FermiumCraft.proxy;

import com.ThreeSquadIndie.FermiumCraft.Entity.EntityFermiumStar;
import com.ThreeSquadIndie.FermiumCraft.Render.RenderFermiumStar;
import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * Created by Dethsanius on 12.03.14, project is forge package are com.ThreeSquadIndie.FermiumCraft.proxy.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(EntityFermiumStar.class, new RenderFermiumStar());
        // This is for rendering entities and so forth later on
    }

}