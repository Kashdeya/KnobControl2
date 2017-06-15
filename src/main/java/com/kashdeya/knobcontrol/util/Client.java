package com.kashdeya.knobcontrol.util;

import com.kashdeya.knobcontrol.handlers.ClientHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Client {
	
	@SubscribeEvent
	public void onItemTooltipEvent(ItemTooltipEvent event){
		if (ClientHandler.foodInfoOff){
		if(event.getItemStack() != null && event.getItemStack().getItem() instanceof ItemFood){
			ItemFood food = (ItemFood) event.getItemStack().getItem();

			int heal = food.getHealAmount(event.getItemStack());
			float saturation = food.getSaturationModifier(event.getItemStack());

			event.getToolTip().add("Heal=" + heal + " Saturation=" + saturation);
			}
		}
	}
	
	@SubscribeEvent
	public void fovChanged(FOVUpdateEvent event)
	{
		if (ClientHandler.fovOff){
		event.setNewfov(1.0F);
		}
	}
	
	@SubscribeEvent
	public void onPotionOverlayEvent(RenderGameOverlayEvent.Pre e){
			if (ClientHandler.potionOff){
		if(e.getType() == RenderGameOverlayEvent.ElementType.POTION_ICONS){
				e.setCanceled(true);
			}
		}
	}
	
	@SubscribeEvent
	public void onTick(TickEvent.RenderTickEvent event)
	{
		if (ClientHandler.f3Off){
		Minecraft.getMinecraft().gameSettings.showDebugInfo = false;
		}
	}
}
