package com.kashdeya.knobcontrol.util;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class BlockRegistry {
	
	public static final List<Block> blocks = new ArrayList();
	public static final String fakeportalItemName = "fakeportal";
	public static Block fakeportal;
	public static ItemBlock fakeportalItemBlock;
	private static boolean initialized = false;
	
	public static void initBlockRegistry(){
	    registerFakePortal();
	    initialized = true;
	}
	  
	private static void registerFakePortal(){
	    fakeportal = new FakePortalBlock();
	    fakeportalItemBlock = new ItemBlock(fakeportal);
	    
	    registerBlock("minecraft:portal", fakeportalItemBlock, fakeportal);
	}
	  
	public static void registerBlock(String registerName, ItemBlock itemBlock, Block block){
	    block.setRegistryName(registerName);
	    block.setUnlocalizedName(registerName);
	    blocks.add(block);
	    
	    if (itemBlock != null){
	      itemBlock.setRegistryName(registerName);
	      itemBlock.setUnlocalizedName(registerName);
	    }
	}
	  
	public static void registerBlock(String registerName, Block block){
	    ItemBlock itemBlock = new ItemBlock(block);
	    registerBlock(registerName, itemBlock, block);
	}
	  
	@SubscribeEvent
	public void onBlockRegistry(RegistryEvent.Register<Block> e){
	    IForgeRegistry<Block> reg = e.getRegistry();
	    reg.registerAll((Block[])blocks.toArray(new Block[0]));
	}
}
