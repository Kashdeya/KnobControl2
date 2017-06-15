package com.kashdeya.knobcontrol.modulars;

import java.lang.reflect.Method;
import java.util.Random;

import com.kashdeya.knobcontrol.handlers.EventsHandler;
import com.kashdeya.knobcontrol.handlers.ModularsHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.Explosion;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Events {
	
	  Random generator = new Random();
	  
	  @SubscribeEvent
	  public void AttackEntity(AttackEntityEvent event){
		  if (ModularsHandler.events){
			  if ((!event.getTarget().worldObj.isRemote) && (!event.getEntityPlayer().capabilities.isCreativeMode)){
			      if (((event.getTarget() instanceof EntityCreeper)) && ((EventsHandler.Creepers_Boom) || (EventsHandler.Creepers_Potions))){
			    	  isCreeper(event.getTarget(), event.getEntityPlayer());}
			      else if (((event.getTarget() instanceof EntitySpider)) && (EventsHandler.Spiders)){
			    	  isSpider(event.getTarget(), event.getEntityPlayer());}
			      else if (((event.getTarget() instanceof EntityZombie)) && (EventsHandler.Zombies)){
			    	  isZombie(event.getTarget(), event.getEntityPlayer());}
			      else if (((event.getTarget() instanceof EntitySkeleton)) && (EventsHandler.Skeletons)){
			    	  isSkeleton(event.getTarget(), event.getEntityPlayer());}
			      else if (((event.getTarget() instanceof EntityCaveSpider)) && (EventsHandler.CaveSpiders)){
			    	  isCaveSpider(event.getTarget(), event.getEntityPlayer());}
			      else if (((event.getTarget() instanceof EntityEnderman)) && (EventsHandler.Endermen)){
			    	  isEnderman(event.getTarget(), event.getEntityPlayer());}
			      else if (((event.getTarget() instanceof EntityWitch)) && (EventsHandler.Witchs)){
			    	  isWitch(event.getTarget(), event.getEntityPlayer());}
			      else if (((event.getTarget() instanceof EntityBlaze)) && (EventsHandler.Blazes)){
			    	  isBlaze(event.getTarget(), event.getEntityPlayer());}
			      else if (((event.getTarget() instanceof EntityEndermite)) && (EventsHandler.Endermites)){
			    	  isEnderMite(event.getTarget(), event.getEntityPlayer());}
			      else if (((event.getTarget() instanceof EntityGhast)) && (EventsHandler.Ghasts)){
			    	  isGhast(event.getTarget(), event.getEntityPlayer());}
			      else if (((event.getTarget() instanceof EntityGuardian)) && (EventsHandler.Guardians)){
			    	  isGuardian(event.getTarget(), event.getEntityPlayer());}
			      else if (((event.getTarget() instanceof EntityMagmaCube)) && (EventsHandler.MagmaCubes)){
			    	  isMagmaCube(event.getTarget(), event.getEntityPlayer());}
			      else if (((event.getTarget() instanceof EntityPigZombie)) && (EventsHandler.PigZombies)){
			    	  isPigZombie(event.getTarget(), event.getEntityPlayer());}
			      else if (((event.getTarget() instanceof EntityPolarBear)) && (EventsHandler.Polarbears)){
			    	  isPolarBear(event.getTarget(), event.getEntityPlayer());}
			      else if (((event.getTarget() instanceof EntitySlime)) && (EventsHandler.Slimes)){
			    	  isSlime(event.getTarget(), event.getEntityPlayer());}
			      else if (((event.getTarget() instanceof EntitySilverfish)) && (EventsHandler.Silverfishs)){
			    	  isSilverfish(event.getTarget(), event.getEntityPlayer());}
			      return;
			    }
			  }
		  }
	  // look into effects and levels.
	  public void isSlime(Entity slime, EntityLivingBase player){
	    if (chance(EventsHandler.slimePotionChance)){
	    	if (EventsHandler.slimePlayerBlindness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, EventsHandler.slimeBlind * 20));
	    	}
	    	if (EventsHandler.slimePlayerNausea){
	    		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, EventsHandler.slimeNausea * 20));
	    	}
	    	if (EventsHandler.slimePlayerFatigue){
	    		player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, EventsHandler.slimeDigSlow * 20));
	    	}
	    	if (EventsHandler.slimePlayerInstant){
	    		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, EventsHandler.slimeInstant * 20));
	    	}
	    	if (EventsHandler.slimePlayerHunger){
	    		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, EventsHandler.slimeHunger * 20));
	    	}
	    	if (EventsHandler.slimePlayerSlowness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, EventsHandler.slimeMoveSlow * 20));
	    	}
	    	if (EventsHandler.slimePlayerPoison){
	    		player.addPotionEffect(new PotionEffect(MobEffects.POISON, EventsHandler.slimePoison * 20));
	    	}
	    	if (EventsHandler.slimePlayerWeakness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, EventsHandler.slimeWeakness * 20));
	    	}
	    	if (EventsHandler.slimePlayerWither){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WITHER, EventsHandler.slimeWither * 20));
	    	}
	    	if (EventsHandler.slimePlayerUnluck){
	    		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, EventsHandler.slimeUnluck * 20));
	    	}
	    }
	  }
	  
	  public void isPolarBear(Entity polarBear, EntityLivingBase player){
	    if (chance(EventsHandler.polarbearPotionChance))
	    {
	    	if (EventsHandler.polarbearPlayerBlindness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, EventsHandler.polarbearBlind * 20));
	    	}
	    	if (EventsHandler.polarbearPlayerNausea){
	    		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, EventsHandler.polarbearNausea * 20));
	    	}
	    	if (EventsHandler.polarbearPlayerFatigue){
	    		player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, EventsHandler.polarbearDigSlow * 20));
	    	}
	    	if (EventsHandler.polarbearPlayerInstant){
	    		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, EventsHandler.polarbearInstant * 20));
	    	}
	    	if (EventsHandler.polarbearPlayerHunger){
	    		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, EventsHandler.polarbearHunger * 20));
	    	}
	    	if (EventsHandler.polarbearPlayerSlowness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, EventsHandler.polarbearMoveSlow * 20));
	    	}
	    	if (EventsHandler.polarbearPlayerPoison){
	    		player.addPotionEffect(new PotionEffect(MobEffects.POISON, EventsHandler.polarbearPoison * 20));
	    	}
	    	if (EventsHandler.polarbearPlayerWeakness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, EventsHandler.polarbearWeakness * 20));
	    	}
	    	if (EventsHandler.polarbearPlayerWither){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WITHER, EventsHandler.polarbearWither * 20));
	    	}
	    	if (EventsHandler.polarbearPlayerUnluck){
	    		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, EventsHandler.polarbearUnluck * 20));
	    	}
	    }
	  }
	  
	  public void isEnderMite(Entity enderMite, EntityLivingBase player)
	  {
	    if (chance(EventsHandler.endermitePotionChance))
	    {
	    	if (EventsHandler.endermitePlayerBlindness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, EventsHandler.endermiteBlind * 20));
	    	}
	    	if (EventsHandler.endermitePlayerNausea){
	    		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, EventsHandler.endermiteNausea * 20));
	    	}
	    	if (EventsHandler.endermitePlayerFatigue){
	    		player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, EventsHandler.endermiteDigSlow * 20));
	    	}
	    	if (EventsHandler.endermitePlayerInstant){
	    		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, EventsHandler.endermiteInstant * 20));
	    	}
	    	if (EventsHandler.endermitePlayerHunger){
	    		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, EventsHandler.endermiteHunger * 20));
	    	}
	    	if (EventsHandler.endermitePlayerSlowness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, EventsHandler.endermiteMoveSlow * 20));
	    	}
	    	if (EventsHandler.endermitePlayerPoison){
	    		player.addPotionEffect(new PotionEffect(MobEffects.POISON, EventsHandler.endermitePoison * 20));
	    	}
	    	if (EventsHandler.endermitePlayerWeakness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, EventsHandler.endermiteWeakness * 20));
	    	}
	    	if (EventsHandler.endermitePlayerWither){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WITHER, EventsHandler.endermiteWither * 20));
	    	}
	    	if (EventsHandler.endermitePlayerUnluck){
	    		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, EventsHandler.endermiteUnluck * 20));
	    	}
	    }
	  }
	  
	  public void isGhast(Entity ghast, EntityLivingBase player)
	  {
	    if (chance(EventsHandler.ghastPotionChance))
	    {
	    	if (EventsHandler.ghastPlayerBlindness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, EventsHandler.ghastBlind * 20));
	    	}
	    	if (EventsHandler.ghastPlayerNausea){
	    		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, EventsHandler.ghastNausea * 20));
	    	}
	    	if (EventsHandler.ghastPlayerFatigue){
	    		player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, EventsHandler.ghastDigSlow * 20));
	    	}
	    	if (EventsHandler.ghastPlayerInstant){
	    		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, EventsHandler.ghastInstant * 20));
	    	}
	    	if (EventsHandler.ghastPlayerHunger){
	    		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, EventsHandler.ghastHunger * 20));
	    	}
	    	if (EventsHandler.ghastPlayerSlowness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, EventsHandler.ghastMoveSlow * 20));
	    	}
	    	if (EventsHandler.ghastPlayerPoison){
	    		player.addPotionEffect(new PotionEffect(MobEffects.POISON, EventsHandler.ghastPoison * 20));
	    	}
	    	if (EventsHandler.ghastPlayerWeakness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, EventsHandler.ghastWeakness * 20));
	    	}
	    	if (EventsHandler.ghastPlayerWither){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WITHER, EventsHandler.ghastWither * 20));
	    	}
	    	if (EventsHandler.ghastPlayerUnluck){
	    		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, EventsHandler.ghastUnluck * 20));
	    	}
	    }
	  }
	  
	  public void isGuardian(Entity guardian, EntityLivingBase player)
	  {
	    if (chance(EventsHandler.guardianPotionChance))
	    {
	    	if (EventsHandler.guardianPlayerBlindness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, EventsHandler.guardianBlind * 20));
	    	}
	    	if (EventsHandler.guardianPlayerNausea){
	    		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, EventsHandler.guardianNausea * 20));
	    	}
	    	if (EventsHandler.guardianPlayerFatigue){
	    		player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, EventsHandler.guardianDigSlow * 20));
	    	}
	    	if (EventsHandler.guardianPlayerInstant){
	    		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, EventsHandler.guardianInstant * 20));
	    	}
	    	if (EventsHandler.guardianPlayerHunger){
	    		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, EventsHandler.guardianHunger * 20));
	    	}
	    	if (EventsHandler.guardianPlayerSlowness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, EventsHandler.guardianMoveSlow * 20));
	    	}
	    	if (EventsHandler.guardianPlayerPoison){
	    		player.addPotionEffect(new PotionEffect(MobEffects.POISON, EventsHandler.guardianPoison * 20));
	    	}
	    	if (EventsHandler.guardianPlayerWeakness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, EventsHandler.guardianWeakness * 20));
	    	}
	    	if (EventsHandler.guardianPlayerWither){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WITHER, EventsHandler.guardianWither * 20));
	    	}
	    	if (EventsHandler.guardianPlayerUnluck){
	    		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, EventsHandler.guardianUnluck * 20));
	    	}
	    }
	  }
	  
	  public void isMagmaCube(Entity magmaCube, EntityLivingBase player)
	  {
	    if (chance(EventsHandler.magmacubePotionChance))
	    {
	    	if (EventsHandler.magmacubePlayerBlindness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, EventsHandler.magmacubeBlind * 20));
	    	}
	    	if (EventsHandler.magmacubePlayerNausea){
	    		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, EventsHandler.magmacubeNausea * 20));
	    	}
	    	if (EventsHandler.magmacubePlayerFatigue){
	    		player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, EventsHandler.magmacubeDigSlow * 20));
	    	}
	    	if (EventsHandler.magmacubePlayerInstant){
	    		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, EventsHandler.magmacubeInstant * 20));
	    	}
	    	if (EventsHandler.magmacubePlayerHunger){
	    		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, EventsHandler.magmacubeHunger * 20));
	    	}
	    	if (EventsHandler.magmacubePlayerSlowness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, EventsHandler.magmacubeMoveSlow * 20));
	    	}
	    	if (EventsHandler.magmacubePlayerPoison){
	    		player.addPotionEffect(new PotionEffect(MobEffects.POISON, EventsHandler.magmacubePoison * 20));
	    	}
	    	if (EventsHandler.magmacubePlayerWeakness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, EventsHandler.magmacubeWeakness * 20));
	    	}
	    	if (EventsHandler.magmacubePlayerWither){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WITHER, EventsHandler.magmacubeWither * 20));
	    	}
	    	if (EventsHandler.magmacubePlayerUnluck){
	    		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, EventsHandler.magmacubeUnluck * 20));
	    	}
	    }
	  }
	  
	  public void isPigZombie(Entity pigZombie, EntityLivingBase player)
	  {
	    if (chance(EventsHandler.pigzombiePotionChance))
	    {
	    	if (EventsHandler.pigzombiePlayerBlindness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, EventsHandler.pigzombieBlind * 20));
	    	}
	    	if (EventsHandler.pigzombiePlayerNausea){
	    		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, EventsHandler.pigzombieNausea * 20));
	    	}
	    	if (EventsHandler.pigzombiePlayerFatigue){
	    		player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, EventsHandler.pigzombieDigSlow * 20));
	    	}
	    	if (EventsHandler.pigzombiePlayerInstant){
	    		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, EventsHandler.pigzombieInstant * 20));
	    	}
	    	if (EventsHandler.pigzombiePlayerHunger){
	    		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, EventsHandler.pigzombieHunger * 20));
	    	}
	    	if (EventsHandler.pigzombiePlayerSlowness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, EventsHandler.pigzombieMoveSlow * 20));
	    	}
	    	if (EventsHandler.pigzombiePlayerPoison){
	    		player.addPotionEffect(new PotionEffect(MobEffects.POISON, EventsHandler.pigzombiePoison * 20));
	    	}
	    	if (EventsHandler.pigzombiePlayerWeakness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, EventsHandler.pigzombieWeakness * 20));
	    	}
	    	if (EventsHandler.pigzombiePlayerWither){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WITHER, EventsHandler.pigzombieWither * 20));
	    	}
	    	if (EventsHandler.pigzombiePlayerUnluck){
	    		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, EventsHandler.pigzombieUnluck * 20));
	    	}
	    }
	  }
	  
	  public void isSilverfish(Entity silverfish, EntityLivingBase player)
	  {
	    if (chance(EventsHandler.silverfishPotionChance))
	    {
	    	if (EventsHandler.silverfishPlayerBlindness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, EventsHandler.silverfishBlind * 20));
	    	}
	    	if (EventsHandler.silverfishPlayerNausea){
	    		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, EventsHandler.silverfishNausea * 20));
	    	}
	    	if (EventsHandler.silverfishPlayerFatigue){
	    		player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, EventsHandler.silverfishDigSlow * 20));
	    	}
	    	if (EventsHandler.silverfishPlayerInstant){
	    		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, EventsHandler.silverfishInstant * 20));
	    	}
	    	if (EventsHandler.silverfishPlayerHunger){
	    		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, EventsHandler.silverfishHunger * 20));
	    	}
	    	if (EventsHandler.silverfishPlayerSlowness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, EventsHandler.silverfishMoveSlow * 20));
	    	}
	    	if (EventsHandler.silverfishPlayerPoison){
	    		player.addPotionEffect(new PotionEffect(MobEffects.POISON, EventsHandler.silverfishPoison * 20));
	    	}
	    	if (EventsHandler.silverfishPlayerWeakness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, EventsHandler.silverfishWeakness * 20));
	    	}
	    	if (EventsHandler.silverfishPlayerWither){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WITHER, EventsHandler.silverfishWither * 20));
	    	}
	    	if (EventsHandler.silverfishPlayerUnluck){
	    		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, EventsHandler.silverfishUnluck * 20));
	    	}
	    }
	  }
	  
	  public void isBlaze(Entity blaze, EntityLivingBase player)
	  {
	    if (chance(EventsHandler.blazePotionChance))
	    {
	    	if (EventsHandler.blazePlayerBlindness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, EventsHandler.blazeBlind * 20));
	    	}
	    	if (EventsHandler.blazePlayerNausea){
	    		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, EventsHandler.blazeNausea * 20));
	    	}
	    	if (EventsHandler.blazePlayerFatigue){
	    		player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, EventsHandler.blazeDigSlow * 20));
	    	}
	    	if (EventsHandler.blazePlayerInstant){
	    		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, EventsHandler.blazeInstant * 20));
	    	}
	    	if (EventsHandler.blazePlayerHunger){
	    		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, EventsHandler.blazeHunger * 20));
	    	}
	    	if (EventsHandler.blazePlayerSlowness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, EventsHandler.blazeMoveSlow * 20));
	    	}
	    	if (EventsHandler.blazePlayerPoison){
	    		player.addPotionEffect(new PotionEffect(MobEffects.POISON, EventsHandler.blazePoison * 20));
	    	}
	    	if (EventsHandler.blazePlayerWeakness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, EventsHandler.blazeWeakness * 20));
	    	}
	    	if (EventsHandler.blazePlayerWither){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WITHER, EventsHandler.blazeWither * 20));
	    	}
	    	if (EventsHandler.blazePlayerUnluck){
	    		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, EventsHandler.blazeUnluck * 20));
	    	}
	    }
	  }
	  
	  public void isCaveSpider(Entity caveSpider, EntityLivingBase player)
	  {
	    if (chance(EventsHandler.caveSpiderPotionChance))
	    {
	    	if (EventsHandler.caveSpiderPlayerBlindness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, EventsHandler.caveSpiderBlind * 20));
	    	}
	    	if (EventsHandler.caveSpiderPlayerNausea){
	    		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, EventsHandler.caveSpiderNausea * 20));
	    	}
	    	if (EventsHandler.caveSpiderPlayerFatigue){
	    		player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, EventsHandler.caveSpiderDigSlow * 20));
	    	}
	    	if (EventsHandler.caveSpiderPlayerInstant){
	    		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, EventsHandler.caveSpiderInstant * 20));
	    	}
	    	if (EventsHandler.caveSpiderPlayerHunger){
	    		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, EventsHandler.caveSpiderHunger * 20));
	    	}
	    	if (EventsHandler.caveSpiderPlayerSlowness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, EventsHandler.caveSpiderMoveSlow * 20));
	    	}
	    	if (EventsHandler.caveSpiderPlayerPoison){
	    		player.addPotionEffect(new PotionEffect(MobEffects.POISON, EventsHandler.caveSpiderPoison * 20));
	    	}
	    	if (EventsHandler.caveSpiderPlayerWeakness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, EventsHandler.caveSpiderWeakness * 20));
	    	}
	    	if (EventsHandler.caveSpiderPlayerWither){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WITHER, EventsHandler.caveSpiderWither * 20));
	    	}
	    	if (EventsHandler.caveSpiderPlayerUnluck){
	    		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, EventsHandler.caveSpiderUnluck * 20));
	    	}
	    }
	  }
	  
	  public void isCreeper(Entity entity, EntityLivingBase player)
	  {
	    if ((EventsHandler.Creepers_Potions) && (chance(EventsHandler.creeperPotionChance)))
	    {
	    	if (EventsHandler.creeperPlayerBlindness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, EventsHandler.creeperBlind * 20));
	    	}
	    	if (EventsHandler.creeperPlayerNausea){
	    		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, EventsHandler.creeperNausea * 20));
	    	}
	    	if (EventsHandler.creeperPlayerFatigue){
	    		player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, EventsHandler.creeperDigSlow * 20));
	    	}
	    	if (EventsHandler.creeperPlayerInstant){
	    		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, EventsHandler.creeperInstant * 20));
	    	}
	    	if (EventsHandler.creeperPlayerHunger){
	    		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, EventsHandler.creeperHunger * 20));
	    	}
	    	if (EventsHandler.creeperPlayerSlowness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, EventsHandler.creeperMoveSlow * 20));
	    	}
	    	if (EventsHandler.creeperPlayerPoison){
	    		player.addPotionEffect(new PotionEffect(MobEffects.POISON, EventsHandler.creeperPoison * 20));
	    	}
	    	if (EventsHandler.creeperPlayerWeakness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, EventsHandler.creeperWeakness * 20));
	    	}
	    	if (EventsHandler.creeperPlayerWither){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WITHER, EventsHandler.creeperWither * 20));
	    	}
	    	if (EventsHandler.creeperPlayerUnluck){
	    		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, EventsHandler.creeperUnluck * 20));
	    	}
	    }
	    
	    if ((chance(EventsHandler.creeperBoomChance)))
	    {
	      EntityCreeper creeper = (EntityCreeper)entity;
	      
	      Class<?>[] name = new Class[0];
	      Object[] obj = new Object[0];
	      try
	      {
	        Method boom = creeper.getClass().getDeclaredMethod("boom", name);
	        boom.setAccessible(true);
	        boom.invoke(creeper, obj);
	      }
	      catch (Exception e)
	      {
	        Explosion explosion = new Explosion(creeper.worldObj, null, creeper.posX, creeper.posY, creeper.posZ, 3.0F, false, true);
	        explosion.doExplosionA();
	        explosion.doExplosionB(true);
	        
	        creeper.setDead();
	      }
	    }
	  }
	  
	  public void isSpider(Entity spider, EntityLivingBase player)
	  {
	    if (chance(EventsHandler.spiderPotionChance))
	    {
	    	if (EventsHandler.spiderPlayerBlindness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, EventsHandler.spiderBlind * 20));
	    	}
	    	if (EventsHandler.spiderPlayerNausea){
	    		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, EventsHandler.spiderNausea * 20));
	    	}
	    	if (EventsHandler.spiderPlayerFatigue){
	    		player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, EventsHandler.spiderDigSlow * 20));
	    	}
	    	if (EventsHandler.spiderPlayerInstant){
	    		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, EventsHandler.spiderInstant * 20));
	    	}
	    	if (EventsHandler.spiderPlayerHunger){
	    		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, EventsHandler.spiderHunger * 20));
	    	}
	    	if (EventsHandler.spiderPlayerSlowness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, EventsHandler.spiderMoveSlow * 20));
	    	}
	    	if (EventsHandler.spiderPlayerPoison){
	    		player.addPotionEffect(new PotionEffect(MobEffects.POISON, EventsHandler.spiderPoison * 20));
	    	}
	    	if (EventsHandler.spiderPlayerWeakness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, EventsHandler.spiderWeakness * 20));
	    	}
	    	if (EventsHandler.spiderPlayerWither){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WITHER, EventsHandler.spiderWither * 20));
	    	}
	    	if (EventsHandler.spiderPlayerUnluck){
	    		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, EventsHandler.spiderUnluck * 20));
	    	}
	    }
	  }
	  
	  public void isZombie(Entity zombie, EntityLivingBase player)
	  {
	    if (chance(EventsHandler.zombiePotionChance))
	    {
	    	if (EventsHandler.zombiePlayerBlindness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, EventsHandler.zombieBlind * 20));
	    	}
	    	if (EventsHandler.zombiePlayerNausea){
	    		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, EventsHandler.zombieNausea * 20));
	    	}
	    	if (EventsHandler.zombiePlayerFatigue){
	    		player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, EventsHandler.zombieDigSlow * 20));
	    	}
	    	if (EventsHandler.zombiePlayerInstant){
	    		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, EventsHandler.zombieInstant * 20));
	    	}
	    	if (EventsHandler.zombiePlayerHunger){
	    		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, EventsHandler.zombieHunger * 20));
	    	}
	    	if (EventsHandler.zombiePlayerSlowness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, EventsHandler.zombieMoveSlow * 20));
	    	}
	    	if (EventsHandler.zombiePlayerPoison){
	    		player.addPotionEffect(new PotionEffect(MobEffects.POISON, EventsHandler.zombiePoison * 20));
	    	}
	    	if (EventsHandler.zombiePlayerWeakness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, EventsHandler.zombieWeakness * 20));
	    	}
	    	if (EventsHandler.zombiePlayerWither){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WITHER, EventsHandler.zombieWither * 20));
	    	}
	    	if (EventsHandler.zombiePlayerUnluck){
	    		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, EventsHandler.zombieUnluck * 20));
	    	}
	    }
	  }
	  
	  public void isSkeleton(Entity skeleton, EntityLivingBase player)
	  {
	    if (chance(EventsHandler.skeletonPotionChance))
	    {
	    	if (EventsHandler.skeletonPlayerBlindness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, EventsHandler.skeletonBlind * 20));
	    	}
	    	if (EventsHandler.skeletonPlayerNausea){
	    		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, EventsHandler.skeletonNausea * 20));
	    	}
	    	if (EventsHandler.skeletonPlayerFatigue){
	    		player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, EventsHandler.skeletonDigSlow * 20));
	    	}
	    	if (EventsHandler.skeletonPlayerInstant){
	    		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, EventsHandler.skeletonInstant * 20));
	    	}
	    	if (EventsHandler.skeletonPlayerHunger){
	    		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, EventsHandler.skeletonHunger * 20));
	    	}
	    	if (EventsHandler.skeletonPlayerSlowness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, EventsHandler.skeletonMoveSlow * 20));
	    	}
	    	if (EventsHandler.skeletonPlayerPoison){
	    		player.addPotionEffect(new PotionEffect(MobEffects.POISON, EventsHandler.skeletonPoison * 20));
	    	}
	    	if (EventsHandler.skeletonPlayerWeakness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, EventsHandler.skeletonWeakness * 20));
	    	}
	    	if (EventsHandler.skeletonPlayerWither){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WITHER, EventsHandler.skeletonWither * 20));
	    	}
	    	if (EventsHandler.skeletonPlayerUnluck){
	    		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, EventsHandler.skeletonUnluck * 20));
	    	}
	    }
	  }
	  
	  public void isEnderman(Entity enderman, EntityLivingBase player)
	  {
	    if (chance(EventsHandler.endermanPotionChance))
	    {
	    	if (EventsHandler.endermanPlayerBlindness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, EventsHandler.endermanBlind * 20));
	    	}
	    	if (EventsHandler.endermanPlayerNausea){
	    		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, EventsHandler.endermanNausea * 20));
	    	}
	    	if (EventsHandler.endermanPlayerFatigue){
	    		player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, EventsHandler.endermanDigSlow * 20));
	    	}
	    	if (EventsHandler.endermanPlayerInstant){
	    		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, EventsHandler.endermanInstant * 20));
	    	}
	    	if (EventsHandler.endermanPlayerHunger){
	    		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, EventsHandler.endermanHunger * 20));
	    	}
	    	if (EventsHandler.endermanPlayerSlowness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, EventsHandler.endermanMoveSlow * 20));
	    	}
	    	if (EventsHandler.endermanPlayerPoison){
	    		player.addPotionEffect(new PotionEffect(MobEffects.POISON, EventsHandler.endermanPoison * 20));
	    	}
	    	if (EventsHandler.endermanPlayerWeakness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, EventsHandler.endermanWeakness * 20));
	    	}
	    	if (EventsHandler.endermanPlayerWither){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WITHER, EventsHandler.endermanWither * 20));
	    	}
	    	if (EventsHandler.endermanPlayerUnluck){
	    		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, EventsHandler.endermanUnluck * 20));
	    	}
	    }
	  }
	  
	  public void isWitch(Entity witch, EntityLivingBase player)
	  {
	    if (chance(EventsHandler.witchPotionChance))
	    {
	    	if (EventsHandler.witchPlayerBlindness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, EventsHandler.witchBlind * 20));
	    	}
	    	if (EventsHandler.witchPlayerNausea){
	    		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, EventsHandler.witchNausea * 20));
	    	}
	    	if (EventsHandler.witchPlayerFatigue){
	    		player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, EventsHandler.witchDigSlow * 20));
	    	}
	    	if (EventsHandler.witchPlayerInstant){
	    		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, EventsHandler.witchInstant * 20));
	    	}
	    	if (EventsHandler.witchPlayerHunger){
	    		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, EventsHandler.witchHunger * 20));
	    	}
	    	if (EventsHandler.witchPlayerSlowness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, EventsHandler.witchMoveSlow * 20));
	    	}
	    	if (EventsHandler.witchPlayerPoison){
	    		player.addPotionEffect(new PotionEffect(MobEffects.POISON, EventsHandler.witchPoison * 20));
	    	}
	    	if (EventsHandler.witchPlayerWeakness){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, EventsHandler.witchWeakness * 20));
	    	}
	    	if (EventsHandler.witchPlayerWither){
	    		player.addPotionEffect(new PotionEffect(MobEffects.WITHER, EventsHandler.witchWither * 20));
	    	}
	    	if (EventsHandler.witchPlayerUnluck){
	    		player.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, EventsHandler.witchUnluck * 20));
	    	}
	    }
	  }
	  
	@SubscribeEvent
	public void extraDrops(LivingDropsEvent event)
	{
		Random random = new Random();

		if (event.getEntity() == null)
			return;

		if (event.getEntity() instanceof EntityEnderman && EventsHandler.extraDropsEnderman)
		{
			ItemStack dropStack = new ItemStack(Items.ENDER_PEARL, 1 + random.nextInt(EventsHandler.endermanDrops));
			EntityItem dropEntity = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, dropStack);
			event.getDrops().add(dropEntity);
		}
	}
	
	@SubscribeEvent
	public void witherSpawn(EntityEvent event)
	{
		Entity getWither = event.getEntity();

		if (getWither != null && getWither instanceof EntityWither && EventsHandler.witherSpawn)
		{
			EntityWither wither = (EntityWither) getWither;
			if (wither.worldObj.provider.getDimension() == 0)
			{
				if (!event.getEntity().worldObj.isRemote)
				{
					ItemStack skulls = new ItemStack(Items.SKULL, 3, 1);
					event.getEntity().entityDropItem(skulls, 0.0F);
					
					ItemStack soulSand = new ItemStack(Blocks.SOUL_SAND, 3);
					event.getEntity().entityDropItem(soulSand, 0.0F);
				}
				wither.setDead();
			}
		}
	}
	  
	public boolean chance(int chance)
	{
	   int i = this.generator.nextInt(chance);
	   if (i + 1 == chance) {
		   return true;
	   }
	   return false;
	}
	
	@SubscribeEvent
	public void explosion(ExplosionEvent.Detonate event) {
		if (EventsHandler.creeperDamage){
			if (event.getExplosion().getExplosivePlacedBy() instanceof EntityCreeper) {
				event.getAffectedBlocks().clear();
			}
		}
	}
}
