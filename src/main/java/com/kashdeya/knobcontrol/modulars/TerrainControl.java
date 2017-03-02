package com.kashdeya.knobcontrol.modulars;

import java.util.Random;

import net.minecraft.init.Biomes;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.kashdeya.knobcontrol.handlers.ModularsHandler;
import com.kashdeya.knobcontrol.handlers.TerrainControlHandler;

public class TerrainControl {
	
	@SubscribeEvent(priority = EventPriority.LOWEST)
	public void noTerraingen(DecorateBiomeEvent.Decorate event){
		if (ModularsHandler.terrainControl){
			EventType type = event.getType();
			switch(type){
			case BIG_SHROOM:
				if (TerrainControlHandler.noBigShroom){
					event.setResult(Event.Result.DENY);
				}
				break;
			case CACTUS:
				if (TerrainControlHandler.noCactus){
					event.setResult(Event.Result.DENY);
				}
				break;
			case CLAY:
				if (TerrainControlHandler.noClay){
					event.setResult(Event.Result.DENY);
				}
				break;
			case CUSTOM:
				if (TerrainControlHandler.noCustom){
					event.setResult(Event.Result.DENY);
				}
				break;
			case DEAD_BUSH:
				if (TerrainControlHandler.noBush){
					event.setResult(Event.Result.DENY);
				}
				break;
			case LILYPAD:
				if (TerrainControlHandler.noLilypad){
					event.setResult(Event.Result.DENY);
				}
				break;
			case FLOWERS:
				if (TerrainControlHandler.noFlowers){
					event.setResult(Event.Result.DENY);
				}
				break;
			case GRASS:
				if (TerrainControlHandler.noGrass){
					event.setResult(Event.Result.DENY);
				}
				break;
			case PUMPKIN:
				if (TerrainControlHandler.noPumpkin){
					event.setResult(Event.Result.DENY);
				}
				break;
			case REED:
				if (TerrainControlHandler.noReed){
					event.setResult(Event.Result.DENY);
				}
				break;
			case SAND:
				if (TerrainControlHandler.noSand){
					event.setResult(Event.Result.DENY);
				}
				break;
			case SAND_PASS2:
				if (TerrainControlHandler.noSand2){
					event.setResult(Event.Result.DENY);
				}
				break;
			case SHROOM:
				if (TerrainControlHandler.noShroom){
					event.setResult(Event.Result.DENY);
				}
				break;
			case TREE:
				if (TerrainControlHandler.noTree){
					event.setResult(Event.Result.DENY);
				}
				break;
			default:
			}
		}
	}
	
	@SubscribeEvent
	public void decorate(DecorateBiomeEvent.Decorate event) {
		if (ModularsHandler.terrainControl){
			World world = event.getWorld();
			Biome biome = world.getBiomeForCoordsBody(event.getPos());
			Random rand = event.getRand();

			if((biome == Biomes.PLAINS || biome == Biomes.MUTATED_PLAINS) && event.getType() == EventType.TREE && TerrainControlHandler.plainsTrees) {
				
				int amount = (int) Math.max(4, 8);
				for(int i = 0; i < amount; i++) {
					int x = rand.nextInt(16) + 8;
					int y = rand.nextInt(16) + 8;
					}
				}
		}
	}
}
