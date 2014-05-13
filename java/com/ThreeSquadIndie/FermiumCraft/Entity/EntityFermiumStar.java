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

    private void left(int math){
        this.worldObj.createExplosion(this, this.posX + math, this.posY - math, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY - math, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY - math, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY + math, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY + math, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY + math, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY, this.posZ + math, (float)5, true);
    }

    private void middle(int math){
        this.worldObj.createExplosion(this, this.posX, this.posY - math, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX, this.posY - math, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX, this.posY - math, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX, this.posY + math, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX, this.posY + math, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX, this.posY + math, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ + math, (float)5, true);
    }

    private void right(int math){
        this.worldObj.createExplosion(this, this.posX - math, this.posY - math, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY - math, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY - math, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY + math, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY + math, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY + math, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY, this.posZ - math, (float)5, true);
    }

    private void kvadrant1(int math){
        this.worldObj.createExplosion(this, this.posX - math, this.posY - math, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY + math, this.posZ - math, (float)5, true);
    }

    private void kvadrant2(int math){
        this.worldObj.createExplosion(this, this.posX - math, this.posY - math, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY + math, this.posZ + math, (float)5, true);
    }

    private void kvadrant3(int math){
        this.worldObj.createExplosion(this, this.posX + math, this.posY - math, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY + math, this.posZ - math, (float)5, true);
    }

    private void kvadrant4(int math){
        this.worldObj.createExplosion(this, this.posX + math, this.posY - math, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY + math, this.posZ + math, (float)5, true);
    }

    private void kvadrant5(int math){
        this.worldObj.createExplosion(this, this.posX, this.posY - math, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX, this.posY + math, this.posZ, (float)5, true);
    }

    private void kvadrant6(int math){
        this.worldObj.createExplosion(this, this.posX, this.posY - math, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ + math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX, this.posY + math, this.posZ + math, (float)5, true);
    }

    private void kvadrant7(int math){
        this.worldObj.createExplosion(this, this.posX, this.posY - math, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ - math, (float)5, true);
        this.worldObj.createExplosion(this, this.posX, this.posY + math, this.posZ - math, (float)5, true);
    }

    private void kvadrant8(int math){
        this.worldObj.createExplosion(this, this.posX - math, this.posY - math, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX - math, this.posY + math, this.posZ, (float)5, true);
    }

    private void kvadrant9(int math){
        this.worldObj.createExplosion(this, this.posX + math, this.posY - math, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX + math, this.posY, this.posZ, (float)5, true);
        this.worldObj.createExplosion(this, this.posX +  math, this.posY + math, this.posZ, (float)5, true);
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
        int length = 100000;
        int var = length / 100;
        if (!this.worldObj.isRemote) {
            this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "false");
            this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)5, true);
            this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "true");
            for (int i = 0; i <= length; ++i)
            {
                int math = i / var;
                if (num == var){
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "false");
                    kvadrant1(math);
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "true");
                    num = 0;
                }
                num++;
            }
            for (int i = 0; i <= length; ++i)
            {
                int math = i / var;
                if (num == var){
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "false");
                    kvadrant2(math);
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "true");
                    num = 0;
                }
                num++;
            }
            for (int i = 0; i <= length; ++i)
            {
                int math = i / var;
                if (num == var){
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "false");
                    kvadrant3(math);
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "true");
                    num = 0;
                }
                num++;
            }
            for (int i = 0; i <= length; ++i)
            {
                int math = i / var;
                if (num == var){
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "false");
                    kvadrant4(math);
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "true");
                    num = 0;
                }
                num++;
            }
            for (int i = 0; i <= length; ++i)
            {
                int math = i / var;
                if (num == var){
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "false");
                    kvadrant5(math);
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "true");
                    num = 0;
                }
                num++;
            }
            for (int i = 0; i <= length; ++i)
            {
                int math = i / var;
                if (num == var){
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "false");
                    kvadrant6(math);
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "true");
                    num = 0;
                }
                num++;
            }
            for (int i = 0; i <= length; ++i)
            {
                int math = i / var;
                if (num == var){
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "false");
                    kvadrant7(math);
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "true");
                    num = 0;
                }
                num++;
            }
            for (int i = 0; i <= length; ++i)
            {
                int math = i / var;
                if (num == var){
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "false");
                    kvadrant8(math);
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "true");
                    num = 0;
                }
                num++;
            }
            for (int i = 0; i <= length; ++i)
            {
                int math = i / var;
                if (num == var){
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "false");
                    kvadrant9(math);
                    this.worldObj.getGameRules().setOrCreateGameRule("doTileDrops", "true");
                    num = 0;
                }
                num++;
            }
            this.isDead = true;
        }
    }
}
