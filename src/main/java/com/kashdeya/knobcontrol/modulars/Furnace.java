package com.kashdeya.knobcontrol.modulars;

import com.kashdeya.knobcontrol.handlers.FurnaceHandler;
import com.kashdeya.knobcontrol.handlers.ModularsHandler;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class Furnace implements IFuelHandler {
	
	public static int PaperBurnTime = 50;
	public static int BowlBurnTime = 200;
	public static int LadderBurnTime = 300;
	public static int WoodenPressurePlateBurnTime = 100;
	public static int SignBurnTime = 200;
	public static int BushBurnTime = 150;
	public static int FrameBurnTime = 750;
	public static int PaintingBurnTime = 750;
	public static int HayBurnTime = 750;
	public static int CarpetBurnTime = 150;
	public static int DoorsBurnTime = 1800;
	public static int ButtonBurnTime = 100;
	public static int BoatBurnTime = 1500;
	public static int BookBurnTime = 750;
	public static int MapBurnTime = 250;
	public static int StandBurnTime = 500;
	public static int FireBurnTime = 1200;
	public static int BlazeBurnTime = 1500;
	public static int BlazeRodBurnTime = 3000;
	public static int CreamBurnTime = 1800;
	public static int ShieldBurnTime = 1500;
	public static int DragonBurnTime = 2500;
	public static int TntBurnTime = 5000;
	public static int TorchBurnTime = 150;
	
	@Override
    public int getBurnTime(ItemStack fuel) {
		if (ModularsHandler.furnace){
			ItemStack itemStack = fuel;
			if (FurnaceHandler.paperBurn){
				if (fuel.getItem() == Items.PAPER) { return PaperBurnTime; }
			}
			if (FurnaceHandler.bowlBurn){
				if (fuel.getItem() == Items.BOWL) { return BowlBurnTime; }
			}
			if (FurnaceHandler.ladderBurn){
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.LADDER)) { return LadderBurnTime; }
			}
			if (FurnaceHandler.woodenPressurePlateBurn){
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.WOODEN_PRESSURE_PLATE)) { return WoodenPressurePlateBurnTime; }
			}
			if (FurnaceHandler.signBurn){
				if (fuel.getItem() == Items.SIGN) { return SignBurnTime; }
			}
			if (FurnaceHandler.bushBurn){
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.DEADBUSH)) { return BushBurnTime; }
			}
			if (FurnaceHandler.frameBurn){
				if (fuel.getItem() == Items.ITEM_FRAME) { return FrameBurnTime; }
			}
			if (FurnaceHandler.paintingBurn){
				if (fuel.getItem() == Items.PAINTING) { return PaintingBurnTime; }
			}
			if (FurnaceHandler.hayBurn){
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.HAY_BLOCK)) { return HayBurnTime; }
			}
			if (FurnaceHandler.carpetBurn){
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.CARPET)) { return CarpetBurnTime; }
			}
			if (FurnaceHandler.doorsBurn){
				if (fuel.getItem() == Items.OAK_DOOR) { return DoorsBurnTime; }
				if (fuel.getItem() == Items.ACACIA_DOOR) { return DoorsBurnTime; }
				if (fuel.getItem() == Items.BIRCH_DOOR) { return DoorsBurnTime; }
				if (fuel.getItem() == Items.DARK_OAK_DOOR) { return DoorsBurnTime; }
				if (fuel.getItem() == Items.JUNGLE_DOOR) { return DoorsBurnTime; }
				if (fuel.getItem() == Items.SPRUCE_DOOR) { return DoorsBurnTime; }
			}
			if (FurnaceHandler.buttonBurn){
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.WOODEN_BUTTON)) { return ButtonBurnTime; }
			}
			if (FurnaceHandler.boatBurn){
				if (fuel.getItem() == Items.BOAT) { return BoatBurnTime; }
				if (fuel.getItem() == Items.ACACIA_BOAT) { return BoatBurnTime; }
				if (fuel.getItem() == Items.BIRCH_BOAT) { return BoatBurnTime; }
				if (fuel.getItem() == Items.DARK_OAK_BOAT) { return BoatBurnTime; }
				if (fuel.getItem() == Items.JUNGLE_BOAT) { return BoatBurnTime; }
		        if (fuel.getItem() == Items.SPRUCE_BOAT) { return BoatBurnTime; }
			}
			if (FurnaceHandler.bookBurn){
				if (fuel.getItem() == Items.WRITABLE_BOOK) { return BookBurnTime; }
				if (fuel.getItem() == Items.BOOK) { return BookBurnTime; }
		        if (fuel.getItem() == Items.WRITTEN_BOOK) { return BookBurnTime; }
			}
			if (FurnaceHandler.mapBurn){
				if (fuel.getItem() == Items.MAP) { return MapBurnTime; }
		        if (fuel.getItem() == Items.FILLED_MAP){ return MapBurnTime; }
			}
			if (FurnaceHandler.standBurn){
				if (fuel.getItem() == Items.ARMOR_STAND) { return StandBurnTime; }
			}
			if (FurnaceHandler.fireBurn){
				if (fuel.getItem() == Items.FIRE_CHARGE) { return FireBurnTime; }
			}
			if (FurnaceHandler.blazeBurn){
				if (fuel.getItem() == Items.BLAZE_POWDER) { return BlazeBurnTime; }
			}
			if (FurnaceHandler.blazeRodBurn){
				if (fuel.getItem() == Items.BLAZE_ROD) { return BlazeRodBurnTime; }
			}
			if (FurnaceHandler.creamBurn){
				if (fuel.getItem() == Items.MAGMA_CREAM) { return CreamBurnTime; }
			}
			if (FurnaceHandler.shieldBurn){
				if (fuel.getItem() == Items.SHIELD) { return ShieldBurnTime; }
			}
			if (FurnaceHandler.dragonBurn){
				if (fuel.getItem() == Items.DRAGON_BREATH) { return DragonBurnTime; }
			}
			if (FurnaceHandler.tntBurn){
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.TNT)) { return TntBurnTime; }
			}
			if (FurnaceHandler.torchBurn){
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.TORCH)) { return TorchBurnTime; }
			}
		}
		return 0;
    }
}
