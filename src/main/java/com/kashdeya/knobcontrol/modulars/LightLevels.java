package com.kashdeya.knobcontrol.modulars;

import com.kashdeya.knobcontrol.handlers.LightLevelHandler;
import com.kashdeya.knobcontrol.handlers.ModularsHandler;

import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumSkyBlock;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LightLevels {
	
	@SubscribeEvent
	public void onLivingSpawnCheckSpawnEvent(LivingSpawnEvent.CheckSpawn event) {
		if (ModularsHandler.lightLevels) {
			if (event.getEntityLiving() instanceof EntityBlaze && LightLevelHandler.Blaze) {
				int skyLight = event.getWorld().getLightFor(EnumSkyBlock.SKY, 
						new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (skyLight > LightLevelHandler.EntityBlaze) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityCaveSpider && LightLevelHandler.CaveSpider) {
				int skyLight = event.getWorld().getLightFor(EnumSkyBlock.SKY,
						new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (skyLight > LightLevelHandler.EntityCaveSpider) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityCreeper && LightLevelHandler.Creeper) {
				int skyLight = event.getWorld().getLightFor(EnumSkyBlock.SKY,
						new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (skyLight > LightLevelHandler.EntityCreeper) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityEnderman && LightLevelHandler.Enderman) {
				int skyLight = event.getWorld().getLightFor(EnumSkyBlock.SKY,
						new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (skyLight > LightLevelHandler.EntityEnderman) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityGhast && LightLevelHandler.Ghast) {
				int skyLight = event.getWorld().getLightFor(EnumSkyBlock.SKY,
						new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (skyLight > LightLevelHandler.EntityGhast) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityGiantZombie && LightLevelHandler.GiantZombie) {
				int skyLight = event.getWorld().getLightFor(EnumSkyBlock.SKY,
						new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (skyLight > LightLevelHandler.EntityGiantZombie) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityMagmaCube && LightLevelHandler.MagmaCube) {
				int skyLight = event.getWorld().getLightFor(EnumSkyBlock.SKY,
						new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (skyLight > LightLevelHandler.EntityMagmaCube) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityPigZombie && LightLevelHandler.PigZombie) {
				int skyLight = event.getWorld().getLightFor(EnumSkyBlock.SKY,
						new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (skyLight > LightLevelHandler.EntityPigZombie) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntitySkeleton && LightLevelHandler.Skeleton) {
				int skyLight = event.getWorld().getLightFor(EnumSkyBlock.SKY,
						new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (skyLight > LightLevelHandler.EntitySkeleton) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntitySlime && LightLevelHandler.Slime) {
				int skyLight = event.getWorld().getLightFor(EnumSkyBlock.SKY,
						new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (skyLight > LightLevelHandler.EntitySlime) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntitySpider && LightLevelHandler.Spider) {
				int skyLight = event.getWorld().getLightFor(EnumSkyBlock.SKY,
						new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (skyLight > LightLevelHandler.EntitySpider) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityWitch && LightLevelHandler.Witch) {
				int skyLight = event.getWorld().getLightFor(EnumSkyBlock.SKY,
						new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (skyLight > LightLevelHandler.EntityWitch) {
					event.setResult(Result.DENY);
				}
			}
			
			if (event.getEntityLiving() instanceof EntityZombie && LightLevelHandler.Zombie) {
				int skyLight = event.getWorld().getLightFor(EnumSkyBlock.SKY,
						new BlockPos(event.getX(), event.getY(), event.getZ()));
				if (skyLight > LightLevelHandler.EntityZombie) {
					event.setResult(Result.DENY);
				}
			}
		}
	}

}
