package com.kashdeya.knobcontrol.modulars;

import java.util.Random;

import com.kashdeya.knobcontrol.handlers.ModularsHandler;
import com.kashdeya.knobcontrol.handlers.RandomBonesHandler;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RandomBones {
	
	Random rand = new Random();
	
	@SubscribeEvent
	  public void onEntityDrop(LivingDropsEvent event){
		  if (ModularsHandler.randomBones){
			  if ((event.getEntity() instanceof EntityPlayer)) {
				  if (event.getEntityLiving() != null){
					  EntityLivingBase entity = event.getEntityLiving();
					  if(
							  // Passive
							  ((entity instanceof EntityBat && RandomBonesHandler.batBones)) ||
							  ((entity instanceof EntityChicken && RandomBonesHandler.chickenBones)) ||
							  ((entity instanceof EntityCow && RandomBonesHandler.cowBones)) ||
							  ((entity instanceof EntityHorse && RandomBonesHandler.horseBones)) ||
							  ((entity instanceof EntityMooshroom && RandomBonesHandler.mooshroomBones)) ||
							  ((entity instanceof EntityOcelot && RandomBonesHandler.ocelotBones)) ||
							  ((entity instanceof EntityPig && RandomBonesHandler.pigBones)) ||
							  ((entity instanceof EntityRabbit && RandomBonesHandler.rabbitBones)) ||
							  ((entity instanceof EntitySheep && RandomBonesHandler.sheepBones)) ||
							  ((entity instanceof EntityWolf && RandomBonesHandler.wolfBones)) ||
							  // Hostile
							  ((entity instanceof EntityCreeper && RandomBonesHandler.creeperBones)) ||
							  ((entity instanceof EntityGiantZombie && RandomBonesHandler.giantZombieBones)) ||
							  ((entity instanceof EntityZombie && RandomBonesHandler.zombieBones)) ||
							  ((entity instanceof EntityPigZombie && RandomBonesHandler.pigZombieBones)) ||
							  ((entity instanceof EntityPolarBear && RandomBonesHandler.polarBearBones)) ||
							  ((entity instanceof EntitySpider && RandomBonesHandler.spiderBones)) ||
							  ((entity instanceof EntityCaveSpider && RandomBonesHandler.caveSpiderBones)) ||
							  ((entity instanceof EntityEnderman && RandomBonesHandler.endermanBones)) ||
							  ((entity instanceof EntityEndermite && RandomBonesHandler.endermiteBones)) ||
							  ((entity instanceof EntityGuardian && RandomBonesHandler.guardianBones)) ||
							  ((entity instanceof EntityShulker && RandomBonesHandler.shulkerBones)) ||
							  ((entity instanceof EntityWitch && RandomBonesHandler.witchBones)) ||
							  ((entity instanceof EntityGhast && RandomBonesHandler.ghastBones)) ||
							  ((entity instanceof EntitySilverfish && RandomBonesHandler.ghastBones))
							  )
					  {
						  int amount = this.rand.nextInt(3);
						  entity.entityDropItem(new ItemStack(Items.BONE, amount + 1), 0.0F);
						  }
					  }
				  }
			  }
		  }

}
