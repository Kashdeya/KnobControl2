package com.kashdeya.knobcontrol.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.kashdeya.knobcontrol.handlers.ClientHandler;
import com.kashdeya.knobcontrol.handlers.CraftingHandler;
import com.kashdeya.knobcontrol.handlers.EventsHandler;
import com.kashdeya.knobcontrol.handlers.FurnaceHandler;
import com.kashdeya.knobcontrol.handlers.ItemStackHandler;
import com.kashdeya.knobcontrol.handlers.LightLevelHandler;
import com.kashdeya.knobcontrol.handlers.MobSpawnsHandler;
import com.kashdeya.knobcontrol.handlers.ModularsHandler;
import com.kashdeya.knobcontrol.handlers.OreHandler;
import com.kashdeya.knobcontrol.handlers.RandomBonesHandler;
import com.kashdeya.knobcontrol.handlers.RemoveDropsHandler;
import com.kashdeya.knobcontrol.handlers.RemoveHandler;
import com.kashdeya.knobcontrol.handlers.RemoveMobsHandler;
import com.kashdeya.knobcontrol.handlers.ServerHandler;
import com.kashdeya.knobcontrol.handlers.TerrainControlHandler;
import com.kashdeya.knobcontrol.handlers.UncraftingHandler;
import com.kashdeya.knobcontrol.modulars.Furnace;

public class Config {
	
	public static Configuration config;
	public static final File configDir = new File("config/Knob Control");	
	
