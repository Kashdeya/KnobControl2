package com.kashdeya.knobcontrol.modulars;

import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.SkeletonType;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.kashdeya.knobcontrol.handlers.ModularsHandler;
import com.kashdeya.knobcontrol.handlers.RemoveMobsHandler;

public class RemoveMobs {
	
	@SubscribeEvent
	public void onEntitySpawn(EntityJoinWorldEvent event){
		if (ModularsHandler.removeMobs){
			if(event.getEntity() instanceof EntityBat && RemoveMobsHandler.bat){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityChicken && RemoveMobsHandler.chicken){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityCow && RemoveMobsHandler.cow){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityMooshroom && RemoveMobsHandler.mooshroom){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityPig && RemoveMobsHandler.pig){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntitySheep && RemoveMobsHandler.sheep){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntitySquid && RemoveMobsHandler.squid){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityVillager && RemoveMobsHandler.villager){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityHorse){
				EntityHorse horse = (EntityHorse)event.getEntity();
				if(horse.getHorseVariant() == 0 && RemoveMobsHandler.horse){
					event.setCanceled(true);
				}
				else if(horse.getHorseVariant() == 1 && RemoveMobsHandler.donkey){
					event.setCanceled(true);
				}
				else if(horse.getHorseVariant() == 2 && RemoveMobsHandler.mule){
					event.setCanceled(true);
				}
			}
			else if(event.getEntity() instanceof EntityOcelot && RemoveMobsHandler.ocelot){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityEndermite && RemoveMobsHandler.endermite){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityWolf && RemoveMobsHandler.wolf){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityIronGolem && RemoveMobsHandler.ironGolem){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntitySnowman && RemoveMobsHandler.snowGolem){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntitySpider && RemoveMobsHandler.spider){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityCaveSpider && RemoveMobsHandler.caveSpider){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityEnderman && RemoveMobsHandler.enderman){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityPigZombie && RemoveMobsHandler.zombiePigman){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityBlaze && RemoveMobsHandler.blaze){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityCreeper && RemoveMobsHandler.creeper){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityGhast && RemoveMobsHandler.ghast){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityMagmaCube && RemoveMobsHandler.magmaCube){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntitySilverfish && RemoveMobsHandler.silverfish){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntitySlime && RemoveMobsHandler.slime){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityPolarBear && RemoveMobsHandler.polarBear){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityShulker && RemoveMobsHandler.shulker){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntityGuardian){
				EntityGuardian guardian = (EntityGuardian)event.getEntity();
				if(guardian.isElder() == false && RemoveMobsHandler.guardian){
					event.setCanceled(true);
				}
				else if(guardian.isElder() && RemoveMobsHandler.elderGuardian){
					event.setCanceled(true);
				}
			}
			else if(event.getEntity() instanceof EntityWitch && RemoveMobsHandler.witch){
				event.setCanceled(true);
			}
			else if(event.getEntity() instanceof EntitySkeleton){
				EntitySkeleton skeleton = (EntitySkeleton)event.getEntity();
				if(skeleton.getSkeletonType()== SkeletonType.NORMAL && RemoveMobsHandler.skeleton){
					event.setCanceled(true);
				}
				else if(skeleton.getSkeletonType()== SkeletonType.WITHER && RemoveMobsHandler.witherSkeleton){
					event.setCanceled(true);
				}
			}
			else if(event.getEntity() instanceof EntityZombie){
				EntityZombie zombie = (EntityZombie)event.getEntity();
				if(zombie.isVillager() && RemoveMobsHandler.zombieVillager){
					event.setCanceled(true);
				}
				else if(RemoveMobsHandler.zombie) {
					event.setCanceled(true);
				}
			}
			else if(event.getEntity() instanceof EntityWither && RemoveMobsHandler.wither){
				event.setCanceled(true);
			}
		}
	}

}
