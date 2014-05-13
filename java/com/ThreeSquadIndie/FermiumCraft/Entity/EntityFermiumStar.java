package com.ThreeSquadIndie.FermiumCraft.entity;

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

    private void flat(int math){
        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY, this.posZ - math, (float)5, true);
    }

    private void up(int math){
        this.worldObj.createExplosion(this, this.posX, this.posY + math, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX, this.posY + math, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY + math, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX, this.posY + math, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY + math, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY + math, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY + math, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY + math, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY + math, this.posZ - math, (float)5, true);
    }

    private void down(int math){
        this.worldObj.createExplosion(this, this.posX, this.posY - math, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX, this.posY - math, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY - math, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX, this.posY - math, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY - math, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY - math, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY - math, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY - math, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY - math, this.posZ + math, (float)5, true);
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
        int var = 5;
        if (!this.worldObj.isRemote)
        {
            for (int i = 0; i < 1000; ++i)
            {
                int math = i / var;
                if (i == 0){
                    this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)5, true);
                }
                if (num == var - 4){
                    up(math);
                }
                else if (num == var - 2){
                    flat(math);
                }
                else if (num == var){
                    down(math);
                    num = 0;
                }
                if (i == 999){

                    this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, (float)5, true, true);
                }
                num++;
            }
            this.isDead = true;
        }
    }
}
