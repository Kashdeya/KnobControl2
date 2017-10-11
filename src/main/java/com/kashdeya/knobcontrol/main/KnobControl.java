package com.kashdeya.knobcontrol.main;

import java.io.File;
import java.util.Iterator;

import com.kashdeya.knobcontrol.config.Config;
import com.kashdeya.knobcontrol.crafting.RecipeRegistry;
import com.kashdeya.knobcontrol.handlers.BedrockHandler;
import com.kashdeya.knobcontrol.handlers.ClientHandler;
import com.kashdeya.knobcontrol.handlers.ModularsHandler;
import com.kashdeya.knobcontrol.handlers.ServerHandler;
import com.kashdeya.knobcontrol.modulars.Crafting;
import com.kashdeya.knobcontrol.modulars.Events;
import com.kashdeya.knobcontrol.modulars.Furnace;
import com.kashdeya.knobcontrol.modulars.ItemStacks;
import com.kashdeya.knobcontrol.modulars.LightLevels;
import com.kashdeya.knobcontrol.modulars.MobDrops;
import com.kashdeya.knobcontrol.modulars.MobSpawns;
import com.kashdeya.knobcontrol.modulars.OreControl;
import com.kashdeya.knobcontrol.modulars.RandomBones;
import com.kashdeya.knobcontrol.modulars.Remove;
import com.kashdeya.knobcontrol.modulars.RemoveDrops;
import com.kashdeya.knobcontrol.modulars.RemoveMobs;
import com.kashdeya.knobcontrol.modulars.TerrainControl;
import com.kashdeya.knobcontrol.modulars.Uncrafting;
import com.kashdeya.knobcontrol.proxy.CommonProxy;
import com.kashdeya.knobcontrol.util.BlockRegistry;
import com.kashdeya.knobcontrol.util.Client;
import com.kashdeya.knobcontrol.util.PotionShift;
import com.kashdeya.knobcontrol.util.Server;

import net.minecraft.client.Minecraft;
import net.minecraft.client.tutorial.TutorialSteps;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.GameRules;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.registries.IForgeRegistryModifiable;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class KnobControl {
	
	@Instance(Reference.MOD_ID)
    public static KnobControl instance;
	
	@SidedProxy(clientSide=Reference.PROXY_CLIENT, serverSide=Reference.PROXY_COMMON)
	public static CommonProxy PROXY;
	
	public static final File configDir = new File("config/Knob Control");
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent e) {
		// Configs
		Config.initCrafting();
		Config.initEvents();
		Config.initFurnace();
		Config.initHardcore();
		Config.initMain();
		Config.initMobSpawns();
		Config.initOreControl();
		Config.initRandomBones();
		Config.initRemove();
		Config.initRemoveMobs();
		Config.initStacks();
		Config.initTerrainControl();
		Config.initUncrafting();
		Config.initRemoveDrops();
		Config.initLightLevels();
		
    	// Modular Events
		MinecraftForge.EVENT_BUS.register(instance);
		
		if (ModularsHandler.events){
			MinecraftForge.EVENT_BUS.register(new Events());
		}
		if (ModularsHandler.oreControl){
			MinecraftForge.ORE_GEN_BUS.register(new OreControl());
		}
		if (ModularsHandler.randomBones){
			MinecraftForge.EVENT_BUS.register(new RandomBones());
		}
		if (ModularsHandler.removeDrops){
			MinecraftForge.EVENT_BUS.register(new RemoveDrops());
		}
		if (ModularsHandler.removeMobs){
			MinecraftForge.EVENT_BUS.register(new RemoveMobs());
		}
		if (ModularsHandler.lightLevels){
			MinecraftForge.EVENT_BUS.register(new LightLevels());
		}
		if (ModularsHandler.terrainControl){
			MinecraftForge.TERRAIN_GEN_BUS.register(new TerrainControl());
		}
		if (ModularsHandler.mobDrops){
			MinecraftForge.EVENT_BUS.register(new MobDrops());
		}
		if (ModularsHandler.mobSpawns){
			MobSpawns.spawn();
		}		
		if (ModularsHandler.itemStacks){
			ItemStacks.registerTweaks();
		}
		if (ServerHandler.noPortal){
			BlockRegistry.initBlockRegistry();
			MinecraftForge.EVENT_BUS.register(new BlockRegistry());
		}
		
		// Server Only
		MinecraftForge.EVENT_BUS.register(new Server());
		
		// Client Only
		if (e.getSide() == Side.CLIENT) 
		{  
			MinecraftForge.EVENT_BUS.register(new Client());
			if (ClientHandler.potionShift){
				MinecraftForge.EVENT_BUS.register(new PotionShift());
			}
		}
		
    	// Recipes
		if (ModularsHandler.crafting){
			Crafting.registerRecipes();
		}
		if (ModularsHandler.remove){
			Remove.registerRecipes();
		}
		if (ModularsHandler.uncrafting){
			Uncrafting.registerRecipes();
		}
		
    	// FuelHandler
		if (ModularsHandler.furnace){
			GameRegistry.registerFuelHandler(new Furnace());
		}
		
    	// Load WorldGeneration
		if (BedrockHandler.flatBedrock)
		{
    		GameRegistry.registerWorldGenerator(new BedrockHandler(), 0);
    	}
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	PROXY.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
			MobDrops.generateConfigFile(new Configuration(new File(configDir, "Mob Drops Modular.cfg")));
			
			if (ClientHandler.tutStuff){
				Minecraft.getMinecraft().getTutorial().setStep(TutorialSteps.NONE);
			}
			
    }
    
    @EventHandler
    public void serverStart(FMLServerStartedEvent e){
    	GameRules game = FMLCommonHandler.instance().getMinecraftServerInstance().worlds[0].getGameRules();
    	
    	if (ServerHandler.keepInvo){
    		game.setOrCreateGameRule("keepInventory", "true");
    	}
    	
		if (ServerHandler.regenOff){
			game.setOrCreateGameRule("naturalRegeneration", "false");
		}
		
		if (ServerHandler.lightCycle){
			game.setOrCreateGameRule("doDaylightCycle", "false");
		}
		
		if (ServerHandler.fireTick){
			game.setOrCreateGameRule("doFireTick", "false");
		}
		
		if (ServerHandler.mobGriefing){
			game.setOrCreateGameRule("mobGriefing", "false");
		}
		
		if (ServerHandler.pvp){
			game.setOrCreateGameRule("pvp", "false");
		}
    }
    
    @SubscribeEvent
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        IForgeRegistryModifiable<IRecipe> registry = (IForgeRegistryModifiable<IRecipe>) event.getRegistry();
        Iterator<ResourceLocation> iterator = RecipeRegistry.removeList.iterator();

        while (iterator.hasNext()) {
            registry.remove(iterator.next());
        }
    }
}
