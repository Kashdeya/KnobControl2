package com.kashdeya.knobcontrol.modulars;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityGuardian;
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
import net.minecraft.entity.monster.ZombieType;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.kashdeya.knobcontrol.handlers.ModularsHandler;
import com.kashdeya.knobcontrol.handlers.RemoveDropsHandler;

public class RemoveDrops {
	
	@SubscribeEvent
	public void onEntityDrops(LivingDropsEvent event)
	{
		if (ModularsHandler.removeDrops){
		// Boss
			if (RemoveDropsHandler.dragon){
				if ((event.getEntityLiving() instanceof EntityDragon)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.wither){
				if ((event.getEntityLiving() instanceof EntityWither)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}		
		
		// Passive
			if (RemoveDropsHandler.bat){
				if ((event.getEntityLiving() instanceof EntityBat)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.chicken){
				if ((event.getEntityLiving() instanceof EntityChicken)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.cow){
				if ((event.getEntityLiving() instanceof EntityCow)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
			
			if (RemoveDropsHandler.horses){
				if ((event.getEntityLiving() instanceof EntityHorse)){
					EntityHorse horse = (EntityHorse)event.getEntity();
					if(horse.getEntityId() == 0){
						event.getDrops().removeAll(event.getDrops());
					}
					else if(horse.getHorseVariant() == 1) {
						event.getDrops().removeAll(event.getDrops());
					}
					else if(horse.getHorseVariant() == 2) {
						event.getDrops().removeAll(event.getDrops());
					}
				}
			}
		
			if (RemoveDropsHandler.mooshroom){
				if ((event.getEntityLiving() instanceof EntityMooshroom)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.ocelot){
				if ((event.getEntityLiving() instanceof EntityOcelot)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.pig){
				if ((event.getEntityLiving() instanceof EntityPig)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.rabbit){
				if ((event.getEntityLiving() instanceof EntityRabbit)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.sheep){
				if ((event.getEntityLiving() instanceof EntitySheep)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.squid){
				if ((event.getEntityLiving() instanceof EntitySquid)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.villager){
				if ((event.getEntityLiving() instanceof EntityVillager)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.wolf){
				if ((event.getEntityLiving() instanceof EntityWolf)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
			
			if (RemoveDropsHandler.creeper){
				if ((event.getEntityLiving() instanceof EntityCreeper)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.blaze){
				if ((event.getEntityLiving() instanceof EntityBlaze)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.caveSpider){
				if ((event.getEntityLiving() instanceof EntityCaveSpider)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.enderman){
				if ((event.getEntityLiving() instanceof EntityEnderman)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.endermite){
				if ((event.getEntityLiving() instanceof EntityEndermite)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.ghast){
				if ((event.getEntityLiving() instanceof EntityGhast)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.giantZombie){
				if ((event.getEntityLiving() instanceof EntityGiantZombie)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
			
			if (RemoveDropsHandler.guardians){
				if ((event.getEntityLiving() instanceof EntityGuardian)){
					EntityGuardian guardian = (EntityGuardian)event.getEntity();
					if(guardian.getEntityId() == 0){
						event.getDrops().removeAll(event.getDrops());
					}
					else {
						event.getDrops().removeAll(event.getDrops());
					}
				}
			}
		
			if (RemoveDropsHandler.magmaCube){
				if ((event.getEntityLiving() instanceof EntityMagmaCube)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.pigZombie){
				if ((event.getEntityLiving() instanceof EntityPigZombie)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.polarbear){
				if ((event.getEntityLiving() instanceof EntityPolarBear)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.shulker){
				if ((event.getEntityLiving() instanceof EntityShulker)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.silverfish){
				if ((event.getEntityLiving() instanceof EntitySilverfish)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if ((event.getEntityLiving() instanceof EntitySkeleton)){
				EntitySkeleton skeleton = (EntitySkeleton)event.getEntity();
				if(skeleton.getSkeletonType()== SkeletonType.NORMAL && RemoveDropsHandler.skeleton){
					event.getDrops().removeAll(event.getDrops());
				}
				else if (skeleton.getSkeletonType()== SkeletonType.WITHER && RemoveDropsHandler.witherSkeleton){
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.slime){
				if ((event.getEntityLiving() instanceof EntitySlime)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.snowman){
				if ((event.getEntityLiving() instanceof EntitySnowman)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.spider){
				if ((event.getEntityLiving() instanceof EntitySpider)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if (RemoveDropsHandler.witch){
				if ((event.getEntityLiving() instanceof EntityWitch)) {
					event.getDrops().removeAll(event.getDrops());
				}
			}
		
			if ((event.getEntityLiving() instanceof EntityZombie)){
				EntityZombie zombie = (EntityZombie)event.getEntity();
				if(zombie.isVillager() && RemoveDropsHandler.villagerZombie){
					event.getDrops().removeAll(event.getDrops());
				}
				else if (RemoveDropsHandler.zombie){
					event.getDrops().removeAll(event.getDrops());
				}
			}
		}
	}
}
