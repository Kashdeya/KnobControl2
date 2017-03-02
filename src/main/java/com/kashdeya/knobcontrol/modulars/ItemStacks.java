package com.kashdeya.knobcontrol.modulars;

import net.minecraft.init.Items;

import com.kashdeya.knobcontrol.handlers.ItemStackHandler;
import com.kashdeya.knobcontrol.handlers.ModularsHandler;

public class ItemStacks {
	
	public static void registerTweaks()
	{
		if (ModularsHandler.itemStacks){
			if (ItemStackHandler.boat){
				Items.BOAT.setMaxStackSize(ItemStackHandler.boatStack);
			}
			if (ItemStackHandler.sboat){
				Items.SPRUCE_BOAT.setMaxStackSize(ItemStackHandler.sboatStack);
			}
			if (ItemStackHandler.jboat){
				Items.BIRCH_BOAT.setMaxStackSize(ItemStackHandler.bboatStack);
			}
			if (ItemStackHandler.jboat){
				Items.JUNGLE_BOAT.setMaxStackSize(ItemStackHandler.jboatStack);
			}
			if (ItemStackHandler.doboat){
				Items.DARK_OAK_BOAT.setMaxStackSize(ItemStackHandler.doboatStack);
			}
			if (ItemStackHandler.aboat){
				Items.ACACIA_BOAT.setMaxStackSize(ItemStackHandler.aboatStack);
			}
			if (ItemStackHandler.minecart){
				Items.MINECART.setMaxStackSize(ItemStackHandler.minecartStack);
			}
			if (ItemStackHandler.fm){
				Items.FURNACE_MINECART.setMaxStackSize(ItemStackHandler.fmStack);
			}
			if (ItemStackHandler.cm){
				Items.CHEST_MINECART.setMaxStackSize(ItemStackHandler.cmStack);
			}
			if (ItemStackHandler.hm){
				Items.HOPPER_MINECART.setMaxStackSize(ItemStackHandler.hmStack);
			}
			if (ItemStackHandler.tm){
				Items.TNT_MINECART.setMaxStackSize(ItemStackHandler.tmStack);
			}
			if (ItemStackHandler.cake){
				Items.CAKE.setMaxStackSize(ItemStackHandler.cakeStack);
			}
			if (ItemStackHandler.snowball){
				Items.SNOWBALL.setMaxStackSize(ItemStackHandler.snowballStack);
			}
			if (ItemStackHandler.egg){
				Items.EGG.setMaxStackSize(ItemStackHandler.eggStack);
			}
			if (ItemStackHandler.pearl){
				Items.ENDER_PEARL.setMaxStackSize(ItemStackHandler.pearlStack);
			}
			if (ItemStackHandler.saddle){
				Items.SADDLE.setMaxStackSize(ItemStackHandler.saddleStack);
			}
			if (ItemStackHandler.bed){
				Items.BED.setMaxStackSize(ItemStackHandler.bedStack);
			}
			if (ItemStackHandler.sign){
				Items.SIGN.setMaxStackSize(ItemStackHandler.signStack);
			}
			if (ItemStackHandler.stand){
				Items.ARMOR_STAND.setMaxStackSize(ItemStackHandler.standStack);
			}
			if (ItemStackHandler.bucket){
				Items.BUCKET.setMaxStackSize(ItemStackHandler.bucketStack);
			}
			if (ItemStackHandler.writable){
				Items.WRITABLE_BOOK.setMaxStackSize(ItemStackHandler.writableStack);
			}
			if (ItemStackHandler.goldenhorse){
				Items.GOLDEN_HORSE_ARMOR.setMaxStackSize(ItemStackHandler.goldenhorseStack);
			}
			if (ItemStackHandler.ironhorse){
				Items.IRON_HORSE_ARMOR.setMaxStackSize(ItemStackHandler.ironhorseStack);
			}
			if (ItemStackHandler.diamondhorse){
				Items.DIAMOND_HORSE_ARMOR.setMaxStackSize(ItemStackHandler.diamondhorseStack);
			}
			if (ItemStackHandler.stew){
				Items.MUSHROOM_STEW.setMaxStackSize(ItemStackHandler.stewStack);
			}
			if (ItemStackHandler.rabbit){
				Items.RABBIT_STEW.setMaxStackSize(ItemStackHandler.rabbitStack);
			}
			if (ItemStackHandler.beet){
				Items.BEETROOT_SOUP.setMaxStackSize(ItemStackHandler.beetStack);
			}
		}
	}
}
