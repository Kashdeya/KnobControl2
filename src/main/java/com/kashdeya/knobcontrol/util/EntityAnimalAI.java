package com.kashdeya.knobcontrol.util;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;

public class EntityAnimalAI{

	 static class AIHurtByAggressor extends EntityAIHurtByTarget
     {
         public AIHurtByAggressor(EntityAnimal p_i45828_1_)
         {
             super(p_i45828_1_, true);
         }

         protected void setEntityAttackTarget(EntityCreature creatureIn, EntityLivingBase entityLivingBaseIn)
         {
             super.setEntityAttackTarget(creatureIn, entityLivingBaseIn);

             if (creatureIn instanceof EntityAnimal)
             {
                 ((EntityAnimal)creatureIn).becomeAngryAt(entityLivingBaseIn);
             }
         }
     }

 static class AITargetAggressor extends EntityAINearestAttackableTarget<EntityPlayer>
     {
         public AITargetAggressor(EntityAnimal p_i45829_1_)
         {
             super(p_i45829_1_, EntityPlayer.class, true);
         }

         /**
          * Returns whether the EntityAIBase should begin execution.
          */
         public boolean shouldExecute()
         {
             return ((EntityAnimal)this.taskOwner).isAngry() && super.shouldExecute();
         }
     }
 
}
