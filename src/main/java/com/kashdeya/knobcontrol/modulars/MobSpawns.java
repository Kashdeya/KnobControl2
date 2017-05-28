package com.kashdeya.knobcontrol.modulars;

import com.kashdeya.knobcontrol.handlers.MobSpawnsHandler;
import com.kashdeya.knobcontrol.handlers.ModularsHandler;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
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
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome.SpawnListEntry;

public class MobSpawns {
	
	public static void spawn(){
		if (ModularsHandler.mobSpawns){
			if (MobSpawnsHandler.Blaze){
				if (MobSpawnsHandler.NetherBlaze){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityBlaze.class, MobSpawnsHandler.NetherBlazeWeight, MobSpawnsHandler.NetherBlazeMin, MobSpawnsHandler.NetherBlazeMax));
		    	}
				if (MobSpawnsHandler.BeachBlaze){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityBlaze.class, MobSpawnsHandler.BeachBlazeWeight, MobSpawnsHandler.BeachBlazeMin, MobSpawnsHandler.BeachBlazeMax));
		    	}
				if (MobSpawnsHandler.DesertBlaze){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityBlaze.class, MobSpawnsHandler.DesertBlazeWeight, MobSpawnsHandler.DesertBlazeMin, MobSpawnsHandler.DesertBlazeMax));
		    	}
				if (MobSpawnsHandler.ExtremeBlaze){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityBlaze.class, MobSpawnsHandler.ExtremeBlazeWeight, MobSpawnsHandler.ExtremeBlazeMin, MobSpawnsHandler.ExtremeBlazeMax));
		    	}
				if (MobSpawnsHandler.ForestBlaze){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityBlaze.class, MobSpawnsHandler.ForestBlazeWeight, MobSpawnsHandler.ForestBlazeMin, MobSpawnsHandler.ForestBlazeMax));
		    	}
				if (MobSpawnsHandler.JungleBlaze){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityBlaze.class, MobSpawnsHandler.JungleBlazeWeight, MobSpawnsHandler.JungleBlazeMin, MobSpawnsHandler.JungleBlazeMax));
		    	}
				if (MobSpawnsHandler.MesaBlaze){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityBlaze.class, MobSpawnsHandler.MesaBlazeWeight, MobSpawnsHandler.MesaBlazeMin, MobSpawnsHandler.MesaBlazeMax));
		    	}
				if (MobSpawnsHandler.PlainsBlaze){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityBlaze.class, MobSpawnsHandler.PlainsBlazeWeight, MobSpawnsHandler.PlainsBlazeMin, MobSpawnsHandler.PlainsBlazeMax));
		    	}
				if (MobSpawnsHandler.SavannaBlaze){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityBlaze.class, MobSpawnsHandler.SavannaBlazeWeight, MobSpawnsHandler.SavannaBlazeMin, MobSpawnsHandler.SavannaBlazeMax));
		    	}
				if (MobSpawnsHandler.SwampBlaze){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityBlaze.class, MobSpawnsHandler.SwampBlazeWeight, MobSpawnsHandler.SwampBlazeMin, MobSpawnsHandler.SwampBlazeMax));
		    	}
				if (MobSpawnsHandler.TaigaBlaze){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityBlaze.class, MobSpawnsHandler.TaigaBlazeWeight, MobSpawnsHandler.TaigaBlazeMin, MobSpawnsHandler.TaigaBlazeMax));
		    	}
				if (MobSpawnsHandler.EndBlaze){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityBlaze.class, MobSpawnsHandler.EndBlazeWeight, MobSpawnsHandler.EndBlazeMin, MobSpawnsHandler.EndBlazeMax));
		    	}
			}
			if (MobSpawnsHandler.CaveSpider){
				if (MobSpawnsHandler.NetherCaveSpider){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCaveSpider.class, MobSpawnsHandler.NetherCaveSpiderWeight, MobSpawnsHandler.NetherCaveSpiderMin, MobSpawnsHandler.NetherCaveSpiderMax));
		    	}
				if (MobSpawnsHandler.BeachCaveSpider){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCaveSpider.class, MobSpawnsHandler.BeachCaveSpiderWeight, MobSpawnsHandler.BeachCaveSpiderMin, MobSpawnsHandler.BeachCaveSpiderMax));
		    	}
				if (MobSpawnsHandler.DesertCaveSpider){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCaveSpider.class, MobSpawnsHandler.DesertCaveSpiderWeight, MobSpawnsHandler.DesertCaveSpiderMin, MobSpawnsHandler.DesertCaveSpiderMax));
		    	}
				if (MobSpawnsHandler.ExtremeCaveSpider){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCaveSpider.class, MobSpawnsHandler.ExtremeCaveSpiderWeight, MobSpawnsHandler.ExtremeCaveSpiderMin, MobSpawnsHandler.ExtremeCaveSpiderMax));
		    	}
				if (MobSpawnsHandler.ForestCaveSpider){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCaveSpider.class, MobSpawnsHandler.ForestCaveSpiderWeight, MobSpawnsHandler.ForestCaveSpiderMin, MobSpawnsHandler.ForestCaveSpiderMax));
		    	}
				if (MobSpawnsHandler.JungleCaveSpider){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCaveSpider.class, MobSpawnsHandler.JungleCaveSpiderWeight, MobSpawnsHandler.JungleCaveSpiderMin, MobSpawnsHandler.JungleCaveSpiderMax));
		    	}
				if (MobSpawnsHandler.MesaCaveSpider){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCaveSpider.class, MobSpawnsHandler.MesaCaveSpiderWeight, MobSpawnsHandler.MesaCaveSpiderMin, MobSpawnsHandler.MesaCaveSpiderMax));
		    	}
				if (MobSpawnsHandler.PlainsCaveSpider){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCaveSpider.class, MobSpawnsHandler.PlainsCaveSpiderWeight, MobSpawnsHandler.PlainsCaveSpiderMin, MobSpawnsHandler.PlainsCaveSpiderMax));
		    	}
				if (MobSpawnsHandler.SavannaCaveSpider){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCaveSpider.class, MobSpawnsHandler.SavannaCaveSpiderWeight, MobSpawnsHandler.SavannaCaveSpiderMin, MobSpawnsHandler.SavannaCaveSpiderMax));
		    	}
				if (MobSpawnsHandler.SwampCaveSpider){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCaveSpider.class, MobSpawnsHandler.SwampCaveSpiderWeight, MobSpawnsHandler.SwampCaveSpiderMin, MobSpawnsHandler.SwampCaveSpiderMax));
		    	}
				if (MobSpawnsHandler.TaigaCaveSpider){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCaveSpider.class, MobSpawnsHandler.TaigaCaveSpiderWeight, MobSpawnsHandler.TaigaCaveSpiderMin, MobSpawnsHandler.TaigaCaveSpiderMax));
		    	}
				if (MobSpawnsHandler.EndCaveSpider){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCaveSpider.class, MobSpawnsHandler.EndCaveSpiderWeight, MobSpawnsHandler.EndCaveSpiderMin, MobSpawnsHandler.EndCaveSpiderMax));
		    	}
			}
			if (MobSpawnsHandler.Creeper){
				if (MobSpawnsHandler.NetherCreeper){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCreeper.class, MobSpawnsHandler.NetherCreeperWeight, MobSpawnsHandler.NetherCreeperMin, MobSpawnsHandler.NetherCreeperMax));
		    	}
				if (MobSpawnsHandler.BeachCreeper){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCreeper.class, MobSpawnsHandler.BeachCreeperWeight, MobSpawnsHandler.BeachCreeperMin, MobSpawnsHandler.BeachCreeperMax));
		    	}
				if (MobSpawnsHandler.DesertCreeper){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCreeper.class, MobSpawnsHandler.DesertCreeperWeight, MobSpawnsHandler.DesertCreeperMin, MobSpawnsHandler.DesertCreeperMax));
		    	}
				if (MobSpawnsHandler.ExtremeCreeper){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCreeper.class, MobSpawnsHandler.ExtremeCreeperWeight, MobSpawnsHandler.ExtremeCreeperMin, MobSpawnsHandler.ExtremeCreeperMax));
		    	}
				if (MobSpawnsHandler.ForestCreeper){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCreeper.class, MobSpawnsHandler.ForestCreeperWeight, MobSpawnsHandler.ForestCreeperMin, MobSpawnsHandler.ForestCreeperMax));
		    	}
				if (MobSpawnsHandler.JungleCreeper){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCreeper.class, MobSpawnsHandler.JungleCreeperWeight, MobSpawnsHandler.JungleCreeperMin, MobSpawnsHandler.JungleCreeperMax));
		    	}
				if (MobSpawnsHandler.MesaCreeper){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCreeper.class, MobSpawnsHandler.MesaCreeperWeight, MobSpawnsHandler.MesaCreeperMin, MobSpawnsHandler.MesaCreeperMax));
		    	}
				if (MobSpawnsHandler.PlainsCreeper){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCreeper.class, MobSpawnsHandler.PlainsCreeperWeight, MobSpawnsHandler.PlainsCreeperMin, MobSpawnsHandler.PlainsCreeperMax));
		    	}
				if (MobSpawnsHandler.SavannaCreeper){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCreeper.class, MobSpawnsHandler.SavannaCreeperWeight, MobSpawnsHandler.SavannaCreeperMin, MobSpawnsHandler.SavannaCreeperMax));
		    	}
				if (MobSpawnsHandler.SwampCreeper){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCreeper.class, MobSpawnsHandler.SwampCreeperWeight, MobSpawnsHandler.SwampCreeperMin, MobSpawnsHandler.SwampCreeperMax));
		    	}
				if (MobSpawnsHandler.TaigaCreeper){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCreeper.class, MobSpawnsHandler.TaigaCreeperWeight, MobSpawnsHandler.TaigaCreeperMin, MobSpawnsHandler.TaigaCreeperMax));
		    	}
				if (MobSpawnsHandler.EndCreeper){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityCreeper.class, MobSpawnsHandler.EndCreeperWeight, MobSpawnsHandler.EndCreeperMin, MobSpawnsHandler.EndCreeperMax));
		    	}
			}
			if (MobSpawnsHandler.Enderman){
				if (MobSpawnsHandler.NetherEnderman){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEnderman.class, MobSpawnsHandler.NetherEndermanWeight, MobSpawnsHandler.NetherEndermanMin, MobSpawnsHandler.NetherEndermanMax));
		    	}
				if (MobSpawnsHandler.BeachEnderman){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEnderman.class, MobSpawnsHandler.BeachEndermanWeight, MobSpawnsHandler.BeachEndermanMin, MobSpawnsHandler.BeachEndermanMax));
		    	}
				if (MobSpawnsHandler.DesertEnderman){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEnderman.class, MobSpawnsHandler.DesertEndermanWeight, MobSpawnsHandler.DesertEndermanMin, MobSpawnsHandler.DesertEndermanMax));
		    	}
				if (MobSpawnsHandler.ExtremeEnderman){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEnderman.class, MobSpawnsHandler.ExtremeEndermanWeight, MobSpawnsHandler.ExtremeEndermanMin, MobSpawnsHandler.ExtremeEndermanMax));
		    	}
				if (MobSpawnsHandler.ForestEnderman){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEnderman.class, MobSpawnsHandler.ForestEndermanWeight, MobSpawnsHandler.ForestEndermanMin, MobSpawnsHandler.ForestEndermanMax));
		    	}
				if (MobSpawnsHandler.JungleEnderman){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEnderman.class, MobSpawnsHandler.JungleEndermanWeight, MobSpawnsHandler.JungleEndermanMin, MobSpawnsHandler.JungleEndermanMax));
		    	}
				if (MobSpawnsHandler.MesaEnderman){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEnderman.class, MobSpawnsHandler.MesaEndermanWeight, MobSpawnsHandler.MesaEndermanMin, MobSpawnsHandler.MesaEndermanMax));
		    	}
				if (MobSpawnsHandler.PlainsEnderman){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEnderman.class, MobSpawnsHandler.PlainsEndermanWeight, MobSpawnsHandler.PlainsEndermanMin, MobSpawnsHandler.PlainsEndermanMax));
		    	}
				if (MobSpawnsHandler.SavannaEnderman){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEnderman.class, MobSpawnsHandler.SavannaEndermanWeight, MobSpawnsHandler.SavannaEndermanMin, MobSpawnsHandler.SavannaEndermanMax));
		    	}
				if (MobSpawnsHandler.SwampEnderman){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEnderman.class, MobSpawnsHandler.SwampEndermanWeight, MobSpawnsHandler.SwampEndermanMin, MobSpawnsHandler.SwampEndermanMax));
		    	}
				if (MobSpawnsHandler.TaigaEnderman){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEnderman.class, MobSpawnsHandler.TaigaEndermanWeight, MobSpawnsHandler.TaigaEndermanMin, MobSpawnsHandler.TaigaEndermanMax));
		    	}
				if (MobSpawnsHandler.EndEnderman){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEnderman.class, MobSpawnsHandler.EndEndermanWeight, MobSpawnsHandler.EndEndermanMin, MobSpawnsHandler.EndEndermanMax));
		    	}
			}
			if (MobSpawnsHandler.Endermite){
				if (MobSpawnsHandler.NetherEndermite){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEndermite.class, MobSpawnsHandler.NetherEndermiteWeight, MobSpawnsHandler.NetherEndermiteMin, MobSpawnsHandler.NetherEndermiteMax));
		    	}
				if (MobSpawnsHandler.BeachEndermite){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEndermite.class, MobSpawnsHandler.BeachEndermiteWeight, MobSpawnsHandler.BeachEndermiteMin, MobSpawnsHandler.BeachEndermiteMax));
		    	}
				if (MobSpawnsHandler.DesertEndermite){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEndermite.class, MobSpawnsHandler.DesertEndermiteWeight, MobSpawnsHandler.DesertEndermiteMin, MobSpawnsHandler.DesertEndermiteMax));
		    	}
				if (MobSpawnsHandler.ExtremeEndermite){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEndermite.class, MobSpawnsHandler.ExtremeEndermiteWeight, MobSpawnsHandler.ExtremeEndermiteMin, MobSpawnsHandler.ExtremeEndermiteMax));
		    	}
				if (MobSpawnsHandler.ForestEndermite){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEndermite.class, MobSpawnsHandler.ForestEndermiteWeight, MobSpawnsHandler.ForestEndermiteMin, MobSpawnsHandler.ForestEndermiteMax));
		    	}
				if (MobSpawnsHandler.JungleEndermite){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEndermite.class, MobSpawnsHandler.JungleEndermiteWeight, MobSpawnsHandler.JungleEndermiteMin, MobSpawnsHandler.JungleEndermiteMax));
		    	}
				if (MobSpawnsHandler.MesaEndermite){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEndermite.class, MobSpawnsHandler.MesaEndermiteWeight, MobSpawnsHandler.MesaEndermiteMin, MobSpawnsHandler.MesaEndermiteMax));
		    	}
				if (MobSpawnsHandler.PlainsEndermite){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEndermite.class, MobSpawnsHandler.PlainsEndermiteWeight, MobSpawnsHandler.PlainsEndermiteMin, MobSpawnsHandler.PlainsEndermiteMax));
		    	}
				if (MobSpawnsHandler.SavannaEndermite){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEndermite.class, MobSpawnsHandler.SavannaEndermiteWeight, MobSpawnsHandler.SavannaEndermiteMin, MobSpawnsHandler.SavannaEndermiteMax));
		    	}
				if (MobSpawnsHandler.SwampEndermite){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEndermite.class, MobSpawnsHandler.SwampEndermiteWeight, MobSpawnsHandler.SwampEndermiteMin, MobSpawnsHandler.SwampEndermiteMax));
		    	}
				if (MobSpawnsHandler.TaigaEndermite){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEndermite.class, MobSpawnsHandler.TaigaEndermiteWeight, MobSpawnsHandler.TaigaEndermiteMin, MobSpawnsHandler.TaigaEndermiteMax));
		    	}
				if (MobSpawnsHandler.EndEndermite){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityEndermite.class, MobSpawnsHandler.EndEndermiteWeight, MobSpawnsHandler.EndEndermiteMin, MobSpawnsHandler.EndEndermiteMax));
		    	}
			}
			if (MobSpawnsHandler.Ghast){
				if (MobSpawnsHandler.NetherGhast){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGhast.class, MobSpawnsHandler.NetherGhastWeight, MobSpawnsHandler.NetherGhastMin, MobSpawnsHandler.NetherGhastMax));
		    	}
				if (MobSpawnsHandler.BeachGhast){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGhast.class, MobSpawnsHandler.BeachGhastWeight, MobSpawnsHandler.BeachGhastMin, MobSpawnsHandler.BeachGhastMax));
		    	}
				if (MobSpawnsHandler.DesertGhast){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGhast.class, MobSpawnsHandler.DesertGhastWeight, MobSpawnsHandler.DesertGhastMin, MobSpawnsHandler.DesertGhastMax));
		    	}
				if (MobSpawnsHandler.ExtremeGhast){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGhast.class, MobSpawnsHandler.ExtremeGhastWeight, MobSpawnsHandler.ExtremeGhastMin, MobSpawnsHandler.ExtremeGhastMax));
		    	}
				if (MobSpawnsHandler.ForestGhast){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGhast.class, MobSpawnsHandler.ForestGhastWeight, MobSpawnsHandler.ForestGhastMin, MobSpawnsHandler.ForestGhastMax));
		    	}
				if (MobSpawnsHandler.JungleGhast){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGhast.class, MobSpawnsHandler.JungleGhastWeight, MobSpawnsHandler.JungleGhastMin, MobSpawnsHandler.JungleGhastMax));
		    	}
				if (MobSpawnsHandler.MesaGhast){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGhast.class, MobSpawnsHandler.MesaGhastWeight, MobSpawnsHandler.MesaGhastMin, MobSpawnsHandler.MesaGhastMax));
		    	}
				if (MobSpawnsHandler.PlainsGhast){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGhast.class, MobSpawnsHandler.PlainsGhastWeight, MobSpawnsHandler.PlainsGhastMin, MobSpawnsHandler.PlainsGhastMax));
		    	}
				if (MobSpawnsHandler.SavannaGhast){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGhast.class, MobSpawnsHandler.SavannaGhastWeight, MobSpawnsHandler.SavannaGhastMin, MobSpawnsHandler.SavannaGhastMax));
		    	}
				if (MobSpawnsHandler.SwampGhast){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGhast.class, MobSpawnsHandler.SwampGhastWeight, MobSpawnsHandler.SwampGhastMin, MobSpawnsHandler.SwampGhastMax));
		    	}
				if (MobSpawnsHandler.TaigaGhast){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGhast.class, MobSpawnsHandler.TaigaGhastWeight, MobSpawnsHandler.TaigaGhastMin, MobSpawnsHandler.TaigaGhastMax));
		    	}
				if (MobSpawnsHandler.EndGhast){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGhast.class, MobSpawnsHandler.EndGhastWeight, MobSpawnsHandler.EndGhastMin, MobSpawnsHandler.EndGhastMax));
		    	}
			}
			if (MobSpawnsHandler.GiantZombie){
				if (MobSpawnsHandler.NetherGiantZombie){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGiantZombie.class, MobSpawnsHandler.NetherGiantZombieWeight, MobSpawnsHandler.NetherGiantZombieMin, MobSpawnsHandler.NetherGiantZombieMax));
		    	}
				if (MobSpawnsHandler.BeachGiantZombie){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGiantZombie.class, MobSpawnsHandler.BeachGiantZombieWeight, MobSpawnsHandler.BeachGiantZombieMin, MobSpawnsHandler.BeachGiantZombieMax));
		    	}
				if (MobSpawnsHandler.DesertGiantZombie){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGiantZombie.class, MobSpawnsHandler.DesertGiantZombieWeight, MobSpawnsHandler.DesertGiantZombieMin, MobSpawnsHandler.DesertGiantZombieMax));
		    	}
				if (MobSpawnsHandler.ExtremeGiantZombie){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGiantZombie.class, MobSpawnsHandler.ExtremeGiantZombieWeight, MobSpawnsHandler.ExtremeGiantZombieMin, MobSpawnsHandler.ExtremeGiantZombieMax));
		    	}
				if (MobSpawnsHandler.ForestGiantZombie){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGiantZombie.class, MobSpawnsHandler.ForestGiantZombieWeight, MobSpawnsHandler.ForestGiantZombieMin, MobSpawnsHandler.ForestGiantZombieMax));
		    	}
				if (MobSpawnsHandler.JungleGiantZombie){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGiantZombie.class, MobSpawnsHandler.JungleGiantZombieWeight, MobSpawnsHandler.JungleGiantZombieMin, MobSpawnsHandler.JungleGiantZombieMax));
		    	}
				if (MobSpawnsHandler.MesaGiantZombie){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGiantZombie.class, MobSpawnsHandler.MesaGiantZombieWeight, MobSpawnsHandler.MesaGiantZombieMin, MobSpawnsHandler.MesaGiantZombieMax));
		    	}
				if (MobSpawnsHandler.PlainsGiantZombie){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGiantZombie.class, MobSpawnsHandler.PlainsGiantZombieWeight, MobSpawnsHandler.PlainsGiantZombieMin, MobSpawnsHandler.PlainsGiantZombieMax));
		    	}
				if (MobSpawnsHandler.SavannaGiantZombie){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGiantZombie.class, MobSpawnsHandler.SavannaGiantZombieWeight, MobSpawnsHandler.SavannaGiantZombieMin, MobSpawnsHandler.SavannaGiantZombieMax));
		    	}
				if (MobSpawnsHandler.SwampGiantZombie){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGiantZombie.class, MobSpawnsHandler.SwampGiantZombieWeight, MobSpawnsHandler.SwampGiantZombieMin, MobSpawnsHandler.SwampGiantZombieMax));
		    	}
				if (MobSpawnsHandler.TaigaGiantZombie){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGiantZombie.class, MobSpawnsHandler.TaigaGiantZombieWeight, MobSpawnsHandler.TaigaGiantZombieMin, MobSpawnsHandler.TaigaGiantZombieMax));
		    	}
				if (MobSpawnsHandler.EndGiantZombie){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGiantZombie.class, MobSpawnsHandler.EndGiantZombieWeight, MobSpawnsHandler.EndGiantZombieMin, MobSpawnsHandler.EndGiantZombieMax));
		    	}
			}
			if (MobSpawnsHandler.Guardian){
				if (MobSpawnsHandler.OceanGuardian){
		    		Biomes.OCEAN.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGuardian.class, MobSpawnsHandler.OceanGuardianWeight, MobSpawnsHandler.OceanGuardianMin, MobSpawnsHandler.OceanGuardianMax));
		    	}
				if (MobSpawnsHandler.DeepGuardian){
		    		Biomes.DEEP_OCEAN.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityGuardian.class, MobSpawnsHandler.DeepGuardianWeight, MobSpawnsHandler.DeepGuardianMin, MobSpawnsHandler.DeepGuardianMax));
		    	}
			}
			if (MobSpawnsHandler.IronGolem){
				if (MobSpawnsHandler.NetherIronGolem){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityIronGolem.class, MobSpawnsHandler.NetherIronGolemWeight, MobSpawnsHandler.NetherIronGolemMin, MobSpawnsHandler.NetherIronGolemMax));
		    	}
				if (MobSpawnsHandler.BeachIronGolem){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityIronGolem.class, MobSpawnsHandler.BeachIronGolemWeight, MobSpawnsHandler.BeachIronGolemMin, MobSpawnsHandler.BeachIronGolemMax));
		    	}
				if (MobSpawnsHandler.DesertIronGolem){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityIronGolem.class, MobSpawnsHandler.DesertIronGolemWeight, MobSpawnsHandler.DesertIronGolemMin, MobSpawnsHandler.DesertIronGolemMax));
		    	}
				if (MobSpawnsHandler.ExtremeIronGolem){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityIronGolem.class, MobSpawnsHandler.ExtremeIronGolemWeight, MobSpawnsHandler.ExtremeIronGolemMin, MobSpawnsHandler.ExtremeIronGolemMax));
		    	}
				if (MobSpawnsHandler.ForestIronGolem){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityIronGolem.class, MobSpawnsHandler.ForestIronGolemWeight, MobSpawnsHandler.ForestIronGolemMin, MobSpawnsHandler.ForestIronGolemMax));
		    	}
				if (MobSpawnsHandler.JungleIronGolem){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityIronGolem.class, MobSpawnsHandler.JungleIronGolemWeight, MobSpawnsHandler.JungleIronGolemMin, MobSpawnsHandler.JungleIronGolemMax));
		    	}
				if (MobSpawnsHandler.MesaIronGolem){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityIronGolem.class, MobSpawnsHandler.MesaIronGolemWeight, MobSpawnsHandler.MesaIronGolemMin, MobSpawnsHandler.MesaIronGolemMax));
		    	}
				if (MobSpawnsHandler.PlainsIronGolem){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityIronGolem.class, MobSpawnsHandler.PlainsIronGolemWeight, MobSpawnsHandler.PlainsIronGolemMin, MobSpawnsHandler.PlainsIronGolemMax));
		    	}
				if (MobSpawnsHandler.SavannaIronGolem){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityIronGolem.class, MobSpawnsHandler.SavannaIronGolemWeight, MobSpawnsHandler.SavannaIronGolemMin, MobSpawnsHandler.SavannaIronGolemMax));
		    	}
				if (MobSpawnsHandler.SwampIronGolem){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityIronGolem.class, MobSpawnsHandler.SwampIronGolemWeight, MobSpawnsHandler.SwampIronGolemMin, MobSpawnsHandler.SwampIronGolemMax));
		    	}
				if (MobSpawnsHandler.TaigaIronGolem){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityIronGolem.class, MobSpawnsHandler.TaigaIronGolemWeight, MobSpawnsHandler.TaigaIronGolemMin, MobSpawnsHandler.TaigaIronGolemMax));
		    	}
				if (MobSpawnsHandler.EndIronGolem){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityIronGolem.class, MobSpawnsHandler.EndIronGolemWeight, MobSpawnsHandler.EndIronGolemMin, MobSpawnsHandler.EndIronGolemMax));
		    	}
			}
			if (MobSpawnsHandler.MagmaCube){
				if (MobSpawnsHandler.NetherMagmaCube){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityMagmaCube.class, MobSpawnsHandler.NetherMagmaCubeWeight, MobSpawnsHandler.NetherMagmaCubeMin, MobSpawnsHandler.NetherMagmaCubeMax));
		    	}
				if (MobSpawnsHandler.BeachMagmaCube){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityMagmaCube.class, MobSpawnsHandler.BeachMagmaCubeWeight, MobSpawnsHandler.BeachMagmaCubeMin, MobSpawnsHandler.BeachMagmaCubeMax));
		    	}
				if (MobSpawnsHandler.DesertMagmaCube){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityMagmaCube.class, MobSpawnsHandler.DesertMagmaCubeWeight, MobSpawnsHandler.DesertMagmaCubeMin, MobSpawnsHandler.DesertMagmaCubeMax));
		    	}
				if (MobSpawnsHandler.ExtremeMagmaCube){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityMagmaCube.class, MobSpawnsHandler.ExtremeMagmaCubeWeight, MobSpawnsHandler.ExtremeMagmaCubeMin, MobSpawnsHandler.ExtremeMagmaCubeMax));
		    	}
				if (MobSpawnsHandler.ForestMagmaCube){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityMagmaCube.class, MobSpawnsHandler.ForestMagmaCubeWeight, MobSpawnsHandler.ForestMagmaCubeMin, MobSpawnsHandler.ForestMagmaCubeMax));
		    	}
				if (MobSpawnsHandler.JungleMagmaCube){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityMagmaCube.class, MobSpawnsHandler.JungleMagmaCubeWeight, MobSpawnsHandler.JungleMagmaCubeMin, MobSpawnsHandler.JungleMagmaCubeMax));
		    	}
				if (MobSpawnsHandler.MesaMagmaCube){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityMagmaCube.class, MobSpawnsHandler.MesaMagmaCubeWeight, MobSpawnsHandler.MesaMagmaCubeMin, MobSpawnsHandler.MesaMagmaCubeMax));
		    	}
				if (MobSpawnsHandler.PlainsMagmaCube){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityMagmaCube.class, MobSpawnsHandler.PlainsMagmaCubeWeight, MobSpawnsHandler.PlainsMagmaCubeMin, MobSpawnsHandler.PlainsMagmaCubeMax));
		    	}
				if (MobSpawnsHandler.SavannaMagmaCube){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityMagmaCube.class, MobSpawnsHandler.SavannaMagmaCubeWeight, MobSpawnsHandler.SavannaMagmaCubeMin, MobSpawnsHandler.SavannaMagmaCubeMax));
		    	}
				if (MobSpawnsHandler.SwampMagmaCube){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityMagmaCube.class, MobSpawnsHandler.SwampMagmaCubeWeight, MobSpawnsHandler.SwampMagmaCubeMin, MobSpawnsHandler.SwampMagmaCubeMax));
		    	}
				if (MobSpawnsHandler.TaigaMagmaCube){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityMagmaCube.class, MobSpawnsHandler.TaigaMagmaCubeWeight, MobSpawnsHandler.TaigaMagmaCubeMin, MobSpawnsHandler.TaigaMagmaCubeMax));
		    	}
				if (MobSpawnsHandler.EndMagmaCube){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityMagmaCube.class, MobSpawnsHandler.EndMagmaCubeWeight, MobSpawnsHandler.EndMagmaCubeMin, MobSpawnsHandler.EndMagmaCubeMax));
		    	}
			}
			if (MobSpawnsHandler.PigZombie){
				if (MobSpawnsHandler.NetherPigZombie){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPigZombie.class, MobSpawnsHandler.NetherPigZombieWeight, MobSpawnsHandler.NetherPigZombieMin, MobSpawnsHandler.NetherPigZombieMax));
		    	}
				if (MobSpawnsHandler.BeachPigZombie){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPigZombie.class, MobSpawnsHandler.BeachPigZombieWeight, MobSpawnsHandler.BeachPigZombieMin, MobSpawnsHandler.BeachPigZombieMax));
		    	}
				if (MobSpawnsHandler.DesertPigZombie){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPigZombie.class, MobSpawnsHandler.DesertPigZombieWeight, MobSpawnsHandler.DesertPigZombieMin, MobSpawnsHandler.DesertPigZombieMax));
		    	}
				if (MobSpawnsHandler.ExtremePigZombie){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPigZombie.class, MobSpawnsHandler.ExtremePigZombieWeight, MobSpawnsHandler.ExtremePigZombieMin, MobSpawnsHandler.ExtremePigZombieMax));
		    	}
				if (MobSpawnsHandler.ForestPigZombie){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPigZombie.class, MobSpawnsHandler.ForestPigZombieWeight, MobSpawnsHandler.ForestPigZombieMin, MobSpawnsHandler.ForestPigZombieMax));
		    	}
				if (MobSpawnsHandler.JunglePigZombie){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPigZombie.class, MobSpawnsHandler.JunglePigZombieWeight, MobSpawnsHandler.JunglePigZombieMin, MobSpawnsHandler.JunglePigZombieMax));
		    	}
				if (MobSpawnsHandler.MesaPigZombie){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPigZombie.class, MobSpawnsHandler.MesaPigZombieWeight, MobSpawnsHandler.MesaPigZombieMin, MobSpawnsHandler.MesaPigZombieMax));
		    	}
				if (MobSpawnsHandler.PlainsPigZombie){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPigZombie.class, MobSpawnsHandler.PlainsPigZombieWeight, MobSpawnsHandler.PlainsPigZombieMin, MobSpawnsHandler.PlainsPigZombieMax));
		    	}
				if (MobSpawnsHandler.SavannaPigZombie){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPigZombie.class, MobSpawnsHandler.SavannaPigZombieWeight, MobSpawnsHandler.SavannaPigZombieMin, MobSpawnsHandler.SavannaPigZombieMax));
		    	}
				if (MobSpawnsHandler.SwampPigZombie){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPigZombie.class, MobSpawnsHandler.SwampPigZombieWeight, MobSpawnsHandler.SwampPigZombieMin, MobSpawnsHandler.SwampPigZombieMax));
		    	}
				if (MobSpawnsHandler.TaigaPigZombie){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPigZombie.class, MobSpawnsHandler.TaigaPigZombieWeight, MobSpawnsHandler.TaigaPigZombieMin, MobSpawnsHandler.TaigaPigZombieMax));
		    	}
				if (MobSpawnsHandler.EndPigZombie){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPigZombie.class, MobSpawnsHandler.EndPigZombieWeight, MobSpawnsHandler.EndPigZombieMin, MobSpawnsHandler.EndPigZombieMax));
		    	}
			}
			if (MobSpawnsHandler.PolarBear){
				if (MobSpawnsHandler.NetherPolarBear){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPolarBear.class, MobSpawnsHandler.NetherPolarBearWeight, MobSpawnsHandler.NetherPolarBearMin, MobSpawnsHandler.NetherPolarBearMax));
		    	}
				if (MobSpawnsHandler.BeachPolarBear){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPolarBear.class, MobSpawnsHandler.BeachPolarBearWeight, MobSpawnsHandler.BeachPolarBearMin, MobSpawnsHandler.BeachPolarBearMax));
		    	}
				if (MobSpawnsHandler.DesertPolarBear){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPolarBear.class, MobSpawnsHandler.DesertPolarBearWeight, MobSpawnsHandler.DesertPolarBearMin, MobSpawnsHandler.DesertPolarBearMax));
		    	}
				if (MobSpawnsHandler.ExtremePolarBear){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPolarBear.class, MobSpawnsHandler.ExtremePolarBearWeight, MobSpawnsHandler.ExtremePolarBearMin, MobSpawnsHandler.ExtremePolarBearMax));
		    	}
				if (MobSpawnsHandler.ForestPolarBear){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPolarBear.class, MobSpawnsHandler.ForestPolarBearWeight, MobSpawnsHandler.ForestPolarBearMin, MobSpawnsHandler.ForestPolarBearMax));
		    	}
				if (MobSpawnsHandler.JunglePolarBear){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPolarBear.class, MobSpawnsHandler.JunglePolarBearWeight, MobSpawnsHandler.JunglePolarBearMin, MobSpawnsHandler.JunglePolarBearMax));
		    	}
				if (MobSpawnsHandler.MesaPolarBear){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPolarBear.class, MobSpawnsHandler.MesaPolarBearWeight, MobSpawnsHandler.MesaPolarBearMin, MobSpawnsHandler.MesaPolarBearMax));
		    	}
				if (MobSpawnsHandler.PlainsPolarBear){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPolarBear.class, MobSpawnsHandler.PlainsPolarBearWeight, MobSpawnsHandler.PlainsPolarBearMin, MobSpawnsHandler.PlainsPolarBearMax));
		    	}
				if (MobSpawnsHandler.SavannaPolarBear){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPolarBear.class, MobSpawnsHandler.SavannaPolarBearWeight, MobSpawnsHandler.SavannaPolarBearMin, MobSpawnsHandler.SavannaPolarBearMax));
		    	}
				if (MobSpawnsHandler.SwampPolarBear){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPolarBear.class, MobSpawnsHandler.SwampPolarBearWeight, MobSpawnsHandler.SwampPolarBearMin, MobSpawnsHandler.SwampPolarBearMax));
		    	}
				if (MobSpawnsHandler.TaigaPolarBear){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPolarBear.class, MobSpawnsHandler.TaigaPolarBearWeight, MobSpawnsHandler.TaigaPolarBearMin, MobSpawnsHandler.TaigaPolarBearMax));
		    	}
				if (MobSpawnsHandler.EndPolarBear){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityPolarBear.class, MobSpawnsHandler.EndPolarBearWeight, MobSpawnsHandler.EndPolarBearMin, MobSpawnsHandler.EndPolarBearMax));
		    	}
			}
			if (MobSpawnsHandler.Shulker){
				if (MobSpawnsHandler.NetherShulker){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityShulker.class, MobSpawnsHandler.NetherShulkerWeight, MobSpawnsHandler.NetherShulkerMin, MobSpawnsHandler.NetherShulkerMax));
		    	}
				if (MobSpawnsHandler.BeachShulker){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityShulker.class, MobSpawnsHandler.BeachShulkerWeight, MobSpawnsHandler.BeachShulkerMin, MobSpawnsHandler.BeachShulkerMax));
		    	}
				if (MobSpawnsHandler.DesertShulker){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityShulker.class, MobSpawnsHandler.DesertShulkerWeight, MobSpawnsHandler.DesertShulkerMin, MobSpawnsHandler.DesertShulkerMax));
		    	}
				if (MobSpawnsHandler.ExtremeShulker){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityShulker.class, MobSpawnsHandler.ExtremeShulkerWeight, MobSpawnsHandler.ExtremeShulkerMin, MobSpawnsHandler.ExtremeShulkerMax));
		    	}
				if (MobSpawnsHandler.ForestShulker){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityShulker.class, MobSpawnsHandler.ForestShulkerWeight, MobSpawnsHandler.ForestShulkerMin, MobSpawnsHandler.ForestShulkerMax));
		    	}
				if (MobSpawnsHandler.JungleShulker){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityShulker.class, MobSpawnsHandler.JungleShulkerWeight, MobSpawnsHandler.JungleShulkerMin, MobSpawnsHandler.JungleShulkerMax));
		    	}
				if (MobSpawnsHandler.MesaShulker){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityShulker.class, MobSpawnsHandler.MesaShulkerWeight, MobSpawnsHandler.MesaShulkerMin, MobSpawnsHandler.MesaShulkerMax));
		    	}
				if (MobSpawnsHandler.PlainsShulker){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityShulker.class, MobSpawnsHandler.PlainsShulkerWeight, MobSpawnsHandler.PlainsShulkerMin, MobSpawnsHandler.PlainsShulkerMax));
		    	}
				if (MobSpawnsHandler.SavannaShulker){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityShulker.class, MobSpawnsHandler.SavannaShulkerWeight, MobSpawnsHandler.SavannaShulkerMin, MobSpawnsHandler.SavannaShulkerMax));
		    	}
				if (MobSpawnsHandler.SwampShulker){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityShulker.class, MobSpawnsHandler.SwampShulkerWeight, MobSpawnsHandler.SwampShulkerMin, MobSpawnsHandler.SwampShulkerMax));
		    	}
				if (MobSpawnsHandler.TaigaShulker){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityShulker.class, MobSpawnsHandler.TaigaShulkerWeight, MobSpawnsHandler.TaigaShulkerMin, MobSpawnsHandler.TaigaShulkerMax));
		    	}
				if (MobSpawnsHandler.EndShulker){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityShulker.class, MobSpawnsHandler.EndShulkerWeight, MobSpawnsHandler.EndShulkerMin, MobSpawnsHandler.EndShulkerMax));
		    	}
			}
			if (MobSpawnsHandler.Silverfish){
				if (MobSpawnsHandler.NetherSilverfish){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySilverfish.class, MobSpawnsHandler.NetherSilverfishWeight, MobSpawnsHandler.NetherSilverfishMin, MobSpawnsHandler.NetherSilverfishMax));
		    	}
				if (MobSpawnsHandler.BeachSilverfish){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySilverfish.class, MobSpawnsHandler.BeachSilverfishWeight, MobSpawnsHandler.BeachSilverfishMin, MobSpawnsHandler.BeachSilverfishMax));
		    	}
				if (MobSpawnsHandler.DesertSilverfish){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySilverfish.class, MobSpawnsHandler.DesertSilverfishWeight, MobSpawnsHandler.DesertSilverfishMin, MobSpawnsHandler.DesertSilverfishMax));
		    	}
				if (MobSpawnsHandler.ExtremeSilverfish){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySilverfish.class, MobSpawnsHandler.ExtremeSilverfishWeight, MobSpawnsHandler.ExtremeSilverfishMin, MobSpawnsHandler.ExtremeSilverfishMax));
		    	}
				if (MobSpawnsHandler.ForestSilverfish){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySilverfish.class, MobSpawnsHandler.ForestSilverfishWeight, MobSpawnsHandler.ForestSilverfishMin, MobSpawnsHandler.ForestSilverfishMax));
		    	}
				if (MobSpawnsHandler.JungleSilverfish){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySilverfish.class, MobSpawnsHandler.JungleSilverfishWeight, MobSpawnsHandler.JungleSilverfishMin, MobSpawnsHandler.JungleSilverfishMax));
		    	}
				if (MobSpawnsHandler.MesaSilverfish){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySilverfish.class, MobSpawnsHandler.MesaSilverfishWeight, MobSpawnsHandler.MesaSilverfishMin, MobSpawnsHandler.MesaSilverfishMax));
		    	}
				if (MobSpawnsHandler.PlainsSilverfish){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySilverfish.class, MobSpawnsHandler.PlainsSilverfishWeight, MobSpawnsHandler.PlainsSilverfishMin, MobSpawnsHandler.PlainsSilverfishMax));
		    	}
				if (MobSpawnsHandler.SavannaSilverfish){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySilverfish.class, MobSpawnsHandler.SavannaSilverfishWeight, MobSpawnsHandler.SavannaSilverfishMin, MobSpawnsHandler.SavannaSilverfishMax));
		    	}
				if (MobSpawnsHandler.SwampSilverfish){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySilverfish.class, MobSpawnsHandler.SwampSilverfishWeight, MobSpawnsHandler.SwampSilverfishMin, MobSpawnsHandler.SwampSilverfishMax));
		    	}
				if (MobSpawnsHandler.TaigaSilverfish){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySilverfish.class, MobSpawnsHandler.TaigaSilverfishWeight, MobSpawnsHandler.TaigaSilverfishMin, MobSpawnsHandler.TaigaSilverfishMax));
		    	}
				if (MobSpawnsHandler.EndSilverfish){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySilverfish.class, MobSpawnsHandler.EndSilverfishWeight, MobSpawnsHandler.EndSilverfishMin, MobSpawnsHandler.EndSilverfishMax));
		    	}
			}
			if (MobSpawnsHandler.Skeleton){
				if (MobSpawnsHandler.NetherSkeleton){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySkeleton.class, MobSpawnsHandler.NetherSkeletonWeight, MobSpawnsHandler.NetherSkeletonMin, MobSpawnsHandler.NetherSkeletonMax));
		    	}
				if (MobSpawnsHandler.BeachSkeleton){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySkeleton.class, MobSpawnsHandler.BeachSkeletonWeight, MobSpawnsHandler.BeachSkeletonMin, MobSpawnsHandler.BeachSkeletonMax));
		    	}
				if (MobSpawnsHandler.DesertSkeleton){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySkeleton.class, MobSpawnsHandler.DesertSkeletonWeight, MobSpawnsHandler.DesertSkeletonMin, MobSpawnsHandler.DesertSkeletonMax));
		    	}
				if (MobSpawnsHandler.ExtremeSkeleton){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySkeleton.class, MobSpawnsHandler.ExtremeSkeletonWeight, MobSpawnsHandler.ExtremeSkeletonMin, MobSpawnsHandler.ExtremeSkeletonMax));
		    	}
				if (MobSpawnsHandler.ForestSkeleton){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySkeleton.class, MobSpawnsHandler.ForestSkeletonWeight, MobSpawnsHandler.ForestSkeletonMin, MobSpawnsHandler.ForestSkeletonMax));
		    	}
				if (MobSpawnsHandler.JungleSkeleton){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySkeleton.class, MobSpawnsHandler.JungleSkeletonWeight, MobSpawnsHandler.JungleSkeletonMin, MobSpawnsHandler.JungleSkeletonMax));
		    	}
				if (MobSpawnsHandler.MesaSkeleton){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySkeleton.class, MobSpawnsHandler.MesaSkeletonWeight, MobSpawnsHandler.MesaSkeletonMin, MobSpawnsHandler.MesaSkeletonMax));
		    	}
				if (MobSpawnsHandler.PlainsSkeleton){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySkeleton.class, MobSpawnsHandler.PlainsSkeletonWeight, MobSpawnsHandler.PlainsSkeletonMin, MobSpawnsHandler.PlainsSkeletonMax));
		    	}
				if (MobSpawnsHandler.SavannaSkeleton){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySkeleton.class, MobSpawnsHandler.SavannaSkeletonWeight, MobSpawnsHandler.SavannaSkeletonMin, MobSpawnsHandler.SavannaSkeletonMax));
		    	}
				if (MobSpawnsHandler.SwampSkeleton){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySkeleton.class, MobSpawnsHandler.SwampSkeletonWeight, MobSpawnsHandler.SwampSkeletonMin, MobSpawnsHandler.SwampSkeletonMax));
		    	}
				if (MobSpawnsHandler.TaigaSkeleton){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySkeleton.class, MobSpawnsHandler.TaigaSkeletonWeight, MobSpawnsHandler.TaigaSkeletonMin, MobSpawnsHandler.TaigaSkeletonMax));
		    	}
				if (MobSpawnsHandler.EndSkeleton){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySkeleton.class, MobSpawnsHandler.EndSkeletonWeight, MobSpawnsHandler.EndSkeletonMin, MobSpawnsHandler.EndSkeletonMax));
		    	}
			}
			if (MobSpawnsHandler.Slime){
				if (MobSpawnsHandler.NetherSlime){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySlime.class, MobSpawnsHandler.NetherSlimeWeight, MobSpawnsHandler.NetherSlimeMin, MobSpawnsHandler.NetherSlimeMax));
		    	}
				if (MobSpawnsHandler.BeachSlime){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySlime.class, MobSpawnsHandler.BeachSlimeWeight, MobSpawnsHandler.BeachSlimeMin, MobSpawnsHandler.BeachSlimeMax));
		    	}
				if (MobSpawnsHandler.DesertSlime){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySlime.class, MobSpawnsHandler.DesertSlimeWeight, MobSpawnsHandler.DesertSlimeMin, MobSpawnsHandler.DesertSlimeMax));
		    	}
				if (MobSpawnsHandler.ExtremeSlime){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySlime.class, MobSpawnsHandler.ExtremeSlimeWeight, MobSpawnsHandler.ExtremeSlimeMin, MobSpawnsHandler.ExtremeSlimeMax));
		    	}
				if (MobSpawnsHandler.ForestSlime){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySlime.class, MobSpawnsHandler.ForestSlimeWeight, MobSpawnsHandler.ForestSlimeMin, MobSpawnsHandler.ForestSlimeMax));
		    	}
				if (MobSpawnsHandler.JungleSlime){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySlime.class, MobSpawnsHandler.JungleSlimeWeight, MobSpawnsHandler.JungleSlimeMin, MobSpawnsHandler.JungleSlimeMax));
		    	}
				if (MobSpawnsHandler.MesaSlime){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySlime.class, MobSpawnsHandler.MesaSlimeWeight, MobSpawnsHandler.MesaSlimeMin, MobSpawnsHandler.MesaSlimeMax));
		    	}
				if (MobSpawnsHandler.PlainsSlime){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySlime.class, MobSpawnsHandler.PlainsSlimeWeight, MobSpawnsHandler.PlainsSlimeMin, MobSpawnsHandler.PlainsSlimeMax));
		    	}
				if (MobSpawnsHandler.SavannaSlime){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySlime.class, MobSpawnsHandler.SavannaSlimeWeight, MobSpawnsHandler.SavannaSlimeMin, MobSpawnsHandler.SavannaSlimeMax));
		    	}
				if (MobSpawnsHandler.SwampSlime){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySlime.class, MobSpawnsHandler.SwampSlimeWeight, MobSpawnsHandler.SwampSlimeMin, MobSpawnsHandler.SwampSlimeMax));
		    	}
				if (MobSpawnsHandler.TaigaSlime){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySlime.class, MobSpawnsHandler.TaigaSlimeWeight, MobSpawnsHandler.TaigaSlimeMin, MobSpawnsHandler.TaigaSlimeMax));
		    	}
				if (MobSpawnsHandler.EndSlime){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySlime.class, MobSpawnsHandler.EndSlimeWeight, MobSpawnsHandler.EndSlimeMin, MobSpawnsHandler.EndSlimeMax));
		    	}
			}
			if (MobSpawnsHandler.Snowman){
				if (MobSpawnsHandler.NetherSnowman){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySnowman.class, MobSpawnsHandler.NetherSnowmanWeight, MobSpawnsHandler.NetherSnowmanMin, MobSpawnsHandler.NetherSnowmanMax));
		    	}
				if (MobSpawnsHandler.BeachSnowman){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySnowman.class, MobSpawnsHandler.BeachSnowmanWeight, MobSpawnsHandler.BeachSnowmanMin, MobSpawnsHandler.BeachSnowmanMax));
		    	}
				if (MobSpawnsHandler.DesertSnowman){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySnowman.class, MobSpawnsHandler.DesertSnowmanWeight, MobSpawnsHandler.DesertSnowmanMin, MobSpawnsHandler.DesertSnowmanMax));
		    	}
				if (MobSpawnsHandler.ExtremeSnowman){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySnowman.class, MobSpawnsHandler.ExtremeSnowmanWeight, MobSpawnsHandler.ExtremeSnowmanMin, MobSpawnsHandler.ExtremeSnowmanMax));
		    	}
				if (MobSpawnsHandler.ForestSnowman){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySnowman.class, MobSpawnsHandler.ForestSnowmanWeight, MobSpawnsHandler.ForestSnowmanMin, MobSpawnsHandler.ForestSnowmanMax));
		    	}
				if (MobSpawnsHandler.JungleSnowman){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySnowman.class, MobSpawnsHandler.JungleSnowmanWeight, MobSpawnsHandler.JungleSnowmanMin, MobSpawnsHandler.JungleSnowmanMax));
		    	}
				if (MobSpawnsHandler.MesaSnowman){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySnowman.class, MobSpawnsHandler.MesaSnowmanWeight, MobSpawnsHandler.MesaSnowmanMin, MobSpawnsHandler.MesaSnowmanMax));
		    	}
				if (MobSpawnsHandler.PlainsSnowman){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySnowman.class, MobSpawnsHandler.PlainsSnowmanWeight, MobSpawnsHandler.PlainsSnowmanMin, MobSpawnsHandler.PlainsSnowmanMax));
		    	}
				if (MobSpawnsHandler.SavannaSnowman){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySnowman.class, MobSpawnsHandler.SavannaSnowmanWeight, MobSpawnsHandler.SavannaSnowmanMin, MobSpawnsHandler.SavannaSnowmanMax));
		    	}
				if (MobSpawnsHandler.SwampSnowman){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySnowman.class, MobSpawnsHandler.SwampSnowmanWeight, MobSpawnsHandler.SwampSnowmanMin, MobSpawnsHandler.SwampSnowmanMax));
		    	}
				if (MobSpawnsHandler.TaigaSnowman){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySnowman.class, MobSpawnsHandler.TaigaSnowmanWeight, MobSpawnsHandler.TaigaSnowmanMin, MobSpawnsHandler.TaigaSnowmanMax));
		    	}
				if (MobSpawnsHandler.EndSnowman){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySnowman.class, MobSpawnsHandler.EndSnowmanWeight, MobSpawnsHandler.EndSnowmanMin, MobSpawnsHandler.EndSnowmanMax));
		    	}
			}
			if (MobSpawnsHandler.Spider){
				if (MobSpawnsHandler.NetherSpider){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySpider.class, MobSpawnsHandler.NetherSpiderWeight, MobSpawnsHandler.NetherSpiderMin, MobSpawnsHandler.NetherSpiderMax));
		    	}
				if (MobSpawnsHandler.BeachSpider){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySpider.class, MobSpawnsHandler.BeachSpiderWeight, MobSpawnsHandler.BeachSpiderMin, MobSpawnsHandler.BeachSpiderMax));
		    	}
				if (MobSpawnsHandler.DesertSpider){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySpider.class, MobSpawnsHandler.DesertSpiderWeight, MobSpawnsHandler.DesertSpiderMin, MobSpawnsHandler.DesertSpiderMax));
		    	}
				if (MobSpawnsHandler.ExtremeSpider){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySpider.class, MobSpawnsHandler.ExtremeSpiderWeight, MobSpawnsHandler.ExtremeSpiderMin, MobSpawnsHandler.ExtremeSpiderMax));
		    	}
				if (MobSpawnsHandler.ForestSpider){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySpider.class, MobSpawnsHandler.ForestSpiderWeight, MobSpawnsHandler.ForestSpiderMin, MobSpawnsHandler.ForestSpiderMax));
		    	}
				if (MobSpawnsHandler.JungleSpider){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySpider.class, MobSpawnsHandler.JungleSpiderWeight, MobSpawnsHandler.JungleSpiderMin, MobSpawnsHandler.JungleSpiderMax));
		    	}
				if (MobSpawnsHandler.MesaSpider){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySpider.class, MobSpawnsHandler.MesaSpiderWeight, MobSpawnsHandler.MesaSpiderMin, MobSpawnsHandler.MesaSpiderMax));
		    	}
				if (MobSpawnsHandler.PlainsSpider){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySpider.class, MobSpawnsHandler.PlainsSpiderWeight, MobSpawnsHandler.PlainsSpiderMin, MobSpawnsHandler.PlainsSpiderMax));
		    	}
				if (MobSpawnsHandler.SavannaSpider){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySpider.class, MobSpawnsHandler.SavannaSpiderWeight, MobSpawnsHandler.SavannaSpiderMin, MobSpawnsHandler.SavannaSpiderMax));
		    	}
				if (MobSpawnsHandler.SwampSpider){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySpider.class, MobSpawnsHandler.SwampSpiderWeight, MobSpawnsHandler.SwampSpiderMin, MobSpawnsHandler.SwampSpiderMax));
		    	}
				if (MobSpawnsHandler.TaigaSpider){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySpider.class, MobSpawnsHandler.TaigaSpiderWeight, MobSpawnsHandler.TaigaSpiderMin, MobSpawnsHandler.TaigaSpiderMax));
		    	}
				if (MobSpawnsHandler.EndSpider){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntitySpider.class, MobSpawnsHandler.EndSpiderWeight, MobSpawnsHandler.EndSpiderMin, MobSpawnsHandler.EndSpiderMax));
		    	}
			}
			if (MobSpawnsHandler.Witch){
				if (MobSpawnsHandler.NetherWitch){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityWitch.class, MobSpawnsHandler.NetherWitchWeight, MobSpawnsHandler.NetherWitchMin, MobSpawnsHandler.NetherWitchMax));
		    	}
				if (MobSpawnsHandler.BeachWitch){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityWitch.class, MobSpawnsHandler.BeachWitchWeight, MobSpawnsHandler.BeachWitchMin, MobSpawnsHandler.BeachWitchMax));
		    	}
				if (MobSpawnsHandler.DesertWitch){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityWitch.class, MobSpawnsHandler.DesertWitchWeight, MobSpawnsHandler.DesertWitchMin, MobSpawnsHandler.DesertWitchMax));
		    	}
				if (MobSpawnsHandler.ExtremeWitch){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityWitch.class, MobSpawnsHandler.ExtremeWitchWeight, MobSpawnsHandler.ExtremeWitchMin, MobSpawnsHandler.ExtremeWitchMax));
		    	}
				if (MobSpawnsHandler.ForestWitch){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityWitch.class, MobSpawnsHandler.ForestWitchWeight, MobSpawnsHandler.ForestWitchMin, MobSpawnsHandler.ForestWitchMax));
		    	}
				if (MobSpawnsHandler.JungleWitch){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityWitch.class, MobSpawnsHandler.JungleWitchWeight, MobSpawnsHandler.JungleWitchMin, MobSpawnsHandler.JungleWitchMax));
		    	}
				if (MobSpawnsHandler.MesaWitch){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityWitch.class, MobSpawnsHandler.MesaWitchWeight, MobSpawnsHandler.MesaWitchMin, MobSpawnsHandler.MesaWitchMax));
		    	}
				if (MobSpawnsHandler.PlainsWitch){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityWitch.class, MobSpawnsHandler.PlainsWitchWeight, MobSpawnsHandler.PlainsWitchMin, MobSpawnsHandler.PlainsWitchMax));
		    	}
				if (MobSpawnsHandler.SavannaWitch){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityWitch.class, MobSpawnsHandler.SavannaWitchWeight, MobSpawnsHandler.SavannaWitchMin, MobSpawnsHandler.SavannaWitchMax));
		    	}
				if (MobSpawnsHandler.SwampWitch){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityWitch.class, MobSpawnsHandler.SwampWitchWeight, MobSpawnsHandler.SwampWitchMin, MobSpawnsHandler.SwampWitchMax));
		    	}
				if (MobSpawnsHandler.TaigaWitch){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityWitch.class, MobSpawnsHandler.TaigaWitchWeight, MobSpawnsHandler.TaigaWitchMin, MobSpawnsHandler.TaigaWitchMax));
		    	}
				if (MobSpawnsHandler.EndWitch){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityWitch.class, MobSpawnsHandler.EndWitchWeight, MobSpawnsHandler.EndWitchMin, MobSpawnsHandler.EndWitchMax));
		    	}
			}
			if (MobSpawnsHandler.Zombie){
				if (MobSpawnsHandler.NetherZombie){
		    		Biomes.HELL.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityZombie.class, MobSpawnsHandler.NetherZombieWeight, MobSpawnsHandler.NetherZombieMin, MobSpawnsHandler.NetherZombieMax));
		    	}
				if (MobSpawnsHandler.BeachZombie){
		    		Biomes.BEACH.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityZombie.class, MobSpawnsHandler.BeachZombieWeight, MobSpawnsHandler.BeachZombieMin, MobSpawnsHandler.BeachZombieMax));
		    	}
				if (MobSpawnsHandler.DesertZombie){
		    		Biomes.DESERT.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityZombie.class, MobSpawnsHandler.DesertZombieWeight, MobSpawnsHandler.DesertZombieMin, MobSpawnsHandler.DesertZombieMax));
		    	}
				if (MobSpawnsHandler.ExtremeZombie){
		    		Biomes.EXTREME_HILLS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityZombie.class, MobSpawnsHandler.ExtremeZombieWeight, MobSpawnsHandler.ExtremeZombieMin, MobSpawnsHandler.ExtremeZombieMax));
		    	}
				if (MobSpawnsHandler.ForestZombie){
		    		Biomes.FOREST.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityZombie.class, MobSpawnsHandler.ForestZombieWeight, MobSpawnsHandler.ForestZombieMin, MobSpawnsHandler.ForestZombieMax));
		    	}
				if (MobSpawnsHandler.JungleZombie){
		    		Biomes.JUNGLE.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityZombie.class, MobSpawnsHandler.JungleZombieWeight, MobSpawnsHandler.JungleZombieMin, MobSpawnsHandler.JungleZombieMax));
		    	}
				if (MobSpawnsHandler.MesaZombie){
		    		Biomes.MESA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityZombie.class, MobSpawnsHandler.MesaZombieWeight, MobSpawnsHandler.MesaZombieMin, MobSpawnsHandler.MesaZombieMax));
		    	}
				if (MobSpawnsHandler.PlainsZombie){
		    		Biomes.PLAINS.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityZombie.class, MobSpawnsHandler.PlainsZombieWeight, MobSpawnsHandler.PlainsZombieMin, MobSpawnsHandler.PlainsZombieMax));
		    	}
				if (MobSpawnsHandler.SavannaZombie){
		    		Biomes.SAVANNA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityZombie.class, MobSpawnsHandler.SavannaZombieWeight, MobSpawnsHandler.SavannaZombieMin, MobSpawnsHandler.SavannaZombieMax));
		    	}
				if (MobSpawnsHandler.SwampZombie){
		    		Biomes.SWAMPLAND.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityZombie.class, MobSpawnsHandler.SwampZombieWeight, MobSpawnsHandler.SwampZombieMin, MobSpawnsHandler.SwampZombieMax));
		    	}
				if (MobSpawnsHandler.TaigaZombie){
		    		Biomes.TAIGA.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityZombie.class, MobSpawnsHandler.TaigaZombieWeight, MobSpawnsHandler.TaigaZombieMin, MobSpawnsHandler.TaigaZombieMax));
		    	}
				if (MobSpawnsHandler.EndZombie){
		    		Biomes.SKY.getSpawnableList(EnumCreatureType.MONSTER).add(new SpawnListEntry(EntityZombie.class, MobSpawnsHandler.EndZombieWeight, MobSpawnsHandler.EndZombieMin, MobSpawnsHandler.EndZombieMax));
		    	}
			}
		}
	}
}
