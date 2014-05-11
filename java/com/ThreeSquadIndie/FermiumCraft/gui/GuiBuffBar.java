package com.ThreeSquadIndie.FermiumCraft.gui;

import com.ThreeSquadIndie.FermiumCraft.lib.Reference;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.opengl.GL11;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Dethsanius on 11.05.2014, project is 1.7.2 package are com.ThreeSquadIndie.FermiumCraft.gui.
 */
public class GuiBuffBar extends Gui
{
    private Minecraft mc;

    public GuiBuffBar(Minecraft mc)
    {
        super();

        // We need this to invoke the render engine.
        this.mc = mc;
    }

    private static final int BUFF_ICON_SIZE = 18;
    private static final int BUFF_ICON_SPACING = BUFF_ICON_SIZE + 2; // 2 pixels between buff icons
    private static final int BUFF_ICON_BASE_U_OFFSET = 0;
    private static final int BUFF_ICON_BASE_V_OFFSET = 198;
    private static final int BUFF_ICONS_PER_ROW = 8;
    ResourceLocation gui = (new ResourceLocation(Reference.InventoryGui));

    //
    // This event is called by GuiIngameForge during each frame by
    // GuiIngameForge.pre() and GuiIngameForce.post().
    //
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void onRenderExperienceBar(RenderGameOverlayEvent event)
    {
        //
        // We draw after the ExperienceBar has drawn.  The event raised by GuiIngameForge.pre()
        // will return true from isCancelable.  If you call event.setCanceled(true) in
        // that case, the portion of rendering which this event represents will be canceled.
        // We want to draw *after* the experience bar is drawn, so we make sure isCancelable() returns
        // false and that the eventType represents the ExperienceBar event.
        if(event.isCancelable() || event.type != RenderGameOverlayEvent.ElementType.EXPERIENCE)
        {
            return;
        }

        // Starting position for the buff bar - 2 pixels from the top left corner.
        int xPos = 2;
        int yPos = 2;
        Collection collection = this.mc.thePlayer.getActivePotionEffects();
        if (!collection.isEmpty())
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(GL11.GL_LIGHTING);
            this.mc.renderEngine.bindTexture(gui);

            for (Iterator iterator = this.mc.thePlayer.getActivePotionEffects()
                    .iterator(); iterator.hasNext(); xPos += BUFF_ICON_SPACING)
            {
                PotionEffect potioneffect = (PotionEffect) iterator.next();
                Potion potion = Potion.potionTypes[potioneffect.getPotionID()];

                if (potion.hasStatusIcon())
                {
                    int iconIndex = potion.getStatusIconIndex();
                    this.drawTexturedModalRect(
                            xPos, yPos,
                            BUFF_ICON_BASE_U_OFFSET + iconIndex % BUFF_ICONS_PER_ROW * BUFF_ICON_SIZE, BUFF_ICON_BASE_V_OFFSET + iconIndex / BUFF_ICONS_PER_ROW * BUFF_ICON_SIZE,
                            BUFF_ICON_SIZE, BUFF_ICON_SIZE);
                }
            }
        }
    }
}
