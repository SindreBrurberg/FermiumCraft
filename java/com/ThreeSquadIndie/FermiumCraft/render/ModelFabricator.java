package com.ThreeSquadIndie.FermiumCraft.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Created by Dethsanius on 11.05.2014, project is 1.7.2 package are com.ThreeSquadIndie.FermiumCraft.render.
 */
public class ModelFabricator extends ModelBase {
    //fields
    ModelRenderer Pillar1;
    ModelRenderer Pillar2;
    ModelRenderer Pillar3;
    ModelRenderer Pillar4;
    ModelRenderer Conector1;
    ModelRenderer Conector2;
    ModelRenderer Conector3;
    ModelRenderer Conector4;
    ModelRenderer Window1;
    ModelRenderer Window2;
    ModelRenderer Window3;
    ModelRenderer Window4;
    ModelRenderer Window5;
    ModelRenderer WorkBenche1;
    ModelRenderer WorkBenche2;
    ModelRenderer Laser1;
    ModelRenderer Laser2;
    ModelRenderer Laser3;
    ModelRenderer Laser4;
    ModelRenderer Slide1;
    ModelRenderer Slide2;
    ModelRenderer Slide3;
    ModelRenderer Slide4;
    ModelRenderer Base;

    public ModelFabricator()
    {
        textureWidth = 64;
        textureHeight = 64;

        Pillar1 = new ModelRenderer(this, 30, 31);
        Pillar1.addBox(0F, 0F, 0F, 2, 15, 2);
        Pillar1.setRotationPoint(-8F, 8F, -8F);
        Pillar1.setTextureSize(64, 64);
        Pillar1.mirror = true;
        setRotation(Pillar1, 0F, 0F, 0F);
        Pillar2 = new ModelRenderer(this, 30, 31);
        Pillar2.addBox(0F, 0F, 0F, 2, 15, 2);
        Pillar2.setRotationPoint(6F, 8F, -8F);
        Pillar2.setTextureSize(64, 64);
        Pillar2.mirror = true;
        setRotation(Pillar2, 0F, 0F, 0F);
        Pillar3 = new ModelRenderer(this, 30, 31);
        Pillar3.addBox(0F, 0F, 0F, 2, 15, 2);
        Pillar3.setRotationPoint(-8F, 8F, 6F);
        Pillar3.setTextureSize(64, 64);
        Pillar3.mirror = true;
        setRotation(Pillar3, 0F, 0F, 0F);
        Pillar4 = new ModelRenderer(this, 30, 31);
        Pillar4.addBox(0F, 0F, 0F, 2, 15, 2);
        Pillar4.setRotationPoint(6F, 8F, 6F);
        Pillar4.setTextureSize(64, 64);
        Pillar4.mirror = true;
        setRotation(Pillar4, 0F, 0F, 0F);
        Conector1 = new ModelRenderer(this, 0, 49);
        Conector1.addBox(0F, 0F, 0F, 12, 1, 1);
        Conector1.setRotationPoint(-6F, 8F, 7F);
        Conector1.setTextureSize(64, 64);
        Conector1.mirror = true;
        setRotation(Conector1, 0F, 0F, 0F);
        Conector2 = new ModelRenderer(this, 0, 47);
        Conector2.addBox(0F, 0F, 0F, 12, 1, 1);
        Conector2.setRotationPoint(-6F, 8F, -8F);
        Conector2.setTextureSize(64, 64);
        Conector2.mirror = true;
        setRotation(Conector2, 0F, 0F, 0F);
        Conector3 = new ModelRenderer(this, 14, 50);
        Conector3.addBox(0F, 0F, 0F, 1, 1, 12);
        Conector3.setRotationPoint(-8F, 8F, -6F);
        Conector3.setTextureSize(64, 64);
        Conector3.mirror = true;
        setRotation(Conector3, 0F, 0F, 0F);
        Conector4 = new ModelRenderer(this, 0, 51);
        Conector4.addBox(0F, 0F, 0F, 1, 1, 12);
        Conector4.setRotationPoint(7F, 8F, -6F);
        Conector4.setTextureSize(64, 64);
        Conector4.mirror = true;
        setRotation(Conector4, 0F, 0F, 0F);
        Window1 = new ModelRenderer(this, 0, 19);
        Window1.addBox(0F, 0F, 0F, 0, 15, 13);
        Window1.setRotationPoint(7.5F, 8.5F, -6.5F);
        Window1.setTextureSize(64, 64);
        Window1.mirror = true;
        setRotation(Window1, 0F, 0F, 0F);
        Window2 = new ModelRenderer(this, 0, 19);
        Window2.addBox(0F, 0F, 0F, 0, 15, 13);
        Window2.setRotationPoint(-7.5F, 8.5F, -6.5F);
        Window2.setTextureSize(64, 64);
        Window2.mirror = true;
        setRotation(Window2, 0F, 0F, 0F);
        Window3 = new ModelRenderer(this, 0, 17);
        Window3.addBox(0F, 0F, 0F, 13, 15, 0);
        Window3.setRotationPoint(-6.5F, 8.5F, 7.5F);
        Window3.setTextureSize(64, 64);
        Window3.mirror = true;
        setRotation(Window3, 0F, 0F, 0F);
        Window4 = new ModelRenderer(this, 0, 17);
        Window4.addBox(0F, 0F, 0F, 13, 15, 0);
        Window4.setRotationPoint(-6.5F, 8.5F, -7.5F);
        Window4.setTextureSize(64, 64);
        Window4.mirror = true;
        setRotation(Window4, 0F, 0F, 0F);
        Window5 = new ModelRenderer(this, 12, 17);
        Window5.addBox(0F, 0F, 0F, 14, 0, 14);
        Window5.setRotationPoint(-7F, 8.5F, -7F);
        Window5.setTextureSize(64, 64);
        Window5.mirror = true;
        setRotation(Window5, -0.0174533F, 0F, 0F);
        WorkBenche1 = new ModelRenderer(this, 0, 0);
        WorkBenche1.addBox(0F, 0F, 0F, 3, 6, 3);
        WorkBenche1.setRotationPoint(-2F, 17F, 0F);
        WorkBenche1.setTextureSize(64, 64);
        WorkBenche1.mirror = true;
        setRotation(WorkBenche1, 0F, 0.7853982F, 0F);
        WorkBenche2 = new ModelRenderer(this, 52, 0);
        WorkBenche2.addBox(0F, 0F, 0F, 3, 6, 3);
        WorkBenche2.setRotationPoint(-1.5F, 17F, -1.5F);
        WorkBenche2.setTextureSize(64, 64);
        WorkBenche2.mirror = true;
        setRotation(WorkBenche2, 0F, 0F, 0F);
        Laser1 = new ModelRenderer(this, 56, 28);
        Laser1.addBox(0F, 0F, 0F, 1, 10, 1);
        Laser1.setRotationPoint(-6.7F, 9F, 7.4F);
        Laser1.setTextureSize(64, 64);
        Laser1.mirror = true;
        setRotation(Laser1, 0.9424778F, 2.356194F, 0F);
        Laser2 = new ModelRenderer(this, 60, 28);
        Laser2.addBox(0F, 0F, 0F, 1, 10, 1);
        Laser2.setRotationPoint(7.4F, 9F, 6.7F);
        Laser2.setTextureSize(64, 64);
        Laser2.mirror = true;
        setRotation(Laser2, 0.9424778F, -2.356194F, 0F);
        Laser3 = new ModelRenderer(this, 60, 17);
        Laser3.addBox(0F, 0F, 0F, 1, 10, 1);
        Laser3.setRotationPoint(-7.4F, 9F, -6.7F);
        Laser3.setTextureSize(64, 64);
        Laser3.mirror = true;
        setRotation(Laser3, 0.9424778F, 0.7853982F, 0F);
        Laser4 = new ModelRenderer(this, 56, 17);
        Laser4.addBox(0F, 0F, 0F, 1, 10, 1);
        Laser4.setRotationPoint(6.7F, 9F, -7.4F);
        Laser4.setTextureSize(64, 64);
        Laser4.mirror = true;
        setRotation(Laser4, 0.9424778F, -0.7853982F, 0F);
        Slide1 = new ModelRenderer(this, 38, 46);
        Slide1.addBox(0F, 0F, 0F, 12, 1, 1);
        Slide1.setRotationPoint(-6F, 8.7F, -7.7F);
        Slide1.setTextureSize(64, 64);
        Slide1.mirror = true;
        setRotation(Slide1, 0.7853982F, 0F, 0F);
        Slide2 = new ModelRenderer(this, 38, 44);
        Slide2.addBox(0F, 0F, 0F, 12, 1, 1);
        Slide2.setRotationPoint(-6F, 8.7F, 6.3F);
        Slide2.setTextureSize(64, 64);
        Slide2.mirror = true;
        setRotation(Slide2, 0.7853982F, 0F, 0F);
        Slide3 = new ModelRenderer(this, 38, 31);
        Slide3.addBox(0F, 0F, 0F, 1, 1, 12);
        Slide3.setRotationPoint(7F, 8F, -6F);
        Slide3.setTextureSize(64, 64);
        Slide3.mirror = true;
        setRotation(Slide3, 0F, 0F, 0.7853982F);
        Slide4 = new ModelRenderer(this, 38, 51);
        Slide4.addBox(0F, 0F, 0F, 1, 1, 12);
        Slide4.setRotationPoint(-7F, 8F, -6F);
        Slide4.setTextureSize(64, 64);
        Slide4.mirror = true;
        setRotation(Slide4, 0F, 0F, 0.7853982F);
        Base = new ModelRenderer(this, 0, 0);
        Base.addBox(0F, 0F, 0F, 16, 1, 16);
        Base.setRotationPoint(-8F, 23F, -8F);
        Base.setTextureSize(64, 64);
        Base.mirror = true;
        setRotation(Base, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Pillar1.render(f5);
        Pillar2.render(f5);
        Pillar3.render(f5);
        Pillar4.render(f5);
        Conector1.render(f5);
        Conector2.render(f5);
        Conector3.render(f5);
        Conector4.render(f5);
        Window1.render(f5);
        Window2.render(f5);
        Window3.render(f5);
        Window4.render(f5);
        Window5.render(f5);
        WorkBenche1.render(f5);
        WorkBenche2.render(f5);
        Laser1.render(f5);
        Laser2.render(f5);
        Laser3.render(f5);
        Laser4.render(f5);
        Slide1.render(f5);
        Slide2.render(f5);
        Slide3.render(f5);
        Slide4.render(f5);
        Base.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
