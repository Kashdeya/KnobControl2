package com.kashdeya.knobcontrol.proxy;

import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.knobcontrol.modulars.Crafting;
import com.kashdeya.knobcontrol.modulars.Furnace;
import com.kashdeya.knobcontrol.modulars.Remove;
import com.kashdeya.knobcontrol.modulars.Uncrafting;

public class CommonProxy {
	
	public void registerTileEntities() {
    	// Tile Entities		
	}

    public void init() {
    	// Recipes
    	Crafting.registerRecipes();
    	Remove.registerRecipes();
    	Uncrafting.registerRecipes();
    	
    	// FuelHandler
    	GameRegistry.registerFuelHandler(new Furnace());
    	// Load WorldGeneration

    }

	public void registerRenderers() {
		//unused - only called clientside
	}
}