	public static void initMain()
	{
		
		File f = new File(configDir, "Main Config.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "Main Configs";
		
		config.addCustomCategoryComment(category + " 1:Modulars", "(EVERYTHING IS TURNED OFF BY DEFAULT!)\n(Enable or Disable All Modular configs here first before editing other config files.)");
		ModularsHandler.crafting = config.getBoolean("Extra Crafting Modular",  category + " 1:Modulars", false, "Enable Extra Crafting Modular Config?");
		ModularsHandler.events = config.getBoolean("Mob Events Modular",  category + " 1:Modulars", false, "Enable Mob Events Modular Config?");
		ModularsHandler.furnace = config.getBoolean("Furnace Modular",  category + " 1:Modulars", false, "Enable Furnace Modular Config?");
		ModularsHandler.hardcore = config.getBoolean("Hardcore Modular",  category + " 1:Modulars", false, "Enable Hardcore Modular Config?");
		ModularsHandler.itemStacks = config.getBoolean("Item Stack Size Modular",  category + " 1:Modulars", false, "Enable Item Stack Size Modular Config?");
		ModularsHandler.mobSpawns = config.getBoolean("Mob Spawn Modular",  category + " 1:Modulars", false, "Enable Mob Spawn Modular Config?");
		ModularsHandler.oreControl = config.getBoolean("Ore Control Modular",  category + " 1:Modulars", false, "Enable Ore Control Modular Config?");
		ModularsHandler.randomBones = config.getBoolean("Random Bone Drops Modular",  category + " 1:Modulars", false, "Enable Random Bone Drops Modular Config?");
		ModularsHandler.remove = config.getBoolean("Remove Vanilla Items Modular",  category + " 1:Modulars", false, "Enable Remove Vanilla Items Modular Config?");
		ModularsHandler.removeDrops = config.getBoolean("Remove Drops Modular",  category + " 1:Modulars", false, "Enable Remove Drops Modular Config?");
		ModularsHandler.removeMobs = config.getBoolean("Remove Mobs Modular",  category + " 1:Modulars", false, "Enable Remove Mobs Modular Config?");
		ModularsHandler.terrainControl = config.getBoolean("Terrain Control Modular",  category + " 1:Modulars", false, "Enable Terrain Control Modular Config?");
		ModularsHandler.uncrafting = config.getBoolean("Uncrafting Modular",  category + " 1:Modulars", false, "Enable Uncrafting Modular Config?");
		ModularsHandler.lightLevels = config.getBoolean("Mob Light Levels",  category + " 1:Modulars", false, "Enable Light Level Modular Config?");
		ModularsHandler.mobDrops = config.getBoolean("Mob Drops",  category + " 1:Modulars", false, "Enable Mob Drops Modular Config?");
		
        // Client Side Changes
        config.addCustomCategoryComment(category + " Client Options", "true or false");
        ClientHandler.f3Off = config.getBoolean("F3 Debug", category + " Client Options", false, "Disable the F3 Debug?");
        ClientHandler.foodInfoOff = config.getBoolean("Food Info", category + " Client Options", false, "Enable Food Saturation Tooltip?");
        ClientHandler.fovOff = config.getBoolean("Field of View", category + " Client Options", false, "Stop FOV from changing due to potions and flight?");
        ClientHandler.potionOff = config.getBoolean("Potion Icons", category + " Client Options", false, "Remove Potion Icons from top right of Screen?");
        ClientHandler.potionShift = config.getBoolean("Potion Shift", category + " Client Options", false, "Stop Inventory screen from shifting if potion effect is displayed?");
        
        // Server Side Changes
        config.addCustomCategoryComment(category + " Misc Options", "true or false");
        ServerHandler.inWall = config.getBoolean("Spawn in Wall", category + " Misc Options", false, "Stop getting hurt from spawning in a wall?");
        ServerHandler.melonDrop = config.getBoolean("Melon Drops", category + " Misc Options", false, "Melons drop full Melons instead of slices?");
        ServerHandler.passThrough = config.getBoolean("Pass Through Signs", category + " Misc Options", false, "Enable Player to pass through a sign?");
        ServerHandler.safeOff = config.getBoolean("Safe Mobs", category + " Misc Options", false, "Stop the Mobs you are riding from getting hurt from your weapon.");
        
        // GameRules
        config.addCustomCategoryComment(category + " GameRules", "true or false");
        ServerHandler.keepInvo = config.getBoolean("Keep Inventory", category + " GameRules", false, "Allow players to keep inventory on death?");
        ServerHandler.regenOff = config.getBoolean("Natural Regeneration", category+ " GameRules", false, "Disable Natural Regeneration?");
        ServerHandler.lightCycle = config.getBoolean("Day-Night Cycle", category + " GameRules", false, "Disable Day-Night Cycle?");
        ServerHandler.fireTick = config.getBoolean("Fire Tick", category + " GameRules", false, "Disable Whether fire should spread and naturally extinguishe?");
        ServerHandler.mobGriefing = config.getBoolean("Mob Griefing", category + " GameRules", false, "Disable Whether creepers, zombies, endermen, ghasts, withers, ender dragons, rabbits, sheep, and villagers\nshould be able to change blocks and\nwhether villagers, zombies, skeletons, and zombie pigmen can pick up items?");
        ServerHandler.pvp = config.getBoolean("PVP", category + " GameRules", false, "Disable Whether the player can fight with other player?");
        
		// Village Control
		config.addCustomCategoryComment(category + " Villages", "true or false");
		ServerHandler.disableVillages = config.getBoolean("Villages",  category + " Villages", false, "Disable Villages?");
		
		// Leaf Decay
		config.addCustomCategoryComment(category + " Bedrock", "true or false");
		ServerHandler.flatBedrock = config.getBoolean("Flat Bedrock",  category + " Bedrock", false, "Enable Flat Bedrock?");
				
		// Leaf Decay
		config.addCustomCategoryComment(category + " Leaf Decay", "Leaf Decay");
		ServerHandler.DecayFuzz = config.getInt("Leaves Decay Fuzz", category + " Leaf Decay", 3, 0, 20, "How random leaves Decay! \n(Lower means less random)");
		ServerHandler.DecaySpeed = config.getInt("Leaves Decay Speed", category + " Leaf Decay", 5, 0, 20, "How fast leaves Decay! \n(Lower means faster)");
		ServerHandler.leafDecay = config.getBoolean("Enable Fast Leaf Decay",  category + " Leaf Decay", false, "Enable?");
		
		// Vanilla Chickens
        config.addCustomCategoryComment(category + " Chicken Shed", "Feather Drops");
        ServerHandler.chicksDropFeathers = config.getBoolean("2. Baby Chickens Feather Drop",  category + " Chicken Shed", false, "Baby Chicken drop Feathers when killed?");
        ServerHandler.dropFreq = config.getInt("4. Natural Feather Drops", category + " Chicken Shed", 20000, 1, Integer.MAX_VALUE, "How often Feathers drop Naturally! \n(Lower means faster drops)");
        ServerHandler.featherDrops = config.getBoolean("1. Enable Chickens Feather Drop",  category + " Chicken Shed", false, "Enable Feather Drops?");
        ServerHandler.forceFeatherDrop = config.getBoolean("3. Feather Drop",  category + " Chicken Shed", false, "Feather Drops when killed");
                
        // Poison Reduce
        config.addCustomCategoryComment(category + " Poison Control", "true or false");
        ServerHandler.ReducePoison = config.getBoolean("Reduce Poison", category+ " Poison Control", false, "Enable Reduced Poison effect?");
        ServerHandler.DmgDecrease = config.getFloat("Reduce Poison Damage", category + " Poison Control", 0.05F, 0F, 1F, "Sets the amount of Poison Damage");
        
        // Replace poison with slowness
        ServerHandler.CaveSpiderPoison = config.getBoolean("Cave Spiders Apply Weakness", category+ " Poison Control", false, "Enable Weakness effect and remove Poison?");
        ServerHandler.weaknessTicks = config.getInt("Cave Spiders Apply Weakness Ticks", category + " Poison Control", 1, 1, 300, "Sets the tick amount of weakness\n(1 = 1 tick)");
        ServerHandler.weaknessLevel = config.getInt("Cave Spiders Apply Weakness Level", category + " Poison Control", 0, 0, 2, "Sets the level of weakness");
        ServerHandler.spidersApplySlowness = config.getBoolean("Spiders Apply Slowness", category+ " Poison Control", false, "Enable Slowness effect and remove Poison?");
        ServerHandler.slownessTicks = config.getInt("Spiders Apply Weakness Ticks", category + " Poison Control", 1, 1, 300, "Sets the tick amount of slowness\n(1 = 1 tick)");
        ServerHandler.slownessLevel = config.getInt("Spiders Apply Weakness Level", category + " Poison Control", 0, 0, 2, "Sets the level of slowness");
        
        // Weather
        config.addCustomCategoryComment(category + " Weather Options", "true or false");
        ServerHandler.NoMoreRain = config.getBoolean("Rain", category + " Weather Options", false, "Disable Rain?");
        ServerHandler.NoMoreThunder = config.getBoolean("Thunder", category + " Weather Options", false, "Disable Thunder?");
        
        // No Sleep
        config.addCustomCategoryComment(category + " Sleep Options", "true or false");
        ServerHandler.noSleep = config.getBoolean("Sleep", category + " Sleep Options", false, "Disable Sleeping?");
        
        // Wither
        config.addCustomCategoryComment(category + " Wither", "true or false");
        EventsHandler.witherSpawn = config.getBoolean("Wither Spawn", category + " Wither", false, "Enable Wither spawning only in the Nether?");
        
		if (config.hasChanged() == true){
        config.save();
        }
	}
	
	public static void initLightLevels()
	{
		File f = new File(configDir, "Light Levels Modular.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "Light Levels Modular";
		
		// Light Levels
		// Mobs
		config.addCustomCategoryComment(category + " Mob Light Levels", "Changes the light level for the mob to spawn!");
		LightLevelHandler.Blaze = config.getBoolean("Blaze", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntityBlaze = config.getInt("Blaze Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.CaveSpider = config.getBoolean("CaveSpider", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntityCaveSpider = config.getInt("CaveSpider Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Creeper = config.getBoolean("Creeper", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntityCreeper = config.getInt("Creeper Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Enderman = config.getBoolean("Enderman", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntityEnderman = config.getInt("Enderman Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Endermite = config.getBoolean("Endermite", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntityEndermite = config.getInt("Endermite Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Ghast = config.getBoolean("Ghast", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntityGhast = config.getInt("Ghast Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.GiantZombie = config.getBoolean("GiantZombie", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntityGiantZombie = config.getInt("GiantZombie Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.IronGolem = config.getBoolean("IronGolem", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntityIronGolem = config.getInt("IronGolem Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.MagmaCube = config.getBoolean("MagmaCube", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntityMagmaCube = config.getInt("MagmaCube Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.PigZombie = config.getBoolean("PigZombie", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntityPigZombie = config.getInt("PigZombie Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.PolarBear = config.getBoolean("PolarBear", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntityPolarBear = config.getInt("PolarBear Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Shulker = config.getBoolean("Shulker", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntityShulker = config.getInt("Shulker Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Silverfish = config.getBoolean("Silverfish", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntitySilverfish = config.getInt("Silverfish Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Skeleton = config.getBoolean("Skeleton", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntitySkeleton = config.getInt("Skeleton Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Slime = config.getBoolean("Slime", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntitySlime = config.getInt("Slime Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Snowman = config.getBoolean("Snowman", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntitySnowman = config.getInt("Snowman Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Spider = config.getBoolean("Spider", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntitySpider = config.getInt("Spider Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Witch = config.getBoolean("Witch", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntityWitch = config.getInt("Witch Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Zombie = config.getBoolean("Zombie", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntityZombie = config.getInt("Zombie Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.WitherSkeleton = config.getBoolean("WitherSkeleton", category + " Mob Light Levels", false, "Enable?");
		LightLevelHandler.EntityWitherSkeleton = config.getInt("WitherSkeleton Spawn", category + " Mob Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		
		// Passive
		config.addCustomCategoryComment(category + " Passive Light Levels", "Changes the light level for the mob to spawn!");
		LightLevelHandler.Bat = config.getBoolean("Bat", category + " Passive Light Levels", false, "Enable?");
		LightLevelHandler.EntityBat = config.getInt("Bat Spawn", category + " Passive Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Chicken = config.getBoolean("Chicken", category + " Passive Light Levels", false, "Enable?");
		LightLevelHandler.EntityChicken = config.getInt("Chicken Spawn", category + " Passive Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Cow = config.getBoolean("Cow", category + " Passive Light Levels", false, "Enable?");
		LightLevelHandler.EntityCow = config.getInt("Cow Spawn", category + " Passive Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Horse = config.getBoolean("Horse", category + " Passive Light Levels", false, "Enable?");
		LightLevelHandler.EntityHorse = config.getInt("Horse Spawn", category + " Passive Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Donkey = config.getBoolean("Donkey", category + " Passive Light Levels", false, "Enable?");
		LightLevelHandler.EntityDonkey = config.getInt("Donkey Spawn", category + " Passive Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Mule = config.getBoolean("Mule", category + " Passive Light Levels", false, "Enable?");
		LightLevelHandler.EntityMule = config.getInt("Mule Spawn", category + " Passive Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Mooshroom = config.getBoolean("Mooshroom", category + " Passive Light Levels", false, "Enable?");
		LightLevelHandler.EntityMooshroom = config.getInt("Mooshroom Spawn", category + " Passive Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Ocelot = config.getBoolean("Ocelot", category + " Passive Light Levels", false, "Enable?");
		LightLevelHandler.EntityOcelot = config.getInt("Ocelot Spawn", category + " Passive Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Pig = config.getBoolean("Pig", category + " Passive Light Levels", false, "Enable?");
		LightLevelHandler.EntityPig = config.getInt("Pig Spawn", category + " Passive Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Rabbit = config.getBoolean("Rabbit", category + " Passive Light Levels", false, "Enable?");
		LightLevelHandler.EntityRabbit = config.getInt("Rabbit Spawn", category + " Passive Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Sheep = config.getBoolean("Sheep", category + " Passive Light Levels", false, "Enable?");
		LightLevelHandler.EntitySheep = config.getInt("Sheep Spawn", category + " Passive Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Villager = config.getBoolean("Villager", category + " Passive Light Levels", false, "Enable?");
		LightLevelHandler.EntityVillager = config.getInt("Villager Spawn", category + " Passive Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		LightLevelHandler.Wolf = config.getBoolean("Wolf", category + " Passive Light Levels", false, "Enable?");
		LightLevelHandler.EntityWolf = config.getInt("Wolf Spawn", category + " Passive Light Levels", 7, 1, 15, "Sets Spawn Light Level.");
		
		if (config.hasChanged() == true){
	        config.save();
	    }
	}
	
	public static void initRemoveDrops()
	{
		File f = new File(configDir, "Remove Drops Modular.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "Remove Drops Modular";
		
		// Mob Spawns
        config.addCustomCategoryComment(category + " Mob Options", "true or false");
        RemoveDropsHandler.bat = config.getBoolean("Bat", category + " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.blaze = config.getBoolean("Blaze", category + " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.caveSpider = config.getBoolean("Cavespider", category + " Mob Options", false, "Disable Custom Drops?");
        RemoveDropsHandler.chicken = config.getBoolean("Chicken", category + " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.cow = config.getBoolean("Cow", category + " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.creeper = config.getBoolean("Creeper", category + " Mob Options", false, "Disable underground Generation?");
        RemoveDropsHandler.dragon = config.getBoolean("Dragon", category + " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.enderman = config.getBoolean("Enderman", category + " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.endermite = config.getBoolean("Endermite", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.ghast = config.getBoolean("Ghast", category + " Mob Options", false, "Disable underground Generation?");
        RemoveDropsHandler.giantZombie = config.getBoolean("Giant Zombie", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.guardians = config.getBoolean("Guardian", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.horses = config.getBoolean("Horses", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.magmaCube = config.getBoolean("Mamagcube", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.mooshroom = config.getBoolean("Mooshroom", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.ocelot = config.getBoolean("Ocelot", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.pig = config.getBoolean("Pig", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.pigZombie = config.getBoolean("PigZombie", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.polarbear = config.getBoolean("Polarbear", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.rabbit = config.getBoolean("Rabbit", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.sheep = config.getBoolean("Sheep", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.shulker = config.getBoolean("Shulker", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.silverfish = config.getBoolean("Silverfish", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.skeleton = config.getBoolean("Skeleton", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.slime = config.getBoolean("Slime", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.snowman = config.getBoolean("Snowman", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.spider = config.getBoolean("Spider", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.squid = config.getBoolean("Squid", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.villager = config.getBoolean("Villager", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.villagerZombie = config.getBoolean("Zombie Villager", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.witch = config.getBoolean("Witch", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.wither = config.getBoolean("Wither", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.witherSkeleton = config.getBoolean("With Skeleton", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.wolf = config.getBoolean("Wolf", category+ " Mob Options", false, "Disable Drops?");
        RemoveDropsHandler.zombie = config.getBoolean("Zombie", category+ " Mob Options", false, "Disable Drops?");        
		
		if (config.hasChanged() == true){
	        config.save();
	    }
	}
	
	public static void initCrafting()
	{
		File f = new File(configDir, "Extra Crafting Modular.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "Extra Crafting Modular";
		
        // Old School Recipes
        config.addCustomCategoryComment(category + " Old School Recipes", "true or false");
        CraftingHandler.appleOff = config.getBoolean("Old Notch Apple Recipe", category + " Old School Recipes", false, "Enable Old Notch Apple Recipe?");
        CraftingHandler.oldArrow = config.getBoolean("Old Arrow Recipe", category + " Old School Recipes", false, "Enable Old Arrow Recipe?");
        CraftingHandler.oldBook = config.getBoolean("Old Book Recipe", category + " Old School Recipes", false, "Enable Old Book Recipe?");
        CraftingHandler.oldHorse = config.getBoolean("Old Horse Armor", category + " Old School Recipes", false, "Enable Old Horse Armor Recipe?");
        CraftingHandler.oldOakFence = config.getBoolean("Old Oak Fence Recipe", category + " Old School Recipes", false, "Enable Old Oak Fence Recipe?");
        
		// Recycle Recipes
        config.addCustomCategoryComment(category + " Recycle Recipes", "true or false");
        CraftingHandler.recycleIron = config.getBoolean("Recycle Iron", category + " Recycle Recipes", false, "Smelt Fully Repaired Iron Tools, Weapons and Armor back into Ingots?");
        CraftingHandler.recycleGold = config.getBoolean("Recycle Gold", category + " Recycle Recipes", false, "Smelt Fully Repaired Gold Tools, Weapons and Armor back into Ingots?");
        
        // Extra Recipes
        config.addCustomCategoryComment(category + " Extra Recipes", "true or false");
        CraftingHandler.barrierBlock = config.getBoolean("World Barrier", category + " Extra Recipes", false, "Enable World Barrier Recipe?");
        CraftingHandler.chestOff = config.getBoolean("Chest Recipe", category + " Extra Recipes", false, "Enable Chest Recipe out of logs?");
        CraftingHandler.clayOff = config.getBoolean("Clay Recipe", category + " Extra Recipes", false, "Enable Clay Block Recipe?");
        CraftingHandler.coal2charcoal = config.getBoolean("Coal 2 Charcoal", category + " Extra Recipes", false, "Craft Coal into Charcoal?");
        CraftingHandler.coarseOff = config.getBoolean("Coarse Dirt", category + " Extra Recipes", false, "Enable Coarse Dirt Recipe?");
        CraftingHandler.cobwebOff = config.getBoolean("Cob Web", category + " Extra Recipes", false, "Enable Cob Web Recipe?");
        CraftingHandler.dustOff = config.getBoolean("Glowstone Dust", category + " Extra Recipes", false, "Enable Glowstone Dust Recipe?");
        CraftingHandler.endstoneOff = config.getBoolean("End Stone", category + " Extra Recipes", false, "Enable End Stone Recipe?");
        CraftingHandler.flintOff = config.getBoolean("Flint Recipe", category + " Extra Recipes", false, "Enable Flint Recipe?");
        CraftingHandler.grassOff = config.getBoolean("Grass Recipe", category + " Extra Recipes", false, "Enable Grass Block Recipe?");
        CraftingHandler.iceOff = config.getBoolean("Ice Block", category + " Extra Recipes", false, "Enable Ice Block Recipe?");
        CraftingHandler.leatherOff = config.getBoolean("Leather Recipe", category + " Extra Recipes", false, "Enable Leather Recipe?");
        CraftingHandler.myceliumOff = config.getBoolean("Mycelium Recipe", category + " Extra Recipes", false, "Enable Mycelium Recipe?");
        CraftingHandler.nametagOff = config.getBoolean("Nametag Recipe", category + " Extra Recipes", false, "Enable Nametag Recipe?");
        CraftingHandler.newHorse = config.getBoolean("New Horse Armor", category + " Extra Recipes", false, "Enable New Horse Armor Recipe? \n(Make sure to Disable Old School Recipe First)");
        CraftingHandler.packedOff = config.getBoolean("Packed Ice", category + " Extra Recipes", false, "Enable Packed Ice Recipe?");
        CraftingHandler.replaceStoneTools = config.getBoolean("Stone Tools", category + " Extra Recipes", false, "Stone Tools require stone?");
        CraftingHandler.saddleOff = config.getBoolean("Saddle Recipe", category + " Extra Recipes", false, "Enable Saddle Recipe?");
        CraftingHandler.slabOff = config.getBoolean("Slabs 2 Cobblestone", category + " Extra Recipes", false, "Enable Slabs 2 Cobblestone?");
        CraftingHandler.spongeOff = config.getBoolean("Sponge Recipe", category + " Extra Recipes", false, "Enable Sponge Recipe?");
        CraftingHandler.xpBottle = config.getBoolean("Xp Bottle", category + " Extra Recipes", false, "Enable XP Bottle Recipe?");
		
		if (config.hasChanged() == true){
	        config.save();
	    }
	}
	
	public static void initEvents()
	{
		File f = new File(configDir, "Mob Events Modular.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "Mob Events Modular";
		
		// Blaze
		config.addCustomCategoryComment(category + " Blaze Config", "true or false");
		EventsHandler.Blazes = config.getBoolean("Potion Effects", category + " Blaze Config", false, "Enable potion effects when fighting a blaze?");
		EventsHandler.blazePotionChance = config.getInt("Potion Chance", category + " Blaze Config", 2, 1, 20, "The chance of players getting potion effects when fighting a mob.");
		config.addCustomCategoryComment(category + " Blaze Potion Effects", "true or false");
		EventsHandler.blazePlayerBlindness = config.getBoolean("Blindness", category + " Blaze Potion Effects", false, "Enable Blindness?");
		EventsHandler.blazeBlind = config.getInt("Blindness Duration", category + " Blaze Potion Effects", 1, 0, 300, "Blindness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.blazePlayerNausea = config.getBoolean("Nausea", category + " Blaze Potion Effects", false, "Enable Nausea?");
		EventsHandler.blazeNausea = config.getInt("Nausea Duration", category + " Blaze Potion Effects", 1, 0, 300, "Nausea duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.blazePlayerFatigue = config.getBoolean("Mining Fatigue", category + " Blaze Potion Effects", false, "Enable Mining Fatigue?");
		EventsHandler.blazeDigSlow = config.getInt("Mining Fatigue Duration", category + " Blaze Potion Effects", 1, 0, 300, "Mining Fatigue duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.blazePlayerInstant = config.getBoolean("Instant Damage", category + " Blaze Potion Effects", false, "Enable Instant Damage?");
		EventsHandler.blazeInstant = config.getInt("Instant Damage Duration", category + " Blaze Potion Effects", 1, 0, 300, "Instant Damage duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.blazePlayerHunger = config.getBoolean("Hunger", category + " Blaze Potion Effects", false, "Enable Hunger?");
		EventsHandler.blazeHunger = config.getInt("Hunger Duration", category + " Blaze Potion Effects", 1, 0, 300, "Hunger duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.blazePlayerSlowness = config.getBoolean("Slowness", category + " Blaze Potion Effects", false, "Enable Slowness?");
		EventsHandler.blazeMoveSlow = config.getInt("Slowness Duration", category + " Blaze Potion Effects", 1, 0, 300, "Slowness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.blazePlayerPoison = config.getBoolean("Poison", category + " Blaze Potion Effects", false, "Enable Poison?");
		EventsHandler.blazePoison = config.getInt("Poison Duration", category + " Blaze Potion Effects", 1, 0, 300, "Poison duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.blazePlayerWeakness = config.getBoolean("Weakness", category + " Blaze Potion Effects", false, "Enable Weakness?");
		EventsHandler.blazeWeakness = config.getInt("Weakness Duration", category + " Blaze Potion Effects", 1, 0, 300, "Weakness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.blazePlayerWither = config.getBoolean("Wither", category + " Blaze Potion Effects", false, "Enable Wither?");
		EventsHandler.blazeWither = config.getInt("Wither Duration", category + " Blaze Potion Effects", 1, 0, 300, "Withering duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.blazePlayerUnluck = config.getBoolean("Unluck", category + " Blaze Potion Effects", false, "Enable Unluck?");
		EventsHandler.blazeUnluck = config.getInt("Unluck Duration", category + " Blaze Potion Effects", 1, 0, 300, "Unluck duration in Ticks!/n(1 = 1 tick)");
		
		// CaveSpider
		config.addCustomCategoryComment(category + " Cave Spider Config", "true or false");
		EventsHandler.CaveSpiders = config.getBoolean("Potion Effects", category + " Cave Spider Config", false, "Enable potion effects when fighting a cavespider?");
		EventsHandler.caveSpiderPotionChance = config.getInt("Potion Chance", category + " Cave Spider Config", 2, 1, 20, "The chance of players getting potion effects when fighting a mob.");
		config.addCustomCategoryComment(category + " Cave Spider Potion Effects", "true or false");
		EventsHandler.caveSpiderPlayerBlindness = config.getBoolean("Blindness", category + " Cave Spider Potion Effects", false, "Enable Blindness?");
		EventsHandler.caveSpiderBlind = config.getInt("Blindness Duration", category + " Cave Spider Potion Effects", 1, 0, 300, "Blindness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerNausea = config.getBoolean("Nausea", category + " Cave Spider Potion Effects", false, "Enable Nausea?");
		EventsHandler.caveSpiderNausea = config.getInt("Nausea Duration", category + " Cave Spider Potion Effects", 1, 0, 300, "Nausea duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerFatigue = config.getBoolean("Mining Fatigue", category + " Cave Spider Potion Effects", false, "Enable Mining Fatigue?");
		EventsHandler.caveSpiderDigSlow = config.getInt("Mining Fatigue Duration", category + " Cave Spider Potion Effects", 1, 0, 300, "Mining Fatigue duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerInstant = config.getBoolean("Instant Damage", category + " Cave Spider Potion Effects", false, "Enable Instant Damage?");
		EventsHandler.caveSpiderInstant = config.getInt("Instant Damage Duration", category + " Cave Spider Potion Effects", 1, 0, 300, "Instant Damage duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerHunger = config.getBoolean("Hunger", category + " Cave Spider Potion Effects", false, "Enable Hunger?");
		EventsHandler.caveSpiderHunger = config.getInt("Hunger Duration", category + " Cave Spider Potion Effects", 1, 0, 300, "Hunger duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerSlowness = config.getBoolean("Slowness", category + " Cave Spider Potion Effects", false, "Enable Slowness?");
		EventsHandler.caveSpiderMoveSlow = config.getInt("Slowness Duration", category + " Cave Spider Potion Effects", 1, 0, 300, "Slowness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerPoison = config.getBoolean("Poison", category + " Cave Spider Potion Effects", false, "Enable Poison?");
		EventsHandler.caveSpiderPoison = config.getInt("Poison Duration", category + " Cave Spider Potion Effects", 1, 0, 300, "Poison duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerWeakness = config.getBoolean("Weakness", category + " Cave Spider Potion Effects", false, "Enable Weakness?");
		EventsHandler.caveSpiderWeakness = config.getInt("Weakness Duration", category + " Cave Spider Potion Effects", 1, 0, 300, "Weakness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerWither = config.getBoolean("Wither", category + " Cave Spider Potion Effects", false, "Enable Wither?");
		EventsHandler.caveSpiderWither = config.getInt("Wither Duration", category + " Cave Spider Potion Effects", 1, 0, 300, "Withering duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerUnluck = config.getBoolean("Unluck", category + " Cave Spider Potion Effects", false, "Enable Unluck?");
		EventsHandler.caveSpiderUnluck = config.getInt("Unluck Duration", category + " Cave Spider Potion Effects", 1, 0, 300, "Unluck duration in Ticks!/n(1 = 1 tick)");
		
		// Creeper
		config.addCustomCategoryComment(category + " Creeper Changes", "true or false");
		EventsHandler.Creepers_Boom = config.getBoolean("Instant Explode", category + " Creeper Changes", false, "Creepers instantly exploding?");
		EventsHandler.creeperBoomChance = config.getInt("Instant Explode Chance", category + " Creeper Changes", 2, 1, 20, "The chance of creepers instantly exploding.");
		EventsHandler.creeperDamage = config.getBoolean("Block Damage", category + " Creeper Changes", false, "Disable Creeper Block Damage?");
		config.addCustomCategoryComment(category + " Creeper Config", "true or false");
		EventsHandler.Creepers_Potions = config.getBoolean("Potion Effects", category + " Creeper Config", false, "Enable potion effects when fighting a creeper?");
		EventsHandler.creeperPotionChance = config.getInt("Potion Chance", category + " Creeper Config", 2, 1, 20, "The chance of players getting potion effects when fighting a mob.");
		config.addCustomCategoryComment(category + " Creeper Potion Effects", "true or false");
		EventsHandler.caveSpiderPlayerBlindness = config.getBoolean("Blindness", category + " Creeper Potion Effects", false, "Enable Blindness?");
		EventsHandler.caveSpiderBlind = config.getInt("Blindness Duration", category + " Creeper Potion Effects", 1, 0, 300, "Blindness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerNausea = config.getBoolean("Nausea", category + " Creeper Potion Effects", false, "Enable Nausea?");
		EventsHandler.caveSpiderNausea = config.getInt("Nausea Duration", category + " Creeper Potion Effects", 1, 0, 300, "Nausea duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerFatigue = config.getBoolean("Mining Fatigue", category + " Creeper Potion Effects", false, "Enable Mining Fatigue?");
		EventsHandler.caveSpiderDigSlow = config.getInt("Mining Fatigue Duration", category + " Creeper Potion Effects", 1, 0, 300, "Mining Fatigue duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerInstant = config.getBoolean("Instant Damage", category + " Creeper Potion Effects", false, "Enable Instant Damage?");
		EventsHandler.caveSpiderInstant = config.getInt("Instant Damage Duration", category + " Creeper Potion Effects", 1, 0, 300, "Instant Damage duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerHunger = config.getBoolean("Hunger", category + " Creeper Potion Effects", false, "Enable Hunger?");
		EventsHandler.caveSpiderHunger = config.getInt("Hunger Duration", category + " Creeper Potion Effects", 1, 0, 300, "Hunger duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerSlowness = config.getBoolean("Slowness", category + " Creeper Potion Effects", false, "Enable Slowness?");
		EventsHandler.caveSpiderMoveSlow = config.getInt("Slowness Duration", category + " Creeper Potion Effects", 1, 0, 300, "Slowness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerPoison = config.getBoolean("Poison", category + " Creeper Potion Effects", false, "Enable Poison?");
		EventsHandler.caveSpiderPoison = config.getInt("Poison Duration", category + " Creeper Potion Effects", 1, 0, 300, "Poison duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerWeakness = config.getBoolean("Weakness", category + " Creeper Potion Effects", false, "Enable Weakness?");
		EventsHandler.caveSpiderWeakness = config.getInt("Weakness Duration", category + " Creeper Potion Effects", 1, 0, 300, "Weakness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerWither = config.getBoolean("Wither", category + " Creeper Potion Effects", false, "Enable Wither?");
		EventsHandler.caveSpiderWither = config.getInt("Wither Duration", category + " Creeper Potion Effects", 1, 0, 300, "Withering duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.caveSpiderPlayerUnluck = config.getBoolean("Unluck", category + " Creeper Potion Effects", false, "Enable Unluck?");
		EventsHandler.caveSpiderUnluck = config.getInt("Unluck Duration", category + " Creeper Potion Effects", 1, 0, 300, "Unluck duration in Ticks!/n(1 = 1 tick)");
		
		// Endermen
		config.addCustomCategoryComment(category + " Endermen Config", "true or false");
		EventsHandler.Endermen = config.getBoolean("Potion Effects", category + " Endermen Config", false, "Enable potion effects when fighting a enderman?");
		EventsHandler.endermanPotionChance = config.getInt("Potion Chance", category + " Endermen Config", 2, 1, 20, "The chance of players getting potion effects when fighting a mob.");
		EventsHandler.extraDropsEnderman = config.getBoolean("Extra Drops", category + " Endermen Config", false, "Enable Extra ender pearl Drops?");
		EventsHandler.endermanDrops = config.getInt("Extra Drops Amount", category + " Endermen Config", 1, 0, Integer.MAX_VALUE, "Amount of extra ender pearls to drop! \nDrops will be a random number between 1 and the number you put!");
		config.addCustomCategoryComment(category + " Endermen Potion Effects", "true or false");
		EventsHandler.endermanPlayerBlindness = config.getBoolean("Blindness", category + " Endermen Potion Effects", false, "Enable Blindness?");
		EventsHandler.endermanBlind = config.getInt("Blindness Duration", category + " Endermen Potion Effects", 1, 0, 300, "Blindness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermanPlayerNausea = config.getBoolean("Nausea", category + " Endermen Potion Effects", false, "Enable Nausea?");
		EventsHandler.endermanNausea = config.getInt("Nausea Duration", category + " Endermen Potion Effects", 1, 0, 300, "Nausea duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermanPlayerFatigue = config.getBoolean("Mining Fatigue", category + " Endermen Potion Effects", false, "Enable Mining Fatigue?");
		EventsHandler.endermanDigSlow = config.getInt("Mining Fatigue Duration", category + " Endermen Potion Effects", 1, 0, 300, "Mining Fatigue duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermanPlayerInstant = config.getBoolean("Instant Damage", category + " Endermen Potion Effects", false, "Enable Instant Damage?");
		EventsHandler.endermanInstant = config.getInt("Instant Damage Duration", category + " Endermen Potion Effects", 1, 0, 300, "Instant Damage duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermanPlayerHunger = config.getBoolean("Hunger", category + " Endermen Potion Effects", false, "Enable Hunger?");
		EventsHandler.endermanHunger = config.getInt("Hunger Duration", category + " Endermen Potion Effects", 1, 0, 300, "Hunger duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermanPlayerSlowness = config.getBoolean("Slowness", category + " Endermen Potion Effects", false, "Enable Slowness?");
		EventsHandler.endermanMoveSlow = config.getInt("Slowness Duration", category + " Endermen Potion Effects", 1, 0, 300, "Slowness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermanPlayerPoison = config.getBoolean("Poison", category + " Endermen Potion Effects", false, "Enable Poison?");
		EventsHandler.endermanPoison = config.getInt("Poison Duration", category + " Endermen Potion Effects", 1, 0, 300, "Poison duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermanPlayerWeakness = config.getBoolean("Weakness", category + " Endermen Potion Effects", false, "Enable Weakness?");
		EventsHandler.endermanWeakness = config.getInt("Weakness Duration", category + " Endermen Potion Effects", 1, 0, 300, "Weakness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermanPlayerWither = config.getBoolean("Wither", category + " Endermen Potion Effects", false, "Enable Wither?");
		EventsHandler.endermanWither = config.getInt("Wither Duration", category + " Endermen Potion Effects", 1, 0, 300, "Withering duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermanPlayerUnluck = config.getBoolean("Unluck", category + " Endermen Potion Effects", false, "Enable Unluck?");
		EventsHandler.endermanUnluck = config.getInt("Unluck Duration", category + " Endermen Potion Effects", 1, 0, 300, "Unluck duration in Ticks!/n(1 = 1 tick)");
			
		// Endermite
		config.addCustomCategoryComment(category + " Endermite Config", "true or false");
		EventsHandler.Endermites = config.getBoolean("Potion Effects", category + " Endermite Config", false, "Enable potion effects when fighting a endermite?");
		EventsHandler.endermitePotionChance = config.getInt("Potion Chance", category + " Endermite Config", 2, 1, 20, "The chance of players getting potion effects when fighting a mob.");
		config.addCustomCategoryComment(category + " Endermite Potion Effects", "true or false");
		EventsHandler.endermitePlayerBlindness = config.getBoolean("Blindness", category + " Endermite Potion Effects", false, "Enable Blindness?");
		EventsHandler.endermiteBlind = config.getInt("Blindness Duration", category + " Endermite Potion Effects", 1, 0, 300, "Blindness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermitePlayerNausea = config.getBoolean("Nausea", category + " Endermite Potion Effects", false, "Enable Nausea?");
		EventsHandler.endermiteNausea = config.getInt("Nausea Duration", category + " Endermite Potion Effects", 1, 0, 300, "Nausea duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermitePlayerFatigue = config.getBoolean("Mining Fatigue", category + " Endermite Potion Effects", false, "Enable Mining Fatigue?");
		EventsHandler.endermiteDigSlow = config.getInt("Mining Fatigue Duration", category + " Endermite Potion Effects", 1, 0, 300, "Mining Fatigue duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermitePlayerInstant = config.getBoolean("Instant Damage", category + " Endermite Potion Effects", false, "Enable Instant Damage?");
		EventsHandler.endermiteInstant = config.getInt("Instant Damage Duration", category + " Endermite Potion Effects", 1, 0, 300, "Instant Damage duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermitePlayerHunger = config.getBoolean("Hunger", category + " Endermite Potion Effects", false, "Enable Hunger?");
		EventsHandler.endermiteHunger = config.getInt("Hunger Duration", category + " Endermite Potion Effects", 1, 0, 300, "Hunger duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermitePlayerSlowness = config.getBoolean("Slowness", category + " Endermite Potion Effects", false, "Enable Slowness?");
		EventsHandler.endermiteMoveSlow = config.getInt("Slowness Duration", category + " Endermite Potion Effects", 1, 0, 300, "Slowness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermitePlayerPoison = config.getBoolean("Poison", category + " Endermite Potion Effects", false, "Enable Poison?");
		EventsHandler.endermitePoison = config.getInt("Poison Duration", category + " Endermite Potion Effects", 1, 0, 300, "Poison duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermitePlayerWeakness = config.getBoolean("Weakness", category + " Endermite Potion Effects", false, "Enable Weakness?");
		EventsHandler.endermiteWeakness = config.getInt("Weakness Duration", category + " Endermite Potion Effects", 1, 0, 300, "Weakness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermitePlayerWither = config.getBoolean("Wither", category + " Endermite Potion Effects", false, "Enable Wither?");
		EventsHandler.endermiteWither = config.getInt("Wither Duration", category + " Endermite Potion Effects", 1, 0, 300, "Withering duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.endermitePlayerUnluck = config.getBoolean("Unluck", category + " Endermite Potion Effects", false, "Enable Unluck?");
		EventsHandler.endermiteUnluck = config.getInt("Unluck Duration", category + " Endermite Potion Effects", 1, 0, 300, "Unluck duration in Ticks!/n(1 = 1 tick)");
		
		// Ghast
		config.addCustomCategoryComment(category + " Ghast Config", "true or false");
		EventsHandler.Ghasts = config.getBoolean("Potion Effects", category + " Ghast Config", false, "Enable potion effects when fighting a ghast?");
		EventsHandler.ghastPotionChance = config.getInt("Potion Chance", category + " Ghast Config", 2, 1, 20, "The chance of players getting potion effects when fighting a mob.");
		config.addCustomCategoryComment(category + " Ghast Potion Effects", "true or false");
		EventsHandler.ghastPlayerBlindness = config.getBoolean("Blindness", category + " Ghast Potion Effects", false, "Enable Blindness?");
		EventsHandler.ghastBlind = config.getInt("Blindness Duration", category + " Ghast Potion Effects", 1, 0, 300, "Blindness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.ghastPlayerNausea = config.getBoolean("Nausea", category + " Ghast Potion Effects", false, "Enable Nausea?");
		EventsHandler.ghastNausea = config.getInt("Nausea Duration", category + " Ghast Potion Effects", 1, 0, 300, "Nausea duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.ghastPlayerFatigue = config.getBoolean("Mining Fatigue", category + " Ghast Potion Effects", false, "Enable Mining Fatigue?");
		EventsHandler.ghastDigSlow = config.getInt("Mining Fatigue Duration", category + " Ghast Potion Effects", 1, 0, 300, "Mining Fatigue duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.ghastPlayerInstant = config.getBoolean("Instant Damage", category + " Ghast Potion Effects", false, "Enable Instant Damage?");
		EventsHandler.ghastInstant = config.getInt("Instant Damage Duration", category + " Ghast Potion Effects", 1, 0, 300, "Instant Damage duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.ghastPlayerHunger = config.getBoolean("Hunger", category + " Ghast Potion Effects", false, "Enable Hunger?");
		EventsHandler.ghastHunger = config.getInt("Hunger Duration", category + " Ghast Potion Effects", 1, 0, 300, "Hunger duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.ghastPlayerSlowness = config.getBoolean("Slowness", category + " Ghast Potion Effects", false, "Enable Slowness?");
		EventsHandler.ghastMoveSlow = config.getInt("Slowness Duration", category + " Ghast Potion Effects", 1, 0, 300, "Slowness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.ghastPlayerPoison = config.getBoolean("Poison", category + " Ghast Potion Effects", false, "Enable Poison?");
		EventsHandler.ghastPoison = config.getInt("Poison Duration", category + " Ghast Potion Effects", 1, 0, 300, "Poison duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.ghastPlayerWeakness = config.getBoolean("Weakness", category + " Ghast Potion Effects", false, "Enable Weakness?");
		EventsHandler.ghastWeakness = config.getInt("Weakness Duration", category + " Ghast Potion Effects", 1, 0, 300, "Weakness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.ghastPlayerWither = config.getBoolean("Wither", category + " Ghast Potion Effects", false, "Enable Wither?");
		EventsHandler.ghastWither = config.getInt("Wither Duration", category + " Ghast Potion Effects", 1, 0, 300, "Withering duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.ghastPlayerUnluck = config.getBoolean("Unluck", category + " Ghast Potion Effects", false, "Enable Unluck?");
		EventsHandler.ghastUnluck = config.getInt("Unluck Duration", category + " Ghast Potion Effects", 1, 0, 300, "Unluck duration in Ticks!/n(1 = 1 tick)");
		
		// Guardian
		config.addCustomCategoryComment(category + " Guardian Config", "true or false");
		EventsHandler.Guardians = config.getBoolean("Potion Effects", category + " Guardian Config", false, "Enable potion effects when fighting a guardian?");
		EventsHandler.guardianPotionChance = config.getInt("Potion Chance", category + " Guardian Config", 2, 1, 20, "The chance of players getting potion effects when fighting a mob.");
		config.addCustomCategoryComment(category + " Guardian Potion Effects", "true or false");
		EventsHandler.guardianPlayerBlindness = config.getBoolean("Blindness", category + " Guardian Potion Effects", false, "Enable Blindness?");
		EventsHandler.guardianBlind = config.getInt("Blindness Duration", category + " Guardian Potion Effects", 1, 0, 300, "Blindness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.guardianPlayerNausea = config.getBoolean("Nausea", category + " Guardian Potion Effects", false, "Enable Nausea?");
		EventsHandler.guardianNausea = config.getInt("Nausea Duration", category + " Guardian Potion Effects", 1, 0, 300, "Nausea duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.guardianPlayerFatigue = config.getBoolean("Mining Fatigue", category + " Guardian Potion Effects", false, "Enable Mining Fatigue?");
		EventsHandler.guardianDigSlow = config.getInt("Mining Fatigue Duration", category + " Guardian Potion Effects", 1, 0, 300, "Mining Fatigue duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.guardianPlayerInstant = config.getBoolean("Instant Damage", category + " Guardian Potion Effects", false, "Enable Instant Damage?");
		EventsHandler.guardianInstant = config.getInt("Instant Damage Duration", category + " Guardian Potion Effects", 1, 0, 300, "Instant Damage duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.guardianPlayerHunger = config.getBoolean("Hunger", category + " Guardian Potion Effects", false, "Enable Hunger?");
		EventsHandler.guardianHunger = config.getInt("Hunger Duration", category + " Guardian Potion Effects", 1, 0, 300, "Hunger duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.guardianPlayerSlowness = config.getBoolean("Slowness", category + " Guardian Potion Effects", false, "Enable Slowness?");
		EventsHandler.guardianMoveSlow = config.getInt("Slowness Duration", category + " Guardian Potion Effects", 1, 0, 300, "Slowness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.guardianPlayerPoison = config.getBoolean("Poison", category + " Guardian Potion Effects", false, "Enable Poison?");
		EventsHandler.guardianPoison = config.getInt("Poison Duration", category + " Guardian Potion Effects", 1, 0, 300, "Poison duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.guardianPlayerWeakness = config.getBoolean("Weakness", category + " Guardian Potion Effects", false, "Enable Weakness?");
		EventsHandler.guardianWeakness = config.getInt("Weakness Duration", category + " Guardian Potion Effects", 1, 0, 300, "Weakness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.guardianPlayerWither = config.getBoolean("Wither", category + " Guardian Potion Effects", false, "Enable Wither?");
		EventsHandler.guardianWither = config.getInt("Wither Duration", category + " Guardian Potion Effects", 1, 0, 300, "Withering duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.guardianPlayerUnluck = config.getBoolean("Unluck", category + " Guardian Potion Effects", false, "Enable Unluck?");
		EventsHandler.guardianUnluck = config.getInt("Unluck Duration", category + " Guardian Potion Effects", 1, 0, 300, "Unluck duration in Ticks!/n(1 = 1 tick)");
		
		// MagmaCube
		config.addCustomCategoryComment(category + " Magmacube Config", "true or false");
		EventsHandler.MagmaCubes = config.getBoolean("Potion Effects", category + " Magmacube Config", false, "Enable potion effects when fighting a magmacube?");
		EventsHandler.magmacubePotionChance = config.getInt("Potion Chance", category + " Magmacube Config", 2, 1, 20, "The chance of players getting potion effects when fighting a mob.");
		config.addCustomCategoryComment(category + " Magmacube Potion Effects", "true or false");
		EventsHandler.magmacubePlayerBlindness = config.getBoolean("Blindness", category + " Magmacube Potion Effects", false, "Enable Blindness?");
		EventsHandler.magmacubeBlind = config.getInt("Blindness Duration", category + " Magmacube Potion Effects", 1, 0, 300, "Blindness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.magmacubePlayerNausea = config.getBoolean("Nausea", category + " Magmacube Potion Effects", false, "Enable Nausea?");
		EventsHandler.magmacubeNausea = config.getInt("Nausea Duration", category + " Magmacube Potion Effects", 1, 0, 300, "Nausea duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.magmacubePlayerFatigue = config.getBoolean("Mining Fatigue", category + " Magmacube Potion Effects", false, "Enable Mining Fatigue?");
		EventsHandler.magmacubeDigSlow = config.getInt("Mining Fatigue Duration", category + " Magmacube Potion Effects", 1, 0, 300, "Mining Fatigue duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.magmacubePlayerInstant = config.getBoolean("Instant Damage", category + " Magmacube Potion Effects", false, "Enable Instant Damage?");
		EventsHandler.magmacubeInstant = config.getInt("Instant Damage Duration", category + " Magmacube Potion Effects", 1, 0, 300, "Instant Damage duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.magmacubePlayerHunger = config.getBoolean("Hunger", category + " Magmacube Potion Effects", false, "Enable Hunger?");
		EventsHandler.magmacubeHunger = config.getInt("Hunger Duration", category + " Magmacube Potion Effects", 1, 0, 300, "Hunger duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.magmacubePlayerSlowness = config.getBoolean("Slowness", category + " Magmacube Potion Effects", false, "Enable Slowness?");
		EventsHandler.magmacubeMoveSlow = config.getInt("Slowness Duration", category + " Magmacube Potion Effects", 1, 0, 300, "Slowness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.magmacubePlayerPoison = config.getBoolean("Poison", category + " Magmacube Potion Effects", false, "Enable Poison?");
		EventsHandler.magmacubePoison = config.getInt("Poison Duration", category + " Magmacube Potion Effects", 1, 0, 300, "Poison duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.magmacubePlayerWeakness = config.getBoolean("Weakness", category + " Magmacube Potion Effects", false, "Enable Weakness?");
		EventsHandler.magmacubeWeakness = config.getInt("Weakness Duration", category + " Magmacube Potion Effects", 1, 0, 300, "Weakness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.magmacubePlayerWither = config.getBoolean("Wither", category + " Magmacube Potion Effects", false, "Enable Wither?");
		EventsHandler.magmacubeWither = config.getInt("Wither Duration", category + " Magmacube Potion Effects", 1, 0, 300, "Withering duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.magmacubePlayerUnluck = config.getBoolean("Unluck", category + " Magmacube Potion Effects", false, "Enable Unluck?");
		EventsHandler.magmacubeUnluck = config.getInt("Unluck Duration", category + " Magmacube Potion Effects", 1, 0, 300, "Unluck duration in Ticks!/n(1 = 1 tick)");
		
		// PigZombie
		config.addCustomCategoryComment(category + " Pig Zombie Config", "true or false");
		EventsHandler.PigZombies = config.getBoolean("Potion Effects", category + " Pig Zombie Config", false, "Enable potion effects when fighting a pig zombie?");
		EventsHandler.pigzombiePotionChance = config.getInt("Potion Chance", category + " Pig Zombie Config", 2, 1, 20, "The chance of players getting potion effects when fighting a mob.");
		config.addCustomCategoryComment(category + " Pig Zombie Potion Effects", "true or false");
		EventsHandler.pigzombiePlayerBlindness = config.getBoolean("Blindness", category + " Pig Zombie Potion Effects", false, "Enable Blindness?");
		EventsHandler.pigzombieBlind = config.getInt("Blindness Duration", category + " Pig Zombie Potion Effects", 1, 0, 300, "Blindness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.pigzombiePlayerNausea = config.getBoolean("Nausea", category + " Pig Zombie Potion Effects", false, "Enable Nausea?");
		EventsHandler.pigzombieNausea = config.getInt("Nausea Duration", category + " Pig Zombie Potion Effects", 1, 0, 300, "Nausea duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.pigzombiePlayerFatigue = config.getBoolean("Mining Fatigue", category + " Pig Zombie Potion Effects", false, "Enable Mining Fatigue?");
		EventsHandler.pigzombieDigSlow = config.getInt("Mining Fatigue Duration", category + " Pig Zombie Potion Effects", 1, 0, 300, "Mining Fatigue duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.pigzombiePlayerInstant = config.getBoolean("Instant Damage", category + " Pig Zombie Potion Effects", false, "Enable Instant Damage?");
		EventsHandler.pigzombieInstant = config.getInt("Instant Damage Duration", category + " Pig Zombie Potion Effects", 1, 0, 300, "Instant Damage duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.pigzombiePlayerHunger = config.getBoolean("Hunger", category + " Pig Zombie Potion Effects", false, "Enable Hunger?");
		EventsHandler.pigzombieHunger = config.getInt("Hunger Duration", category + " Pig Zombie Potion Effects", 1, 0, 300, "Hunger duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.pigzombiePlayerSlowness = config.getBoolean("Slowness", category + " Pig Zombie Potion Effects", false, "Enable Slowness?");
		EventsHandler.pigzombieMoveSlow = config.getInt("Slowness Duration", category + " Pig Zombie Potion Effects", 1, 0, 300, "Slowness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.pigzombiePlayerPoison = config.getBoolean("Poison", category + " Pig Zombie Potion Effects", false, "Enable Poison?");
		EventsHandler.pigzombiePoison = config.getInt("Poison Duration", category + " Pig Zombie Potion Effects", 1, 0, 300, "Poison duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.pigzombiePlayerWeakness = config.getBoolean("Weakness", category + " Pig Zombie Potion Effects", false, "Enable Weakness?");
		EventsHandler.pigzombieWeakness = config.getInt("Weakness Duration", category + " Pig Zombie Potion Effects", 1, 0, 300, "Weakness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.pigzombiePlayerWither = config.getBoolean("Wither", category + " Pig Zombie Potion Effects", false, "Enable Wither?");
		EventsHandler.pigzombieWither = config.getInt("Wither Duration", category + " Pig Zombie Potion Effects", 1, 0, 300, "Withering duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.pigzombiePlayerUnluck = config.getBoolean("Unluck", category + " Pig Zombie Potion Effects", false, "Enable Unluck?");
		EventsHandler.pigzombieUnluck = config.getInt("Unluck Duration", category + " Pig Zombie Potion Effects", 1, 0, 300, "Unluck duration in Ticks!/n(1 = 1 tick)");
		
		// PolarBear
		config.addCustomCategoryComment(category + " Polarbear Config", "true or false");
		EventsHandler.Polarbears = config.getBoolean("Potion Effects", category + " Polarbear Config", false, "Enable potion effects when fighting a polarbear?");
		EventsHandler.polarbearPotionChance = config.getInt("Potion Chance", category + " Polarbear Config", 2, 1, 20, "The chance of players getting potion effects when fighting a mob.");
		config.addCustomCategoryComment(category + " Polarbear Potion Effects", "true or false");
		EventsHandler.polarbearPlayerBlindness = config.getBoolean("Blindness", category + " Polarbear Potion Effects", false, "Enable Blindness?");
		EventsHandler.polarbearBlind = config.getInt("Blindness Duration", category + " Polarbear Potion Effects", 1, 0, 300, "Blindness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.polarbearPlayerNausea = config.getBoolean("Nausea", category + " Polarbear Potion Effects", false, "Enable Nausea?");
		EventsHandler.polarbearNausea = config.getInt("Nausea Duration", category + " Polarbear Potion Effects", 1, 0, 300, "Nausea duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.polarbearPlayerFatigue = config.getBoolean("Mining Fatigue", category + " Polarbear Potion Effects", false, "Enable Mining Fatigue?");
		EventsHandler.polarbearDigSlow = config.getInt("Mining Fatigue Duration", category + " Polarbear Potion Effects", 1, 0, 300, "Mining Fatigue duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.polarbearPlayerInstant = config.getBoolean("Instant Damage", category + " Polarbear Potion Effects", false, "Enable Instant Damage?");
		EventsHandler.polarbearInstant = config.getInt("Instant Damage Duration", category + " Polarbear Potion Effects", 1, 0, 300, "Instant Damage duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.polarbearPlayerHunger = config.getBoolean("Hunger", category + " Polarbear Potion Effects", false, "Enable Hunger?");
		EventsHandler.polarbearHunger = config.getInt("Hunger Duration", category + " Polarbear Potion Effects", 1, 0, 300, "Hunger duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.polarbearPlayerSlowness = config.getBoolean("Slowness", category + " Polarbear Potion Effects", false, "Enable Slowness?");
		EventsHandler.polarbearMoveSlow = config.getInt("Slowness Duration", category + " Polarbear Potion Effects", 1, 0, 300, "Slowness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.polarbearPlayerPoison = config.getBoolean("Poison", category + " Polarbear Potion Effects", false, "Enable Poison?");
		EventsHandler.polarbearPoison = config.getInt("Poison Duration", category + " Polarbear Potion Effects", 1, 0, 300, "Poison duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.polarbearPlayerWeakness = config.getBoolean("Weakness", category + " Polarbear Potion Effects", false, "Enable Weakness?");
		EventsHandler.polarbearWeakness = config.getInt("Weakness Duration", category + " Polarbear Potion Effects", 1, 0, 300, "Weakness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.polarbearPlayerWither = config.getBoolean("Wither", category + " Polarbear Potion Effects", false, "Enable Wither?");
		EventsHandler.polarbearWither = config.getInt("Wither Duration", category + " Polarbear Potion Effects", 1, 0, 300, "Withering duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.polarbearPlayerUnluck = config.getBoolean("Unluck", category + " Polarbear Potion Effects", false, "Enable Unluck?");
		EventsHandler.polarbearUnluck = config.getInt("Unluck Duration", category + " Polarbear Potion Effects", 1, 0, 300, "Unluck duration in Ticks!/n(1 = 1 tick)");
		
		// Silverfish
		config.addCustomCategoryComment(category + " Silverfish Config", "true or false");
		EventsHandler.Silverfishs = config.getBoolean("Potion Effects", category + " Silverfish Config", false, "Enable potion effects when fighting a silverfish?");
		EventsHandler.silverfishPotionChance = config.getInt("Potion Chance", category + " Silverfish Config", 2, 1, 20, "The chance of players getting potion effects when fighting a mob.");
		config.addCustomCategoryComment(category + " Silverfish Potion Effects", "true or false");
		EventsHandler.silverfishPlayerBlindness = config.getBoolean("Blindness", category + " Silverfish Potion Effects", false, "Enable Blindness?");
		EventsHandler.silverfishBlind = config.getInt("Blindness Duration", category + " Silverfish Potion Effects", 1, 0, 300, "Blindness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.silverfishPlayerNausea = config.getBoolean("Nausea", category + " Silverfish Potion Effects", false, "Enable Nausea?");
		EventsHandler.silverfishNausea = config.getInt("Nausea Duration", category + " Silverfish Potion Effects", 1, 0, 300, "Nausea duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.silverfishPlayerFatigue = config.getBoolean("Mining Fatigue", category + " Silverfish Potion Effects", false, "Enable Mining Fatigue?");
		EventsHandler.silverfishDigSlow = config.getInt("Mining Fatigue Duration", category + " Silverfish Potion Effects", 1, 0, 300, "Mining Fatigue duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.silverfishPlayerInstant = config.getBoolean("Instant Damage", category + " Silverfish Potion Effects", false, "Enable Instant Damage?");
		EventsHandler.silverfishInstant = config.getInt("Instant Damage Duration", category + " Silverfish Potion Effects", 1, 0, 300, "Instant Damage duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.silverfishPlayerHunger = config.getBoolean("Hunger", category + " Silverfish Potion Effects", false, "Enable Hunger?");
		EventsHandler.silverfishHunger = config.getInt("Hunger Duration", category + " Silverfish Potion Effects", 1, 0, 300, "Hunger duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.silverfishPlayerSlowness = config.getBoolean("Slowness", category + " Silverfish Potion Effects", false, "Enable Slowness?");
		EventsHandler.silverfishMoveSlow = config.getInt("Slowness Duration", category + " Silverfish Potion Effects", 1, 0, 300, "Slowness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.silverfishPlayerPoison = config.getBoolean("Poison", category + " Silverfish Potion Effects", false, "Enable Poison?");
		EventsHandler.silverfishPoison = config.getInt("Poison Duration", category + " Silverfish Potion Effects", 1, 0, 300, "Poison duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.silverfishPlayerWeakness = config.getBoolean("Weakness", category + " Silverfish Potion Effects", false, "Enable Weakness?");
		EventsHandler.silverfishWeakness = config.getInt("Weakness Duration", category + " Silverfish Potion Effects", 1, 0, 300, "Weakness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.silverfishPlayerWither = config.getBoolean("Wither", category + " Silverfish Potion Effects", false, "Enable Wither?");
		EventsHandler.silverfishWither = config.getInt("Wither Duration", category + " Silverfish Potion Effects", 1, 0, 300, "Withering duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.silverfishPlayerUnluck = config.getBoolean("Unluck", category + " Silverfish Potion Effects", false, "Enable Unluck?");
		EventsHandler.silverfishUnluck = config.getInt("Unluck Duration", category + " Silverfish Potion Effects", 1, 0, 300, "Unluck duration in Ticks!/n(1 = 1 tick)");
		
		// Skeleton
		config.addCustomCategoryComment(category + " Skeleton Config", "true or false");
		EventsHandler.Skeletons = config.getBoolean("Potion Effects", category + " Skeleton Config", false, "Enable potion effects when fighting a skeleton?");
		EventsHandler.skeletonPotionChance = config.getInt("Potion Chance", category + " Skeleton Config", 2, 1, 20, "The chance of players getting potion effects when fighting a mob.");
		config.addCustomCategoryComment(category + " Skeleton Potion Effects", "true or false");
		EventsHandler.skeletonPlayerBlindness = config.getBoolean("Blindness", category + " Skeleton Potion Effects", false, "Enable Blindness?");
		EventsHandler.skeletonBlind = config.getInt("Blindness Duration", category + " Skeleton Potion Effects", 1, 0, 300, "Blindness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.skeletonPlayerNausea = config.getBoolean("Nausea", category + " Skeleton Potion Effects", false, "Enable Nausea?");
		EventsHandler.skeletonNausea = config.getInt("Nausea Duration", category + " Skeleton Potion Effects", 1, 0, 300, "Nausea duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.skeletonPlayerFatigue = config.getBoolean("Mining Fatigue", category + " Skeleton Potion Effects", false, "Enable Mining Fatigue?");
		EventsHandler.skeletonDigSlow = config.getInt("Mining Fatigue Duration", category + " Skeleton Potion Effects", 1, 0, 300, "Mining Fatigue duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.skeletonPlayerInstant = config.getBoolean("Instant Damage", category + " Skeleton Potion Effects", false, "Enable Instant Damage?");
		EventsHandler.skeletonInstant = config.getInt("Instant Damage Duration", category + " Skeleton Potion Effects", 1, 0, 300, "Instant Damage duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.skeletonPlayerHunger = config.getBoolean("Hunger", category + " Skeleton Potion Effects", false, "Enable Hunger?");
		EventsHandler.skeletonHunger = config.getInt("Hunger Duration", category + " Skeleton Potion Effects", 1, 0, 300, "Hunger duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.skeletonPlayerSlowness = config.getBoolean("Slowness", category + " Skeleton Potion Effects", false, "Enable Slowness?");
		EventsHandler.skeletonMoveSlow = config.getInt("Slowness Duration", category + " Skeleton Potion Effects", 1, 0, 300, "Slowness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.skeletonPlayerPoison = config.getBoolean("Poison", category + " Skeleton Potion Effects", false, "Enable Poison?");
		EventsHandler.skeletonPoison = config.getInt("Poison Duration", category + " Skeleton Potion Effects", 1, 0, 300, "Poison duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.skeletonPlayerWeakness = config.getBoolean("Weakness", category + " Skeleton Potion Effects", false, "Enable Weakness?");
		EventsHandler.skeletonWeakness = config.getInt("Weakness Duration", category + " Skeleton Potion Effects", 1, 0, 300, "Weakness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.skeletonPlayerWither = config.getBoolean("Wither", category + " Skeleton Potion Effects", false, "Enable Wither?");
		EventsHandler.skeletonWither = config.getInt("Wither Duration", category + " Skeleton Potion Effects", 1, 0, 300, "Withering duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.skeletonPlayerUnluck = config.getBoolean("Unluck", category + " Skeleton Potion Effects", false, "Enable Unluck?");
		EventsHandler.skeletonUnluck = config.getInt("Unluck Duration", category + " Skeleton Potion Effects", 1, 0, 300, "Unluck duration in Ticks!/n(1 = 1 tick)");
		
		// Slime
		config.addCustomCategoryComment(category + " Slime Config", "true or false");
		EventsHandler.Slimes = config.getBoolean("Potion Effects", category + " Slime Config", false, "Enable potion effects when fighting a slime?");
		EventsHandler.slimePotionChance = config.getInt("Potion Chance", category + " Slime Config", 2, 1, 20, "The chance of players getting potion effects when fighting a mob.");
		config.addCustomCategoryComment(category + " Slime Potion Effects", "true or false");
		EventsHandler.slimePlayerBlindness = config.getBoolean("Blindness", category + " Slime Potion Effects", false, "Enable Blindness?");
		EventsHandler.slimeBlind = config.getInt("Blindness Duration", category + " Slime Potion Effects", 1, 0, 300, "Blindness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.slimePlayerNausea = config.getBoolean("Nausea", category + " Slime Potion Effects", false, "Enable Nausea?");
		EventsHandler.slimeNausea = config.getInt("Nausea Duration", category + " Slime Potion Effects", 1, 0, 300, "Nausea duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.slimePlayerFatigue = config.getBoolean("Mining Fatigue", category + " Slime Potion Effects", false, "Enable Mining Fatigue?");
		EventsHandler.slimeDigSlow = config.getInt("Mining Fatigue Duration", category + " Slime Potion Effects", 1, 0, 300, "Mining Fatigue duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.slimePlayerInstant = config.getBoolean("Instant Damage", category + " Slime Potion Effects", false, "Enable Instant Damage?");
		EventsHandler.slimeInstant = config.getInt("Instant Damage Duration", category + " Slime Potion Effects", 1, 0, 300, "Instant Damage duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.slimePlayerHunger = config.getBoolean("Hunger", category + " Slime Potion Effects", false, "Enable Hunger?");
		EventsHandler.slimeHunger = config.getInt("Hunger Duration", category + " Slime Potion Effects", 1, 0, 300, "Hunger duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.slimePlayerSlowness = config.getBoolean("Slowness", category + " Slime Potion Effects", false, "Enable Slowness?");
		EventsHandler.slimeMoveSlow = config.getInt("Slowness Duration", category + " Slime Potion Effects", 1, 0, 300, "Slowness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.slimePlayerPoison = config.getBoolean("Poison", category + " Slime Potion Effects", false, "Enable Poison?");
		EventsHandler.slimePoison = config.getInt("Poison Duration", category + " Slime Potion Effects", 1, 0, 300, "Poison duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.slimePlayerWeakness = config.getBoolean("Weakness", category + " Slime Potion Effects", false, "Enable Weakness?");
		EventsHandler.slimeWeakness = config.getInt("Weakness Duration", category + " Slime Potion Effects", 1, 0, 300, "Weakness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.slimePlayerWither = config.getBoolean("Wither", category + " Slime Potion Effects", false, "Enable Wither?");
		EventsHandler.slimeWither = config.getInt("Wither Duration", category + " Slime Potion Effects", 1, 0, 300, "Withering duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.slimePlayerUnluck = config.getBoolean("Unluck", category + " Slime Potion Effects", false, "Enable Unluck?");
		EventsHandler.slimeUnluck = config.getInt("Unluck Duration", category + " Slime Potion Effects", 1, 0, 300, "Unluck duration in Ticks!/n(1 = 1 tick)");
		
		// Spider
		config.addCustomCategoryComment(category + " Spider Config", "true or false");
		EventsHandler.Spiders = config.getBoolean("Potion Effects", category + " Spider Config", false, "Enable potion effects when fighting a spider?");
		EventsHandler.spiderPotionChance = config.getInt("Potion Chance", category + " Spider Config", 2, 1, 20, "The chance of players getting potion effects when fighting a mob.");
		config.addCustomCategoryComment(category + " Spider Potion Effects", "true or false");
		EventsHandler.spiderPlayerBlindness = config.getBoolean("Blindness", category + " Spider Potion Effects", false, "Enable Blindness?");
		EventsHandler.spiderBlind = config.getInt("Blindness Duration", category + " Spider Potion Effects", 1, 0, 300, "Blindness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.spiderPlayerNausea = config.getBoolean("Nausea", category + " Spider Potion Effects", false, "Enable Nausea?");
		EventsHandler.spiderNausea = config.getInt("Nausea Duration", category + " Spider Potion Effects", 1, 0, 300, "Nausea duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.spiderPlayerFatigue = config.getBoolean("Mining Fatigue", category + " Spider Potion Effects", false, "Enable Mining Fatigue?");
		EventsHandler.spiderDigSlow = config.getInt("Mining Fatigue Duration", category + " Spider Potion Effects", 1, 0, 300, "Mining Fatigue duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.spiderPlayerInstant = config.getBoolean("Instant Damage", category + " Spider Potion Effects", false, "Enable Instant Damage?");
		EventsHandler.spiderInstant = config.getInt("Instant Damage Duration", category + " Spider Potion Effects", 1, 0, 300, "Instant Damage duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.spiderPlayerHunger = config.getBoolean("Hunger", category + " Spider Potion Effects", false, "Enable Hunger?");
		EventsHandler.spiderHunger = config.getInt("Hunger Duration", category + " Spider Potion Effects", 1, 0, 300, "Hunger duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.spiderPlayerSlowness = config.getBoolean("Slowness", category + " Spider Potion Effects", false, "Enable Slowness?");
		EventsHandler.spiderMoveSlow = config.getInt("Slowness Duration", category + " Spider Potion Effects", 1, 0, 300, "Slowness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.spiderPlayerPoison = config.getBoolean("Poison", category + " Spider Potion Effects", false, "Enable Poison?");
		EventsHandler.spiderPoison = config.getInt("Poison Duration", category + " Spider Potion Effects", 1, 0, 300, "Poison duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.spiderPlayerWeakness = config.getBoolean("Weakness", category + " Spider Potion Effects", false, "Enable Weakness?");
		EventsHandler.spiderWeakness = config.getInt("Weakness Duration", category + " Spider Potion Effects", 1, 0, 300, "Weakness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.spiderPlayerWither = config.getBoolean("Wither", category + " Spider Potion Effects", false, "Enable Wither?");
		EventsHandler.spiderWither = config.getInt("Wither Duration", category + " Spider Potion Effects", 1, 0, 300, "Withering duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.spiderPlayerUnluck = config.getBoolean("Unluck", category + " Spider Potion Effects", false, "Enable Unluck?");
		EventsHandler.spiderUnluck = config.getInt("Unluck Duration", category + " Spider Potion Effects", 1, 0, 300, "Unluck duration in Ticks!/n(1 = 1 tick)");
		
		// Witch
		config.addCustomCategoryComment(category + " Witch Config", "true or false");
		EventsHandler.Witchs = config.getBoolean("Potion Effects", category + " Witch Config", false, "Enable potion effects when fighting a witch?");
		EventsHandler.witchPotionChance = config.getInt("Potion Chance", category + " Witch Config", 2, 1, 20, "The chance of players getting potion effects when fighting a mob.");
		config.addCustomCategoryComment(category + " Witch Potion Effects", "true or false");
		EventsHandler.witchPlayerBlindness = config.getBoolean("Blindness", category + " Witch Potion Effects", false, "Enable Blindness?");
		EventsHandler.witchBlind = config.getInt("Blindness Duration", category + " Witch Potion Effects", 1, 0, 300, "Blindness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.witchPlayerNausea = config.getBoolean("Nausea", category + " Witch Potion Effects", false, "Enable Nausea?");
		EventsHandler.witchNausea = config.getInt("Nausea Duration", category + " Witch Potion Effects", 1, 0, 300, "Nausea duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.witchPlayerFatigue = config.getBoolean("Mining Fatigue", category + " Witch Potion Effects", false, "Enable Mining Fatigue?");
		EventsHandler.witchDigSlow = config.getInt("Mining Fatigue Duration", category + " Witch Potion Effects", 1, 0, 300, "Mining Fatigue duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.witchPlayerInstant = config.getBoolean("Instant Damage", category + " Witch Potion Effects", false, "Enable Instant Damage?");
		EventsHandler.witchInstant = config.getInt("Instant Damage Duration", category + " Witch Potion Effects", 1, 0, 300, "Instant Damage duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.witchPlayerHunger = config.getBoolean("Hunger", category + " Witch Potion Effects", false, "Enable Hunger?");
		EventsHandler.witchHunger = config.getInt("Hunger Duration", category + " Witch Potion Effects", 1, 0, 300, "Hunger duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.witchPlayerSlowness = config.getBoolean("Slowness", category + " Witch Potion Effects", false, "Enable Slowness?");
		EventsHandler.witchMoveSlow = config.getInt("Slowness Duration", category + " Witch Potion Effects", 1, 0, 300, "Slowness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.witchPlayerPoison = config.getBoolean("Poison", category + " Witch Potion Effects", false, "Enable Poison?");
		EventsHandler.witchPoison = config.getInt("Poison Duration", category + " Witch Potion Effects", 1, 0, 300, "Poison duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.witchPlayerWeakness = config.getBoolean("Weakness", category + " Witch Potion Effects", false, "Enable Weakness?");
		EventsHandler.witchWeakness = config.getInt("Weakness Duration", category + " Witch Potion Effects", 1, 0, 300, "Weakness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.witchPlayerWither = config.getBoolean("Wither", category + " Witch Potion Effects", false, "Enable Wither?");
		EventsHandler.witchWither = config.getInt("Wither Duration", category + " Witch Potion Effects", 1, 0, 300, "Withering duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.witchPlayerUnluck = config.getBoolean("Unluck", category + " Witch Potion Effects", false, "Enable Unluck?");
		EventsHandler.witchUnluck = config.getInt("Unluck Duration", category + " Witch Potion Effects", 1, 0, 300, "Unluck duration in Ticks!/n(1 = 1 tick)");
		
		// Zombie
		config.addCustomCategoryComment(category + " Zombie Config", "true or false");
		EventsHandler.Zombies = config.getBoolean("Potion Effects", category + " Zombie Config", false, "Enable potion effects when fighting a mob a zombie?");
		EventsHandler.zombiePotionChance = config.getInt("Potion Chance", category + " Zombie Config", 2, 1, 20, "The chance of players getting potion effects when fighting a mob.");
		config.addCustomCategoryComment(category + " Zombie Potion Effects", "true or false");
		EventsHandler.zombiePlayerBlindness = config.getBoolean("Blindness", category + " Zombie Potion Effects", false, "Enable Blindness?");
		EventsHandler.zombieBlind = config.getInt("Blindness Duration", category + " Zombie Potion Effects", 1, 0, 300, "Blindness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.zombiePlayerNausea = config.getBoolean("Nausea", category + " Zombie Potion Effects", false, "Enable Nausea?");
		EventsHandler.zombieNausea = config.getInt("Nausea Duration", category + " Zombie Potion Effects", 1, 0, 300, "Nausea duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.zombiePlayerFatigue = config.getBoolean("Mining Fatigue", category + " Zombie Potion Effects", false, "Enable Mining Fatigue?");
		EventsHandler.zombieDigSlow = config.getInt("Mining Fatigue Duration", category + " Zombie Potion Effects", 1, 0, 300, "Mining Fatigue duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.zombiePlayerInstant = config.getBoolean("Instant Damage", category + " Zombie Potion Effects", false, "Enable Instant Damage?");
		EventsHandler.zombieInstant = config.getInt("Instant Damage Duration", category + " Zombie Potion Effects", 1, 0, 300, "Instant Damage duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.zombiePlayerHunger = config.getBoolean("Hunger", category + " Zombie Potion Effects", false, "Enable Hunger?");
		EventsHandler.zombieHunger = config.getInt("Hunger Duration", category + " Zombie Potion Effects", 1, 0, 300, "Hunger duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.zombiePlayerSlowness = config.getBoolean("Slowness", category + " Zombie Potion Effects", false, "Enable Slowness?");
		EventsHandler.zombieMoveSlow = config.getInt("Slowness Duration", category + " Zombie Potion Effects", 1, 0, 300, "Slowness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.zombiePlayerPoison = config.getBoolean("Poison", category + " Zombie Potion Effects", false, "Enable Poison?");
		EventsHandler.zombiePoison = config.getInt("Poison Duration", category + " Zombie Potion Effects", 1, 0, 300, "Poison duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.zombiePlayerWeakness = config.getBoolean("Weakness", category + " Zombie Potion Effects", false, "Enable Weakness?");
		EventsHandler.zombieWeakness = config.getInt("Weakness Duration", category + " Zombie Potion Effects", 1, 0, 300, "Weakness duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.zombiePlayerWither = config.getBoolean("Wither", category + " Zombie Potion Effects", false, "Enable Wither?");
		EventsHandler.zombieWither = config.getInt("Wither Duration", category + " Zombie Potion Effects", 1, 0, 300, "Withering duration in Ticks!/n(1 = 1 tick)");
		EventsHandler.zombiePlayerUnluck = config.getBoolean("Unluck", category + " Zombie Potion Effects", false, "Enable Unluck?");
		EventsHandler.zombieUnluck = config.getInt("Unluck Duration", category + " Zombie Potion Effects", 1, 0, 300, "Unluck duration in Ticks!/n(1 = 1 tick)");
		
		if (config.hasChanged() == true){
	        config.save();
	    }
	}
	
	public static void initFurnace()
	{
		File f = new File(configDir, "Furnace Modular.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "Furnace Modular";
		
		// Furnace
		config.addCustomCategoryComment(category + " Furnace Options", "true or false");
		FurnaceHandler.blazeBurn = config.getBoolean("Blaze Powder", category + " Furnace Options", false, "Enable Blaze Powders?");
		Furnace.BlazeBurnTime = config.getInt("Blaze Powder Burn", category + " Furnace Options", 1500, 0, Integer.MAX_VALUE, "Blaze Powder Burn Time!");
		FurnaceHandler.blazeRodBurn = config.getBoolean("Blaze Rod", category + " Furnace Options", false, "Enable Blaze Rods?");
		Furnace.BlazeRodBurnTime = config.getInt("Blaze Rod Burn", category + " Furnace Options", 3000, 0, Integer.MAX_VALUE, "Blaze Rod Burn Time!");
		FurnaceHandler.boatBurn = config.getBoolean("Boats", category + " Furnace Options", false, "Enable Boats?");
		Furnace.BoatBurnTime = config.getInt("Boats Burn", category + " Furnace Options", 1500, 0, Integer.MAX_VALUE, "Boats Burn Time!");
		FurnaceHandler.bookBurn = config.getBoolean("Books", category + " Furnace Options", false, "Enable Books?");
		Furnace.BookBurnTime = config.getInt("Books Burn", category + " Furnace Options", 750, 0, Integer.MAX_VALUE, "Books Burn Time!");
		FurnaceHandler.bowlBurn = config.getBoolean("Bowls", category + " Furnace Options", false, "Enable Bowls?");
		Furnace.BowlBurnTime = config.getInt("Bowls Burn", category + " Furnace Options", 200, 0, Integer.MAX_VALUE, "Bowls Burn Time!");
		FurnaceHandler.bushBurn = config.getBoolean("Bushs", category + " Furnace Options", false, "Enable Bushs?");
		Furnace.BushBurnTime = config.getInt("Bushs Burn", category + " Furnace Options", 150, 0, Integer.MAX_VALUE, "Bushs Burn Time!");
		FurnaceHandler.buttonBurn = config.getBoolean("Wooden Buttons", category + " Furnace Options", false, "Enable Wooden Buttons?");
		Furnace.ButtonBurnTime = config.getInt("Wooden Buttons Burn", category + " Furnace Options", 100, 0, Integer.MAX_VALUE, "Wooden Buttons Burn Time!");
		FurnaceHandler.carpetBurn = config.getBoolean("Carpets", category + " Furnace Options", false, "Enable Carpets?");
		Furnace.CarpetBurnTime = config.getInt("Carpets Burn", category + " Furnace Options", 150, 0, Integer.MAX_VALUE, "Carpets Burn Time!");
		FurnaceHandler.creamBurn = config.getBoolean("Magma Creams", category + " Furnace Options", false, "Enable Magma Creams?");
		Furnace.CreamBurnTime = config.getInt("Magma Creams Burn", category + " Furnace Options", 1800, 0, Integer.MAX_VALUE, "Magma Creams Burn Time!");
		FurnaceHandler.doorsBurn = config.getBoolean("Doors", category + " Furnace Options", false, "Enable Doors?");
		Furnace.DoorsBurnTime = config.getInt("Doors Burn", category + " Furnace Options", 1800, 0, Integer.MAX_VALUE, "Doors Burn Time!");
		FurnaceHandler.dragonBurn = config.getBoolean("Dragons Breath", category + " Furnace Options", false, "Enable Dragons Breath?");
		Furnace.DragonBurnTime = config.getInt("Dragons Breath Burn", category + " Furnace Options", 2500, 0, Integer.MAX_VALUE, "Dragons Breath Burn Time!");
		FurnaceHandler.fireBurn = config.getBoolean("Fire", category + " Furnace Options", false, "Enable Fire?");
		Furnace.FireBurnTime = config.getInt("Fire Burn", category + " Furnace Options", 1200, 0, Integer.MAX_VALUE, "Fire Burn Time!");
		FurnaceHandler.frameBurn = config.getBoolean("Item Frames", category + " Furnace Options", false, "Enable Item Frames?");
		Furnace.FrameBurnTime = config.getInt("Item Frames Burn", category + " Furnace Options", 750, 0, Integer.MAX_VALUE, "Frames Burn Time!");
		FurnaceHandler.hayBurn = config.getBoolean("Hay Bales", category + " Furnace Options", false, "Enable Hay Bales?");
		Furnace.HayBurnTime = config.getInt("Hay Bales Burn", category + " Furnace Options", 750, 0, Integer.MAX_VALUE, "Hay Bales Burn Time!");
		FurnaceHandler.ladderBurn = config.getBoolean("Ladders", category + " Furnace Options", false, "Enable Ladders?");
		Furnace.LadderBurnTime = config.getInt("Ladders Burn", category + " Furnace Options", 300, 0, Integer.MAX_VALUE, "Ladders Burn Time!");
		FurnaceHandler.mapBurn = config.getBoolean("Maps", category + " Furnace Options", false, "Enable Maps?");
		Furnace.MapBurnTime = config.getInt("Maps Burn", category + " Furnace Options", 250, 0, Integer.MAX_VALUE, "Maps Burn Time!");
		FurnaceHandler.paintingBurn = config.getBoolean("Paintings", category + " Furnace Options", false, "Enable Paintings?");
		Furnace.PaintingBurnTime = config.getInt("Paintings Burn", category + " Furnace Options", 750, 0, Integer.MAX_VALUE, "Paintings Burn Time!");
		FurnaceHandler.paperBurn = config.getBoolean("Paper", category + " Furnace Options", false, "Enable Paper?");
		Furnace.PaperBurnTime = config.getInt("Paper Burn", category + " Furnace Options", 50, 0, Integer.MAX_VALUE, "Paper Burn Time!");
		FurnaceHandler.shieldBurn = config.getBoolean("Shields", category + " Furnace Options", false, "Enable Shields?");
		Furnace.ShieldBurnTime = config.getInt("Shields Burn", category + " Furnace Options", 1500, 0, Integer.MAX_VALUE, "Shields Burn Time!");
		FurnaceHandler.signBurn = config.getBoolean("Signs", category + " Furnace Options", false, "Enable Signs?");
		Furnace.SignBurnTime = config.getInt("Signs Burn", category + " Furnace Options", 200, 0, Integer.MAX_VALUE, "Signs Burn Time!");
		FurnaceHandler.standBurn = config.getBoolean("Armor Stands", category + " Furnace Options", false, "Enable Armor Stands?");
		Furnace.StandBurnTime = config.getInt("Armor Stands Burn", category + " Furnace Options", 500, 0, Integer.MAX_VALUE, "Armor Stands Burn Time!");
		FurnaceHandler.tntBurn = config.getBoolean("TNT", category + " Furnace Options", false, "Enable TNT?");
		Furnace.TntBurnTime = config.getInt("TNT Burn", category + " Furnace Options", 5000, 0, Integer.MAX_VALUE, "TNT Burn Time!");
		FurnaceHandler.torchBurn = config.getBoolean("Torchs", category + " Furnace Options", false, "Enable Torchs?");
		Furnace.TorchBurnTime = config.getInt("Torchs Burn", category + " Furnace Options", 150, 0, Integer.MAX_VALUE, "Torchs Burn Time!");
		FurnaceHandler.woodenPressurePlateBurn = config.getBoolean("Wooden Pressure Plates", category + " Furnace Options", false, "Enable Wooden Pressure Plates?");
		Furnace.WoodenPressurePlateBurnTime = config.getInt("Wooden Pressure Plates Burn", category + " Furnace Options", 100, 0, Integer.MAX_VALUE, "Wooden Pressure Plates Burn Time!");
		
		if (config.hasChanged() == true){
	        config.save();
	    }
	}
	
	public static void initStacks()
	{
		File f = new File(configDir, "Item Stacks Modular.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "Item Stacks Modular";
		
		// Item Stacks
		config.addCustomCategoryComment(category + " Item Stack Options", "true or false");
		ItemStackHandler.boat = config.getBoolean("Boat", category + " Item Stack Options", false, "Enable Boat?");
		ItemStackHandler.boatStack = config.getInt("Boat Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.sboat = config.getBoolean("Spruce Boat", category + " Item Stack Options", false, "Enable Spruce Boat?");
		ItemStackHandler.sboatStack = config.getInt("Spruce Boat Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.bboat = config.getBoolean("Birch Boat", category + " Item Stack Options", false, "Enable Birch Boat?");
		ItemStackHandler.bboatStack = config.getInt("Birch Boat Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.jboat = config.getBoolean("Jungle Boat", category + " Item Stack Options", false, "Enable jungle Boat?");
		ItemStackHandler.jboatStack = config.getInt("Jungle Boat Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.doboat = config.getBoolean("Dark Oak Boat", category + " Item Stack Options", false, "Enable Dark Oak Boat?");
		ItemStackHandler.doboatStack = config.getInt("Dark Oak Boat Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.aboat = config.getBoolean("Acacia Boat", category + " Item Stack Options", false, "Enable Acacia Boat?");
		ItemStackHandler.aboatStack = config.getInt("Acacia Boat Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.minecart = config.getBoolean("Minecart", category + " Item Stack Options", false, "Enable Minecart?");
		ItemStackHandler.minecartStack = config.getInt("Minecart Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.fm = config.getBoolean("Furnace Minecart", category + " Item Stack Options", false, "Enable Furnace Minecart?");
		ItemStackHandler.fmStack = config.getInt("Furnace Minecart Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.cm = config.getBoolean("Chest Minecart", category + " Item Stack Options", false, "Enable Chest Minecart?");
		ItemStackHandler.cmStack = config.getInt("Chest Minecart Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.hm = config.getBoolean("Hopper Minecart", category + " Item Stack Options", false, "Enable Hopper Minecart?");
		ItemStackHandler.hmStack = config.getInt("Hopper Minecart Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.tm = config.getBoolean("TnT Minecart", category + " Item Stack Options", false, "Enable TnT Minecart?");
		ItemStackHandler.tmStack = config.getInt("TnT Minecart Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.snowball = config.getBoolean("Snowballs", category + " Item Stack Options", false, "Enable Snowballs?");
		ItemStackHandler.snowballStack = config.getInt("Snowballs Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.egg = config.getBoolean("Eggs", category + " Item Stack Options", false, "Enable Eggs?");
		ItemStackHandler.eggStack = config.getInt("Eggs Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.pearl = config.getBoolean("Ender Pearls", category + " Item Stack Options", false, "Enable Ender Pearls?");
		ItemStackHandler.pearlStack = config.getInt("Ender Pearls Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.saddle = config.getBoolean("Saddles", category + " Item Stack Options", false, "Enable Saddles?");
		ItemStackHandler.saddleStack = config.getInt("Saddles Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.bed = config.getBoolean("Beds", category + " Item Stack Options", false, "Enable Beds?");
		ItemStackHandler.bedStack = config.getInt("Beds Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.cake = config.getBoolean("Cakes", category + " Item Stack Options", false, "Enable Cakes?");
		ItemStackHandler.cakeStack = config.getInt("Cakes Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.sign = config.getBoolean("Signs", category + " Item Stack Options", false, "Enable Signs?");
		ItemStackHandler.signStack = config.getInt("Signs Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.stand = config.getBoolean("Armor Stand", category + " Item Stack Options", false, "Enable Armor Stand?");
		ItemStackHandler.standStack = config.getInt("Armor Stand Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.bucket = config.getBoolean("Buckets", category + " Item Stack Options", false, "Enable Buckets?");
		ItemStackHandler.bucketStack = config.getInt("Buckets Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.writable = config.getBoolean("Writable Books", category + " Item Stack Options", false, "Enable Writable Books?");
		ItemStackHandler.writableStack = config.getInt("Writable Books Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.goldenhorse = config.getBoolean("Golden Horse Armor", category + " Item Stack Options", false, "Enable Golden Horse Armor?");
		ItemStackHandler.goldenhorseStack = config.getInt("Golden Horse Armor Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.ironhorse = config.getBoolean("Iron Horse Armor", category + " Item Stack Options", false, "Enable Iron Horse Armor?");
		ItemStackHandler.ironhorseStack = config.getInt("Iron Horse Armor Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.diamondhorse = config.getBoolean("Diamond Horse Armor", category + " Item Stack Options", false, "Enable Diamond Horse Armor?");
		ItemStackHandler.diamondhorseStack = config.getInt("Diamond Horse Armor Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.stew = config.getBoolean("Mushroom Stew", category + " Item Stack Options", false, "Enable Mushroom Stew?");
		ItemStackHandler.stewStack = config.getInt("Mushroom Stew Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.rabbit = config.getBoolean("Rabbit Stew", category + " Item Stack Options", false, "Enable Rabbit Stew?");
		ItemStackHandler.rabbitStack = config.getInt("Rabbit Stew Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		ItemStackHandler.beet = config.getBoolean("Beet Stew", category + " Item Stack Options", false, "Enable Beet Stew?");
		ItemStackHandler.beetStack = config.getInt("Beet Stew Stack", category + " Item Stack Options", 64, 1, 64, "Stack Size!");
		
		if (config.hasChanged() == true){
	        config.save();
	    }
	}
	
	public static void initHardcore()
	{
		File f = new File(configDir, "Hardcore Modular.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "Hardcore Modular";
		
		// Mob Spawns
        config.addCustomCategoryComment(category + " Hardcore Options", "true or false");
        ServerHandler.airOff = config.getBoolean("Instant Drown", category + " Hardcore Options", false, "Instant death when you run out of air?");
        ServerHandler.LavaHurts = config.getBoolean("Lava Kills", category + " Hardcore Options", false, "Lava Kills Player?");
        ServerHandler.NoSwim = config.getBoolean("No Swim", category + " Hardcore Options", false, "Disable Player Swim?");
        ServerHandler.CactusHurts = config.getBoolean("Cactus Kills", category + " Hardcore Options", false, "Cactus Kills Player?");
        ServerHandler.FallDamage = config.getBoolean("Fall Damage", category + " Hardcore Options", false, "Fall Damage kills Player?");
        ServerHandler.SetFallDamage = config.getBoolean("Fall Damage Custom", category + " Hardcore Options", false, "Fall Damage kills Player?\n(Can not be used if Fall Damage is true!)");
        ServerHandler.FallDamageAmount = config.getFloat("Fall Damage Custom Amount", category + " Hardcore Options", 10F, 0F, 20F, "Sets the amount of Damage Falling does to Player!");
        ServerHandler.FallingBlock = config.getBoolean("Falling Blocks", category + " Hardcore Options", false, "Falling Blocks kills Player?");
        ServerHandler.FoodOverhaul = config.getBoolean("Food Overhaul", category + " Hardcore Options", false, "Player Starves to Death if they don't eat?");
        ServerHandler.SleepHunger = config.getBoolean("Sleep Hunger", category + " Hardcore Options", false, "Do Players get hungery when they sleep?");
        ServerHandler.hungerLoss = config.getBoolean("Hunger Loss", category+ " Hardcore Options", false, "Enable Hunger Loss?");
        ServerHandler.exhaustion = config.getFloat("Hunger Loss Amount", category + " Hardcore Options", 0.005F, 0.001F, 1.0F, "Sets the amount of Hunger Loss");
        ServerHandler.inFire = config.getBoolean("Fire Kills", category+ " Hardcore Options", false, "Stepping into fire Kills you?");
        ServerHandler.onFire = config.getBoolean("On Fire Kills", category+ " Hardcore Options", false, "Being on fire Kills you?");
        ServerHandler.witherDeath = config.getBoolean("Wither Effect", category+ " Hardcore Options", false, "Wither Effect Kills you?");
        ServerHandler.dragonBreath = config.getBoolean("Dragon Breath", category+ " Hardcore Options", false, "Dragon Breath Kills you?");
        ServerHandler.Lightning = config.getBoolean("Lightning Strikes", category+ " Hardcore Options", false, "Lightning Strikes Kills you?");
        ServerHandler.netherrackBurn = config.getBoolean("Netherrack Burn", category+ " Hardcore Options", false, "Disable Netherrack Burning Players?");
        ServerHandler.burnTime = config.getInt("Netherrack Burn Time", category + " Hardcore Options", 2, 1, 300, "Amount of Seconds the player burns for!");
        ServerHandler.pigmanAngry = config.getBoolean("Angry Pigman", category+ " Hardcore Options", false, "Enable Angry Pigman?");
        ServerHandler.pigmanAngryChance = config.getInt("Angry Pigman Chance", category + " Hardcore Options", 1, 1, 100, "chance (1 in amount) to make Zombie Pigmen angry if the player destroys blocks");
        
		if (config.hasChanged() == true){
	        config.save();
	    }
	}
	
	public static void initMobSpawns()
	{
		File f = new File(configDir, "Mob Spawns Modular.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "Mob Spawns Modular";
		
		// Blaze
        config.addCustomCategoryComment(category + " Blaze", "true or false");
        // Beach Biome
        MobSpawnsHandler.Blaze = config.getBoolean("Blaze", category + " Blaze", false, "Enable custom Blaze Spawns?");
        MobSpawnsHandler.BeachBlaze = config.getBoolean("Blaze Beach", category + " Blaze", false, "Enable Blaze Beach Spawns?");
        MobSpawnsHandler.BeachBlazeWeight = config.getInt("Blaze Beach Weight", category + " Blaze", 100, 1, Integer.MAX_VALUE, "Blaze Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachBlazeMin = config.getInt("Blaze Beach Min Group Size", category + " Blaze", 1, 1, Integer.MAX_VALUE, "Blaze Beach Min Group Size!");
        MobSpawnsHandler.BeachBlazeMax = config.getInt("Blaze Beach Max Group Size", category + " Blaze", 5, 1, Integer.MAX_VALUE, "Blaze Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherBlaze = config.getBoolean("Blaze Nether", category + " Blaze", false, "Enable Blaze Nether Spawns?");
        MobSpawnsHandler.NetherBlazeWeight = config.getInt("Blaze Nether Weight", category + " Blaze", 100, 1, Integer.MAX_VALUE, "Blaze Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherBlazeMin = config.getInt("Blaze Nether Min Group Size", category + " Blaze", 1, 1, Integer.MAX_VALUE, "Blaze Nether Min Group Size!");
        MobSpawnsHandler.NetherBlazeMax = config.getInt("Blaze Nether Max Group Size", category + " Blaze", 5, 1, Integer.MAX_VALUE, "Blaze Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertBlaze = config.getBoolean("Blaze Desert", category + " Blaze", false, "Enable Blaze Desert Spawns?");
        MobSpawnsHandler.DesertBlazeWeight = config.getInt("Blaze Desert Weight", category + " Blaze", 100, 1, Integer.MAX_VALUE, "Blaze Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertBlazeMin = config.getInt("Blaze Desert Min Group Size", category + " Blaze", 1, 1, Integer.MAX_VALUE, "Blaze Desert Min Group Size!");
        MobSpawnsHandler.DesertBlazeMax = config.getInt("Blaze Desert Max Group Size", category + " Blaze", 5, 1, Integer.MAX_VALUE, "Blaze Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremeBlaze = config.getBoolean("Blaze Extreme", category + " Blaze", false, "Enable Blaze Extreme Spawns?");
        MobSpawnsHandler.ExtremeBlazeWeight = config.getInt("Blaze Extreme Weight", category + " Blaze", 100, 1, Integer.MAX_VALUE, "Blaze Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremeBlazeMin = config.getInt("Blaze Extreme Min Group Size", category + " Blaze", 1, 1, Integer.MAX_VALUE, "Blaze Extreme Min Group Size!");
        MobSpawnsHandler.ExtremeBlazeMax = config.getInt("Blaze Extreme Max Group Size", category + " Blaze", 5, 1, Integer.MAX_VALUE, "Blaze Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestBlaze = config.getBoolean("Blaze Forest", category + " Blaze", false, "Enable Blaze Forest Spawns?");
        MobSpawnsHandler.ForestBlazeWeight = config.getInt("Blaze Forest Weight", category + " Blaze", 100, 1, Integer.MAX_VALUE, "Blaze Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestBlazeMin = config.getInt("Blaze Forest Min Group Size", category + " Blaze", 1, 1, Integer.MAX_VALUE, "Blaze Forest Min Group Size!");
        MobSpawnsHandler.ForestBlazeMax = config.getInt("Blaze Forest Max Group Size", category + " Blaze", 5, 1, Integer.MAX_VALUE, "Blaze Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JungleBlaze = config.getBoolean("Blaze Jungle", category + " Blaze", false, "Enable Blaze Jungle Spawns?");
        MobSpawnsHandler.JungleBlazeWeight = config.getInt("Blaze Jungle Weight", category + " Blaze", 100, 1, Integer.MAX_VALUE, "Blaze Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JungleBlazeMin = config.getInt("Blaze Jungle Min Group Size", category + " Blaze", 1, 1, Integer.MAX_VALUE, "Blaze Jungle Min Group Size!");
        MobSpawnsHandler.JungleBlazeMax = config.getInt("Blaze Jungle Max Group Size", category + " Blaze", 5, 1, Integer.MAX_VALUE, "Blaze Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaBlaze = config.getBoolean("Blaze Mesa", category + " Blaze", false, "Enable Blaze Mesa Spawns?");
        MobSpawnsHandler.MesaBlazeWeight = config.getInt("Blaze Mesa Weight", category + " Blaze", 100, 1, Integer.MAX_VALUE, "Blaze Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaBlazeMin = config.getInt("Blaze Mesa Min Group Size", category + " Blaze", 1, 1, Integer.MAX_VALUE, "Blaze Mesa Min Group Size!");
        MobSpawnsHandler.MesaBlazeMax = config.getInt("Blaze Mesa Max Group Size", category + " Blaze", 5, 1, Integer.MAX_VALUE, "Blaze Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsBlaze = config.getBoolean("Blaze Plains", category + " Blaze", false, "Enable Blaze Plains Spawns?");
        MobSpawnsHandler.PlainsBlazeWeight = config.getInt("Blaze Plains Weight", category + " Blaze", 100, 1, Integer.MAX_VALUE, "Blaze Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsBlazeMin = config.getInt("Blaze Plains Min Group Size", category + " Blaze", 1, 1, Integer.MAX_VALUE, "Blaze Plains Min Group Size!");
        MobSpawnsHandler.PlainsBlazeMax = config.getInt("Blaze Plains Max Group Size", category + " Blaze", 5, 1, Integer.MAX_VALUE, "Blaze Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaBlaze = config.getBoolean("Blaze Savanna", category + " Blaze", false, "Enable Blaze Savanna Spawns?");
        MobSpawnsHandler.SavannaBlazeWeight = config.getInt("Blaze Savanna Weight", category + " Blaze", 100, 1, Integer.MAX_VALUE, "Blaze Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaBlazeMin = config.getInt("Blaze Savanna Min Group Size", category + " Blaze", 1, 1, Integer.MAX_VALUE, "Blaze Savanna Min Group Size!");
        MobSpawnsHandler.SavannaBlazeMax = config.getInt("Blaze Savanna Max Group Size", category + " Blaze", 5, 1, Integer.MAX_VALUE, "Blaze Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampBlaze = config.getBoolean("Blaze Swamp", category + " Blaze", false, "Enable Blaze Swamp Spawns?");
        MobSpawnsHandler.SwampBlazeWeight = config.getInt("Blaze Swamp Weight", category + " Blaze", 100, 1, Integer.MAX_VALUE, "Blaze Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampBlazeMin = config.getInt("Blaze Swamp Min Group Size", category + " Blaze", 1, 1, Integer.MAX_VALUE, "Blaze Swamp Min Group Size!");
        MobSpawnsHandler.SwampBlazeMax = config.getInt("Blaze Swamp Max Group Size", category + " Blaze", 5, 1, Integer.MAX_VALUE, "Blaze Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaBlaze = config.getBoolean("Blaze Taiga", category + " Blaze", false, "Enable Blaze Taiga Spawns?");
        MobSpawnsHandler.TaigaBlazeWeight = config.getInt("Blaze Taiga Weight", category + " Blaze", 100, 1, Integer.MAX_VALUE, "Blaze Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaBlazeMin = config.getInt("Blaze Taiga Min Group Size", category + " Blaze", 1, 1, Integer.MAX_VALUE, "Blaze Taiga Min Group Size!");
        MobSpawnsHandler.TaigaBlazeMax = config.getInt("Blaze Taiga Max Group Size", category + " Blaze", 5, 1, Integer.MAX_VALUE, "Blaze Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndBlaze = config.getBoolean("Blaze End", category + " Blaze", false, "Enable Blaze End Spawns?");
        MobSpawnsHandler.EndBlazeWeight = config.getInt("Blaze End Weight", category + " Blaze", 100, 1, Integer.MAX_VALUE, "Blaze End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndBlazeMin = config.getInt("Blaze End Min Group Size", category + " Blaze", 1, 1, Integer.MAX_VALUE, "Blaze End Min Group Size!");
        MobSpawnsHandler.EndBlazeMax = config.getInt("Blaze End Max Group Size", category + " Blaze", 5, 1, Integer.MAX_VALUE, "Blaze End Max Group Size!");
        
        // CaveSpider
        config.addCustomCategoryComment(category + " CaveSpider", "true or false");
        // Beach Biome
        MobSpawnsHandler.CaveSpider = config.getBoolean("CaveSpider", category + " CaveSpider", false, "Enable custom CaveSpider Spawns?");
        MobSpawnsHandler.BeachCaveSpider = config.getBoolean("CaveSpider Beach", category + " CaveSpider", false, "Enable CaveSpider Beach Spawns?");
        MobSpawnsHandler.BeachCaveSpiderWeight = config.getInt("CaveSpider Beach Weight", category + " CaveSpider", 100, 1, Integer.MAX_VALUE, "CaveSpider Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachCaveSpiderMin = config.getInt("CaveSpider Beach Min Group Size", category + " CaveSpider", 1, 1, Integer.MAX_VALUE, "CaveSpider Beach Min Group Size!");
        MobSpawnsHandler.BeachCaveSpiderMax = config.getInt("CaveSpider Beach Max Group Size", category + " CaveSpider", 5, 1, Integer.MAX_VALUE, "CaveSpider Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherCaveSpider = config.getBoolean("CaveSpider Nether", category + " CaveSpider", false, "Enable CaveSpider Nether Spawns?");
        MobSpawnsHandler.NetherCaveSpiderWeight = config.getInt("CaveSpider Nether Weight", category + " CaveSpider", 100, 1, Integer.MAX_VALUE, "CaveSpider Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherCaveSpiderMin = config.getInt("CaveSpider Nether Min Group Size", category + " CaveSpider", 1, 1, Integer.MAX_VALUE, "CaveSpider Nether Min Group Size!");
        MobSpawnsHandler.NetherCaveSpiderMax = config.getInt("CaveSpider Nether Max Group Size", category + " CaveSpider", 5, 1, Integer.MAX_VALUE, "CaveSpider Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertCaveSpider = config.getBoolean("CaveSpider Desert", category + " CaveSpider", false, "Enable CaveSpider Desert Spawns?");
        MobSpawnsHandler.DesertCaveSpiderWeight = config.getInt("CaveSpider Desert Weight", category + " CaveSpider", 100, 1, Integer.MAX_VALUE, "CaveSpider Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertCaveSpiderMin = config.getInt("CaveSpider Desert Min Group Size", category + " CaveSpider", 1, 1, Integer.MAX_VALUE, "CaveSpider Desert Min Group Size!");
        MobSpawnsHandler.DesertCaveSpiderMax = config.getInt("CaveSpider Desert Max Group Size", category + " CaveSpider", 5, 1, Integer.MAX_VALUE, "CaveSpider Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremeCaveSpider = config.getBoolean("CaveSpider Extreme", category + " CaveSpider", false, "Enable CaveSpider Extreme Spawns?");
        MobSpawnsHandler.ExtremeCaveSpiderWeight = config.getInt("CaveSpider Extreme Weight", category + " CaveSpider", 100, 1, Integer.MAX_VALUE, "CaveSpider Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremeCaveSpiderMin = config.getInt("CaveSpider Extreme Min Group Size", category + " CaveSpider", 1, 1, Integer.MAX_VALUE, "CaveSpider Extreme Min Group Size!");
        MobSpawnsHandler.ExtremeCaveSpiderMax = config.getInt("CaveSpider Extreme Max Group Size", category + " CaveSpider", 5, 1, Integer.MAX_VALUE, "CaveSpider Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestCaveSpider = config.getBoolean("CaveSpider Forest", category + " CaveSpider", false, "Enable CaveSpider Forest Spawns?");
        MobSpawnsHandler.ForestCaveSpiderWeight = config.getInt("CaveSpider Forest Weight", category + " CaveSpider", 100, 1, Integer.MAX_VALUE, "CaveSpider Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestCaveSpiderMin = config.getInt("CaveSpider Forest Min Group Size", category + " CaveSpider", 1, 1, Integer.MAX_VALUE, "CaveSpider Forest Min Group Size!");
        MobSpawnsHandler.ForestCaveSpiderMax = config.getInt("CaveSpider Forest Max Group Size", category + " CaveSpider", 5, 1, Integer.MAX_VALUE, "CaveSpider Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JungleCaveSpider = config.getBoolean("CaveSpider Jungle", category + " CaveSpider", false, "Enable CaveSpider Jungle Spawns?");
        MobSpawnsHandler.JungleCaveSpiderWeight = config.getInt("CaveSpider Jungle Weight", category + " CaveSpider", 100, 1, Integer.MAX_VALUE, "CaveSpider Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JungleCaveSpiderMin = config.getInt("CaveSpider Jungle Min Group Size", category + " CaveSpider", 1, 1, Integer.MAX_VALUE, "CaveSpider Jungle Min Group Size!");
        MobSpawnsHandler.JungleCaveSpiderMax = config.getInt("CaveSpider Jungle Max Group Size", category + " CaveSpider", 5, 1, Integer.MAX_VALUE, "CaveSpider Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaCaveSpider = config.getBoolean("CaveSpider Mesa", category + " CaveSpider", false, "Enable CaveSpider Mesa Spawns?");
        MobSpawnsHandler.MesaCaveSpiderWeight = config.getInt("CaveSpider Mesa Weight", category + " CaveSpider", 100, 1, Integer.MAX_VALUE, "CaveSpider Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaCaveSpiderMin = config.getInt("CaveSpider Mesa Min Group Size", category + " CaveSpider", 1, 1, Integer.MAX_VALUE, "CaveSpider Mesa Min Group Size!");
        MobSpawnsHandler.MesaCaveSpiderMax = config.getInt("CaveSpider Mesa Max Group Size", category + " CaveSpider", 5, 1, Integer.MAX_VALUE, "CaveSpider Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsCaveSpider = config.getBoolean("CaveSpider Plains", category + " CaveSpider", false, "Enable CaveSpider Plains Spawns?");
        MobSpawnsHandler.PlainsCaveSpiderWeight = config.getInt("CaveSpider Plains Weight", category + " CaveSpider", 100, 1, Integer.MAX_VALUE, "CaveSpider Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsCaveSpiderMin = config.getInt("CaveSpider Plains Min Group Size", category + " CaveSpider", 1, 1, Integer.MAX_VALUE, "CaveSpider Plains Min Group Size!");
        MobSpawnsHandler.PlainsCaveSpiderMax = config.getInt("CaveSpider Plains Max Group Size", category + " CaveSpider", 5, 1, Integer.MAX_VALUE, "CaveSpider Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaCaveSpider = config.getBoolean("CaveSpider Savanna", category + " CaveSpider", false, "Enable CaveSpider Savanna Spawns?");
        MobSpawnsHandler.SavannaCaveSpiderWeight = config.getInt("CaveSpider Savanna Weight", category + " CaveSpider", 100, 1, Integer.MAX_VALUE, "CaveSpider Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaCaveSpiderMin = config.getInt("CaveSpider Savanna Min Group Size", category + " CaveSpider", 1, 1, Integer.MAX_VALUE, "CaveSpider Savanna Min Group Size!");
        MobSpawnsHandler.SavannaCaveSpiderMax = config.getInt("CaveSpider Savanna Max Group Size", category + " CaveSpider", 5, 1, Integer.MAX_VALUE, "CaveSpider Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampCaveSpider = config.getBoolean("CaveSpider Swamp", category + " CaveSpider", false, "Enable CaveSpider Swamp Spawns?");
        MobSpawnsHandler.SwampCaveSpiderWeight = config.getInt("CaveSpider Swamp Weight", category + " CaveSpider", 100, 1, Integer.MAX_VALUE, "CaveSpider Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampCaveSpiderMin = config.getInt("CaveSpider Swamp Min Group Size", category + " CaveSpider", 1, 1, Integer.MAX_VALUE, "CaveSpider Swamp Min Group Size!");
        MobSpawnsHandler.SwampCaveSpiderMax = config.getInt("CaveSpider Swamp Max Group Size", category + " CaveSpider", 5, 1, Integer.MAX_VALUE, "CaveSpider Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaCaveSpider = config.getBoolean("CaveSpider Taiga", category + " CaveSpider", false, "Enable CaveSpider Taiga Spawns?");
        MobSpawnsHandler.TaigaCaveSpiderWeight = config.getInt("CaveSpider Taiga Weight", category + " CaveSpider", 100, 1, Integer.MAX_VALUE, "CaveSpider Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaCaveSpiderMin = config.getInt("CaveSpider Taiga Min Group Size", category + " CaveSpider", 1, 1, Integer.MAX_VALUE, "CaveSpider Taiga Min Group Size!");
        MobSpawnsHandler.TaigaCaveSpiderMax = config.getInt("CaveSpider Taiga Max Group Size", category + " CaveSpider", 5, 1, Integer.MAX_VALUE, "CaveSpider Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndCaveSpider = config.getBoolean("CaveSpider End", category + " CaveSpider", false, "Enable CaveSpider End Spawns?");
        MobSpawnsHandler.EndCaveSpiderWeight = config.getInt("CaveSpider End Weight", category + " CaveSpider", 100, 1, Integer.MAX_VALUE, "CaveSpider End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndCaveSpiderMin = config.getInt("CaveSpider End Min Group Size", category + " CaveSpider", 1, 1, Integer.MAX_VALUE, "CaveSpider End Min Group Size!");
        MobSpawnsHandler.EndCaveSpiderMax = config.getInt("CaveSpider End Max Group Size", category + " CaveSpider", 5, 1, Integer.MAX_VALUE, "CaveSpider End Max Group Size!");
        
        // Creeper
        config.addCustomCategoryComment(category + " Creeper", "true or false");
        // Beach Biome
        MobSpawnsHandler.Creeper = config.getBoolean("Creeper", category + " Creeper", false, "Enable custom Creeper Spawns?");
        MobSpawnsHandler.BeachCreeper = config.getBoolean("Creeper Beach", category + " Creeper", false, "Enable Creeper Beach Spawns?");
        MobSpawnsHandler.BeachCreeperWeight = config.getInt("Creeper Beach Weight", category + " Creeper", 100, 1, Integer.MAX_VALUE, "Creeper Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachCreeperMin = config.getInt("Creeper Beach Min Group Size", category + " Creeper", 1, 1, Integer.MAX_VALUE, "Creeper Beach Min Group Size!");
        MobSpawnsHandler.BeachCreeperMax = config.getInt("Creeper Beach Max Group Size", category + " Creeper", 5, 1, Integer.MAX_VALUE, "Creeper Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherCreeper = config.getBoolean("Creeper Nether", category + " Creeper", false, "Enable Creeper Nether Spawns?");
        MobSpawnsHandler.NetherCreeperWeight = config.getInt("Creeper Nether Weight", category + " Creeper", 100, 1, Integer.MAX_VALUE, "Creeper Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherCreeperMin = config.getInt("Creeper Nether Min Group Size", category + " Creeper", 1, 1, Integer.MAX_VALUE, "Creeper Nether Min Group Size!");
        MobSpawnsHandler.NetherCreeperMax = config.getInt("Creeper Nether Max Group Size", category + " Creeper", 5, 1, Integer.MAX_VALUE, "Creeper Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertCreeper = config.getBoolean("Creeper Desert", category + " Creeper", false, "Enable Creeper Desert Spawns?");
        MobSpawnsHandler.DesertCreeperWeight = config.getInt("Creeper Desert Weight", category + " Creeper", 100, 1, Integer.MAX_VALUE, "Creeper Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertCreeperMin = config.getInt("Creeper Desert Min Group Size", category + " Creeper", 1, 1, Integer.MAX_VALUE, "Creeper Desert Min Group Size!");
        MobSpawnsHandler.DesertCreeperMax = config.getInt("Creeper Desert Max Group Size", category + " Creeper", 5, 1, Integer.MAX_VALUE, "Creeper Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremeCreeper = config.getBoolean("Creeper Extreme", category + " Creeper", false, "Enable Creeper Extreme Spawns?");
        MobSpawnsHandler.ExtremeCreeperWeight = config.getInt("Creeper Extreme Weight", category + " Creeper", 100, 1, Integer.MAX_VALUE, "Creeper Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremeCreeperMin = config.getInt("Creeper Extreme Min Group Size", category + " Creeper", 1, 1, Integer.MAX_VALUE, "Creeper Extreme Min Group Size!");
        MobSpawnsHandler.ExtremeCreeperMax = config.getInt("Creeper Extreme Max Group Size", category + " Creeper", 5, 1, Integer.MAX_VALUE, "Creeper Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestCreeper = config.getBoolean("Creeper Forest", category + " Creeper", false, "Enable Creeper Forest Spawns?");
        MobSpawnsHandler.ForestCreeperWeight = config.getInt("Creeper Forest Weight", category + " Creeper", 100, 1, Integer.MAX_VALUE, "Creeper Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestCreeperMin = config.getInt("Creeper Forest Min Group Size", category + " Creeper", 1, 1, Integer.MAX_VALUE, "Creeper Forest Min Group Size!");
        MobSpawnsHandler.ForestCreeperMax = config.getInt("Creeper Forest Max Group Size", category + " Creeper", 5, 1, Integer.MAX_VALUE, "Creeper Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JungleCreeper = config.getBoolean("Creeper Jungle", category + " Creeper", false, "Enable Creeper Jungle Spawns?");
        MobSpawnsHandler.JungleCreeperWeight = config.getInt("Creeper Jungle Weight", category + " Creeper", 100, 1, Integer.MAX_VALUE, "Creeper Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JungleCreeperMin = config.getInt("Creeper Jungle Min Group Size", category + " Creeper", 1, 1, Integer.MAX_VALUE, "Creeper Jungle Min Group Size!");
        MobSpawnsHandler.JungleCreeperMax = config.getInt("Creeper Jungle Max Group Size", category + " Creeper", 5, 1, Integer.MAX_VALUE, "Creeper Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaCreeper = config.getBoolean("Creeper Mesa", category + " Creeper", false, "Enable Creeper Mesa Spawns?");
        MobSpawnsHandler.MesaCreeperWeight = config.getInt("Creeper Mesa Weight", category + " Creeper", 100, 1, Integer.MAX_VALUE, "Creeper Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaCreeperMin = config.getInt("Creeper Mesa Min Group Size", category + " Creeper", 1, 1, Integer.MAX_VALUE, "Creeper Mesa Min Group Size!");
        MobSpawnsHandler.MesaCreeperMax = config.getInt("Creeper Mesa Max Group Size", category + " Creeper", 5, 1, Integer.MAX_VALUE, "Creeper Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsCreeper = config.getBoolean("Creeper Plains", category + " Creeper", false, "Enable Creeper Plains Spawns?");
        MobSpawnsHandler.PlainsCreeperWeight = config.getInt("Creeper Plains Weight", category + " Creeper", 100, 1, Integer.MAX_VALUE, "Creeper Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsCreeperMin = config.getInt("Creeper Plains Min Group Size", category + " Creeper", 1, 1, Integer.MAX_VALUE, "Creeper Plains Min Group Size!");
        MobSpawnsHandler.PlainsCreeperMax = config.getInt("Creeper Plains Max Group Size", category + " Creeper", 5, 1, Integer.MAX_VALUE, "Creeper Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaCreeper = config.getBoolean("Creeper Savanna", category + " Creeper", false, "Enable Creeper Savanna Spawns?");
        MobSpawnsHandler.SavannaCreeperWeight = config.getInt("Creeper Savanna Weight", category + " Creeper", 100, 1, Integer.MAX_VALUE, "Creeper Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaCreeperMin = config.getInt("Creeper Savanna Min Group Size", category + " Creeper", 1, 1, Integer.MAX_VALUE, "Creeper Savanna Min Group Size!");
        MobSpawnsHandler.SavannaCreeperMax = config.getInt("Creeper Savanna Max Group Size", category + " Creeper", 5, 1, Integer.MAX_VALUE, "Creeper Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampCreeper = config.getBoolean("Creeper Swamp", category + " Creeper", false, "Enable Creeper Swamp Spawns?");
        MobSpawnsHandler.SwampCreeperWeight = config.getInt("Creeper Swamp Weight", category + " Creeper", 100, 1, Integer.MAX_VALUE, "Creeper Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampCreeperMin = config.getInt("Creeper Swamp Min Group Size", category + " Creeper", 1, 1, Integer.MAX_VALUE, "Creeper Swamp Min Group Size!");
        MobSpawnsHandler.SwampCreeperMax = config.getInt("Creeper Swamp Max Group Size", category + " Creeper", 5, 1, Integer.MAX_VALUE, "Creeper Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaCreeper = config.getBoolean("Creeper Taiga", category + " Creeper", false, "Enable Creeper Taiga Spawns?");
        MobSpawnsHandler.TaigaCreeperWeight = config.getInt("Creeper Taiga Weight", category + " Creeper", 100, 1, Integer.MAX_VALUE, "Creeper Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaCreeperMin = config.getInt("Creeper Taiga Min Group Size", category + " Creeper", 1, 1, Integer.MAX_VALUE, "Creeper Taiga Min Group Size!");
        MobSpawnsHandler.TaigaCreeperMax = config.getInt("Creeper Taiga Max Group Size", category + " Creeper", 5, 1, Integer.MAX_VALUE, "Creeper Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndCreeper = config.getBoolean("Creeper End", category + " Creeper", false, "Enable Creeper End Spawns?");
        MobSpawnsHandler.EndCreeperWeight = config.getInt("Creeper End Weight", category + " Creeper", 100, 1, Integer.MAX_VALUE, "Creeper End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndCreeperMin = config.getInt("Creeper End Min Group Size", category + " Creeper", 1, 1, Integer.MAX_VALUE, "Creeper End Min Group Size!");
        MobSpawnsHandler.EndCreeperMax = config.getInt("Creeper End Max Group Size", category + " Creeper", 5, 1, Integer.MAX_VALUE, "Creeper End Max Group Size!");
        
        // Enderman
        config.addCustomCategoryComment(category + " Enderman", "true or false");
        // Beach Biome
        MobSpawnsHandler.Enderman = config.getBoolean("Enderman", category + " Enderman", false, "Enable custom Enderman Spawns?");
        MobSpawnsHandler.BeachEnderman = config.getBoolean("Enderman Beach", category + " Enderman", false, "Enable Enderman Beach Spawns?");
        MobSpawnsHandler.BeachEndermanWeight = config.getInt("Enderman Beach Weight", category + " Enderman", 100, 1, Integer.MAX_VALUE, "Enderman Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachEndermanMin = config.getInt("Enderman Beach Min Group Size", category + " Enderman", 1, 1, Integer.MAX_VALUE, "Enderman Beach Min Group Size!");
        MobSpawnsHandler.BeachEndermanMax = config.getInt("Enderman Beach Max Group Size", category + " Enderman", 5, 1, Integer.MAX_VALUE, "Enderman Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherEnderman = config.getBoolean("Enderman Nether", category + " Enderman", false, "Enable Enderman Nether Spawns?");
        MobSpawnsHandler.NetherEndermanWeight = config.getInt("Enderman Nether Weight", category + " Enderman", 100, 1, Integer.MAX_VALUE, "Enderman Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherEndermanMin = config.getInt("Enderman Nether Min Group Size", category + " Enderman", 1, 1, Integer.MAX_VALUE, "Enderman Nether Min Group Size!");
        MobSpawnsHandler.NetherEndermanMax = config.getInt("Enderman Nether Max Group Size", category + " Enderman", 5, 1, Integer.MAX_VALUE, "Enderman Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertEnderman = config.getBoolean("Enderman Desert", category + " Enderman", false, "Enable Enderman Desert Spawns?");
        MobSpawnsHandler.DesertEndermanWeight = config.getInt("Enderman Desert Weight", category + " Enderman", 100, 1, Integer.MAX_VALUE, "Enderman Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertEndermanMin = config.getInt("Enderman Desert Min Group Size", category + " Enderman", 1, 1, Integer.MAX_VALUE, "Enderman Desert Min Group Size!");
        MobSpawnsHandler.DesertEndermanMax = config.getInt("Enderman Desert Max Group Size", category + " Enderman", 5, 1, Integer.MAX_VALUE, "Enderman Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremeEnderman = config.getBoolean("Enderman Extreme", category + " Enderman", false, "Enable Enderman Extreme Spawns?");
        MobSpawnsHandler.ExtremeEndermanWeight = config.getInt("Enderman Extreme Weight", category + " Enderman", 100, 1, Integer.MAX_VALUE, "Enderman Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremeEndermanMin = config.getInt("Enderman Extreme Min Group Size", category + " Enderman", 1, 1, Integer.MAX_VALUE, "Enderman Extreme Min Group Size!");
        MobSpawnsHandler.ExtremeEndermanMax = config.getInt("Enderman Extreme Max Group Size", category + " Enderman", 5, 1, Integer.MAX_VALUE, "Enderman Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestEnderman = config.getBoolean("Enderman Forest", category + " Enderman", false, "Enable Enderman Forest Spawns?");
        MobSpawnsHandler.ForestEndermanWeight = config.getInt("Enderman Forest Weight", category + " Enderman", 100, 1, Integer.MAX_VALUE, "Enderman Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestEndermanMin = config.getInt("Enderman Forest Min Group Size", category + " Enderman", 1, 1, Integer.MAX_VALUE, "Enderman Forest Min Group Size!");
        MobSpawnsHandler.ForestEndermanMax = config.getInt("Enderman Forest Max Group Size", category + " Enderman", 5, 1, Integer.MAX_VALUE, "Enderman Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JungleEnderman = config.getBoolean("Enderman Jungle", category + " Enderman", false, "Enable Enderman Jungle Spawns?");
        MobSpawnsHandler.JungleEndermanWeight = config.getInt("Enderman Jungle Weight", category + " Enderman", 100, 1, Integer.MAX_VALUE, "Enderman Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JungleEndermanMin = config.getInt("Enderman Jungle Min Group Size", category + " Enderman", 1, 1, Integer.MAX_VALUE, "Enderman Jungle Min Group Size!");
        MobSpawnsHandler.JungleEndermanMax = config.getInt("Enderman Jungle Max Group Size", category + " Enderman", 5, 1, Integer.MAX_VALUE, "Enderman Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaEnderman = config.getBoolean("Enderman Mesa", category + " Enderman", false, "Enable Enderman Mesa Spawns?");
        MobSpawnsHandler.MesaEndermanWeight = config.getInt("Enderman Mesa Weight", category + " Enderman", 100, 1, Integer.MAX_VALUE, "Enderman Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaEndermanMin = config.getInt("Enderman Mesa Min Group Size", category + " Enderman", 1, 1, Integer.MAX_VALUE, "Enderman Mesa Min Group Size!");
        MobSpawnsHandler.MesaEndermanMax = config.getInt("Enderman Mesa Max Group Size", category + " Enderman", 5, 1, Integer.MAX_VALUE, "Enderman Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsEnderman = config.getBoolean("Enderman Plains", category + " Enderman", false, "Enable Enderman Plains Spawns?");
        MobSpawnsHandler.PlainsEndermanWeight = config.getInt("Enderman Plains Weight", category + " Enderman", 100, 1, Integer.MAX_VALUE, "Enderman Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsEndermanMin = config.getInt("Enderman Plains Min Group Size", category + " Enderman", 1, 1, Integer.MAX_VALUE, "Enderman Plains Min Group Size!");
        MobSpawnsHandler.PlainsEndermanMax = config.getInt("Enderman Plains Max Group Size", category + " Enderman", 5, 1, Integer.MAX_VALUE, "Enderman Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaEnderman = config.getBoolean("Enderman Savanna", category + " Enderman", false, "Enable Enderman Savanna Spawns?");
        MobSpawnsHandler.SavannaEndermanWeight = config.getInt("Enderman Savanna Weight", category + " Enderman", 100, 1, Integer.MAX_VALUE, "Enderman Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaEndermanMin = config.getInt("Enderman Savanna Min Group Size", category + " Enderman", 1, 1, Integer.MAX_VALUE, "Enderman Savanna Min Group Size!");
        MobSpawnsHandler.SavannaEndermanMax = config.getInt("Enderman Savanna Max Group Size", category + " Enderman", 5, 1, Integer.MAX_VALUE, "Enderman Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampEnderman = config.getBoolean("Enderman Swamp", category + " Enderman", false, "Enable Enderman Swamp Spawns?");
        MobSpawnsHandler.SwampEndermanWeight = config.getInt("Enderman Swamp Weight", category + " Enderman", 100, 1, Integer.MAX_VALUE, "Enderman Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampEndermanMin = config.getInt("Enderman Swamp Min Group Size", category + " Enderman", 1, 1, Integer.MAX_VALUE, "Enderman Swamp Min Group Size!");
        MobSpawnsHandler.SwampEndermanMax = config.getInt("Enderman Swamp Max Group Size", category + " Enderman", 5, 1, Integer.MAX_VALUE, "Enderman Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaEnderman = config.getBoolean("Enderman Taiga", category + " Enderman", false, "Enable Enderman Taiga Spawns?");
        MobSpawnsHandler.TaigaEndermanWeight = config.getInt("Enderman Taiga Weight", category + " Enderman", 100, 1, Integer.MAX_VALUE, "Enderman Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaEndermanMin = config.getInt("Enderman Taiga Min Group Size", category + " Enderman", 1, 1, Integer.MAX_VALUE, "Enderman Taiga Min Group Size!");
        MobSpawnsHandler.TaigaEndermanMax = config.getInt("Enderman Taiga Max Group Size", category + " Enderman", 5, 1, Integer.MAX_VALUE, "Enderman Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndEnderman = config.getBoolean("Enderman End", category + " Enderman", false, "Enable Enderman End Spawns?");
        MobSpawnsHandler.EndEndermanWeight = config.getInt("Enderman End Weight", category + " Enderman", 100, 1, Integer.MAX_VALUE, "Enderman End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndEndermanMin = config.getInt("Enderman End Min Group Size", category + " Enderman", 1, 1, Integer.MAX_VALUE, "Enderman End Min Group Size!");
        MobSpawnsHandler.EndEndermanMax = config.getInt("Enderman End Max Group Size", category + " Enderman", 5, 1, Integer.MAX_VALUE, "Enderman End Max Group Size!");
        
        // Endermite
        config.addCustomCategoryComment(category + " Endermite", "true or false");
        // Beach Biome
        MobSpawnsHandler.Endermite = config.getBoolean("Endermite", category + " Endermite", false, "Enable custom Endermite Spawns?");
        MobSpawnsHandler.BeachEndermite = config.getBoolean("Endermite Beach", category + " Endermite", false, "Enable Endermite Beach Spawns?");
        MobSpawnsHandler.BeachEndermiteWeight = config.getInt("Endermite Beach Weight", category + " Endermite", 100, 1, Integer.MAX_VALUE, "Endermite Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachEndermiteMin = config.getInt("Endermite Beach Min Group Size", category + " Endermite", 1, 1, Integer.MAX_VALUE, "Endermite Beach Min Group Size!");
        MobSpawnsHandler.BeachEndermiteMax = config.getInt("Endermite Beach Max Group Size", category + " Endermite", 5, 1, Integer.MAX_VALUE, "Endermite Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherEndermite = config.getBoolean("Endermite Nether", category + " Endermite", false, "Enable Endermite Nether Spawns?");
        MobSpawnsHandler.NetherEndermiteWeight = config.getInt("Endermite Nether Weight", category + " Endermite", 100, 1, Integer.MAX_VALUE, "Endermite Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherEndermiteMin = config.getInt("Endermite Nether Min Group Size", category + " Endermite", 1, 1, Integer.MAX_VALUE, "Endermite Nether Min Group Size!");
        MobSpawnsHandler.NetherEndermiteMax = config.getInt("Endermite Nether Max Group Size", category + " Endermite", 5, 1, Integer.MAX_VALUE, "Endermite Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertEndermite = config.getBoolean("Endermite Desert", category + " Endermite", false, "Enable Endermite Desert Spawns?");
        MobSpawnsHandler.DesertEndermiteWeight = config.getInt("Endermite Desert Weight", category + " Endermite", 100, 1, Integer.MAX_VALUE, "Endermite Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertEndermiteMin = config.getInt("Endermite Desert Min Group Size", category + " Endermite", 1, 1, Integer.MAX_VALUE, "Endermite Desert Min Group Size!");
        MobSpawnsHandler.DesertEndermiteMax = config.getInt("Endermite Desert Max Group Size", category + " Endermite", 5, 1, Integer.MAX_VALUE, "Endermite Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremeEndermite = config.getBoolean("Endermite Extreme", category + " Endermite", false, "Enable Endermite Extreme Spawns?");
        MobSpawnsHandler.ExtremeEndermiteWeight = config.getInt("Endermite Extreme Weight", category + " Endermite", 100, 1, Integer.MAX_VALUE, "Endermite Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremeEndermiteMin = config.getInt("Endermite Extreme Min Group Size", category + " Endermite", 1, 1, Integer.MAX_VALUE, "Endermite Extreme Min Group Size!");
        MobSpawnsHandler.ExtremeEndermiteMax = config.getInt("Endermite Extreme Max Group Size", category + " Endermite", 5, 1, Integer.MAX_VALUE, "Endermite Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestEndermite = config.getBoolean("Endermite Forest", category + " Endermite", false, "Enable Endermite Forest Spawns?");
        MobSpawnsHandler.ForestEndermiteWeight = config.getInt("Endermite Forest Weight", category + " Endermite", 100, 1, Integer.MAX_VALUE, "Endermite Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestEndermiteMin = config.getInt("Endermite Forest Min Group Size", category + " Endermite", 1, 1, Integer.MAX_VALUE, "Endermite Forest Min Group Size!");
        MobSpawnsHandler.ForestEndermiteMax = config.getInt("Endermite Forest Max Group Size", category + " Endermite", 5, 1, Integer.MAX_VALUE, "Endermite Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JungleEndermite = config.getBoolean("Endermite Jungle", category + " Endermite", false, "Enable Endermite Jungle Spawns?");
        MobSpawnsHandler.JungleEndermiteWeight = config.getInt("Endermite Jungle Weight", category + " Endermite", 100, 1, Integer.MAX_VALUE, "Endermite Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JungleEndermiteMin = config.getInt("Endermite Jungle Min Group Size", category + " Endermite", 1, 1, Integer.MAX_VALUE, "Endermite Jungle Min Group Size!");
        MobSpawnsHandler.JungleEndermiteMax = config.getInt("Endermite Jungle Max Group Size", category + " Endermite", 5, 1, Integer.MAX_VALUE, "Endermite Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaEndermite = config.getBoolean("Endermite Mesa", category + " Endermite", false, "Enable Endermite Mesa Spawns?");
        MobSpawnsHandler.MesaEndermiteWeight = config.getInt("Endermite Mesa Weight", category + " Endermite", 100, 1, Integer.MAX_VALUE, "Endermite Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaEndermiteMin = config.getInt("Endermite Mesa Min Group Size", category + " Endermite", 1, 1, Integer.MAX_VALUE, "Endermite Mesa Min Group Size!");
        MobSpawnsHandler.MesaEndermiteMax = config.getInt("Endermite Mesa Max Group Size", category + " Endermite", 5, 1, Integer.MAX_VALUE, "Endermite Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsEndermite = config.getBoolean("Endermite Plains", category + " Endermite", false, "Enable Endermite Plains Spawns?");
        MobSpawnsHandler.PlainsEndermiteWeight = config.getInt("Endermite Plains Weight", category + " Endermite", 100, 1, Integer.MAX_VALUE, "Endermite Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsEndermiteMin = config.getInt("Endermite Plains Min Group Size", category + " Endermite", 1, 1, Integer.MAX_VALUE, "Endermite Plains Min Group Size!");
        MobSpawnsHandler.PlainsEndermiteMax = config.getInt("Endermite Plains Max Group Size", category + " Endermite", 5, 1, Integer.MAX_VALUE, "Endermite Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaEndermite = config.getBoolean("Endermite Savanna", category + " Endermite", false, "Enable Endermite Savanna Spawns?");
        MobSpawnsHandler.SavannaEndermiteWeight = config.getInt("Endermite Savanna Weight", category + " Endermite", 100, 1, Integer.MAX_VALUE, "Endermite Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaEndermiteMin = config.getInt("Endermite Savanna Min Group Size", category + " Endermite", 1, 1, Integer.MAX_VALUE, "Endermite Savanna Min Group Size!");
        MobSpawnsHandler.SavannaEndermiteMax = config.getInt("Endermite Savanna Max Group Size", category + " Endermite", 5, 1, Integer.MAX_VALUE, "Endermite Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampEndermite = config.getBoolean("Endermite Swamp", category + " Endermite", false, "Enable Endermite Swamp Spawns?");
        MobSpawnsHandler.SwampEndermiteWeight = config.getInt("Endermite Swamp Weight", category + " Endermite", 100, 1, Integer.MAX_VALUE, "Endermite Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampEndermiteMin = config.getInt("Endermite Swamp Min Group Size", category + " Endermite", 1, 1, Integer.MAX_VALUE, "Endermite Swamp Min Group Size!");
        MobSpawnsHandler.SwampEndermiteMax = config.getInt("Endermite Swamp Max Group Size", category + " Endermite", 5, 1, Integer.MAX_VALUE, "Endermite Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaEndermite = config.getBoolean("Endermite Taiga", category + " Endermite", false, "Enable Endermite Taiga Spawns?");
        MobSpawnsHandler.TaigaEndermiteWeight = config.getInt("Endermite Taiga Weight", category + " Endermite", 100, 1, Integer.MAX_VALUE, "Endermite Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaEndermiteMin = config.getInt("Endermite Taiga Min Group Size", category + " Endermite", 1, 1, Integer.MAX_VALUE, "Endermite Taiga Min Group Size!");
        MobSpawnsHandler.TaigaEndermiteMax = config.getInt("Endermite Taiga Max Group Size", category + " Endermite", 5, 1, Integer.MAX_VALUE, "Endermite Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndEndermite = config.getBoolean("Endermite End", category + " Endermite", false, "Enable Endermite End Spawns?");
        MobSpawnsHandler.EndEndermiteWeight = config.getInt("Endermite End Weight", category + " Endermite", 100, 1, Integer.MAX_VALUE, "Endermite End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndEndermiteMin = config.getInt("Endermite End Min Group Size", category + " Endermite", 1, 1, Integer.MAX_VALUE, "Endermite End Min Group Size!");
        MobSpawnsHandler.EndEndermiteMax = config.getInt("Endermite End Max Group Size", category + " Endermite", 5, 1, Integer.MAX_VALUE, "Endermite End Max Group Size!");
        
        // Ghast
        config.addCustomCategoryComment(category + " Ghast", "true or false");
        // Beach Biome
        MobSpawnsHandler.Ghast = config.getBoolean("Ghast", category + " Ghast", false, "Enable custom Ghast Spawns?");
        MobSpawnsHandler.BeachGhast = config.getBoolean("Ghast Beach", category + " Ghast", false, "Enable Ghast Beach Spawns?");
        MobSpawnsHandler.BeachGhastWeight = config.getInt("Ghast Beach Weight", category + " Ghast", 100, 1, Integer.MAX_VALUE, "Ghast Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachGhastMin = config.getInt("Ghast Beach Min Group Size", category + " Ghast", 1, 1, Integer.MAX_VALUE, "Ghast Beach Min Group Size!");
        MobSpawnsHandler.BeachGhastMax = config.getInt("Ghast Beach Max Group Size", category + " Ghast", 5, 1, Integer.MAX_VALUE, "Ghast Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherGhast = config.getBoolean("Ghast Nether", category + " Ghast", false, "Enable Ghast Nether Spawns?");
        MobSpawnsHandler.NetherGhastWeight = config.getInt("Ghast Nether Weight", category + " Ghast", 100, 1, Integer.MAX_VALUE, "Ghast Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherGhastMin = config.getInt("Ghast Nether Min Group Size", category + " Ghast", 1, 1, Integer.MAX_VALUE, "Ghast Nether Min Group Size!");
        MobSpawnsHandler.NetherGhastMax = config.getInt("Ghast Nether Max Group Size", category + " Ghast", 5, 1, Integer.MAX_VALUE, "Ghast Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertGhast = config.getBoolean("Ghast Desert", category + " Ghast", false, "Enable Ghast Desert Spawns?");
        MobSpawnsHandler.DesertGhastWeight = config.getInt("Ghast Desert Weight", category + " Ghast", 100, 1, Integer.MAX_VALUE, "Ghast Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertGhastMin = config.getInt("Ghast Desert Min Group Size", category + " Ghast", 1, 1, Integer.MAX_VALUE, "Ghast Desert Min Group Size!");
        MobSpawnsHandler.DesertGhastMax = config.getInt("Ghast Desert Max Group Size", category + " Ghast", 5, 1, Integer.MAX_VALUE, "Ghast Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremeGhast = config.getBoolean("Ghast Extreme", category + " Ghast", false, "Enable Ghast Extreme Spawns?");
        MobSpawnsHandler.ExtremeGhastWeight = config.getInt("Ghast Extreme Weight", category + " Ghast", 100, 1, Integer.MAX_VALUE, "Ghast Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremeGhastMin = config.getInt("Ghast Extreme Min Group Size", category + " Ghast", 1, 1, Integer.MAX_VALUE, "Ghast Extreme Min Group Size!");
        MobSpawnsHandler.ExtremeGhastMax = config.getInt("Ghast Extreme Max Group Size", category + " Ghast", 5, 1, Integer.MAX_VALUE, "Ghast Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestGhast = config.getBoolean("Ghast Forest", category + " Ghast", false, "Enable Ghast Forest Spawns?");
        MobSpawnsHandler.ForestGhastWeight = config.getInt("Ghast Forest Weight", category + " Ghast", 100, 1, Integer.MAX_VALUE, "Ghast Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestGhastMin = config.getInt("Ghast Forest Min Group Size", category + " Ghast", 1, 1, Integer.MAX_VALUE, "Ghast Forest Min Group Size!");
        MobSpawnsHandler.ForestGhastMax = config.getInt("Ghast Forest Max Group Size", category + " Ghast", 5, 1, Integer.MAX_VALUE, "Ghast Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JungleGhast = config.getBoolean("Ghast Jungle", category + " Ghast", false, "Enable Ghast Jungle Spawns?");
        MobSpawnsHandler.JungleGhastWeight = config.getInt("Ghast Jungle Weight", category + " Ghast", 100, 1, Integer.MAX_VALUE, "Ghast Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JungleGhastMin = config.getInt("Ghast Jungle Min Group Size", category + " Ghast", 1, 1, Integer.MAX_VALUE, "Ghast Jungle Min Group Size!");
        MobSpawnsHandler.JungleGhastMax = config.getInt("Ghast Jungle Max Group Size", category + " Ghast", 5, 1, Integer.MAX_VALUE, "Ghast Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaGhast = config.getBoolean("Ghast Mesa", category + " Ghast", false, "Enable Ghast Mesa Spawns?");
        MobSpawnsHandler.MesaGhastWeight = config.getInt("Ghast Mesa Weight", category + " Ghast", 100, 1, Integer.MAX_VALUE, "Ghast Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaGhastMin = config.getInt("Ghast Mesa Min Group Size", category + " Ghast", 1, 1, Integer.MAX_VALUE, "Ghast Mesa Min Group Size!");
        MobSpawnsHandler.MesaGhastMax = config.getInt("Ghast Mesa Max Group Size", category + " Ghast", 5, 1, Integer.MAX_VALUE, "Ghast Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsGhast = config.getBoolean("Ghast Plains", category + " Ghast", false, "Enable Ghast Plains Spawns?");
        MobSpawnsHandler.PlainsGhastWeight = config.getInt("Ghast Plains Weight", category + " Ghast", 100, 1, Integer.MAX_VALUE, "Ghast Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsGhastMin = config.getInt("Ghast Plains Min Group Size", category + " Ghast", 1, 1, Integer.MAX_VALUE, "Ghast Plains Min Group Size!");
        MobSpawnsHandler.PlainsGhastMax = config.getInt("Ghast Plains Max Group Size", category + " Ghast", 5, 1, Integer.MAX_VALUE, "Ghast Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaGhast = config.getBoolean("Ghast Savanna", category + " Ghast", false, "Enable Ghast Savanna Spawns?");
        MobSpawnsHandler.SavannaGhastWeight = config.getInt("Ghast Savanna Weight", category + " Ghast", 100, 1, Integer.MAX_VALUE, "Ghast Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaGhastMin = config.getInt("Ghast Savanna Min Group Size", category + " Ghast", 1, 1, Integer.MAX_VALUE, "Ghast Savanna Min Group Size!");
        MobSpawnsHandler.SavannaGhastMax = config.getInt("Ghast Savanna Max Group Size", category + " Ghast", 5, 1, Integer.MAX_VALUE, "Ghast Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampGhast = config.getBoolean("Ghast Swamp", category + " Ghast", false, "Enable Ghast Swamp Spawns?");
        MobSpawnsHandler.SwampGhastWeight = config.getInt("Ghast Swamp Weight", category + " Ghast", 100, 1, Integer.MAX_VALUE, "Ghast Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampGhastMin = config.getInt("Ghast Swamp Min Group Size", category + " Ghast", 1, 1, Integer.MAX_VALUE, "Ghast Swamp Min Group Size!");
        MobSpawnsHandler.SwampGhastMax = config.getInt("Ghast Swamp Max Group Size", category + " Ghast", 5, 1, Integer.MAX_VALUE, "Ghast Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaGhast = config.getBoolean("Ghast Taiga", category + " Ghast", false, "Enable Ghast Taiga Spawns?");
        MobSpawnsHandler.TaigaGhastWeight = config.getInt("Ghast Taiga Weight", category + " Ghast", 100, 1, Integer.MAX_VALUE, "Ghast Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaGhastMin = config.getInt("Ghast Taiga Min Group Size", category + " Ghast", 1, 1, Integer.MAX_VALUE, "Ghast Taiga Min Group Size!");
        MobSpawnsHandler.TaigaGhastMax = config.getInt("Ghast Taiga Max Group Size", category + " Ghast", 5, 1, Integer.MAX_VALUE, "Ghast Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndGhast = config.getBoolean("Ghast End", category + " Ghast", false, "Enable Ghast End Spawns?");
        MobSpawnsHandler.EndGhastWeight = config.getInt("Ghast End Weight", category + " Ghast", 100, 1, Integer.MAX_VALUE, "Ghast End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndGhastMin = config.getInt("Ghast End Min Group Size", category + " Ghast", 1, 1, Integer.MAX_VALUE, "Ghast End Min Group Size!");
        MobSpawnsHandler.EndGhastMax = config.getInt("Ghast End Max Group Size", category + " Ghast", 5, 1, Integer.MAX_VALUE, "Ghast End Max Group Size!");
        
        // GiantZombie
        config.addCustomCategoryComment(category + " GiantZombie", "true or false");
        // Beach Biome
        MobSpawnsHandler.GiantZombie = config.getBoolean("GiantZombie", category + " GiantZombie", false, "Enable custom GiantZombie Spawns?");
        MobSpawnsHandler.BeachGiantZombie = config.getBoolean("GiantZombie Beach", category + " GiantZombie", false, "Enable GiantZombie Beach Spawns?");
        MobSpawnsHandler.BeachGiantZombieWeight = config.getInt("GiantZombie Beach Weight", category + " GiantZombie", 100, 1, Integer.MAX_VALUE, "GiantZombie Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachGiantZombieMin = config.getInt("GiantZombie Beach Min Group Size", category + " GiantZombie", 1, 1, Integer.MAX_VALUE, "GiantZombie Beach Min Group Size!");
        MobSpawnsHandler.BeachGiantZombieMax = config.getInt("GiantZombie Beach Max Group Size", category + " GiantZombie", 5, 1, Integer.MAX_VALUE, "GiantZombie Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherGiantZombie = config.getBoolean("GiantZombie Nether", category + " GiantZombie", false, "Enable GiantZombie Nether Spawns?");
        MobSpawnsHandler.NetherGiantZombieWeight = config.getInt("GiantZombie Nether Weight", category + " GiantZombie", 100, 1, Integer.MAX_VALUE, "GiantZombie Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherGiantZombieMin = config.getInt("GiantZombie Nether Min Group Size", category + " GiantZombie", 1, 1, Integer.MAX_VALUE, "GiantZombie Nether Min Group Size!");
        MobSpawnsHandler.NetherGiantZombieMax = config.getInt("GiantZombie Nether Max Group Size", category + " GiantZombie", 5, 1, Integer.MAX_VALUE, "GiantZombie Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertGiantZombie = config.getBoolean("GiantZombie Desert", category + " GiantZombie", false, "Enable GiantZombie Desert Spawns?");
        MobSpawnsHandler.DesertGiantZombieWeight = config.getInt("GiantZombie Desert Weight", category + " GiantZombie", 100, 1, Integer.MAX_VALUE, "GiantZombie Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertGiantZombieMin = config.getInt("GiantZombie Desert Min Group Size", category + " GiantZombie", 1, 1, Integer.MAX_VALUE, "GiantZombie Desert Min Group Size!");
        MobSpawnsHandler.DesertGiantZombieMax = config.getInt("GiantZombie Desert Max Group Size", category + " GiantZombie", 5, 1, Integer.MAX_VALUE, "GiantZombie Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremeGiantZombie = config.getBoolean("GiantZombie Extreme", category + " GiantZombie", false, "Enable GiantZombie Extreme Spawns?");
        MobSpawnsHandler.ExtremeGiantZombieWeight = config.getInt("GiantZombie Extreme Weight", category + " GiantZombie", 100, 1, Integer.MAX_VALUE, "GiantZombie Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremeGiantZombieMin = config.getInt("GiantZombie Extreme Min Group Size", category + " GiantZombie", 1, 1, Integer.MAX_VALUE, "GiantZombie Extreme Min Group Size!");
        MobSpawnsHandler.ExtremeGiantZombieMax = config.getInt("GiantZombie Extreme Max Group Size", category + " GiantZombie", 5, 1, Integer.MAX_VALUE, "GiantZombie Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestGiantZombie = config.getBoolean("GiantZombie Forest", category + " GiantZombie", false, "Enable GiantZombie Forest Spawns?");
        MobSpawnsHandler.ForestGiantZombieWeight = config.getInt("GiantZombie Forest Weight", category + " GiantZombie", 100, 1, Integer.MAX_VALUE, "GiantZombie Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestGiantZombieMin = config.getInt("GiantZombie Forest Min Group Size", category + " GiantZombie", 1, 1, Integer.MAX_VALUE, "GiantZombie Forest Min Group Size!");
        MobSpawnsHandler.ForestGiantZombieMax = config.getInt("GiantZombie Forest Max Group Size", category + " GiantZombie", 5, 1, Integer.MAX_VALUE, "GiantZombie Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JungleGiantZombie = config.getBoolean("GiantZombie Jungle", category + " GiantZombie", false, "Enable GiantZombie Jungle Spawns?");
        MobSpawnsHandler.JungleGiantZombieWeight = config.getInt("GiantZombie Jungle Weight", category + " GiantZombie", 100, 1, Integer.MAX_VALUE, "GiantZombie Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JungleGiantZombieMin = config.getInt("GiantZombie Jungle Min Group Size", category + " GiantZombie", 1, 1, Integer.MAX_VALUE, "GiantZombie Jungle Min Group Size!");
        MobSpawnsHandler.JungleGiantZombieMax = config.getInt("GiantZombie Jungle Max Group Size", category + " GiantZombie", 5, 1, Integer.MAX_VALUE, "GiantZombie Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaGiantZombie = config.getBoolean("GiantZombie Mesa", category + " GiantZombie", false, "Enable GiantZombie Mesa Spawns?");
        MobSpawnsHandler.MesaGiantZombieWeight = config.getInt("GiantZombie Mesa Weight", category + " GiantZombie", 100, 1, Integer.MAX_VALUE, "GiantZombie Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaGiantZombieMin = config.getInt("GiantZombie Mesa Min Group Size", category + " GiantZombie", 1, 1, Integer.MAX_VALUE, "GiantZombie Mesa Min Group Size!");
        MobSpawnsHandler.MesaGiantZombieMax = config.getInt("GiantZombie Mesa Max Group Size", category + " GiantZombie", 5, 1, Integer.MAX_VALUE, "GiantZombie Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsGiantZombie = config.getBoolean("GiantZombie Plains", category + " GiantZombie", false, "Enable GiantZombie Plains Spawns?");
        MobSpawnsHandler.PlainsGiantZombieWeight = config.getInt("GiantZombie Plains Weight", category + " GiantZombie", 100, 1, Integer.MAX_VALUE, "GiantZombie Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsGiantZombieMin = config.getInt("GiantZombie Plains Min Group Size", category + " GiantZombie", 1, 1, Integer.MAX_VALUE, "GiantZombie Plains Min Group Size!");
        MobSpawnsHandler.PlainsGiantZombieMax = config.getInt("GiantZombie Plains Max Group Size", category + " GiantZombie", 5, 1, Integer.MAX_VALUE, "GiantZombie Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaGiantZombie = config.getBoolean("GiantZombie Savanna", category + " GiantZombie", false, "Enable GiantZombie Savanna Spawns?");
        MobSpawnsHandler.SavannaGiantZombieWeight = config.getInt("GiantZombie Savanna Weight", category + " GiantZombie", 100, 1, Integer.MAX_VALUE, "GiantZombie Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaGiantZombieMin = config.getInt("GiantZombie Savanna Min Group Size", category + " GiantZombie", 1, 1, Integer.MAX_VALUE, "GiantZombie Savanna Min Group Size!");
        MobSpawnsHandler.SavannaGiantZombieMax = config.getInt("GiantZombie Savanna Max Group Size", category + " GiantZombie", 5, 1, Integer.MAX_VALUE, "GiantZombie Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampGiantZombie = config.getBoolean("GiantZombie Swamp", category + " GiantZombie", false, "Enable GiantZombie Swamp Spawns?");
        MobSpawnsHandler.SwampGiantZombieWeight = config.getInt("GiantZombie Swamp Weight", category + " GiantZombie", 100, 1, Integer.MAX_VALUE, "GiantZombie Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampGiantZombieMin = config.getInt("GiantZombie Swamp Min Group Size", category + " GiantZombie", 1, 1, Integer.MAX_VALUE, "GiantZombie Swamp Min Group Size!");
        MobSpawnsHandler.SwampGiantZombieMax = config.getInt("GiantZombie Swamp Max Group Size", category + " GiantZombie", 5, 1, Integer.MAX_VALUE, "GiantZombie Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaGiantZombie = config.getBoolean("GiantZombie Taiga", category + " GiantZombie", false, "Enable GiantZombie Taiga Spawns?");
        MobSpawnsHandler.TaigaGiantZombieWeight = config.getInt("GiantZombie Taiga Weight", category + " GiantZombie", 100, 1, Integer.MAX_VALUE, "GiantZombie Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaGiantZombieMin = config.getInt("GiantZombie Taiga Min Group Size", category + " GiantZombie", 1, 1, Integer.MAX_VALUE, "GiantZombie Taiga Min Group Size!");
        MobSpawnsHandler.TaigaGiantZombieMax = config.getInt("GiantZombie Taiga Max Group Size", category + " GiantZombie", 5, 1, Integer.MAX_VALUE, "GiantZombie Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndGiantZombie = config.getBoolean("GiantZombie End", category + " GiantZombie", false, "Enable GiantZombie End Spawns?");
        MobSpawnsHandler.EndGiantZombieWeight = config.getInt("GiantZombie End Weight", category + " GiantZombie", 100, 1, Integer.MAX_VALUE, "GiantZombie End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndGiantZombieMin = config.getInt("GiantZombie End Min Group Size", category + " GiantZombie", 1, 1, Integer.MAX_VALUE, "GiantZombie End Min Group Size!");
        MobSpawnsHandler.EndGiantZombieMax = config.getInt("GiantZombie End Max Group Size", category + " GiantZombie", 5, 1, Integer.MAX_VALUE, "GiantZombie End Max Group Size!");
        
        // Guardian
        config.addCustomCategoryComment(category + " Guardian", "true or false");
        // Ocean Biome
        MobSpawnsHandler.Guardian = config.getBoolean("Guardian", category + " Guardian", false, "Enable custom Guardian Spawns?");
        MobSpawnsHandler.OceanGuardian = config.getBoolean("Guardian Ocean", category + " Guardian", false, "Enable Guardian Ocean Spawns?");
        MobSpawnsHandler.OceanGuardianWeight = config.getInt("Guardian Ocean Weight", category + " Guardian", 100, 1, Integer.MAX_VALUE, "Guardian Ocean Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.OceanGuardianMin = config.getInt("Guardian Ocean Min Group Size", category + " Guardian", 1, 1, Integer.MAX_VALUE, "Guardian Ocean Min Group Size!");
        MobSpawnsHandler.OceanGuardianMax = config.getInt("Guardian Ocean Max Group Size", category + " Guardian", 5, 1, Integer.MAX_VALUE, "Guardian Ocean Max Group Size!");
		// Deep Biome
        MobSpawnsHandler.DeepGuardian = config.getBoolean("Guardian Deep", category + " Guardian", false, "Enable Guardian Deep Spawns?");
        MobSpawnsHandler.DeepGuardianWeight = config.getInt("Guardian Deep Weight", category + " Guardian", 100, 1, Integer.MAX_VALUE, "Guardian Deep Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DeepGuardianMin = config.getInt("Guardian Deep Min Group Size", category + " Guardian", 1, 1, Integer.MAX_VALUE, "Guardian Deep Min Group Size!");
        MobSpawnsHandler.DeepGuardianMax = config.getInt("Guardian Deep Max Group Size", category + " Guardian", 5, 1, Integer.MAX_VALUE, "Guardian Deep Max Group Size!");
        
        // IronGolem
        config.addCustomCategoryComment(category + " IronGolem", "true or false");
        // Beach Biome
        MobSpawnsHandler.IronGolem = config.getBoolean("IronGolem", category + " IronGolem", false, "Enable custom IronGolem Spawns?");
        MobSpawnsHandler.BeachIronGolem = config.getBoolean("IronGolem Beach", category + " IronGolem", false, "Enable IronGolem Beach Spawns?");
        MobSpawnsHandler.BeachIronGolemWeight = config.getInt("IronGolem Beach Weight", category + " IronGolem", 100, 1, Integer.MAX_VALUE, "IronGolem Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachIronGolemMin = config.getInt("IronGolem Beach Min Group Size", category + " IronGolem", 1, 1, Integer.MAX_VALUE, "IronGolem Beach Min Group Size!");
        MobSpawnsHandler.BeachIronGolemMax = config.getInt("IronGolem Beach Max Group Size", category + " IronGolem", 5, 1, Integer.MAX_VALUE, "IronGolem Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherIronGolem = config.getBoolean("IronGolem Nether", category + " IronGolem", false, "Enable IronGolem Nether Spawns?");
        MobSpawnsHandler.NetherIronGolemWeight = config.getInt("IronGolem Nether Weight", category + " IronGolem", 100, 1, Integer.MAX_VALUE, "IronGolem Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherIronGolemMin = config.getInt("IronGolem Nether Min Group Size", category + " IronGolem", 1, 1, Integer.MAX_VALUE, "IronGolem Nether Min Group Size!");
        MobSpawnsHandler.NetherIronGolemMax = config.getInt("IronGolem Nether Max Group Size", category + " IronGolem", 5, 1, Integer.MAX_VALUE, "IronGolem Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertIronGolem = config.getBoolean("IronGolem Desert", category + " IronGolem", false, "Enable IronGolem Desert Spawns?");
        MobSpawnsHandler.DesertIronGolemWeight = config.getInt("IronGolem Desert Weight", category + " IronGolem", 100, 1, Integer.MAX_VALUE, "IronGolem Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertIronGolemMin = config.getInt("IronGolem Desert Min Group Size", category + " IronGolem", 1, 1, Integer.MAX_VALUE, "IronGolem Desert Min Group Size!");
        MobSpawnsHandler.DesertIronGolemMax = config.getInt("IronGolem Desert Max Group Size", category + " IronGolem", 5, 1, Integer.MAX_VALUE, "IronGolem Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremeIronGolem = config.getBoolean("IronGolem Extreme", category + " IronGolem", false, "Enable IronGolem Extreme Spawns?");
        MobSpawnsHandler.ExtremeIronGolemWeight = config.getInt("IronGolem Extreme Weight", category + " IronGolem", 100, 1, Integer.MAX_VALUE, "IronGolem Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremeIronGolemMin = config.getInt("IronGolem Extreme Min Group Size", category + " IronGolem", 1, 1, Integer.MAX_VALUE, "IronGolem Extreme Min Group Size!");
        MobSpawnsHandler.ExtremeIronGolemMax = config.getInt("IronGolem Extreme Max Group Size", category + " IronGolem", 5, 1, Integer.MAX_VALUE, "IronGolem Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestIronGolem = config.getBoolean("IronGolem Forest", category + " IronGolem", false, "Enable IronGolem Forest Spawns?");
        MobSpawnsHandler.ForestIronGolemWeight = config.getInt("IronGolem Forest Weight", category + " IronGolem", 100, 1, Integer.MAX_VALUE, "IronGolem Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestIronGolemMin = config.getInt("IronGolem Forest Min Group Size", category + " IronGolem", 1, 1, Integer.MAX_VALUE, "IronGolem Forest Min Group Size!");
        MobSpawnsHandler.ForestIronGolemMax = config.getInt("IronGolem Forest Max Group Size", category + " IronGolem", 5, 1, Integer.MAX_VALUE, "IronGolem Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JungleIronGolem = config.getBoolean("IronGolem Jungle", category + " IronGolem", false, "Enable IronGolem Jungle Spawns?");
        MobSpawnsHandler.JungleIronGolemWeight = config.getInt("IronGolem Jungle Weight", category + " IronGolem", 100, 1, Integer.MAX_VALUE, "IronGolem Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JungleIronGolemMin = config.getInt("IronGolem Jungle Min Group Size", category + " IronGolem", 1, 1, Integer.MAX_VALUE, "IronGolem Jungle Min Group Size!");
        MobSpawnsHandler.JungleIronGolemMax = config.getInt("IronGolem Jungle Max Group Size", category + " IronGolem", 5, 1, Integer.MAX_VALUE, "IronGolem Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaIronGolem = config.getBoolean("IronGolem Mesa", category + " IronGolem", false, "Enable IronGolem Mesa Spawns?");
        MobSpawnsHandler.MesaIronGolemWeight = config.getInt("IronGolem Mesa Weight", category + " IronGolem", 100, 1, Integer.MAX_VALUE, "IronGolem Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaIronGolemMin = config.getInt("IronGolem Mesa Min Group Size", category + " IronGolem", 1, 1, Integer.MAX_VALUE, "IronGolem Mesa Min Group Size!");
        MobSpawnsHandler.MesaIronGolemMax = config.getInt("IronGolem Mesa Max Group Size", category + " IronGolem", 5, 1, Integer.MAX_VALUE, "IronGolem Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsIronGolem = config.getBoolean("IronGolem Plains", category + " IronGolem", false, "Enable IronGolem Plains Spawns?");
        MobSpawnsHandler.PlainsIronGolemWeight = config.getInt("IronGolem Plains Weight", category + " IronGolem", 100, 1, Integer.MAX_VALUE, "IronGolem Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsIronGolemMin = config.getInt("IronGolem Plains Min Group Size", category + " IronGolem", 1, 1, Integer.MAX_VALUE, "IronGolem Plains Min Group Size!");
        MobSpawnsHandler.PlainsIronGolemMax = config.getInt("IronGolem Plains Max Group Size", category + " IronGolem", 5, 1, Integer.MAX_VALUE, "IronGolem Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaIronGolem = config.getBoolean("IronGolem Savanna", category + " IronGolem", false, "Enable IronGolem Savanna Spawns?");
        MobSpawnsHandler.SavannaIronGolemWeight = config.getInt("IronGolem Savanna Weight", category + " IronGolem", 100, 1, Integer.MAX_VALUE, "IronGolem Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaIronGolemMin = config.getInt("IronGolem Savanna Min Group Size", category + " IronGolem", 1, 1, Integer.MAX_VALUE, "IronGolem Savanna Min Group Size!");
        MobSpawnsHandler.SavannaIronGolemMax = config.getInt("IronGolem Savanna Max Group Size", category + " IronGolem", 5, 1, Integer.MAX_VALUE, "IronGolem Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampIronGolem = config.getBoolean("IronGolem Swamp", category + " IronGolem", false, "Enable IronGolem Swamp Spawns?");
        MobSpawnsHandler.SwampIronGolemWeight = config.getInt("IronGolem Swamp Weight", category + " IronGolem", 100, 1, Integer.MAX_VALUE, "IronGolem Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampIronGolemMin = config.getInt("IronGolem Swamp Min Group Size", category + " IronGolem", 1, 1, Integer.MAX_VALUE, "IronGolem Swamp Min Group Size!");
        MobSpawnsHandler.SwampIronGolemMax = config.getInt("IronGolem Swamp Max Group Size", category + " IronGolem", 5, 1, Integer.MAX_VALUE, "IronGolem Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaIronGolem = config.getBoolean("IronGolem Taiga", category + " IronGolem", false, "Enable IronGolem Taiga Spawns?");
        MobSpawnsHandler.TaigaIronGolemWeight = config.getInt("IronGolem Taiga Weight", category + " IronGolem", 100, 1, Integer.MAX_VALUE, "IronGolem Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaIronGolemMin = config.getInt("IronGolem Taiga Min Group Size", category + " IronGolem", 1, 1, Integer.MAX_VALUE, "IronGolem Taiga Min Group Size!");
        MobSpawnsHandler.TaigaIronGolemMax = config.getInt("IronGolem Taiga Max Group Size", category + " IronGolem", 5, 1, Integer.MAX_VALUE, "IronGolem Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndIronGolem = config.getBoolean("IronGolem End", category + " IronGolem", false, "Enable IronGolem End Spawns?");
        MobSpawnsHandler.EndIronGolemWeight = config.getInt("IronGolem End Weight", category + " IronGolem", 100, 1, Integer.MAX_VALUE, "IronGolem End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndIronGolemMin = config.getInt("IronGolem End Min Group Size", category + " IronGolem", 1, 1, Integer.MAX_VALUE, "IronGolem End Min Group Size!");
        MobSpawnsHandler.EndIronGolemMax = config.getInt("IronGolem End Max Group Size", category + " IronGolem", 5, 1, Integer.MAX_VALUE, "IronGolem End Max Group Size!");
        
        // MagmaCube
        config.addCustomCategoryComment(category + " MagmaCube", "true or false");
        // Beach Biome
        MobSpawnsHandler.MagmaCube = config.getBoolean("MagmaCube", category + " MagmaCube", false, "Enable custom MagmaCube Spawns?");
        MobSpawnsHandler.BeachMagmaCube = config.getBoolean("MagmaCube Beach", category + " MagmaCube", false, "Enable MagmaCube Beach Spawns?");
        MobSpawnsHandler.BeachMagmaCubeWeight = config.getInt("MagmaCube Beach Weight", category + " MagmaCube", 100, 1, Integer.MAX_VALUE, "MagmaCube Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachMagmaCubeMin = config.getInt("MagmaCube Beach Min Group Size", category + " MagmaCube", 1, 1, Integer.MAX_VALUE, "MagmaCube Beach Min Group Size!");
        MobSpawnsHandler.BeachMagmaCubeMax = config.getInt("MagmaCube Beach Max Group Size", category + " MagmaCube", 5, 1, Integer.MAX_VALUE, "MagmaCube Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherMagmaCube = config.getBoolean("MagmaCube Nether", category + " MagmaCube", false, "Enable MagmaCube Nether Spawns?");
        MobSpawnsHandler.NetherMagmaCubeWeight = config.getInt("MagmaCube Nether Weight", category + " MagmaCube", 100, 1, Integer.MAX_VALUE, "MagmaCube Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherMagmaCubeMin = config.getInt("MagmaCube Nether Min Group Size", category + " MagmaCube", 1, 1, Integer.MAX_VALUE, "MagmaCube Nether Min Group Size!");
        MobSpawnsHandler.NetherMagmaCubeMax = config.getInt("MagmaCube Nether Max Group Size", category + " MagmaCube", 5, 1, Integer.MAX_VALUE, "MagmaCube Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertMagmaCube = config.getBoolean("MagmaCube Desert", category + " MagmaCube", false, "Enable MagmaCube Desert Spawns?");
        MobSpawnsHandler.DesertMagmaCubeWeight = config.getInt("MagmaCube Desert Weight", category + " MagmaCube", 100, 1, Integer.MAX_VALUE, "MagmaCube Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertMagmaCubeMin = config.getInt("MagmaCube Desert Min Group Size", category + " MagmaCube", 1, 1, Integer.MAX_VALUE, "MagmaCube Desert Min Group Size!");
        MobSpawnsHandler.DesertMagmaCubeMax = config.getInt("MagmaCube Desert Max Group Size", category + " MagmaCube", 5, 1, Integer.MAX_VALUE, "MagmaCube Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremeMagmaCube = config.getBoolean("MagmaCube Extreme", category + " MagmaCube", false, "Enable MagmaCube Extreme Spawns?");
        MobSpawnsHandler.ExtremeMagmaCubeWeight = config.getInt("MagmaCube Extreme Weight", category + " MagmaCube", 100, 1, Integer.MAX_VALUE, "MagmaCube Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremeMagmaCubeMin = config.getInt("MagmaCube Extreme Min Group Size", category + " MagmaCube", 1, 1, Integer.MAX_VALUE, "MagmaCube Extreme Min Group Size!");
        MobSpawnsHandler.ExtremeMagmaCubeMax = config.getInt("MagmaCube Extreme Max Group Size", category + " MagmaCube", 5, 1, Integer.MAX_VALUE, "MagmaCube Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestMagmaCube = config.getBoolean("MagmaCube Forest", category + " MagmaCube", false, "Enable MagmaCube Forest Spawns?");
        MobSpawnsHandler.ForestMagmaCubeWeight = config.getInt("MagmaCube Forest Weight", category + " MagmaCube", 100, 1, Integer.MAX_VALUE, "MagmaCube Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestMagmaCubeMin = config.getInt("MagmaCube Forest Min Group Size", category + " MagmaCube", 1, 1, Integer.MAX_VALUE, "MagmaCube Forest Min Group Size!");
        MobSpawnsHandler.ForestMagmaCubeMax = config.getInt("MagmaCube Forest Max Group Size", category + " MagmaCube", 5, 1, Integer.MAX_VALUE, "MagmaCube Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JungleMagmaCube = config.getBoolean("MagmaCube Jungle", category + " MagmaCube", false, "Enable MagmaCube Jungle Spawns?");
        MobSpawnsHandler.JungleMagmaCubeWeight = config.getInt("MagmaCube Jungle Weight", category + " MagmaCube", 100, 1, Integer.MAX_VALUE, "MagmaCube Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JungleMagmaCubeMin = config.getInt("MagmaCube Jungle Min Group Size", category + " MagmaCube", 1, 1, Integer.MAX_VALUE, "MagmaCube Jungle Min Group Size!");
        MobSpawnsHandler.JungleMagmaCubeMax = config.getInt("MagmaCube Jungle Max Group Size", category + " MagmaCube", 5, 1, Integer.MAX_VALUE, "MagmaCube Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaMagmaCube = config.getBoolean("MagmaCube Mesa", category + " MagmaCube", false, "Enable MagmaCube Mesa Spawns?");
        MobSpawnsHandler.MesaMagmaCubeWeight = config.getInt("MagmaCube Mesa Weight", category + " MagmaCube", 100, 1, Integer.MAX_VALUE, "MagmaCube Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaMagmaCubeMin = config.getInt("MagmaCube Mesa Min Group Size", category + " MagmaCube", 1, 1, Integer.MAX_VALUE, "MagmaCube Mesa Min Group Size!");
        MobSpawnsHandler.MesaMagmaCubeMax = config.getInt("MagmaCube Mesa Max Group Size", category + " MagmaCube", 5, 1, Integer.MAX_VALUE, "MagmaCube Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsMagmaCube = config.getBoolean("MagmaCube Plains", category + " MagmaCube", false, "Enable MagmaCube Plains Spawns?");
        MobSpawnsHandler.PlainsMagmaCubeWeight = config.getInt("MagmaCube Plains Weight", category + " MagmaCube", 100, 1, Integer.MAX_VALUE, "MagmaCube Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsMagmaCubeMin = config.getInt("MagmaCube Plains Min Group Size", category + " MagmaCube", 1, 1, Integer.MAX_VALUE, "MagmaCube Plains Min Group Size!");
        MobSpawnsHandler.PlainsMagmaCubeMax = config.getInt("MagmaCube Plains Max Group Size", category + " MagmaCube", 5, 1, Integer.MAX_VALUE, "MagmaCube Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaMagmaCube = config.getBoolean("MagmaCube Savanna", category + " MagmaCube", false, "Enable MagmaCube Savanna Spawns?");
        MobSpawnsHandler.SavannaMagmaCubeWeight = config.getInt("MagmaCube Savanna Weight", category + " MagmaCube", 100, 1, Integer.MAX_VALUE, "MagmaCube Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaMagmaCubeMin = config.getInt("MagmaCube Savanna Min Group Size", category + " MagmaCube", 1, 1, Integer.MAX_VALUE, "MagmaCube Savanna Min Group Size!");
        MobSpawnsHandler.SavannaMagmaCubeMax = config.getInt("MagmaCube Savanna Max Group Size", category + " MagmaCube", 5, 1, Integer.MAX_VALUE, "MagmaCube Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampMagmaCube = config.getBoolean("MagmaCube Swamp", category + " MagmaCube", false, "Enable MagmaCube Swamp Spawns?");
        MobSpawnsHandler.SwampMagmaCubeWeight = config.getInt("MagmaCube Swamp Weight", category + " MagmaCube", 100, 1, Integer.MAX_VALUE, "MagmaCube Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampMagmaCubeMin = config.getInt("MagmaCube Swamp Min Group Size", category + " MagmaCube", 1, 1, Integer.MAX_VALUE, "MagmaCube Swamp Min Group Size!");
        MobSpawnsHandler.SwampMagmaCubeMax = config.getInt("MagmaCube Swamp Max Group Size", category + " MagmaCube", 5, 1, Integer.MAX_VALUE, "MagmaCube Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaMagmaCube = config.getBoolean("MagmaCube Taiga", category + " MagmaCube", false, "Enable MagmaCube Taiga Spawns?");
        MobSpawnsHandler.TaigaMagmaCubeWeight = config.getInt("MagmaCube Taiga Weight", category + " MagmaCube", 100, 1, Integer.MAX_VALUE, "MagmaCube Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaMagmaCubeMin = config.getInt("MagmaCube Taiga Min Group Size", category + " MagmaCube", 1, 1, Integer.MAX_VALUE, "MagmaCube Taiga Min Group Size!");
        MobSpawnsHandler.TaigaMagmaCubeMax = config.getInt("MagmaCube Taiga Max Group Size", category + " MagmaCube", 5, 1, Integer.MAX_VALUE, "MagmaCube Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndMagmaCube = config.getBoolean("MagmaCube End", category + " MagmaCube", false, "Enable MagmaCube End Spawns?");
        MobSpawnsHandler.EndMagmaCubeWeight = config.getInt("MagmaCube End Weight", category + " MagmaCube", 100, 1, Integer.MAX_VALUE, "MagmaCube End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndMagmaCubeMin = config.getInt("MagmaCube End Min Group Size", category + " MagmaCube", 1, 1, Integer.MAX_VALUE, "MagmaCube End Min Group Size!");
        MobSpawnsHandler.EndMagmaCubeMax = config.getInt("MagmaCube End Max Group Size", category + " MagmaCube", 5, 1, Integer.MAX_VALUE, "MagmaCube End Max Group Size!");
        
        // PigZombie
        config.addCustomCategoryComment(category + " PigZombie", "true or false");
        // Beach Biome
        MobSpawnsHandler.PigZombie = config.getBoolean("PigZombie", category + " PigZombie", false, "Enable custom PigZombie Spawns?");
        MobSpawnsHandler.BeachPigZombie = config.getBoolean("PigZombie Beach", category + " PigZombie", false, "Enable PigZombie Beach Spawns?");
        MobSpawnsHandler.BeachPigZombieWeight = config.getInt("PigZombie Beach Weight", category + " PigZombie", 100, 1, Integer.MAX_VALUE, "PigZombie Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachPigZombieMin = config.getInt("PigZombie Beach Min Group Size", category + " PigZombie", 1, 1, Integer.MAX_VALUE, "PigZombie Beach Min Group Size!");
        MobSpawnsHandler.BeachPigZombieMax = config.getInt("PigZombie Beach Max Group Size", category + " PigZombie", 5, 1, Integer.MAX_VALUE, "PigZombie Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherPigZombie = config.getBoolean("PigZombie Nether", category + " PigZombie", false, "Enable PigZombie Nether Spawns?");
        MobSpawnsHandler.NetherPigZombieWeight = config.getInt("PigZombie Nether Weight", category + " PigZombie", 100, 1, Integer.MAX_VALUE, "PigZombie Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherPigZombieMin = config.getInt("PigZombie Nether Min Group Size", category + " PigZombie", 1, 1, Integer.MAX_VALUE, "PigZombie Nether Min Group Size!");
        MobSpawnsHandler.NetherPigZombieMax = config.getInt("PigZombie Nether Max Group Size", category + " PigZombie", 5, 1, Integer.MAX_VALUE, "PigZombie Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertPigZombie = config.getBoolean("PigZombie Desert", category + " PigZombie", false, "Enable PigZombie Desert Spawns?");
        MobSpawnsHandler.DesertPigZombieWeight = config.getInt("PigZombie Desert Weight", category + " PigZombie", 100, 1, Integer.MAX_VALUE, "PigZombie Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertPigZombieMin = config.getInt("PigZombie Desert Min Group Size", category + " PigZombie", 1, 1, Integer.MAX_VALUE, "PigZombie Desert Min Group Size!");
        MobSpawnsHandler.DesertPigZombieMax = config.getInt("PigZombie Desert Max Group Size", category + " PigZombie", 5, 1, Integer.MAX_VALUE, "PigZombie Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremePigZombie = config.getBoolean("PigZombie Extreme", category + " PigZombie", false, "Enable PigZombie Extreme Spawns?");
        MobSpawnsHandler.ExtremePigZombieWeight = config.getInt("PigZombie Extreme Weight", category + " PigZombie", 100, 1, Integer.MAX_VALUE, "PigZombie Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremePigZombieMin = config.getInt("PigZombie Extreme Min Group Size", category + " PigZombie", 1, 1, Integer.MAX_VALUE, "PigZombie Extreme Min Group Size!");
        MobSpawnsHandler.ExtremePigZombieMax = config.getInt("PigZombie Extreme Max Group Size", category + " PigZombie", 5, 1, Integer.MAX_VALUE, "PigZombie Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestPigZombie = config.getBoolean("PigZombie Forest", category + " PigZombie", false, "Enable PigZombie Forest Spawns?");
        MobSpawnsHandler.ForestPigZombieWeight = config.getInt("PigZombie Forest Weight", category + " PigZombie", 100, 1, Integer.MAX_VALUE, "PigZombie Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestPigZombieMin = config.getInt("PigZombie Forest Min Group Size", category + " PigZombie", 1, 1, Integer.MAX_VALUE, "PigZombie Forest Min Group Size!");
        MobSpawnsHandler.ForestPigZombieMax = config.getInt("PigZombie Forest Max Group Size", category + " PigZombie", 5, 1, Integer.MAX_VALUE, "PigZombie Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JunglePigZombie = config.getBoolean("PigZombie Jungle", category + " PigZombie", false, "Enable PigZombie Jungle Spawns?");
        MobSpawnsHandler.JunglePigZombieWeight = config.getInt("PigZombie Jungle Weight", category + " PigZombie", 100, 1, Integer.MAX_VALUE, "PigZombie Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JunglePigZombieMin = config.getInt("PigZombie Jungle Min Group Size", category + " PigZombie", 1, 1, Integer.MAX_VALUE, "PigZombie Jungle Min Group Size!");
        MobSpawnsHandler.JunglePigZombieMax = config.getInt("PigZombie Jungle Max Group Size", category + " PigZombie", 5, 1, Integer.MAX_VALUE, "PigZombie Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaPigZombie = config.getBoolean("PigZombie Mesa", category + " PigZombie", false, "Enable PigZombie Mesa Spawns?");
        MobSpawnsHandler.MesaPigZombieWeight = config.getInt("PigZombie Mesa Weight", category + " PigZombie", 100, 1, Integer.MAX_VALUE, "PigZombie Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaPigZombieMin = config.getInt("PigZombie Mesa Min Group Size", category + " PigZombie", 1, 1, Integer.MAX_VALUE, "PigZombie Mesa Min Group Size!");
        MobSpawnsHandler.MesaPigZombieMax = config.getInt("PigZombie Mesa Max Group Size", category + " PigZombie", 5, 1, Integer.MAX_VALUE, "PigZombie Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsPigZombie = config.getBoolean("PigZombie Plains", category + " PigZombie", false, "Enable PigZombie Plains Spawns?");
        MobSpawnsHandler.PlainsPigZombieWeight = config.getInt("PigZombie Plains Weight", category + " PigZombie", 100, 1, Integer.MAX_VALUE, "PigZombie Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsPigZombieMin = config.getInt("PigZombie Plains Min Group Size", category + " PigZombie", 1, 1, Integer.MAX_VALUE, "PigZombie Plains Min Group Size!");
        MobSpawnsHandler.PlainsPigZombieMax = config.getInt("PigZombie Plains Max Group Size", category + " PigZombie", 5, 1, Integer.MAX_VALUE, "PigZombie Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaPigZombie = config.getBoolean("PigZombie Savanna", category + " PigZombie", false, "Enable PigZombie Savanna Spawns?");
        MobSpawnsHandler.SavannaPigZombieWeight = config.getInt("PigZombie Savanna Weight", category + " PigZombie", 100, 1, Integer.MAX_VALUE, "PigZombie Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaPigZombieMin = config.getInt("PigZombie Savanna Min Group Size", category + " PigZombie", 1, 1, Integer.MAX_VALUE, "PigZombie Savanna Min Group Size!");
        MobSpawnsHandler.SavannaPigZombieMax = config.getInt("PigZombie Savanna Max Group Size", category + " PigZombie", 5, 1, Integer.MAX_VALUE, "PigZombie Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampPigZombie = config.getBoolean("PigZombie Swamp", category + " PigZombie", false, "Enable PigZombie Swamp Spawns?");
        MobSpawnsHandler.SwampPigZombieWeight = config.getInt("PigZombie Swamp Weight", category + " PigZombie", 100, 1, Integer.MAX_VALUE, "PigZombie Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampPigZombieMin = config.getInt("PigZombie Swamp Min Group Size", category + " PigZombie", 1, 1, Integer.MAX_VALUE, "PigZombie Swamp Min Group Size!");
        MobSpawnsHandler.SwampPigZombieMax = config.getInt("PigZombie Swamp Max Group Size", category + " PigZombie", 5, 1, Integer.MAX_VALUE, "PigZombie Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaPigZombie = config.getBoolean("PigZombie Taiga", category + " PigZombie", false, "Enable PigZombie Taiga Spawns?");
        MobSpawnsHandler.TaigaPigZombieWeight = config.getInt("PigZombie Taiga Weight", category + " PigZombie", 100, 1, Integer.MAX_VALUE, "PigZombie Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaPigZombieMin = config.getInt("PigZombie Taiga Min Group Size", category + " PigZombie", 1, 1, Integer.MAX_VALUE, "PigZombie Taiga Min Group Size!");
        MobSpawnsHandler.TaigaPigZombieMax = config.getInt("PigZombie Taiga Max Group Size", category + " PigZombie", 5, 1, Integer.MAX_VALUE, "PigZombie Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndPigZombie = config.getBoolean("PigZombie End", category + " PigZombie", false, "Enable PigZombie End Spawns?");
        MobSpawnsHandler.EndPigZombieWeight = config.getInt("PigZombie End Weight", category + " PigZombie", 100, 1, Integer.MAX_VALUE, "PigZombie End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndPigZombieMin = config.getInt("PigZombie End Min Group Size", category + " PigZombie", 1, 1, Integer.MAX_VALUE, "PigZombie End Min Group Size!");
        MobSpawnsHandler.EndPigZombieMax = config.getInt("PigZombie End Max Group Size", category + " PigZombie", 5, 1, Integer.MAX_VALUE, "PigZombie End Max Group Size!");
        
        // PolarBear
        config.addCustomCategoryComment(category + " PolarBear", "true or false");
        // Beach Biome
        MobSpawnsHandler.PolarBear = config.getBoolean("PolarBear", category + " PolarBear", false, "Enable custom PolarBear Spawns?");
        MobSpawnsHandler.BeachPolarBear = config.getBoolean("PolarBear Beach", category + " PolarBear", false, "Enable PolarBear Beach Spawns?");
        MobSpawnsHandler.BeachPolarBearWeight = config.getInt("PolarBear Beach Weight", category + " PolarBear", 100, 1, Integer.MAX_VALUE, "PolarBear Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachPolarBearMin = config.getInt("PolarBear Beach Min Group Size", category + " PolarBear", 1, 1, Integer.MAX_VALUE, "PolarBear Beach Min Group Size!");
        MobSpawnsHandler.BeachPolarBearMax = config.getInt("PolarBear Beach Max Group Size", category + " PolarBear", 5, 1, Integer.MAX_VALUE, "PolarBear Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherPolarBear = config.getBoolean("PolarBear Nether", category + " PolarBear", false, "Enable PolarBear Nether Spawns?");
        MobSpawnsHandler.NetherPolarBearWeight = config.getInt("PolarBear Nether Weight", category + " PolarBear", 100, 1, Integer.MAX_VALUE, "PolarBear Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherPolarBearMin = config.getInt("PolarBear Nether Min Group Size", category + " PolarBear", 1, 1, Integer.MAX_VALUE, "PolarBear Nether Min Group Size!");
        MobSpawnsHandler.NetherPolarBearMax = config.getInt("PolarBear Nether Max Group Size", category + " PolarBear", 5, 1, Integer.MAX_VALUE, "PolarBear Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertPolarBear = config.getBoolean("PolarBear Desert", category + " PolarBear", false, "Enable PolarBear Desert Spawns?");
        MobSpawnsHandler.DesertPolarBearWeight = config.getInt("PolarBear Desert Weight", category + " PolarBear", 100, 1, Integer.MAX_VALUE, "PolarBear Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertPolarBearMin = config.getInt("PolarBear Desert Min Group Size", category + " PolarBear", 1, 1, Integer.MAX_VALUE, "PolarBear Desert Min Group Size!");
        MobSpawnsHandler.DesertPolarBearMax = config.getInt("PolarBear Desert Max Group Size", category + " PolarBear", 5, 1, Integer.MAX_VALUE, "PolarBear Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremePolarBear = config.getBoolean("PolarBear Extreme", category + " PolarBear", false, "Enable PolarBear Extreme Spawns?");
        MobSpawnsHandler.ExtremePolarBearWeight = config.getInt("PolarBear Extreme Weight", category + " PolarBear", 100, 1, Integer.MAX_VALUE, "PolarBear Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremePolarBearMin = config.getInt("PolarBear Extreme Min Group Size", category + " PolarBear", 1, 1, Integer.MAX_VALUE, "PolarBear Extreme Min Group Size!");
        MobSpawnsHandler.ExtremePolarBearMax = config.getInt("PolarBear Extreme Max Group Size", category + " PolarBear", 5, 1, Integer.MAX_VALUE, "PolarBear Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestPolarBear = config.getBoolean("PolarBear Forest", category + " PolarBear", false, "Enable PolarBear Forest Spawns?");
        MobSpawnsHandler.ForestPolarBearWeight = config.getInt("PolarBear Forest Weight", category + " PolarBear", 100, 1, Integer.MAX_VALUE, "PolarBear Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestPolarBearMin = config.getInt("PolarBear Forest Min Group Size", category + " PolarBear", 1, 1, Integer.MAX_VALUE, "PolarBear Forest Min Group Size!");
        MobSpawnsHandler.ForestPolarBearMax = config.getInt("PolarBear Forest Max Group Size", category + " PolarBear", 5, 1, Integer.MAX_VALUE, "PolarBear Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JunglePolarBear = config.getBoolean("PolarBear Jungle", category + " PolarBear", false, "Enable PolarBear Jungle Spawns?");
        MobSpawnsHandler.JunglePolarBearWeight = config.getInt("PolarBear Jungle Weight", category + " PolarBear", 100, 1, Integer.MAX_VALUE, "PolarBear Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JunglePolarBearMin = config.getInt("PolarBear Jungle Min Group Size", category + " PolarBear", 1, 1, Integer.MAX_VALUE, "PolarBear Jungle Min Group Size!");
        MobSpawnsHandler.JunglePolarBearMax = config.getInt("PolarBear Jungle Max Group Size", category + " PolarBear", 5, 1, Integer.MAX_VALUE, "PolarBear Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaPolarBear = config.getBoolean("PolarBear Mesa", category + " PolarBear", false, "Enable PolarBear Mesa Spawns?");
        MobSpawnsHandler.MesaPolarBearWeight = config.getInt("PolarBear Mesa Weight", category + " PolarBear", 100, 1, Integer.MAX_VALUE, "PolarBear Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaPolarBearMin = config.getInt("PolarBear Mesa Min Group Size", category + " PolarBear", 1, 1, Integer.MAX_VALUE, "PolarBear Mesa Min Group Size!");
        MobSpawnsHandler.MesaPolarBearMax = config.getInt("PolarBear Mesa Max Group Size", category + " PolarBear", 5, 1, Integer.MAX_VALUE, "PolarBear Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsPolarBear = config.getBoolean("PolarBear Plains", category + " PolarBear", false, "Enable PolarBear Plains Spawns?");
        MobSpawnsHandler.PlainsPolarBearWeight = config.getInt("PolarBear Plains Weight", category + " PolarBear", 100, 1, Integer.MAX_VALUE, "PolarBear Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsPolarBearMin = config.getInt("PolarBear Plains Min Group Size", category + " PolarBear", 1, 1, Integer.MAX_VALUE, "PolarBear Plains Min Group Size!");
        MobSpawnsHandler.PlainsPolarBearMax = config.getInt("PolarBear Plains Max Group Size", category + " PolarBear", 5, 1, Integer.MAX_VALUE, "PolarBear Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaPolarBear = config.getBoolean("PolarBear Savanna", category + " PolarBear", false, "Enable PolarBear Savanna Spawns?");
        MobSpawnsHandler.SavannaPolarBearWeight = config.getInt("PolarBear Savanna Weight", category + " PolarBear", 100, 1, Integer.MAX_VALUE, "PolarBear Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaPolarBearMin = config.getInt("PolarBear Savanna Min Group Size", category + " PolarBear", 1, 1, Integer.MAX_VALUE, "PolarBear Savanna Min Group Size!");
        MobSpawnsHandler.SavannaPolarBearMax = config.getInt("PolarBear Savanna Max Group Size", category + " PolarBear", 5, 1, Integer.MAX_VALUE, "PolarBear Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampPolarBear = config.getBoolean("PolarBear Swamp", category + " PolarBear", false, "Enable PolarBear Swamp Spawns?");
        MobSpawnsHandler.SwampPolarBearWeight = config.getInt("PolarBear Swamp Weight", category + " PolarBear", 100, 1, Integer.MAX_VALUE, "PolarBear Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampPolarBearMin = config.getInt("PolarBear Swamp Min Group Size", category + " PolarBear", 1, 1, Integer.MAX_VALUE, "PolarBear Swamp Min Group Size!");
        MobSpawnsHandler.SwampPolarBearMax = config.getInt("PolarBear Swamp Max Group Size", category + " PolarBear", 5, 1, Integer.MAX_VALUE, "PolarBear Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaPolarBear = config.getBoolean("PolarBear Taiga", category + " PolarBear", false, "Enable PolarBear Taiga Spawns?");
        MobSpawnsHandler.TaigaPolarBearWeight = config.getInt("PolarBear Taiga Weight", category + " PolarBear", 100, 1, Integer.MAX_VALUE, "PolarBear Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaPolarBearMin = config.getInt("PolarBear Taiga Min Group Size", category + " PolarBear", 1, 1, Integer.MAX_VALUE, "PolarBear Taiga Min Group Size!");
        MobSpawnsHandler.TaigaPolarBearMax = config.getInt("PolarBear Taiga Max Group Size", category + " PolarBear", 5, 1, Integer.MAX_VALUE, "PolarBear Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndPolarBear = config.getBoolean("PolarBear End", category + " PolarBear", false, "Enable PolarBear End Spawns?");
        MobSpawnsHandler.EndPolarBearWeight = config.getInt("PolarBear End Weight", category + " PolarBear", 100, 1, Integer.MAX_VALUE, "PolarBear End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndPolarBearMin = config.getInt("PolarBear End Min Group Size", category + " PolarBear", 1, 1, Integer.MAX_VALUE, "PolarBear End Min Group Size!");
        MobSpawnsHandler.EndPolarBearMax = config.getInt("PolarBear End Max Group Size", category + " PolarBear", 5, 1, Integer.MAX_VALUE, "PolarBear End Max Group Size!");
        
        // Shulker
        config.addCustomCategoryComment(category + " Shulker", "true or false");
        // Beach Biome
        MobSpawnsHandler.Shulker = config.getBoolean("Shulker", category + " Shulker", false, "Enable custom Shulker Spawns?");
        MobSpawnsHandler.BeachShulker = config.getBoolean("Shulker Beach", category + " Shulker", false, "Enable Shulker Beach Spawns?");
        MobSpawnsHandler.BeachShulkerWeight = config.getInt("Shulker Beach Weight", category + " Shulker", 100, 1, Integer.MAX_VALUE, "Shulker Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachShulkerMin = config.getInt("Shulker Beach Min Group Size", category + " Shulker", 1, 1, Integer.MAX_VALUE, "Shulker Beach Min Group Size!");
        MobSpawnsHandler.BeachShulkerMax = config.getInt("Shulker Beach Max Group Size", category + " Shulker", 5, 1, Integer.MAX_VALUE, "Shulker Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherShulker = config.getBoolean("Shulker Nether", category + " Shulker", false, "Enable Shulker Nether Spawns?");
        MobSpawnsHandler.NetherShulkerWeight = config.getInt("Shulker Nether Weight", category + " Shulker", 100, 1, Integer.MAX_VALUE, "Shulker Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherShulkerMin = config.getInt("Shulker Nether Min Group Size", category + " Shulker", 1, 1, Integer.MAX_VALUE, "Shulker Nether Min Group Size!");
        MobSpawnsHandler.NetherShulkerMax = config.getInt("Shulker Nether Max Group Size", category + " Shulker", 5, 1, Integer.MAX_VALUE, "Shulker Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertShulker = config.getBoolean("Shulker Desert", category + " Shulker", false, "Enable Shulker Desert Spawns?");
        MobSpawnsHandler.DesertShulkerWeight = config.getInt("Shulker Desert Weight", category + " Shulker", 100, 1, Integer.MAX_VALUE, "Shulker Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertShulkerMin = config.getInt("Shulker Desert Min Group Size", category + " Shulker", 1, 1, Integer.MAX_VALUE, "Shulker Desert Min Group Size!");
        MobSpawnsHandler.DesertShulkerMax = config.getInt("Shulker Desert Max Group Size", category + " Shulker", 5, 1, Integer.MAX_VALUE, "Shulker Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremeShulker = config.getBoolean("Shulker Extreme", category + " Shulker", false, "Enable Shulker Extreme Spawns?");
        MobSpawnsHandler.ExtremeShulkerWeight = config.getInt("Shulker Extreme Weight", category + " Shulker", 100, 1, Integer.MAX_VALUE, "Shulker Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremeShulkerMin = config.getInt("Shulker Extreme Min Group Size", category + " Shulker", 1, 1, Integer.MAX_VALUE, "Shulker Extreme Min Group Size!");
        MobSpawnsHandler.ExtremeShulkerMax = config.getInt("Shulker Extreme Max Group Size", category + " Shulker", 5, 1, Integer.MAX_VALUE, "Shulker Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestShulker = config.getBoolean("Shulker Forest", category + " Shulker", false, "Enable Shulker Forest Spawns?");
        MobSpawnsHandler.ForestShulkerWeight = config.getInt("Shulker Forest Weight", category + " Shulker", 100, 1, Integer.MAX_VALUE, "Shulker Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestShulkerMin = config.getInt("Shulker Forest Min Group Size", category + " Shulker", 1, 1, Integer.MAX_VALUE, "Shulker Forest Min Group Size!");
        MobSpawnsHandler.ForestShulkerMax = config.getInt("Shulker Forest Max Group Size", category + " Shulker", 5, 1, Integer.MAX_VALUE, "Shulker Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JungleShulker = config.getBoolean("Shulker Jungle", category + " Shulker", false, "Enable Shulker Jungle Spawns?");
        MobSpawnsHandler.JungleShulkerWeight = config.getInt("Shulker Jungle Weight", category + " Shulker", 100, 1, Integer.MAX_VALUE, "Shulker Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JungleShulkerMin = config.getInt("Shulker Jungle Min Group Size", category + " Shulker", 1, 1, Integer.MAX_VALUE, "Shulker Jungle Min Group Size!");
        MobSpawnsHandler.JungleShulkerMax = config.getInt("Shulker Jungle Max Group Size", category + " Shulker", 5, 1, Integer.MAX_VALUE, "Shulker Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaShulker = config.getBoolean("Shulker Mesa", category + " Shulker", false, "Enable Shulker Mesa Spawns?");
        MobSpawnsHandler.MesaShulkerWeight = config.getInt("Shulker Mesa Weight", category + " Shulker", 100, 1, Integer.MAX_VALUE, "Shulker Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaShulkerMin = config.getInt("Shulker Mesa Min Group Size", category + " Shulker", 1, 1, Integer.MAX_VALUE, "Shulker Mesa Min Group Size!");
        MobSpawnsHandler.MesaShulkerMax = config.getInt("Shulker Mesa Max Group Size", category + " Shulker", 5, 1, Integer.MAX_VALUE, "Shulker Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsShulker = config.getBoolean("Shulker Plains", category + " Shulker", false, "Enable Shulker Plains Spawns?");
        MobSpawnsHandler.PlainsShulkerWeight = config.getInt("Shulker Plains Weight", category + " Shulker", 100, 1, Integer.MAX_VALUE, "Shulker Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsShulkerMin = config.getInt("Shulker Plains Min Group Size", category + " Shulker", 1, 1, Integer.MAX_VALUE, "Shulker Plains Min Group Size!");
        MobSpawnsHandler.PlainsShulkerMax = config.getInt("Shulker Plains Max Group Size", category + " Shulker", 5, 1, Integer.MAX_VALUE, "Shulker Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaShulker = config.getBoolean("Shulker Savanna", category + " Shulker", false, "Enable Shulker Savanna Spawns?");
        MobSpawnsHandler.SavannaShulkerWeight = config.getInt("Shulker Savanna Weight", category + " Shulker", 100, 1, Integer.MAX_VALUE, "Shulker Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaShulkerMin = config.getInt("Shulker Savanna Min Group Size", category + " Shulker", 1, 1, Integer.MAX_VALUE, "Shulker Savanna Min Group Size!");
        MobSpawnsHandler.SavannaShulkerMax = config.getInt("Shulker Savanna Max Group Size", category + " Shulker", 5, 1, Integer.MAX_VALUE, "Shulker Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampShulker = config.getBoolean("Shulker Swamp", category + " Shulker", false, "Enable Shulker Swamp Spawns?");
        MobSpawnsHandler.SwampShulkerWeight = config.getInt("Shulker Swamp Weight", category + " Shulker", 100, 1, Integer.MAX_VALUE, "Shulker Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampShulkerMin = config.getInt("Shulker Swamp Min Group Size", category + " Shulker", 1, 1, Integer.MAX_VALUE, "Shulker Swamp Min Group Size!");
        MobSpawnsHandler.SwampShulkerMax = config.getInt("Shulker Swamp Max Group Size", category + " Shulker", 5, 1, Integer.MAX_VALUE, "Shulker Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaShulker = config.getBoolean("Shulker Taiga", category + " Shulker", false, "Enable Shulker Taiga Spawns?");
        MobSpawnsHandler.TaigaShulkerWeight = config.getInt("Shulker Taiga Weight", category + " Shulker", 100, 1, Integer.MAX_VALUE, "Shulker Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaShulkerMin = config.getInt("Shulker Taiga Min Group Size", category + " Shulker", 1, 1, Integer.MAX_VALUE, "Shulker Taiga Min Group Size!");
        MobSpawnsHandler.TaigaShulkerMax = config.getInt("Shulker Taiga Max Group Size", category + " Shulker", 5, 1, Integer.MAX_VALUE, "Shulker Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndShulker = config.getBoolean("Shulker End", category + " Shulker", false, "Enable Shulker End Spawns?");
        MobSpawnsHandler.EndShulkerWeight = config.getInt("Shulker End Weight", category + " Shulker", 100, 1, Integer.MAX_VALUE, "Shulker End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndShulkerMin = config.getInt("Shulker End Min Group Size", category + " Shulker", 1, 1, Integer.MAX_VALUE, "Shulker End Min Group Size!");
        MobSpawnsHandler.EndShulkerMax = config.getInt("Shulker End Max Group Size", category + " Shulker", 5, 1, Integer.MAX_VALUE, "Shulker End Max Group Size!");
        
        // Silverfish
        config.addCustomCategoryComment(category + " Silverfish", "true or false");
        // Beach Biome
        MobSpawnsHandler.Silverfish = config.getBoolean("Silverfish", category + " Silverfish", false, "Enable custom Silverfish Spawns?");
        MobSpawnsHandler.BeachSilverfish = config.getBoolean("Silverfish Beach", category + " Silverfish", false, "Enable Silverfish Beach Spawns?");
        MobSpawnsHandler.BeachSilverfishWeight = config.getInt("Silverfish Beach Weight", category + " Silverfish", 100, 1, Integer.MAX_VALUE, "Silverfish Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachSilverfishMin = config.getInt("Silverfish Beach Min Group Size", category + " Silverfish", 1, 1, Integer.MAX_VALUE, "Silverfish Beach Min Group Size!");
        MobSpawnsHandler.BeachSilverfishMax = config.getInt("Silverfish Beach Max Group Size", category + " Silverfish", 5, 1, Integer.MAX_VALUE, "Silverfish Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherSilverfish = config.getBoolean("Silverfish Nether", category + " Silverfish", false, "Enable Silverfish Nether Spawns?");
        MobSpawnsHandler.NetherSilverfishWeight = config.getInt("Silverfish Nether Weight", category + " Silverfish", 100, 1, Integer.MAX_VALUE, "Silverfish Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherSilverfishMin = config.getInt("Silverfish Nether Min Group Size", category + " Silverfish", 1, 1, Integer.MAX_VALUE, "Silverfish Nether Min Group Size!");
        MobSpawnsHandler.NetherSilverfishMax = config.getInt("Silverfish Nether Max Group Size", category + " Silverfish", 5, 1, Integer.MAX_VALUE, "Silverfish Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertSilverfish = config.getBoolean("Silverfish Desert", category + " Silverfish", false, "Enable Silverfish Desert Spawns?");
        MobSpawnsHandler.DesertSilverfishWeight = config.getInt("Silverfish Desert Weight", category + " Silverfish", 100, 1, Integer.MAX_VALUE, "Silverfish Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertSilverfishMin = config.getInt("Silverfish Desert Min Group Size", category + " Silverfish", 1, 1, Integer.MAX_VALUE, "Silverfish Desert Min Group Size!");
        MobSpawnsHandler.DesertSilverfishMax = config.getInt("Silverfish Desert Max Group Size", category + " Silverfish", 5, 1, Integer.MAX_VALUE, "Silverfish Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremeSilverfish = config.getBoolean("Silverfish Extreme", category + " Silverfish", false, "Enable Silverfish Extreme Spawns?");
        MobSpawnsHandler.ExtremeSilverfishWeight = config.getInt("Silverfish Extreme Weight", category + " Silverfish", 100, 1, Integer.MAX_VALUE, "Silverfish Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremeSilverfishMin = config.getInt("Silverfish Extreme Min Group Size", category + " Silverfish", 1, 1, Integer.MAX_VALUE, "Silverfish Extreme Min Group Size!");
        MobSpawnsHandler.ExtremeSilverfishMax = config.getInt("Silverfish Extreme Max Group Size", category + " Silverfish", 5, 1, Integer.MAX_VALUE, "Silverfish Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestSilverfish = config.getBoolean("Silverfish Forest", category + " Silverfish", false, "Enable Silverfish Forest Spawns?");
        MobSpawnsHandler.ForestSilverfishWeight = config.getInt("Silverfish Forest Weight", category + " Silverfish", 100, 1, Integer.MAX_VALUE, "Silverfish Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestSilverfishMin = config.getInt("Silverfish Forest Min Group Size", category + " Silverfish", 1, 1, Integer.MAX_VALUE, "Silverfish Forest Min Group Size!");
        MobSpawnsHandler.ForestSilverfishMax = config.getInt("Silverfish Forest Max Group Size", category + " Silverfish", 5, 1, Integer.MAX_VALUE, "Silverfish Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JungleSilverfish = config.getBoolean("Silverfish Jungle", category + " Silverfish", false, "Enable Silverfish Jungle Spawns?");
        MobSpawnsHandler.JungleSilverfishWeight = config.getInt("Silverfish Jungle Weight", category + " Silverfish", 100, 1, Integer.MAX_VALUE, "Silverfish Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JungleSilverfishMin = config.getInt("Silverfish Jungle Min Group Size", category + " Silverfish", 1, 1, Integer.MAX_VALUE, "Silverfish Jungle Min Group Size!");
        MobSpawnsHandler.JungleSilverfishMax = config.getInt("Silverfish Jungle Max Group Size", category + " Silverfish", 5, 1, Integer.MAX_VALUE, "Silverfish Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaSilverfish = config.getBoolean("Silverfish Mesa", category + " Silverfish", false, "Enable Silverfish Mesa Spawns?");
        MobSpawnsHandler.MesaSilverfishWeight = config.getInt("Silverfish Mesa Weight", category + " Silverfish", 100, 1, Integer.MAX_VALUE, "Silverfish Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaSilverfishMin = config.getInt("Silverfish Mesa Min Group Size", category + " Silverfish", 1, 1, Integer.MAX_VALUE, "Silverfish Mesa Min Group Size!");
        MobSpawnsHandler.MesaSilverfishMax = config.getInt("Silverfish Mesa Max Group Size", category + " Silverfish", 5, 1, Integer.MAX_VALUE, "Silverfish Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsSilverfish = config.getBoolean("Silverfish Plains", category + " Silverfish", false, "Enable Silverfish Plains Spawns?");
        MobSpawnsHandler.PlainsSilverfishWeight = config.getInt("Silverfish Plains Weight", category + " Silverfish", 100, 1, Integer.MAX_VALUE, "Silverfish Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsSilverfishMin = config.getInt("Silverfish Plains Min Group Size", category + " Silverfish", 1, 1, Integer.MAX_VALUE, "Silverfish Plains Min Group Size!");
        MobSpawnsHandler.PlainsSilverfishMax = config.getInt("Silverfish Plains Max Group Size", category + " Silverfish", 5, 1, Integer.MAX_VALUE, "Silverfish Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaSilverfish = config.getBoolean("Silverfish Savanna", category + " Silverfish", false, "Enable Silverfish Savanna Spawns?");
        MobSpawnsHandler.SavannaSilverfishWeight = config.getInt("Silverfish Savanna Weight", category + " Silverfish", 100, 1, Integer.MAX_VALUE, "Silverfish Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaSilverfishMin = config.getInt("Silverfish Savanna Min Group Size", category + " Silverfish", 1, 1, Integer.MAX_VALUE, "Silverfish Savanna Min Group Size!");
        MobSpawnsHandler.SavannaSilverfishMax = config.getInt("Silverfish Savanna Max Group Size", category + " Silverfish", 5, 1, Integer.MAX_VALUE, "Silverfish Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampSilverfish = config.getBoolean("Silverfish Swamp", category + " Silverfish", false, "Enable Silverfish Swamp Spawns?");
        MobSpawnsHandler.SwampSilverfishWeight = config.getInt("Silverfish Swamp Weight", category + " Silverfish", 100, 1, Integer.MAX_VALUE, "Silverfish Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampSilverfishMin = config.getInt("Silverfish Swamp Min Group Size", category + " Silverfish", 1, 1, Integer.MAX_VALUE, "Silverfish Swamp Min Group Size!");
        MobSpawnsHandler.SwampSilverfishMax = config.getInt("Silverfish Swamp Max Group Size", category + " Silverfish", 5, 1, Integer.MAX_VALUE, "Silverfish Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaSilverfish = config.getBoolean("Silverfish Taiga", category + " Silverfish", false, "Enable Silverfish Taiga Spawns?");
        MobSpawnsHandler.TaigaSilverfishWeight = config.getInt("Silverfish Taiga Weight", category + " Silverfish", 100, 1, Integer.MAX_VALUE, "Silverfish Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaSilverfishMin = config.getInt("Silverfish Taiga Min Group Size", category + " Silverfish", 1, 1, Integer.MAX_VALUE, "Silverfish Taiga Min Group Size!");
        MobSpawnsHandler.TaigaSilverfishMax = config.getInt("Silverfish Taiga Max Group Size", category + " Silverfish", 5, 1, Integer.MAX_VALUE, "Silverfish Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndSilverfish = config.getBoolean("Silverfish End", category + " Silverfish", false, "Enable Silverfish End Spawns?");
        MobSpawnsHandler.EndSilverfishWeight = config.getInt("Silverfish End Weight", category + " Silverfish", 100, 1, Integer.MAX_VALUE, "Silverfish End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndSilverfishMin = config.getInt("Silverfish End Min Group Size", category + " Silverfish", 1, 1, Integer.MAX_VALUE, "Silverfish End Min Group Size!");
        MobSpawnsHandler.EndSilverfishMax = config.getInt("Silverfish End Max Group Size", category + " Silverfish", 5, 1, Integer.MAX_VALUE, "Silverfish End Max Group Size!");
        
        // Skeleton
        config.addCustomCategoryComment(category + " Skeleton", "true or false");
        // Beach Biome
        MobSpawnsHandler.Skeleton = config.getBoolean("Skeleton", category + " Skeleton", false, "Enable custom Skeleton Spawns?");
        MobSpawnsHandler.BeachSkeleton = config.getBoolean("Skeleton Beach", category + " Skeleton", false, "Enable Skeleton Beach Spawns?");
        MobSpawnsHandler.BeachSkeletonWeight = config.getInt("Skeleton Beach Weight", category + " Skeleton", 100, 1, Integer.MAX_VALUE, "Skeleton Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachSkeletonMin = config.getInt("Skeleton Beach Min Group Size", category + " Skeleton", 1, 1, Integer.MAX_VALUE, "Skeleton Beach Min Group Size!");
        MobSpawnsHandler.BeachSkeletonMax = config.getInt("Skeleton Beach Max Group Size", category + " Skeleton", 5, 1, Integer.MAX_VALUE, "Skeleton Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherSkeleton = config.getBoolean("Skeleton Nether", category + " Skeleton", false, "Enable Skeleton Nether Spawns?");
        MobSpawnsHandler.NetherSkeletonWeight = config.getInt("Skeleton Nether Weight", category + " Skeleton", 100, 1, Integer.MAX_VALUE, "Skeleton Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherSkeletonMin = config.getInt("Skeleton Nether Min Group Size", category + " Skeleton", 1, 1, Integer.MAX_VALUE, "Skeleton Nether Min Group Size!");
        MobSpawnsHandler.NetherSkeletonMax = config.getInt("Skeleton Nether Max Group Size", category + " Skeleton", 5, 1, Integer.MAX_VALUE, "Skeleton Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertSkeleton = config.getBoolean("Skeleton Desert", category + " Skeleton", false, "Enable Skeleton Desert Spawns?");
        MobSpawnsHandler.DesertSkeletonWeight = config.getInt("Skeleton Desert Weight", category + " Skeleton", 100, 1, Integer.MAX_VALUE, "Skeleton Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertSkeletonMin = config.getInt("Skeleton Desert Min Group Size", category + " Skeleton", 1, 1, Integer.MAX_VALUE, "Skeleton Desert Min Group Size!");
        MobSpawnsHandler.DesertSkeletonMax = config.getInt("Skeleton Desert Max Group Size", category + " Skeleton", 5, 1, Integer.MAX_VALUE, "Skeleton Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremeSkeleton = config.getBoolean("Skeleton Extreme", category + " Skeleton", false, "Enable Skeleton Extreme Spawns?");
        MobSpawnsHandler.ExtremeSkeletonWeight = config.getInt("Skeleton Extreme Weight", category + " Skeleton", 100, 1, Integer.MAX_VALUE, "Skeleton Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremeSkeletonMin = config.getInt("Skeleton Extreme Min Group Size", category + " Skeleton", 1, 1, Integer.MAX_VALUE, "Skeleton Extreme Min Group Size!");
        MobSpawnsHandler.ExtremeSkeletonMax = config.getInt("Skeleton Extreme Max Group Size", category + " Skeleton", 5, 1, Integer.MAX_VALUE, "Skeleton Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestSkeleton = config.getBoolean("Skeleton Forest", category + " Skeleton", false, "Enable Skeleton Forest Spawns?");
        MobSpawnsHandler.ForestSkeletonWeight = config.getInt("Skeleton Forest Weight", category + " Skeleton", 100, 1, Integer.MAX_VALUE, "Skeleton Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestSkeletonMin = config.getInt("Skeleton Forest Min Group Size", category + " Skeleton", 1, 1, Integer.MAX_VALUE, "Skeleton Forest Min Group Size!");
        MobSpawnsHandler.ForestSkeletonMax = config.getInt("Skeleton Forest Max Group Size", category + " Skeleton", 5, 1, Integer.MAX_VALUE, "Skeleton Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JungleSkeleton = config.getBoolean("Skeleton Jungle", category + " Skeleton", false, "Enable Skeleton Jungle Spawns?");
        MobSpawnsHandler.JungleSkeletonWeight = config.getInt("Skeleton Jungle Weight", category + " Skeleton", 100, 1, Integer.MAX_VALUE, "Skeleton Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JungleSkeletonMin = config.getInt("Skeleton Jungle Min Group Size", category + " Skeleton", 1, 1, Integer.MAX_VALUE, "Skeleton Jungle Min Group Size!");
        MobSpawnsHandler.JungleSkeletonMax = config.getInt("Skeleton Jungle Max Group Size", category + " Skeleton", 5, 1, Integer.MAX_VALUE, "Skeleton Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaSkeleton = config.getBoolean("Skeleton Mesa", category + " Skeleton", false, "Enable Skeleton Mesa Spawns?");
        MobSpawnsHandler.MesaSkeletonWeight = config.getInt("Skeleton Mesa Weight", category + " Skeleton", 100, 1, Integer.MAX_VALUE, "Skeleton Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaSkeletonMin = config.getInt("Skeleton Mesa Min Group Size", category + " Skeleton", 1, 1, Integer.MAX_VALUE, "Skeleton Mesa Min Group Size!");
        MobSpawnsHandler.MesaSkeletonMax = config.getInt("Skeleton Mesa Max Group Size", category + " Skeleton", 5, 1, Integer.MAX_VALUE, "Skeleton Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsSkeleton = config.getBoolean("Skeleton Plains", category + " Skeleton", false, "Enable Skeleton Plains Spawns?");
        MobSpawnsHandler.PlainsSkeletonWeight = config.getInt("Skeleton Plains Weight", category + " Skeleton", 100, 1, Integer.MAX_VALUE, "Skeleton Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsSkeletonMin = config.getInt("Skeleton Plains Min Group Size", category + " Skeleton", 1, 1, Integer.MAX_VALUE, "Skeleton Plains Min Group Size!");
        MobSpawnsHandler.PlainsSkeletonMax = config.getInt("Skeleton Plains Max Group Size", category + " Skeleton", 5, 1, Integer.MAX_VALUE, "Skeleton Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaSkeleton = config.getBoolean("Skeleton Savanna", category + " Skeleton", false, "Enable Skeleton Savanna Spawns?");
        MobSpawnsHandler.SavannaSkeletonWeight = config.getInt("Skeleton Savanna Weight", category + " Skeleton", 100, 1, Integer.MAX_VALUE, "Skeleton Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaSkeletonMin = config.getInt("Skeleton Savanna Min Group Size", category + " Skeleton", 1, 1, Integer.MAX_VALUE, "Skeleton Savanna Min Group Size!");
        MobSpawnsHandler.SavannaSkeletonMax = config.getInt("Skeleton Savanna Max Group Size", category + " Skeleton", 5, 1, Integer.MAX_VALUE, "Skeleton Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampSkeleton = config.getBoolean("Skeleton Swamp", category + " Skeleton", false, "Enable Skeleton Swamp Spawns?");
        MobSpawnsHandler.SwampSkeletonWeight = config.getInt("Skeleton Swamp Weight", category + " Skeleton", 100, 1, Integer.MAX_VALUE, "Skeleton Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampSkeletonMin = config.getInt("Skeleton Swamp Min Group Size", category + " Skeleton", 1, 1, Integer.MAX_VALUE, "Skeleton Swamp Min Group Size!");
        MobSpawnsHandler.SwampSkeletonMax = config.getInt("Skeleton Swamp Max Group Size", category + " Skeleton", 5, 1, Integer.MAX_VALUE, "Skeleton Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaSkeleton = config.getBoolean("Skeleton Taiga", category + " Skeleton", false, "Enable Skeleton Taiga Spawns?");
        MobSpawnsHandler.TaigaSkeletonWeight = config.getInt("Skeleton Taiga Weight", category + " Skeleton", 100, 1, Integer.MAX_VALUE, "Skeleton Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaSkeletonMin = config.getInt("Skeleton Taiga Min Group Size", category + " Skeleton", 1, 1, Integer.MAX_VALUE, "Skeleton Taiga Min Group Size!");
        MobSpawnsHandler.TaigaSkeletonMax = config.getInt("Skeleton Taiga Max Group Size", category + " Skeleton", 5, 1, Integer.MAX_VALUE, "Skeleton Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndSkeleton = config.getBoolean("Skeleton End", category + " Skeleton", false, "Enable Skeleton End Spawns?");
        MobSpawnsHandler.EndSkeletonWeight = config.getInt("Skeleton End Weight", category + " Skeleton", 100, 1, Integer.MAX_VALUE, "Skeleton End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndSkeletonMin = config.getInt("Skeleton End Min Group Size", category + " Skeleton", 1, 1, Integer.MAX_VALUE, "Skeleton End Min Group Size!");
        MobSpawnsHandler.EndSkeletonMax = config.getInt("Skeleton End Max Group Size", category + " Skeleton", 5, 1, Integer.MAX_VALUE, "Skeleton End Max Group Size!");
        
        // Slime
        config.addCustomCategoryComment(category + " Slime", "true or false");
        // Beach Biome
        MobSpawnsHandler.Slime = config.getBoolean("Slime", category + " Slime", false, "Enable custom Slime Spawns?");
        MobSpawnsHandler.BeachSlime = config.getBoolean("Slime Beach", category + " Slime", false, "Enable Slime Beach Spawns?");
        MobSpawnsHandler.BeachSlimeWeight = config.getInt("Slime Beach Weight", category + " Slime", 100, 1, Integer.MAX_VALUE, "Slime Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachSlimeMin = config.getInt("Slime Beach Min Group Size", category + " Slime", 1, 1, Integer.MAX_VALUE, "Slime Beach Min Group Size!");
        MobSpawnsHandler.BeachSlimeMax = config.getInt("Slime Beach Max Group Size", category + " Slime", 5, 1, Integer.MAX_VALUE, "Slime Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherSlime = config.getBoolean("Slime Nether", category + " Slime", false, "Enable Slime Nether Spawns?");
        MobSpawnsHandler.NetherSlimeWeight = config.getInt("Slime Nether Weight", category + " Slime", 100, 1, Integer.MAX_VALUE, "Slime Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherSlimeMin = config.getInt("Slime Nether Min Group Size", category + " Slime", 1, 1, Integer.MAX_VALUE, "Slime Nether Min Group Size!");
        MobSpawnsHandler.NetherSlimeMax = config.getInt("Slime Nether Max Group Size", category + " Slime", 5, 1, Integer.MAX_VALUE, "Slime Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertSlime = config.getBoolean("Slime Desert", category + " Slime", false, "Enable Slime Desert Spawns?");
        MobSpawnsHandler.DesertSlimeWeight = config.getInt("Slime Desert Weight", category + " Slime", 100, 1, Integer.MAX_VALUE, "Slime Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertSlimeMin = config.getInt("Slime Desert Min Group Size", category + " Slime", 1, 1, Integer.MAX_VALUE, "Slime Desert Min Group Size!");
        MobSpawnsHandler.DesertSlimeMax = config.getInt("Slime Desert Max Group Size", category + " Slime", 5, 1, Integer.MAX_VALUE, "Slime Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremeSlime = config.getBoolean("Slime Extreme", category + " Slime", false, "Enable Slime Extreme Spawns?");
        MobSpawnsHandler.ExtremeSlimeWeight = config.getInt("Slime Extreme Weight", category + " Slime", 100, 1, Integer.MAX_VALUE, "Slime Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremeSlimeMin = config.getInt("Slime Extreme Min Group Size", category + " Slime", 1, 1, Integer.MAX_VALUE, "Slime Extreme Min Group Size!");
        MobSpawnsHandler.ExtremeSlimeMax = config.getInt("Slime Extreme Max Group Size", category + " Slime", 5, 1, Integer.MAX_VALUE, "Slime Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestSlime = config.getBoolean("Slime Forest", category + " Slime", false, "Enable Slime Forest Spawns?");
        MobSpawnsHandler.ForestSlimeWeight = config.getInt("Slime Forest Weight", category + " Slime", 100, 1, Integer.MAX_VALUE, "Slime Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestSlimeMin = config.getInt("Slime Forest Min Group Size", category + " Slime", 1, 1, Integer.MAX_VALUE, "Slime Forest Min Group Size!");
        MobSpawnsHandler.ForestSlimeMax = config.getInt("Slime Forest Max Group Size", category + " Slime", 5, 1, Integer.MAX_VALUE, "Slime Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JungleSlime = config.getBoolean("Slime Jungle", category + " Slime", false, "Enable Slime Jungle Spawns?");
        MobSpawnsHandler.JungleSlimeWeight = config.getInt("Slime Jungle Weight", category + " Slime", 100, 1, Integer.MAX_VALUE, "Slime Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JungleSlimeMin = config.getInt("Slime Jungle Min Group Size", category + " Slime", 1, 1, Integer.MAX_VALUE, "Slime Jungle Min Group Size!");
        MobSpawnsHandler.JungleSlimeMax = config.getInt("Slime Jungle Max Group Size", category + " Slime", 5, 1, Integer.MAX_VALUE, "Slime Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaSlime = config.getBoolean("Slime Mesa", category + " Slime", false, "Enable Slime Mesa Spawns?");
        MobSpawnsHandler.MesaSlimeWeight = config.getInt("Slime Mesa Weight", category + " Slime", 100, 1, Integer.MAX_VALUE, "Slime Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaSlimeMin = config.getInt("Slime Mesa Min Group Size", category + " Slime", 1, 1, Integer.MAX_VALUE, "Slime Mesa Min Group Size!");
        MobSpawnsHandler.MesaSlimeMax = config.getInt("Slime Mesa Max Group Size", category + " Slime", 5, 1, Integer.MAX_VALUE, "Slime Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsSlime = config.getBoolean("Slime Plains", category + " Slime", false, "Enable Slime Plains Spawns?");
        MobSpawnsHandler.PlainsSlimeWeight = config.getInt("Slime Plains Weight", category + " Slime", 100, 1, Integer.MAX_VALUE, "Slime Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsSlimeMin = config.getInt("Slime Plains Min Group Size", category + " Slime", 1, 1, Integer.MAX_VALUE, "Slime Plains Min Group Size!");
        MobSpawnsHandler.PlainsSlimeMax = config.getInt("Slime Plains Max Group Size", category + " Slime", 5, 1, Integer.MAX_VALUE, "Slime Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaSlime = config.getBoolean("Slime Savanna", category + " Slime", false, "Enable Slime Savanna Spawns?");
        MobSpawnsHandler.SavannaSlimeWeight = config.getInt("Slime Savanna Weight", category + " Slime", 100, 1, Integer.MAX_VALUE, "Slime Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaSlimeMin = config.getInt("Slime Savanna Min Group Size", category + " Slime", 1, 1, Integer.MAX_VALUE, "Slime Savanna Min Group Size!");
        MobSpawnsHandler.SavannaSlimeMax = config.getInt("Slime Savanna Max Group Size", category + " Slime", 5, 1, Integer.MAX_VALUE, "Slime Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampSlime = config.getBoolean("Slime Swamp", category + " Slime", false, "Enable Slime Swamp Spawns?");
        MobSpawnsHandler.SwampSlimeWeight = config.getInt("Slime Swamp Weight", category + " Slime", 100, 1, Integer.MAX_VALUE, "Slime Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampSlimeMin = config.getInt("Slime Swamp Min Group Size", category + " Slime", 1, 1, Integer.MAX_VALUE, "Slime Swamp Min Group Size!");
        MobSpawnsHandler.SwampSlimeMax = config.getInt("Slime Swamp Max Group Size", category + " Slime", 5, 1, Integer.MAX_VALUE, "Slime Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaSlime = config.getBoolean("Slime Taiga", category + " Slime", false, "Enable Slime Taiga Spawns?");
        MobSpawnsHandler.TaigaSlimeWeight = config.getInt("Slime Taiga Weight", category + " Slime", 100, 1, Integer.MAX_VALUE, "Slime Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaSlimeMin = config.getInt("Slime Taiga Min Group Size", category + " Slime", 1, 1, Integer.MAX_VALUE, "Slime Taiga Min Group Size!");
        MobSpawnsHandler.TaigaSlimeMax = config.getInt("Slime Taiga Max Group Size", category + " Slime", 5, 1, Integer.MAX_VALUE, "Slime Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndSlime = config.getBoolean("Slime End", category + " Slime", false, "Enable Slime End Spawns?");
        MobSpawnsHandler.EndSlimeWeight = config.getInt("Slime End Weight", category + " Slime", 100, 1, Integer.MAX_VALUE, "Slime End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndSlimeMin = config.getInt("Slime End Min Group Size", category + " Slime", 1, 1, Integer.MAX_VALUE, "Slime End Min Group Size!");
        MobSpawnsHandler.EndSlimeMax = config.getInt("Slime End Max Group Size", category + " Slime", 5, 1, Integer.MAX_VALUE, "Slime End Max Group Size!");
        
        // Snowman
        config.addCustomCategoryComment(category + " Snowman", "true or false");
        // Beach Biome
        MobSpawnsHandler.Snowman = config.getBoolean("Snowman", category + " Snowman", false, "Enable custom Snowman Spawns?");
        MobSpawnsHandler.BeachSnowman = config.getBoolean("Snowman Beach", category + " Snowman", false, "Enable Snowman Beach Spawns?");
        MobSpawnsHandler.BeachSnowmanWeight = config.getInt("Snowman Beach Weight", category + " Snowman", 100, 1, Integer.MAX_VALUE, "Snowman Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachSnowmanMin = config.getInt("Snowman Beach Min Group Size", category + " Snowman", 1, 1, Integer.MAX_VALUE, "Snowman Beach Min Group Size!");
        MobSpawnsHandler.BeachSnowmanMax = config.getInt("Snowman Beach Max Group Size", category + " Snowman", 5, 1, Integer.MAX_VALUE, "Snowman Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherSnowman = config.getBoolean("Snowman Nether", category + " Snowman", false, "Enable Snowman Nether Spawns?");
        MobSpawnsHandler.NetherSnowmanWeight = config.getInt("Snowman Nether Weight", category + " Snowman", 100, 1, Integer.MAX_VALUE, "Snowman Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherSnowmanMin = config.getInt("Snowman Nether Min Group Size", category + " Snowman", 1, 1, Integer.MAX_VALUE, "Snowman Nether Min Group Size!");
        MobSpawnsHandler.NetherSnowmanMax = config.getInt("Snowman Nether Max Group Size", category + " Snowman", 5, 1, Integer.MAX_VALUE, "Snowman Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertSnowman = config.getBoolean("Snowman Desert", category + " Snowman", false, "Enable Snowman Desert Spawns?");
        MobSpawnsHandler.DesertSnowmanWeight = config.getInt("Snowman Desert Weight", category + " Snowman", 100, 1, Integer.MAX_VALUE, "Snowman Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertSnowmanMin = config.getInt("Snowman Desert Min Group Size", category + " Snowman", 1, 1, Integer.MAX_VALUE, "Snowman Desert Min Group Size!");
        MobSpawnsHandler.DesertSnowmanMax = config.getInt("Snowman Desert Max Group Size", category + " Snowman", 5, 1, Integer.MAX_VALUE, "Snowman Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremeSnowman = config.getBoolean("Snowman Extreme", category + " Snowman", false, "Enable Snowman Extreme Spawns?");
        MobSpawnsHandler.ExtremeSnowmanWeight = config.getInt("Snowman Extreme Weight", category + " Snowman", 100, 1, Integer.MAX_VALUE, "Snowman Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremeSnowmanMin = config.getInt("Snowman Extreme Min Group Size", category + " Snowman", 1, 1, Integer.MAX_VALUE, "Snowman Extreme Min Group Size!");
        MobSpawnsHandler.ExtremeSnowmanMax = config.getInt("Snowman Extreme Max Group Size", category + " Snowman", 5, 1, Integer.MAX_VALUE, "Snowman Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestSnowman = config.getBoolean("Snowman Forest", category + " Snowman", false, "Enable Snowman Forest Spawns?");
        MobSpawnsHandler.ForestSnowmanWeight = config.getInt("Snowman Forest Weight", category + " Snowman", 100, 1, Integer.MAX_VALUE, "Snowman Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestSnowmanMin = config.getInt("Snowman Forest Min Group Size", category + " Snowman", 1, 1, Integer.MAX_VALUE, "Snowman Forest Min Group Size!");
        MobSpawnsHandler.ForestSnowmanMax = config.getInt("Snowman Forest Max Group Size", category + " Snowman", 5, 1, Integer.MAX_VALUE, "Snowman Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JungleSnowman = config.getBoolean("Snowman Jungle", category + " Snowman", false, "Enable Snowman Jungle Spawns?");
        MobSpawnsHandler.JungleSnowmanWeight = config.getInt("Snowman Jungle Weight", category + " Snowman", 100, 1, Integer.MAX_VALUE, "Snowman Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JungleSnowmanMin = config.getInt("Snowman Jungle Min Group Size", category + " Snowman", 1, 1, Integer.MAX_VALUE, "Snowman Jungle Min Group Size!");
        MobSpawnsHandler.JungleSnowmanMax = config.getInt("Snowman Jungle Max Group Size", category + " Snowman", 5, 1, Integer.MAX_VALUE, "Snowman Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaSnowman = config.getBoolean("Snowman Mesa", category + " Snowman", false, "Enable Snowman Mesa Spawns?");
        MobSpawnsHandler.MesaSnowmanWeight = config.getInt("Snowman Mesa Weight", category + " Snowman", 100, 1, Integer.MAX_VALUE, "Snowman Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaSnowmanMin = config.getInt("Snowman Mesa Min Group Size", category + " Snowman", 1, 1, Integer.MAX_VALUE, "Snowman Mesa Min Group Size!");
        MobSpawnsHandler.MesaSnowmanMax = config.getInt("Snowman Mesa Max Group Size", category + " Snowman", 5, 1, Integer.MAX_VALUE, "Snowman Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsSnowman = config.getBoolean("Snowman Plains", category + " Snowman", false, "Enable Snowman Plains Spawns?");
        MobSpawnsHandler.PlainsSnowmanWeight = config.getInt("Snowman Plains Weight", category + " Snowman", 100, 1, Integer.MAX_VALUE, "Snowman Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsSnowmanMin = config.getInt("Snowman Plains Min Group Size", category + " Snowman", 1, 1, Integer.MAX_VALUE, "Snowman Plains Min Group Size!");
        MobSpawnsHandler.PlainsSnowmanMax = config.getInt("Snowman Plains Max Group Size", category + " Snowman", 5, 1, Integer.MAX_VALUE, "Snowman Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaSnowman = config.getBoolean("Snowman Savanna", category + " Snowman", false, "Enable Snowman Savanna Spawns?");
        MobSpawnsHandler.SavannaSnowmanWeight = config.getInt("Snowman Savanna Weight", category + " Snowman", 100, 1, Integer.MAX_VALUE, "Snowman Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaSnowmanMin = config.getInt("Snowman Savanna Min Group Size", category + " Snowman", 1, 1, Integer.MAX_VALUE, "Snowman Savanna Min Group Size!");
        MobSpawnsHandler.SavannaSnowmanMax = config.getInt("Snowman Savanna Max Group Size", category + " Snowman", 5, 1, Integer.MAX_VALUE, "Snowman Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampSnowman = config.getBoolean("Snowman Swamp", category + " Snowman", false, "Enable Snowman Swamp Spawns?");
        MobSpawnsHandler.SwampSnowmanWeight = config.getInt("Snowman Swamp Weight", category + " Snowman", 100, 1, Integer.MAX_VALUE, "Snowman Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampSnowmanMin = config.getInt("Snowman Swamp Min Group Size", category + " Snowman", 1, 1, Integer.MAX_VALUE, "Snowman Swamp Min Group Size!");
        MobSpawnsHandler.SwampSnowmanMax = config.getInt("Snowman Swamp Max Group Size", category + " Snowman", 5, 1, Integer.MAX_VALUE, "Snowman Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaSnowman = config.getBoolean("Snowman Taiga", category + " Snowman", false, "Enable Snowman Taiga Spawns?");
        MobSpawnsHandler.TaigaSnowmanWeight = config.getInt("Snowman Taiga Weight", category + " Snowman", 100, 1, Integer.MAX_VALUE, "Snowman Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaSnowmanMin = config.getInt("Snowman Taiga Min Group Size", category + " Snowman", 1, 1, Integer.MAX_VALUE, "Snowman Taiga Min Group Size!");
        MobSpawnsHandler.TaigaSnowmanMax = config.getInt("Snowman Taiga Max Group Size", category + " Snowman", 5, 1, Integer.MAX_VALUE, "Snowman Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndSnowman = config.getBoolean("Snowman End", category + " Snowman", false, "Enable Snowman End Spawns?");
        MobSpawnsHandler.EndSnowmanWeight = config.getInt("Snowman End Weight", category + " Snowman", 100, 1, Integer.MAX_VALUE, "Snowman End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndSnowmanMin = config.getInt("Snowman End Min Group Size", category + " Snowman", 1, 1, Integer.MAX_VALUE, "Snowman End Min Group Size!");
        MobSpawnsHandler.EndSnowmanMax = config.getInt("Snowman End Max Group Size", category + " Snowman", 5, 1, Integer.MAX_VALUE, "Snowman End Max Group Size!");
        
        // Spider
        config.addCustomCategoryComment(category + " Spider", "true or false");
        // Beach Biome
        MobSpawnsHandler.Spider = config.getBoolean("Spider", category + " Spider", false, "Enable custom Spider Spawns?");
        MobSpawnsHandler.BeachSpider = config.getBoolean("Spider Beach", category + " Spider", false, "Enable Spider Beach Spawns?");
        MobSpawnsHandler.BeachSpiderWeight = config.getInt("Spider Beach Weight", category + " Spider", 100, 1, Integer.MAX_VALUE, "Spider Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachSpiderMin = config.getInt("Spider Beach Min Group Size", category + " Spider", 1, 1, Integer.MAX_VALUE, "Spider Beach Min Group Size!");
        MobSpawnsHandler.BeachSpiderMax = config.getInt("Spider Beach Max Group Size", category + " Spider", 5, 1, Integer.MAX_VALUE, "Spider Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherSpider = config.getBoolean("Spider Nether", category + " Spider", false, "Enable Spider Nether Spawns?");
        MobSpawnsHandler.NetherSpiderWeight = config.getInt("Spider Nether Weight", category + " Spider", 100, 1, Integer.MAX_VALUE, "Spider Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherSpiderMin = config.getInt("Spider Nether Min Group Size", category + " Spider", 1, 1, Integer.MAX_VALUE, "Spider Nether Min Group Size!");
        MobSpawnsHandler.NetherSpiderMax = config.getInt("Spider Nether Max Group Size", category + " Spider", 5, 1, Integer.MAX_VALUE, "Spider Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertSpider = config.getBoolean("Spider Desert", category + " Spider", false, "Enable Spider Desert Spawns?");
        MobSpawnsHandler.DesertSpiderWeight = config.getInt("Spider Desert Weight", category + " Spider", 100, 1, Integer.MAX_VALUE, "Spider Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertSpiderMin = config.getInt("Spider Desert Min Group Size", category + " Spider", 1, 1, Integer.MAX_VALUE, "Spider Desert Min Group Size!");
        MobSpawnsHandler.DesertSpiderMax = config.getInt("Spider Desert Max Group Size", category + " Spider", 5, 1, Integer.MAX_VALUE, "Spider Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremeSpider = config.getBoolean("Spider Extreme", category + " Spider", false, "Enable Spider Extreme Spawns?");
        MobSpawnsHandler.ExtremeSpiderWeight = config.getInt("Spider Extreme Weight", category + " Spider", 100, 1, Integer.MAX_VALUE, "Spider Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremeSpiderMin = config.getInt("Spider Extreme Min Group Size", category + " Spider", 1, 1, Integer.MAX_VALUE, "Spider Extreme Min Group Size!");
        MobSpawnsHandler.ExtremeSpiderMax = config.getInt("Spider Extreme Max Group Size", category + " Spider", 5, 1, Integer.MAX_VALUE, "Spider Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestSpider = config.getBoolean("Spider Forest", category + " Spider", false, "Enable Spider Forest Spawns?");
        MobSpawnsHandler.ForestSpiderWeight = config.getInt("Spider Forest Weight", category + " Spider", 100, 1, Integer.MAX_VALUE, "Spider Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestSpiderMin = config.getInt("Spider Forest Min Group Size", category + " Spider", 1, 1, Integer.MAX_VALUE, "Spider Forest Min Group Size!");
        MobSpawnsHandler.ForestSpiderMax = config.getInt("Spider Forest Max Group Size", category + " Spider", 5, 1, Integer.MAX_VALUE, "Spider Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JungleSpider = config.getBoolean("Spider Jungle", category + " Spider", false, "Enable Spider Jungle Spawns?");
        MobSpawnsHandler.JungleSpiderWeight = config.getInt("Spider Jungle Weight", category + " Spider", 100, 1, Integer.MAX_VALUE, "Spider Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JungleSpiderMin = config.getInt("Spider Jungle Min Group Size", category + " Spider", 1, 1, Integer.MAX_VALUE, "Spider Jungle Min Group Size!");
        MobSpawnsHandler.JungleSpiderMax = config.getInt("Spider Jungle Max Group Size", category + " Spider", 5, 1, Integer.MAX_VALUE, "Spider Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaSpider = config.getBoolean("Spider Mesa", category + " Spider", false, "Enable Spider Mesa Spawns?");
        MobSpawnsHandler.MesaSpiderWeight = config.getInt("Spider Mesa Weight", category + " Spider", 100, 1, Integer.MAX_VALUE, "Spider Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaSpiderMin = config.getInt("Spider Mesa Min Group Size", category + " Spider", 1, 1, Integer.MAX_VALUE, "Spider Mesa Min Group Size!");
        MobSpawnsHandler.MesaSpiderMax = config.getInt("Spider Mesa Max Group Size", category + " Spider", 5, 1, Integer.MAX_VALUE, "Spider Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsSpider = config.getBoolean("Spider Plains", category + " Spider", false, "Enable Spider Plains Spawns?");
        MobSpawnsHandler.PlainsSpiderWeight = config.getInt("Spider Plains Weight", category + " Spider", 100, 1, Integer.MAX_VALUE, "Spider Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsSpiderMin = config.getInt("Spider Plains Min Group Size", category + " Spider", 1, 1, Integer.MAX_VALUE, "Spider Plains Min Group Size!");
        MobSpawnsHandler.PlainsSpiderMax = config.getInt("Spider Plains Max Group Size", category + " Spider", 5, 1, Integer.MAX_VALUE, "Spider Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaSpider = config.getBoolean("Spider Savanna", category + " Spider", false, "Enable Spider Savanna Spawns?");
        MobSpawnsHandler.SavannaSpiderWeight = config.getInt("Spider Savanna Weight", category + " Spider", 100, 1, Integer.MAX_VALUE, "Spider Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaSpiderMin = config.getInt("Spider Savanna Min Group Size", category + " Spider", 1, 1, Integer.MAX_VALUE, "Spider Savanna Min Group Size!");
        MobSpawnsHandler.SavannaSpiderMax = config.getInt("Spider Savanna Max Group Size", category + " Spider", 5, 1, Integer.MAX_VALUE, "Spider Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampSpider = config.getBoolean("Spider Swamp", category + " Spider", false, "Enable Spider Swamp Spawns?");
        MobSpawnsHandler.SwampSpiderWeight = config.getInt("Spider Swamp Weight", category + " Spider", 100, 1, Integer.MAX_VALUE, "Spider Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampSpiderMin = config.getInt("Spider Swamp Min Group Size", category + " Spider", 1, 1, Integer.MAX_VALUE, "Spider Swamp Min Group Size!");
        MobSpawnsHandler.SwampSpiderMax = config.getInt("Spider Swamp Max Group Size", category + " Spider", 5, 1, Integer.MAX_VALUE, "Spider Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaSpider = config.getBoolean("Spider Taiga", category + " Spider", false, "Enable Spider Taiga Spawns?");
        MobSpawnsHandler.TaigaSpiderWeight = config.getInt("Spider Taiga Weight", category + " Spider", 100, 1, Integer.MAX_VALUE, "Spider Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaSpiderMin = config.getInt("Spider Taiga Min Group Size", category + " Spider", 1, 1, Integer.MAX_VALUE, "Spider Taiga Min Group Size!");
        MobSpawnsHandler.TaigaSpiderMax = config.getInt("Spider Taiga Max Group Size", category + " Spider", 5, 1, Integer.MAX_VALUE, "Spider Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndSpider = config.getBoolean("Spider End", category + " Spider", false, "Enable Spider End Spawns?");
        MobSpawnsHandler.EndSpiderWeight = config.getInt("Spider End Weight", category + " Spider", 100, 1, Integer.MAX_VALUE, "Spider End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndSpiderMin = config.getInt("Spider End Min Group Size", category + " Spider", 1, 1, Integer.MAX_VALUE, "Spider End Min Group Size!");
        MobSpawnsHandler.EndSpiderMax = config.getInt("Spider End Max Group Size", category + " Spider", 5, 1, Integer.MAX_VALUE, "Spider End Max Group Size!");
        
        // Witch
        config.addCustomCategoryComment(category + " Witch", "true or false");
        // Beach Biome
        MobSpawnsHandler.Witch = config.getBoolean("Witch", category + " Witch", false, "Enable custom Witch Spawns?");
        MobSpawnsHandler.BeachWitch = config.getBoolean("Witch Beach", category + " Witch", false, "Enable Witch Beach Spawns?");
        MobSpawnsHandler.BeachWitchWeight = config.getInt("Witch Beach Weight", category + " Witch", 100, 1, Integer.MAX_VALUE, "Witch Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachWitchMin = config.getInt("Witch Beach Min Group Size", category + " Witch", 1, 1, Integer.MAX_VALUE, "Witch Beach Min Group Size!");
        MobSpawnsHandler.BeachWitchMax = config.getInt("Witch Beach Max Group Size", category + " Witch", 5, 1, Integer.MAX_VALUE, "Witch Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherWitch = config.getBoolean("Witch Nether", category + " Witch", false, "Enable Witch Nether Spawns?");
        MobSpawnsHandler.NetherWitchWeight = config.getInt("Witch Nether Weight", category + " Witch", 100, 1, Integer.MAX_VALUE, "Witch Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherWitchMin = config.getInt("Witch Nether Min Group Size", category + " Witch", 1, 1, Integer.MAX_VALUE, "Witch Nether Min Group Size!");
        MobSpawnsHandler.NetherWitchMax = config.getInt("Witch Nether Max Group Size", category + " Witch", 5, 1, Integer.MAX_VALUE, "Witch Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertWitch = config.getBoolean("Witch Desert", category + " Witch", false, "Enable Witch Desert Spawns?");
        MobSpawnsHandler.DesertWitchWeight = config.getInt("Witch Desert Weight", category + " Witch", 100, 1, Integer.MAX_VALUE, "Witch Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertWitchMin = config.getInt("Witch Desert Min Group Size", category + " Witch", 1, 1, Integer.MAX_VALUE, "Witch Desert Min Group Size!");
        MobSpawnsHandler.DesertWitchMax = config.getInt("Witch Desert Max Group Size", category + " Witch", 5, 1, Integer.MAX_VALUE, "Witch Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremeWitch = config.getBoolean("Witch Extreme", category + " Witch", false, "Enable Witch Extreme Spawns?");
        MobSpawnsHandler.ExtremeWitchWeight = config.getInt("Witch Extreme Weight", category + " Witch", 100, 1, Integer.MAX_VALUE, "Witch Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremeWitchMin = config.getInt("Witch Extreme Min Group Size", category + " Witch", 1, 1, Integer.MAX_VALUE, "Witch Extreme Min Group Size!");
        MobSpawnsHandler.ExtremeWitchMax = config.getInt("Witch Extreme Max Group Size", category + " Witch", 5, 1, Integer.MAX_VALUE, "Witch Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestWitch = config.getBoolean("Witch Forest", category + " Witch", false, "Enable Witch Forest Spawns?");
        MobSpawnsHandler.ForestWitchWeight = config.getInt("Witch Forest Weight", category + " Witch", 100, 1, Integer.MAX_VALUE, "Witch Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestWitchMin = config.getInt("Witch Forest Min Group Size", category + " Witch", 1, 1, Integer.MAX_VALUE, "Witch Forest Min Group Size!");
        MobSpawnsHandler.ForestWitchMax = config.getInt("Witch Forest Max Group Size", category + " Witch", 5, 1, Integer.MAX_VALUE, "Witch Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JungleWitch = config.getBoolean("Witch Jungle", category + " Witch", false, "Enable Witch Jungle Spawns?");
        MobSpawnsHandler.JungleWitchWeight = config.getInt("Witch Jungle Weight", category + " Witch", 100, 1, Integer.MAX_VALUE, "Witch Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JungleWitchMin = config.getInt("Witch Jungle Min Group Size", category + " Witch", 1, 1, Integer.MAX_VALUE, "Witch Jungle Min Group Size!");
        MobSpawnsHandler.JungleWitchMax = config.getInt("Witch Jungle Max Group Size", category + " Witch", 5, 1, Integer.MAX_VALUE, "Witch Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaWitch = config.getBoolean("Witch Mesa", category + " Witch", false, "Enable Witch Mesa Spawns?");
        MobSpawnsHandler.MesaWitchWeight = config.getInt("Witch Mesa Weight", category + " Witch", 100, 1, Integer.MAX_VALUE, "Witch Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaWitchMin = config.getInt("Witch Mesa Min Group Size", category + " Witch", 1, 1, Integer.MAX_VALUE, "Witch Mesa Min Group Size!");
        MobSpawnsHandler.MesaWitchMax = config.getInt("Witch Mesa Max Group Size", category + " Witch", 5, 1, Integer.MAX_VALUE, "Witch Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsWitch = config.getBoolean("Witch Plains", category + " Witch", false, "Enable Witch Plains Spawns?");
        MobSpawnsHandler.PlainsWitchWeight = config.getInt("Witch Plains Weight", category + " Witch", 100, 1, Integer.MAX_VALUE, "Witch Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsWitchMin = config.getInt("Witch Plains Min Group Size", category + " Witch", 1, 1, Integer.MAX_VALUE, "Witch Plains Min Group Size!");
        MobSpawnsHandler.PlainsWitchMax = config.getInt("Witch Plains Max Group Size", category + " Witch", 5, 1, Integer.MAX_VALUE, "Witch Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaWitch = config.getBoolean("Witch Savanna", category + " Witch", false, "Enable Witch Savanna Spawns?");
        MobSpawnsHandler.SavannaWitchWeight = config.getInt("Witch Savanna Weight", category + " Witch", 100, 1, Integer.MAX_VALUE, "Witch Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaWitchMin = config.getInt("Witch Savanna Min Group Size", category + " Witch", 1, 1, Integer.MAX_VALUE, "Witch Savanna Min Group Size!");
        MobSpawnsHandler.SavannaWitchMax = config.getInt("Witch Savanna Max Group Size", category + " Witch", 5, 1, Integer.MAX_VALUE, "Witch Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampWitch = config.getBoolean("Witch Swamp", category + " Witch", false, "Enable Witch Swamp Spawns?");
        MobSpawnsHandler.SwampWitchWeight = config.getInt("Witch Swamp Weight", category + " Witch", 100, 1, Integer.MAX_VALUE, "Witch Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampWitchMin = config.getInt("Witch Swamp Min Group Size", category + " Witch", 1, 1, Integer.MAX_VALUE, "Witch Swamp Min Group Size!");
        MobSpawnsHandler.SwampWitchMax = config.getInt("Witch Swamp Max Group Size", category + " Witch", 5, 1, Integer.MAX_VALUE, "Witch Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaWitch = config.getBoolean("Witch Taiga", category + " Witch", false, "Enable Witch Taiga Spawns?");
        MobSpawnsHandler.TaigaWitchWeight = config.getInt("Witch Taiga Weight", category + " Witch", 100, 1, Integer.MAX_VALUE, "Witch Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaWitchMin = config.getInt("Witch Taiga Min Group Size", category + " Witch", 1, 1, Integer.MAX_VALUE, "Witch Taiga Min Group Size!");
        MobSpawnsHandler.TaigaWitchMax = config.getInt("Witch Taiga Max Group Size", category + " Witch", 5, 1, Integer.MAX_VALUE, "Witch Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndWitch = config.getBoolean("Witch End", category + " Witch", false, "Enable Witch End Spawns?");
        MobSpawnsHandler.EndWitchWeight = config.getInt("Witch End Weight", category + " Witch", 100, 1, Integer.MAX_VALUE, "Witch End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndWitchMin = config.getInt("Witch End Min Group Size", category + " Witch", 1, 1, Integer.MAX_VALUE, "Witch End Min Group Size!");
        MobSpawnsHandler.EndWitchMax = config.getInt("Witch End Max Group Size", category + " Witch", 5, 1, Integer.MAX_VALUE, "Witch End Max Group Size!");        
        
        // Zombie
        config.addCustomCategoryComment(category + " Zombie", "true or false");
        // Beach Biome
        MobSpawnsHandler.Zombie = config.getBoolean("Zombie", category + " Zombie", false, "Enable custom Zombie Spawns?");
        MobSpawnsHandler.BeachZombie = config.getBoolean("Zombie Beach", category + " Zombie", false, "Enable Zombie Beach Spawns?");
        MobSpawnsHandler.BeachZombieWeight = config.getInt("Zombie Beach Weight", category + " Zombie", 100, 1, Integer.MAX_VALUE, "Zombie Beach Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.BeachZombieMin = config.getInt("Zombie Beach Min Group Size", category + " Zombie", 1, 1, Integer.MAX_VALUE, "Zombie Beach Min Group Size!");
        MobSpawnsHandler.BeachZombieMax = config.getInt("Zombie Beach Max Group Size", category + " Zombie", 5, 1, Integer.MAX_VALUE, "Zombie Beach Max Group Size!");
		// Nether Biome
        MobSpawnsHandler.NetherZombie = config.getBoolean("Zombie Nether", category + " Zombie", false, "Enable Zombie Nether Spawns?");
        MobSpawnsHandler.NetherZombieWeight = config.getInt("Zombie Nether Weight", category + " Zombie", 100, 1, Integer.MAX_VALUE, "Zombie Nether Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.NetherZombieMin = config.getInt("Zombie Nether Min Group Size", category + " Zombie", 1, 1, Integer.MAX_VALUE, "Zombie Nether Min Group Size!");
        MobSpawnsHandler.NetherZombieMax = config.getInt("Zombie Nether Max Group Size", category + " Zombie", 5, 1, Integer.MAX_VALUE, "Zombie Nether Max Group Size!");
        // Desert Biome
        MobSpawnsHandler.DesertZombie = config.getBoolean("Zombie Desert", category + " Zombie", false, "Enable Zombie Desert Spawns?");
        MobSpawnsHandler.DesertZombieWeight = config.getInt("Zombie Desert Weight", category + " Zombie", 100, 1, Integer.MAX_VALUE, "Zombie Desert Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.DesertZombieMin = config.getInt("Zombie Desert Min Group Size", category + " Zombie", 1, 1, Integer.MAX_VALUE, "Zombie Desert Min Group Size!");
        MobSpawnsHandler.DesertZombieMax = config.getInt("Zombie Desert Max Group Size", category + " Zombie", 5, 1, Integer.MAX_VALUE, "Zombie Desert Max Group Size!");
        // Extreme Hills Biome
        MobSpawnsHandler.ExtremeZombie = config.getBoolean("Zombie Extreme", category + " Zombie", false, "Enable Zombie Extreme Spawns?");
        MobSpawnsHandler.ExtremeZombieWeight = config.getInt("Zombie Extreme Weight", category + " Zombie", 100, 1, Integer.MAX_VALUE, "Zombie Extreme Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ExtremeZombieMin = config.getInt("Zombie Extreme Min Group Size", category + " Zombie", 1, 1, Integer.MAX_VALUE, "Zombie Extreme Min Group Size!");
        MobSpawnsHandler.ExtremeZombieMax = config.getInt("Zombie Extreme Max Group Size", category + " Zombie", 5, 1, Integer.MAX_VALUE, "Zombie Extreme Max Group Size!");
        // Forest Biome
        MobSpawnsHandler.ForestZombie = config.getBoolean("Zombie Forest", category + " Zombie", false, "Enable Zombie Forest Spawns?");
        MobSpawnsHandler.ForestZombieWeight = config.getInt("Zombie Forest Weight", category + " Zombie", 100, 1, Integer.MAX_VALUE, "Zombie Forest Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.ForestZombieMin = config.getInt("Zombie Forest Min Group Size", category + " Zombie", 1, 1, Integer.MAX_VALUE, "Zombie Forest Min Group Size!");
        MobSpawnsHandler.ForestZombieMax = config.getInt("Zombie Forest Max Group Size", category + " Zombie", 5, 1, Integer.MAX_VALUE, "Zombie Forest Max Group Size!");
        // Jungle Biome
        MobSpawnsHandler.JungleZombie = config.getBoolean("Zombie Jungle", category + " Zombie", false, "Enable Zombie Jungle Spawns?");
        MobSpawnsHandler.JungleZombieWeight = config.getInt("Zombie Jungle Weight", category + " Zombie", 100, 1, Integer.MAX_VALUE, "Zombie Jungle Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.JungleZombieMin = config.getInt("Zombie Jungle Min Group Size", category + " Zombie", 1, 1, Integer.MAX_VALUE, "Zombie Jungle Min Group Size!");
        MobSpawnsHandler.JungleZombieMax = config.getInt("Zombie Jungle Max Group Size", category + " Zombie", 5, 1, Integer.MAX_VALUE, "Zombie Jungle Max Group Size!");
        // Mesa Biome
        MobSpawnsHandler.MesaZombie = config.getBoolean("Zombie Mesa", category + " Zombie", false, "Enable Zombie Mesa Spawns?");
        MobSpawnsHandler.MesaZombieWeight = config.getInt("Zombie Mesa Weight", category + " Zombie", 100, 1, Integer.MAX_VALUE, "Zombie Mesa Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.MesaZombieMin = config.getInt("Zombie Mesa Min Group Size", category + " Zombie", 1, 1, Integer.MAX_VALUE, "Zombie Mesa Min Group Size!");
        MobSpawnsHandler.MesaZombieMax = config.getInt("Zombie Mesa Max Group Size", category + " Zombie", 5, 1, Integer.MAX_VALUE, "Zombie Mesa Max Group Size!");
        // Plains Biome
        MobSpawnsHandler.PlainsZombie = config.getBoolean("Zombie Plains", category + " Zombie", false, "Enable Zombie Plains Spawns?");
        MobSpawnsHandler.PlainsZombieWeight = config.getInt("Zombie Plains Weight", category + " Zombie", 100, 1, Integer.MAX_VALUE, "Zombie Plains Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.PlainsZombieMin = config.getInt("Zombie Plains Min Group Size", category + " Zombie", 1, 1, Integer.MAX_VALUE, "Zombie Plains Min Group Size!");
        MobSpawnsHandler.PlainsZombieMax = config.getInt("Zombie Plains Max Group Size", category + " Zombie", 5, 1, Integer.MAX_VALUE, "Zombie Plains Max Group Size!");
        // Savanna Biome
        MobSpawnsHandler.SavannaZombie = config.getBoolean("Zombie Savanna", category + " Zombie", false, "Enable Zombie Savanna Spawns?");
        MobSpawnsHandler.SavannaZombieWeight = config.getInt("Zombie Savanna Weight", category + " Zombie", 100, 1, Integer.MAX_VALUE, "Zombie Savanna Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SavannaZombieMin = config.getInt("Zombie Savanna Min Group Size", category + " Zombie", 1, 1, Integer.MAX_VALUE, "Zombie Savanna Min Group Size!");
        MobSpawnsHandler.SavannaZombieMax = config.getInt("Zombie Savanna Max Group Size", category + " Zombie", 5, 1, Integer.MAX_VALUE, "Zombie Savanna Max Group Size!");
        // Swamp Biome
        MobSpawnsHandler.SwampZombie = config.getBoolean("Zombie Swamp", category + " Zombie", false, "Enable Zombie Swamp Spawns?");
        MobSpawnsHandler.SwampZombieWeight = config.getInt("Zombie Swamp Weight", category + " Zombie", 100, 1, Integer.MAX_VALUE, "Zombie Swamp Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.SwampZombieMin = config.getInt("Zombie Swamp Min Group Size", category + " Zombie", 1, 1, Integer.MAX_VALUE, "Zombie Swamp Min Group Size!");
        MobSpawnsHandler.SwampZombieMax = config.getInt("Zombie Swamp Max Group Size", category + " Zombie", 5, 1, Integer.MAX_VALUE, "Zombie Swamp Max Group Size!");
        // Taiga Biome
        MobSpawnsHandler.TaigaZombie = config.getBoolean("Zombie Taiga", category + " Zombie", false, "Enable Zombie Taiga Spawns?");
        MobSpawnsHandler.TaigaZombieWeight = config.getInt("Zombie Taiga Weight", category + " Zombie", 100, 1, Integer.MAX_VALUE, "Zombie Taiga Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.TaigaZombieMin = config.getInt("Zombie Taiga Min Group Size", category + " Zombie", 1, 1, Integer.MAX_VALUE, "Zombie Taiga Min Group Size!");
        MobSpawnsHandler.TaigaZombieMax = config.getInt("Zombie Taiga Max Group Size", category + " Zombie", 5, 1, Integer.MAX_VALUE, "Zombie Taiga Max Group Size!");
        // End Biome
        MobSpawnsHandler.EndZombie = config.getBoolean("Zombie End", category + " Zombie", false, "Enable Zombie End Spawns?");
        MobSpawnsHandler.EndZombieWeight = config.getInt("Zombie End Weight", category + " Zombie", 100, 1, Integer.MAX_VALUE, "Zombie End Spawn Weight!\n(Vanilla Setting: Spider 100 Skeleton 100 Zombie 200)");
        MobSpawnsHandler.EndZombieMin = config.getInt("Zombie End Min Group Size", category + " Zombie", 1, 1, Integer.MAX_VALUE, "Zombie End Min Group Size!");
        MobSpawnsHandler.EndZombieMax = config.getInt("Zombie End Max Group Size", category + " Zombie", 5, 1, Integer.MAX_VALUE, "Zombie End Max Group Size!");
		
        if (config.hasChanged() == true){
	        config.save();
	    }
	}
	
	public static void initOreControl()
	{
		File f = new File(configDir, "Ore Control Modular.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "Ore Control Modular";
		
		// Mob Spawns
        config.addCustomCategoryComment(category + " Worldgen Options", "true or false");
        OreHandler.noAndesite = config.getBoolean("Andesite", category + " Worldgen Options", false, "Disable Ore Generation?");
        OreHandler.noCoal = config.getBoolean("Coal", category + " Worldgen Options", false, "Disable Ore Generation?");
        OreHandler.noCustom = config.getBoolean("Custom", category + " Worldgen Options", false, "Disable Custom Ore Generation? \n(NOTE - Will only work with mods that use OreGenEvent.GenerateMinable event.)");
        OreHandler.noDiamond = config.getBoolean("Diamond", category + " Worldgen Options", false, "Disable Ore Generation?");
        OreHandler.noDiorite = config.getBoolean("Diorite", category + " Worldgen Options", false, "Disable Ore Generation?");
        OreHandler.noDirt = config.getBoolean("Dirt", category + " Worldgen Options", false, "Disable underground Generation?");
        OreHandler.noEmerald = config.getBoolean("Emerald", category + " Worldgen Options", false, "Disable Ore Generation?");
        OreHandler.noGold = config.getBoolean("Gold", category + " Worldgen Options", false, "Disable Ore Generation?");
        OreHandler.noGranite = config.getBoolean("Granite", category+ " Worldgen Options", false, "Disable Ore Generation?");
        OreHandler.noGravel = config.getBoolean("Gravel", category + " Worldgen Options", false, "Disable underground Generation?");
        OreHandler.noIron = config.getBoolean("Iron", category+ " Worldgen Options", false, "Disable Ore Generation?");
        OreHandler.noLapis = config.getBoolean("Lapis", category+ " Worldgen Options", false, "Disable Ore Generation?");
        OreHandler.noQuartz = config.getBoolean("Quartz", category+ " Worldgen Options", false, "Disable Ore Generation?");
        OreHandler.noRedstone = config.getBoolean("Redstone", category+ " Worldgen Options", false, "Disable Ore Generation?");
        OreHandler.noSilverFish = config.getBoolean("Silverfish", category+ " Worldgen Options", false, "Disable Ore Generation?");
		
		if (config.hasChanged() == true){
	        config.save();
	    }
	}
	
	public static void initRandomBones()
	{
		File f = new File(configDir, "Random Bones Modular.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "Random Bones Modular";
		
		// Mob Spawns
        config.addCustomCategoryComment(category + " Passive Bone Drops", "true or false");
        RandomBonesHandler.batBones = config.getBoolean("Bats Bones", category+ " Passive Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.chickenBones = config.getBoolean("Chicken Bones", category+ " Passive Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.cowBones = config.getBoolean("Cow Bones", category+ " Passive Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.horseBones = config.getBoolean("Horse Bones", category+ " Passive Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.mooshroomBones = config.getBoolean("Mooshroom Bones", category+ " Passive Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.ocelotBones = config.getBoolean("Ocelot Bones", category+ " Passive Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.pigBones = config.getBoolean("Pig Bones", category+ " Passive Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.rabbitBones = config.getBoolean("Rabbit Bones", category+ " Passive Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.sheepBones = config.getBoolean("Sheep Bones", category+ " Passive Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.wolfBones = config.getBoolean("Wolf Bones", category+ " Passive Bone Drops", false, "Drops bones when killed?");
        
        // Hostile
        config.addCustomCategoryComment(category + " Hostile Bone Drops", "true or false");
        RandomBonesHandler.blazeBones = config.getBoolean("Cave Spider Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.caveSpiderBones = config.getBoolean("Cave Spider Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.creeperBones = config.getBoolean("Creeper Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.endermanBones = config.getBoolean("Enderman Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.endermiteBones = config.getBoolean("Endermite Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.ghastBones = config.getBoolean("Ghast Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.giantZombieBones = config.getBoolean("Giant Zombie Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.guardianBones = config.getBoolean("Guardian Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.ironGolemBones = config.getBoolean("Cave Spider Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.magmaCubeBones = config.getBoolean("Cave Spider Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.pigZombieBones = config.getBoolean("Pig Zombie Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.polarBearBones = config.getBoolean("Polar bear Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.shulkerBones = config.getBoolean("Shulker Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.silverfishBones = config.getBoolean("Silverfish Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.skeletonBones = config.getBoolean("Cave Spider Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.slimeBones = config.getBoolean("Cave Spider Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.snowmanBones = config.getBoolean("Cave Spider Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.spiderBones = config.getBoolean("Spider Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.witchBones = config.getBoolean("Witch Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
        RandomBonesHandler.zombieBones = config.getBoolean("Zombie Bones", category+ " Hostile Bone Drops", false, "Drops bones when killed?");
		
		if (config.hasChanged() == true){
	        config.save();
	    }
	}
	
	public static void initRemove()
	{
		File f = new File(configDir, "Remove Vanilla Items Modular.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "Remove Vanilla Items Modular";
		
		// Mob Spawns
        config.addCustomCategoryComment(category + " Remove Recipes", "true or false");
        RemoveHandler.woodenTools = config.getBoolean("Wooden Tools", category + " Remove Recipes", false, "Disable?");
        RemoveHandler.stoneTools = config.getBoolean("Stone Tools", category + " Remove Recipes", false, "Disable?");
        RemoveHandler.goldenTools = config.getBoolean("Golden Tools", category + " Remove Recipes", false, "Disable?");
        RemoveHandler.ironTools = config.getBoolean("Iron Tools", category + " Remove Recipes", false, "Disable?");
        RemoveHandler.diamondTools = config.getBoolean("Diamond Tools", category + " Remove Recipes", false, "Disable?");
        RemoveHandler.goldenArmor = config.getBoolean("Golden Armor", category + " Remove Recipes", false, "Disable?");
        RemoveHandler.ironArmor = config.getBoolean("Iron Armor", category + " Remove Recipes", false, "Disable?");
        RemoveHandler.diamondArmor = config.getBoolean("Diamond Armor", category + " Remove Recipes", false, "Disable?");
		
		if (config.hasChanged() == true){
	        config.save();
	    }
	}
	
	public static void initRemoveMobs()
	{
		File f = new File(configDir, "Remove Mobs Modular.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "Remove Mobs Modular";
		
		// Passive
		config.addCustomCategoryComment(category + " Passive", "true or false");
		RemoveMobsHandler.bat = config.getBoolean("Bats", category + " Passive", false, "Disable Mob?");
		RemoveMobsHandler.chicken = config.getBoolean("Chickens", category + " Passive", false, "Disable Mob?");
		RemoveMobsHandler.cow = config.getBoolean("Cow", category + " Passive", false, "Disable Mob?");
		RemoveMobsHandler.mooshroom = config.getBoolean("Mooshroom", category + " Passive", false, "Disable Mob?");
		RemoveMobsHandler.pig = config.getBoolean("Pig", category + " Passive", false, "Disable Mob?");
		RemoveMobsHandler.sheep = config.getBoolean("Sheep", category + " Passive", false, "Disable Mob?");
		RemoveMobsHandler.squid = config.getBoolean("Squid", category + " Passive", false, "Disable Mob?");
		RemoveMobsHandler.villager = config.getBoolean("Villager", category + " Passive", false, "Disable Mob?");
		// Tamable
		config.addCustomCategoryComment(category + " Tamable", "true or false");
		RemoveMobsHandler.horse = config.getBoolean("Horse", category + " Tamable", false, "Disable Mob?");
		RemoveMobsHandler.donkey = config.getBoolean("Donkey", category + " Tamable", false, "Disable Mob?");
		RemoveMobsHandler.mule = config.getBoolean("Mule", category + " Tamable", false, "Disable Mob?");
		RemoveMobsHandler.ocelot = config.getBoolean("Ocelot", category + " Tamable", false, "Disable Mob?");
		RemoveMobsHandler.wolf = config.getBoolean("Wolf", category + " Tamable", false, "Disable Mob?");
		// Neutral
		config.addCustomCategoryComment(category + " Neutral", "true or false");
		RemoveMobsHandler.ironGolem = config.getBoolean("Iron Golem", category + " Neutral", false, "Disable Mob?");
		RemoveMobsHandler.snowGolem = config.getBoolean("Snow Golem", category + " Neutral", false, "Disable Mob?");
		RemoveMobsHandler.spider = config.getBoolean("Spider", category + " Neutral", false, "Disable Mob?");
		RemoveMobsHandler.caveSpider = config.getBoolean("Cave Spider", category + " Neutral", false, "Disable Mob?");
		RemoveMobsHandler.enderman = config.getBoolean("Enderman", category + " Neutral", false, "Disable Mob?");
		RemoveMobsHandler.zombiePigman = config.getBoolean("Zombie Pigman", category + " Neutral", false, "Disable Mob?");
		RemoveMobsHandler.polarBear = config.getBoolean("Polar Bear", category + " Neutral", false, "Disable Mob?");
		// Hostile
		config.addCustomCategoryComment(category + " Hostile", "true or false");
		RemoveMobsHandler.blaze = config.getBoolean("Blaze", category + " Hostile", false, "Disable Mob?");
		RemoveMobsHandler.chickenJockey = config.getBoolean("Chicken Jockey", category + " Hostile", false, "Disable Mob?");
		RemoveMobsHandler.creeper = config.getBoolean("Creeper", category + " Hostile", false, "Disable Mob?");
		RemoveMobsHandler.ghast = config.getBoolean("Ghast", category + " Hostile", false, "Disable Mob?");
		RemoveMobsHandler.magmaCube = config.getBoolean("Magma Cube", category + " Hostile", false, "Disable Mob?");
		RemoveMobsHandler.silverfish = config.getBoolean("Silverfish", category + " Hostile", false, "Disable Mob?");
		RemoveMobsHandler.skeleton = config.getBoolean("Skeleton", category + " Hostile", false, "Disable Mob?");
		RemoveMobsHandler.slime = config.getBoolean("Slime", category + " Hostile", false, "Disable Mob?");
		RemoveMobsHandler.spiderJockey = config.getBoolean("Spider Jockey", category + " Hostile", false, "Disable Mob?");
		RemoveMobsHandler.witch = config.getBoolean("Witch", category + " Hostile", false, "Disable Mob?");
		RemoveMobsHandler.witherSkeleton = config.getBoolean("Wither Skeleton", category + " Hostile", false, "Disable Mob?");
		RemoveMobsHandler.zombie = config.getBoolean("Zombie", category + " Hostile", false, "Disable Mob?");
		RemoveMobsHandler.zombieVillager = config.getBoolean("Zombie Villager", category + " Hostile", false, "Disable Mob?");
		RemoveMobsHandler.guardian = config.getBoolean("Guardian", category + " Hostile", false, "Disable Mob?");
		RemoveMobsHandler.shulker = config.getBoolean("Shulker", category + " Hostile", false, "Disable Mob?");
		RemoveMobsHandler.endermite = config.getBoolean("Endermite", category + " Hostile", false, "Disable Mob?");
		// Boss
		config.addCustomCategoryComment(category + " Boss", "true or false");
		RemoveMobsHandler.wither = config.getBoolean("Wither", category + " Boss", false, "Disable Mob?");
		RemoveMobsHandler.elderGuardian = config.getBoolean("Elder Gaurdian", category + " Boss", false, "Disable Mob?");
		
		if (config.hasChanged() == true){
	        config.save();
	    }
	}
	
	public static void initTerrainControl()
	{
		File f = new File(configDir, "Terrain Control Modular.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "Terrain Control Modular";
		
		// Mob Spawns
        config.addCustomCategoryComment(category + " Worldgen Options", "true or false");
        TerrainControlHandler.noBigShroom = config.getBoolean("Big Shrooms", category + " Worldgen Options", false, "Disable Big Shrooms from Generating?");
        TerrainControlHandler.noCactus = config.getBoolean("Cactus", category + " Worldgen Options", false, "Disable Cactus from Generating?");
        TerrainControlHandler.noClay = config.getBoolean("Clay", category + " Worldgen Options", false, "Disable Clay from Generating?");
        TerrainControlHandler.noCustom = config.getBoolean("Custom", category + " Worldgen Options", false, "Disable Custom Decorations from Generating?");
        TerrainControlHandler.noBush = config.getBoolean("Dead Bush", category + " Worldgen Options", false, "Disable Dead Bushes from Generating?");
        TerrainControlHandler.noLilypad = config.getBoolean("Lilypads", category + " Worldgen Options", false, "Disable Lilypads from Generating?");
        TerrainControlHandler.noFlowers = config.getBoolean("Flowers", category + " Worldgen Options", false, "Disable Flowers from Generating?");
        TerrainControlHandler.noGrass = config.getBoolean("Grass", category + " Worldgen Options", false, "Disable Grass from Generating?");
        TerrainControlHandler.noPumpkin = config.getBoolean("Pumpkins", category + " Worldgen Options", false, "Disable Pumpkins from Generating?");
        TerrainControlHandler.noReed = config.getBoolean("Sugar Cane", category + " Worldgen Options", false, "Disable Sugar Cane from Generating?");
        TerrainControlHandler.noSand = config.getBoolean("Sand", category + " Worldgen Options", false, "Disable Sand from Generating?");
        TerrainControlHandler.noSand2 = config.getBoolean("Sand Stone", category + " Worldgen Options", false, "Disable Sand Stone from Generating?");
        TerrainControlHandler.noShroom = config.getBoolean("Little Shrooms", category + " Worldgen Options", false, "Disable Little Shrooms from Generating?");
        TerrainControlHandler.noTree = config.getBoolean("Trees", category + " Worldgen Options", false, "Disable Trees from Generating?");
        TerrainControlHandler.plainsTrees = config.getBoolean("Plains Biome Trees", category + " Worldgen Options", false, "Enable Tree Generation in the Plains Biome?");
        
		if (config.hasChanged() == true){
	        config.save();
	    }
	}
	
	public static void initUncrafting()
	{
		File f = new File(configDir, "Uncrafting Modular.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "Uncrafting Modular";
		
        config.addCustomCategoryComment(category + " Uncrafting Recipes", "true or false");
        UncraftingHandler.blaze_powder = config.getBoolean("Blaze Rod", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.bowl = config.getBoolean("Bowl", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.brick_block = config.getBoolean("Brick Block", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.crafting_table = config.getBoolean("Crafting Table", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe? (Do not Enable if you have TINKERS installed)");
        UncraftingHandler.furnace = config.getBoolean("Furnace", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.glass_bottle = config.getBoolean("Glass Bottles", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.glowstone = config.getBoolean("Glowstone", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.ladder = config.getBoolean("Ladders", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.leather = config.getBoolean("Leather Armor", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.nether_brick = config.getBoolean("Nether Brick", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.paper = config.getBoolean("Paper", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.prizmarine = config.getBoolean("Prizmarine", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.quartz_block = config.getBoolean("Quartz Block", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.quartz_block1 = config.getBoolean("Chiseled Quartz", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.quartz_block2 = config.getBoolean("Pillar Quartz", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.red_sandstone = config.getBoolean("Red Sandstone", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.red_sandstone2 = config.getBoolean("Red Sandstone 2", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.sandstone = config.getBoolean("Sandstone", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.sandstone1 = config.getBoolean("Chiseled Sandstone", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.sandstone2 = config.getBoolean("Smooth Sandstone", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.sticks = config.getBoolean("Sticks", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.stone2 = config.getBoolean("Polished Granite", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.stone4 = config.getBoolean("Polished Diorite", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.stone6 = config.getBoolean("Polished Andesite", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.stonebrick = config.getBoolean("Stone Brick", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.stonebrick3 = config.getBoolean("Chiseled Stone Brick", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.uncraftSeedsOff = config.getBoolean("Wheat Seeds", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
        UncraftingHandler.wool = config.getBoolean("Wool Block", category + " Uncrafting Recipes", false, "Enable Uncrafting Recipe?");
		
		if (config.hasChanged() == true){
	        config.save();
	    }
	}
}
