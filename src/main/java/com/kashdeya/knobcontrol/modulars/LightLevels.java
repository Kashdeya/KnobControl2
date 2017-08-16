package com.kashdeya.knobcontrol.modulars;

import com.kashdeya.knobcontrol.handlers.LightLevelHandler;
import com.kashdeya.knobcontrol.handlers.ModularsHandler;

import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
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
import net.minecraft.entity.monster.EntityWitherSkeleton;
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
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumSkyBlock;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LightLevels {
	
	@SubscribeEvent
	public void onLivingSpawnCheckSpawnEvent(LivingSpawnEvent.CheckSpawn event) {
		if (ModularsHandler.lightLevels) {
			
			// Mobs
			if (event.getEntityLiving() instanceof EntityBlaze && LightLevelHandler.Blaze) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityBlaze) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityCaveSpider && LightLevelHandler.CaveSpider) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityCaveSpider) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityCreeper && LightLevelHandler.Creeper) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityCreeper) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityEnderman && LightLevelHandler.Enderman) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityEnderman) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityEndermite && LightLevelHandler.Endermite) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityEndermite) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityGhast && LightLevelHandler.Ghast) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityGhast) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityGiantZombie && LightLevelHandler.GiantZombie) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityGiantZombie) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityIronGolem && LightLevelHandler.IronGolem) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityIronGolem) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityMagmaCube && LightLevelHandler.MagmaCube) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityMagmaCube) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityPigZombie && LightLevelHandler.PigZombie) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityPigZombie) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityPolarBear && LightLevelHandler.PolarBear) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityPolarBear) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityShulker && LightLevelHandler.Shulker) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityShulker) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntitySilverfish && LightLevelHandler.Silverfish) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntitySilverfish) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntitySkeleton && LightLevelHandler.Skeleton) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntitySkeleton) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityWitherSkeleton && LightLevelHandler.WitherSkeleton) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityWitherSkeleton) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntitySlime && LightLevelHandler.Slime) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntitySlime) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntitySnowman && LightLevelHandler.Snowman) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntitySnowman) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntitySpider && LightLevelHandler.Spider) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntitySpider) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityWitch && LightLevelHandler.Witch) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityWitch) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityZombie && LightLevelHandler.Zombie) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityZombie) {
					event.setResult(Result.DENY);
				}
			}
			
			// passive
			if (event.getEntityLiving() instanceof EntityBat && LightLevelHandler.Bat) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityBat) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityChicken && LightLevelHandler.Chicken) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityChicken) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityCow && LightLevelHandler.Cow) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityCow) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityHorse && LightLevelHandler.Horse) {
				EntityHorse horse = (EntityHorse)event.getEntity();
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (horse.getHorseVariant() == 0 && blockLight > LightLevelHandler.EntityHorse) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityHorse && LightLevelHandler.Donkey) {
				EntityHorse horse = (EntityHorse)event.getEntity();
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (horse.getHorseVariant() == 1 && blockLight > LightLevelHandler.EntityDonkey) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityHorse && LightLevelHandler.Mule) {
				EntityHorse horse = (EntityHorse)event.getEntity();
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (horse.getHorseVariant() == 2 && blockLight > LightLevelHandler.EntityMule) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityMooshroom && LightLevelHandler.Mooshroom) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityMooshroom) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityOcelot && LightLevelHandler.Ocelot) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityOcelot) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityPig && LightLevelHandler.Pig) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityPig) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityRabbit && LightLevelHandler.Rabbit) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityRabbit) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntitySheep && LightLevelHandler.Sheep) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntitySheep) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityVillager && LightLevelHandler.Villager) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityVillager) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityWolf && LightLevelHandler.Wolf) {
				int blockLight = event.getWorld().getLightFor(EnumSkyBlock.BLOCK, new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (blockLight > LightLevelHandler.EntityWolf) {
					event.setResult(Result.DENY);
				}
			}
		}
	}

}
