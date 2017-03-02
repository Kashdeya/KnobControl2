package com.kashdeya.knobcontrol.modulars;

import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.kashdeya.knobcontrol.handlers.ModularsHandler;
import com.kashdeya.knobcontrol.handlers.OreHandler;

public class OreControl {
	
	@SubscribeEvent(priority = EventPriority.LOWEST)
	public void onOreGenMinable(OreGenEvent.GenerateMinable event){
		if (ModularsHandler.oreControl){
			EventType type = event.getType();
			switch(type){
			case DIORITE:
	            if (OreHandler.noDiorite)
	            {
	                event.setResult(Event.Result.DENY);
	            }
	            break;
	        case GRANITE:
	            if (OreHandler.noGranite)
	            {
	                event.setResult(Event.Result.DENY);
	            }
	            break;
	        case ANDESITE:
	            if (OreHandler.noAndesite)
	            {
	                event.setResult(Event.Result.DENY);
	            }
	            break;
	        case DIRT:
	            if (OreHandler.noDirt)
	            {
	                event.setResult(Event.Result.DENY);
	            }
	            break;
	        case GRAVEL:
	            if (OreHandler.noGravel)
	            {
	                event.setResult(Event.Result.DENY);
	            }
	            break;
	        case COAL:
	            if (OreHandler.noCoal)
	            {
	                event.setResult(Event.Result.DENY);
	            }
	            break;
	        case DIAMOND:
	            if (OreHandler.noDiamond)
	            {
	                event.setResult(Event.Result.DENY);
	            }
	            break;
	        case GOLD:
	            if (OreHandler.noGold)
	            {
	                event.setResult(Event.Result.DENY);
	            }
	            break;
	        case IRON:
	            if (OreHandler.noIron)
	            {
	                event.setResult(Event.Result.DENY);
	            }
	            break;
	        case LAPIS:
	            if (OreHandler.noLapis)
	            {
	                event.setResult(Event.Result.DENY);
	            }
	            break;
	        case REDSTONE:
	            if (OreHandler.noRedstone)
	            {
	                event.setResult(Event.Result.DENY);
	            }
	            break;
	        case QUARTZ:
	            if (OreHandler.noQuartz)
	            {
	                event.setResult(Event.Result.DENY);
	            }
	            break;
	        case EMERALD:
	            if (OreHandler.noEmerald)
	            {
	                event.setResult(Event.Result.DENY);
	            }
	            break;
	        case SILVERFISH:
	            if (OreHandler.noSilverFish)
	            {
	                event.setResult(Event.Result.DENY);
	            }
	            break;
	        case CUSTOM:
	            if (OreHandler.noCustom)
	            {
	            	event.setResult(Event.Result.DENY);
	            }
	            break;
	        default:
			}
		}
	}
}
