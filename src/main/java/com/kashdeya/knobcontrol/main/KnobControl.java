package com.kashdeya.knobcontrol.main;

import java.io.File;

import net.minecraft.world.GameRules;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import com.kashdeya.knobcontrol.config.Config;
import com.kashdeya.knobcontrol.handlers.BedrockHandler;
import com.kashdeya.knobcontrol.handlers.ClientHandler;
import com.kashdeya.knobcontrol.handlers.ModularsHandler;
import com.kashdeya.knobcontrol.handlers.ServerHandler;
import com.kashdeya.knobcontrol.modulars.Events;
import com.kashdeya.knobcontrol.modulars.ItemStacks;
import com.kashdeya.knobcontrol.modulars.LightLevels;
import com.kashdeya.knobcontrol.modulars.MobDrops;
import com.kashdeya.knobcontrol.modulars.MobSpawns;
import com.kashdeya.knobcontrol.modulars.OreControl;
import com.kashdeya.knobcontrol.modulars.RandomBones;
import com.kashdeya.knobcontrol.modulars.RemoveDrops;
import com.kashdeya.knobcontrol.modulars.RemoveMobs;
import com.kashdeya.knobcontrol.modulars.TerrainControl;
import com.kashdeya.knobcontrol.proxy.CommonProxy;
import com.kashdeya.knobcontrol.util.Client;
import com.kashdeya.knobcontrol.util.PotionShift;
import com.kashdeya.knobcontrol.util.Server;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class KnobControl {
	
	@Instance(Reference.MOD_ID)
    public static KnobControl instance;
	
	@SidedProxy(clientSide=Reference.PROXY_CLIENT, serverSide=Reference.PROXY_COMMON)
	public static CommonProxy PROXY;
	
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
		
    	// Events
		MinecraftForge.EVENT_BUS.register(instance);
		MinecraftForge.EVENT_BUS.register(new Events());
		MinecraftForge.ORE_GEN_BUS.register(new OreControl());
		MinecraftForge.EVENT_BUS.register(new RandomBones());
		MinecraftForge.EVENT_BUS.register(new RemoveDrops());
		MinecraftForge.EVENT_BUS.register(new RemoveMobs());
		MinecraftForge.EVENT_BUS.register(new LightLevels());
		MinecraftForge.TERRAIN_GEN_BUS.register(new TerrainControl());
		MinecraftForge.EVENT_BUS.register(new Server());
		
		// Extras
		if (ModularsHandler.mobSpawns){
			MobSpawns.spawn();
		}
		
		if (ModularsHandler.itemStacks){
			ItemStacks.registerTweaks();
		}
		
		if (BedrockHandler.flatBedrock)
		{
    		GameRegistry.registerWorldGenerator(new BedrockHandler(), 0);
    	}
		
		
		if (e.getSide() == Side.CLIENT) 
		{  
			MinecraftForge.EVENT_BUS.register(new Client());
			if (ClientHandler.potionShift){
				MinecraftForge.EVENT_BUS.register(new PotionShift());
			}
		}
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	PROXY.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
		
		MobDrops.generateConfigFile(new Configuration(new File(Config.configDir, "mobdrops.cfg")));
    }
    
    @EventHandler
    public void serverStart(FMLServerStartedEvent e){
    	GameRules game = FMLCommonHandler.instance().getMinecraftServerInstance().worldServers[0].getGameRules();
    	
    	if (ServerHandler.keepInvo){
    		game.setOrCreateGameRule("keepInventory", "true");
    	}
    }
}
