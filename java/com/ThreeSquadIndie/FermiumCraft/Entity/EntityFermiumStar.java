package com.ThreeSquadIndie.FermiumCraft.Entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

/**
 * Created by Dethsanius on 09.05.2014, project is forge InteliJ package are com.ThreeSquadIndie.FermiumCraft.Entity.
 */
public class EntityFermiumStar extends EntityThrowable {
    public EntityFermiumStar(World par1World)
    {
        super(par1World);
    }

    public EntityFermiumStar(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World, par2EntityLivingBase);
    }

    public EntityFermiumStar(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
        if (par1MovingObjectPosition.entityHit != null)
        {
            byte b0 = 0;

            if (par1MovingObjectPosition.entityHit instanceof EntityBlaze)
            {
                b0 = 1;
            }

            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)b0);
        }
        int num = 0;
        if (!this.worldObj.isRemote)
        {
            for (int i = 0; i < 100; ++i)
            {
                if (num == 5){
                    this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)5, true);
                    num = 0;
                }
                if (i == 99){

                    this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, (float)5, true, true);
                }
                num++;
            }
            this.isDead = true;
        }
    }
}
