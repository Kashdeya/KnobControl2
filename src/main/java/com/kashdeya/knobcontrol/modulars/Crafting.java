package com.kashdeya.knobcontrol.modulars;

import java.util.ArrayList;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.kashdeya.knobcontrol.handlers.CraftingHandler;
import com.kashdeya.knobcontrol.handlers.ModularsHandler;

public class Crafting {
	
	public static void registerRecipes(){
		
		if (ModularsHandler.crafting){
			if (CraftingHandler.oldHorse){
				GameRegistry.addShapedRecipe(new ItemStack(Items.IRON_HORSE_ARMOR), new Object[] {"  H", "IWI", "L L", 'W', new ItemStack(Blocks.WOOL), 'I', new ItemStack(Items.IRON_INGOT), 'H', new ItemStack(Items.IRON_HELMET), 'L', new ItemStack(Items.IRON_LEGGINGS)});
				GameRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_HORSE_ARMOR), new Object[] {"  H", "GWG", "L L", 'W', new ItemStack(Blocks.WOOL), 'G', new ItemStack(Items.GOLD_INGOT), 'H', new ItemStack(Items.GOLDEN_HELMET), 'L', new ItemStack(Items.GOLDEN_LEGGINGS)});
				GameRegistry.addShapedRecipe(new ItemStack(Items.DIAMOND_HORSE_ARMOR), new Object[] {"  H", "DWD", "L L", 'W', new ItemStack(Blocks.WOOL), 'D', new ItemStack(Items.DIAMOND), 'H', new ItemStack(Items.DIAMOND_HELMET), 'L', new ItemStack(Items.DIAMOND_LEGGINGS)});
			}
			
			if (CraftingHandler.xpBottle){
				GameRegistry.addShapedRecipe(new ItemStack(Items.EXPERIENCE_BOTTLE), new Object[] {"rrr", "rsr", "rrr", 'r', new ItemStack(Items.GOLD_NUGGET), 's', new ItemStack(Items.GLASS_BOTTLE)});
			}
			
			if (CraftingHandler.grassPath){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GRASS_PATH), new Object[] {new ItemStack(Blocks.GRASS), new ItemStack(Items.WOODEN_SHOVEL)});
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GRASS_PATH), new Object[] {new ItemStack(Blocks.GRASS), new ItemStack(Items.STONE_SHOVEL)});
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GRASS_PATH), new Object[] {new ItemStack(Blocks.GRASS), new ItemStack(Items.IRON_SHOVEL)});
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GRASS_PATH), new Object[] {new ItemStack(Blocks.GRASS), new ItemStack(Items.GOLDEN_SHOVEL)});
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GRASS_PATH), new Object[] {new ItemStack(Blocks.GRASS), new ItemStack(Items.DIAMOND_SHOVEL)});
			}
			
			if (CraftingHandler.barrierBlock){
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.BARRIER, 64), new Object[] {"rrr", "rsr", "rrr", 'r', new ItemStack(Blocks.GLASS, 0, 14), 's', new ItemStack(Items.NETHER_STAR)});
			}
			
			if (CraftingHandler.myceliumOff){
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.MYCELIUM, 5), new Object[] {"DBD", "BDB", "DBD", 'B', new ItemStack(Blocks.BROWN_MUSHROOM), 'D', new ItemStack(Blocks.GRASS)});
			}
			
			if (CraftingHandler.grassOff){
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.GRASS), new Object[] {"B", "S", "D", 'B', new ItemStack(Items.DYE, 1, 15), 'S', new ItemStack(Items.WHEAT_SEEDS), 'D', new ItemStack(Blocks.DIRT)});
			}
			
			if (CraftingHandler.dustOff){
				GameRegistry.addShapedRecipe(new ItemStack(Items.GLOWSTONE_DUST,4), new Object[] {"GRG", "RGR", "GRG", 'G', new ItemStack(Items.GOLD_NUGGET), 'R', new ItemStack(Items.REDSTONE)});
			}
			
			if (CraftingHandler.flintOff){
				GameRegistry.addShapelessRecipe(new ItemStack(Items.FLINT), new Object[] {new ItemStack(Blocks.GRAVEL), new ItemStack(Blocks.GRAVEL), new ItemStack(Blocks.GRAVEL)});
			}
			
			if (CraftingHandler.appleOff){
				GameRegistry.addRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), "ggg", "gag", "ggg", 'g', new ItemStack(Blocks.GOLD_BLOCK), 'a', new ItemStack(Items.APPLE));
			}
			
			if (CraftingHandler.endstoneOff){
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.END_STONE), new Object[] {"CCC", "CEC", "CCC", 'E', Items.ENDER_PEARL,'C', Blocks.SANDSTONE});
			}
			
			if (CraftingHandler.coarseOff){
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.DIRT,8), new Object[] {"CCC", "CBC", "CCC", 'C', new ItemStack(Blocks.DIRT, 1, 1), 'B', new ItemStack(Items.WATER_BUCKET)});
			}
			
			if (CraftingHandler.leatherOff){
				GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER), 0.5F);
			}
			
			if (CraftingHandler.nametagOff){
				GameRegistry.addShapelessRecipe(new ItemStack(Items.NAME_TAG), new Object[] {Items.PAPER, Items.PAPER, Items.STRING});
			}
			
			if (CraftingHandler.newHorse){
				GameRegistry.addShapedRecipe(new ItemStack(Items.IRON_HORSE_ARMOR), new Object[] {"  I", "ISI", "I I", 'S', Items.SADDLE, 'I', Items.IRON_INGOT});
				GameRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_HORSE_ARMOR), new Object[] {"  G", "GSG", "G G", 'S', Items.SADDLE, 'G', Items.GOLD_INGOT});
				GameRegistry.addShapedRecipe(new ItemStack(Items.DIAMOND_HORSE_ARMOR), new Object[] {"  D", "DSD", "D D", 'S', Items.SADDLE, 'D', Items.DIAMOND});
			}
			
			if (CraftingHandler.saddleOff){
				GameRegistry.addShapedRecipe(new ItemStack(Items.SADDLE), new Object[] {"LLL", "LIL", "I I", 'L', Items.LEATHER, 'I', Items.IRON_INGOT});
			}
			
			if (CraftingHandler.spongeOff){
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.SPONGE), new Object[] {"WWW", "WBW", "WWW", 'W', Blocks.WOOL, 'B', Items.WATER_BUCKET});
			}
			
			if (CraftingHandler.cobwebOff){
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.WEB), new Object[] {"SSS", "SBS", "SSS", 'S', Items.STRING, 'B', Items.SLIME_BALL});
			}
			
			if (CraftingHandler.iceOff){
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.ICE), new Object[] {"SSS", "SBS", "SSS", 'S', Items.SNOWBALL, 'B', Items.WATER_BUCKET});
			}
			
			if (CraftingHandler.packedOff){
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.PACKED_ICE), new Object[] {"II", "II", 'I', Blocks.ICE});
			}
			
			if (CraftingHandler.slabOff){
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.COBBLESTONE), new Object[] {"S", "S", 'S', new ItemStack(Blocks.STONE_SLAB, 1, 3)});
			}
			
			if (CraftingHandler.chestOff){
				IRecipe chestRecipe = new ShapedOreRecipe(new ItemStack(Blocks.CHEST, 4), new Object[] {"LLL", "L L", "LLL", 'L', "logWood"});
				GameRegistry.addRecipe(chestRecipe);			
			}
			
			if (CraftingHandler.clayOff){
				GameRegistry.addShapelessRecipe(new ItemStack(Item.getItemFromBlock(Blocks.CLAY), 2), new ItemStack(Items.WATER_BUCKET),new ItemStack(Item.getItemFromBlock(Blocks.SAND)),new ItemStack(Item.getItemFromBlock(Blocks.GRAVEL)));
				IRecipe clayRecipe = new ShapelessOreRecipe(new ItemStack(Items.CLAY_BALL, 4), new Object[] {new ItemStack(Blocks.CLAY)});
				GameRegistry.addRecipe(clayRecipe);
			}
			
			if (CraftingHandler.coal2charcoal){
				GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL,1,1), new Object[]{Items.COAL});
			}
			if (CraftingHandler.recycleIron){
				GameRegistry.addSmelting(Items.IRON_AXE, new ItemStack(Items.IRON_INGOT,3), 0.0F);
				GameRegistry.addSmelting(Items.IRON_DOOR, new ItemStack(Items.IRON_INGOT,6), 0.0F);
				GameRegistry.addSmelting(Items.IRON_HOE, new ItemStack(Items.IRON_INGOT,2), 0.0F);
				GameRegistry.addSmelting(Items.IRON_PICKAXE, new ItemStack(Items.IRON_INGOT,3), 0.0F);
				GameRegistry.addSmelting(Items.IRON_SHOVEL, new ItemStack(Items.IRON_INGOT), 0.0F);
				GameRegistry.addSmelting(Items.IRON_SWORD, new ItemStack(Items.IRON_INGOT,2), 0.0F);
				GameRegistry.addSmelting(Items.IRON_BOOTS, new ItemStack(Items.IRON_INGOT,4), 0.0F);
				GameRegistry.addSmelting(Items.IRON_CHESTPLATE, new ItemStack(Items.IRON_INGOT,8), 0.0F);
				GameRegistry.addSmelting(Items.IRON_HELMET, new ItemStack(Items.IRON_INGOT,5), 0.0F);
				GameRegistry.addSmelting(Items.IRON_LEGGINGS, new ItemStack(Items.IRON_INGOT,7), 0.0F);
				GameRegistry.addSmelting(Items.CAULDRON, new ItemStack(Items.IRON_INGOT,7), 0.0F);
				GameRegistry.addSmelting(Items.BUCKET, new ItemStack(Items.IRON_INGOT,3), 0.0F);
				GameRegistry.addSmelting(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, new ItemStack(Items.IRON_INGOT,2), 0.0F);
				GameRegistry.addSmelting(Items.MINECART, new ItemStack(Items.IRON_INGOT,5), 0.0F);
			}
			if (CraftingHandler.recycleGold){
				GameRegistry.addSmelting(Items.GOLDEN_AXE, new ItemStack(Items.GOLD_INGOT,3), 0.0F);
				GameRegistry.addSmelting(Items.GOLDEN_HOE, new ItemStack(Items.GOLD_INGOT,2), 0.0F);
				GameRegistry.addSmelting(Items.GOLDEN_PICKAXE, new ItemStack(Items.GOLD_INGOT,3), 0.0F);
				GameRegistry.addSmelting(Items.GOLDEN_SHOVEL, new ItemStack(Items.GOLD_INGOT), 0.0F);
				GameRegistry.addSmelting(Items.GOLDEN_SWORD, new ItemStack(Items.GOLD_INGOT,2), 0.0F);
				GameRegistry.addSmelting(Items.GOLDEN_BOOTS, new ItemStack(Items.GOLD_INGOT,4), 0.0F);
				GameRegistry.addSmelting(Items.GOLDEN_CHESTPLATE, new ItemStack(Items.GOLD_INGOT,8), 0.0F);
				GameRegistry.addSmelting(Items.GOLDEN_HELMET, new ItemStack(Items.GOLD_INGOT,5), 0.0F);
				GameRegistry.addSmelting(Items.GOLDEN_LEGGINGS, new ItemStack(Items.GOLD_INGOT,7), 0.0F);
				GameRegistry.addSmelting(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE, new ItemStack(Items.GOLD_INGOT,2), 0.0F);
			}
			if (CraftingHandler.recycleDiamond){
				GameRegistry.addSmelting(Items.DIAMOND_AXE, new ItemStack(Items.DIAMOND,3), 0.0F);
				GameRegistry.addSmelting(Items.DIAMOND_HOE, new ItemStack(Items.DIAMOND,2), 0.0F);
				GameRegistry.addSmelting(Items.DIAMOND_PICKAXE, new ItemStack(Items.DIAMOND,3), 0.0F);
				GameRegistry.addSmelting(Items.DIAMOND_SHOVEL, new ItemStack(Items.DIAMOND), 0.0F);
				GameRegistry.addSmelting(Items.DIAMOND_SWORD, new ItemStack(Items.DIAMOND,2), 0.0F);
				GameRegistry.addSmelting(Items.DIAMOND_BOOTS, new ItemStack(Items.DIAMOND,4), 0.0F);
				GameRegistry.addSmelting(Items.DIAMOND_CHESTPLATE, new ItemStack(Items.DIAMOND,8), 0.0F);
				GameRegistry.addSmelting(Items.DIAMOND_HELMET, new ItemStack(Items.DIAMOND,5), 0.0F);
				GameRegistry.addSmelting(Items.DIAMOND_LEGGINGS, new ItemStack(Items.DIAMOND,7), 0.0F);
			}
			if (CraftingHandler.recycleHorseArmor && CraftingHandler.newHorse){
				GameRegistry.addSmelting(Items.IRON_HORSE_ARMOR, new ItemStack(Items.IRON_INGOT,5), 0.0F);
			}
			if (CraftingHandler.recycleHorseArmor && CraftingHandler.newHorse){
				GameRegistry.addSmelting(Items.GOLDEN_HORSE_ARMOR, new ItemStack(Items.GOLD_INGOT,5), 0.0F);
			}
			if (CraftingHandler.recycleHorseArmor && CraftingHandler.newHorse){
				GameRegistry.addSmelting(Items.DIAMOND_HORSE_ARMOR, new ItemStack(Items.DIAMOND,5), 0.0F);
			}
			if (CraftingHandler.recycleHorseArmor && CraftingHandler.oldHorse){
				GameRegistry.addSmelting(Items.IRON_HORSE_ARMOR, new ItemStack(Items.IRON_INGOT,21), 0.0F);
			}
			if (CraftingHandler.recycleHorseArmor && CraftingHandler.oldHorse){
				GameRegistry.addSmelting(Items.GOLDEN_HORSE_ARMOR, new ItemStack(Items.GOLD_INGOT,21), 0.0F);
			}
			if (CraftingHandler.recycleHorseArmor && CraftingHandler.oldHorse){
				GameRegistry.addSmelting(Items.DIAMOND_HORSE_ARMOR, new ItemStack(Items.DIAMOND,21), 0.0F);
			}
			
			if (CraftingHandler.realStoneTools){
				removeRecipe(new ItemStack(Items.STONE_AXE));
				removeRecipe(new ItemStack(Items.STONE_HOE));
				removeRecipe(new ItemStack(Items.STONE_SWORD));
				removeRecipe(new ItemStack(Items.STONE_SHOVEL));
				removeRecipe(new ItemStack(Items.STONE_PICKAXE));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.STONE_AXE), "rr", "rs", " s", 'r', new ItemStack(Blocks.STONE), 's', new ItemStack(Items.STICK)));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.STONE_AXE), "rr", "sr", "s ", 'r', new ItemStack(Blocks.STONE), 's', new ItemStack(Items.STICK)));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.STONE_HOE), "rr", " s", " s", 'r', new ItemStack(Blocks.STONE), 's', new ItemStack(Items.STICK)));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.STONE_HOE), "rr", "s ", "s ", 'r', new ItemStack(Blocks.STONE), 's', new ItemStack(Items.STICK)));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.STONE_SWORD), "r", "r", "s", 'r', new ItemStack(Blocks.STONE), 's', new ItemStack(Items.STICK)));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.STONE_SHOVEL), "r", "s", "s", 'r', new ItemStack(Blocks.STONE), 's', new ItemStack(Items.STICK)));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.STONE_PICKAXE), "rrr", " s ", " s ", 'r', new ItemStack(Blocks.STONE), 's', new ItemStack(Items.STICK)));
			}
			
			if (CraftingHandler.oldBook){
				removeRecipe(new ItemStack(Items.BOOK));
				GameRegistry.addShapedRecipe(new ItemStack(Items.BOOK), new Object[] {"S", "S", "S", 'S', new ItemStack(Items.PAPER)});
			}
			
			if (CraftingHandler.oldArrow){
				removeRecipe(new ItemStack(Items.ARROW));
				GameRegistry.addShapedRecipe(new ItemStack(Items.ARROW, 4), new Object[] {"F", "S", "I", 'F', new ItemStack(Items.FLINT), 'S', new ItemStack(Items.STICK), 'I', new ItemStack(Items.IRON_INGOT)});
			}
			
			if (CraftingHandler.oldOakFence){
				removeRecipe(new ItemStack(Blocks.OAK_FENCE));
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.OAK_FENCE, 3), new Object[] {"SSS", "SSS", 'S', new ItemStack(Items.STICK)});
			}
		}
	}
	
	private static void removeRecipe(ItemStack resultItem){
		ItemStack recipeResult;
		ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();
		for(int scan = 0;scan < recipes.size();scan++){
			IRecipe tmpRecipe = (IRecipe) recipes.get(scan);
			recipeResult = tmpRecipe.getRecipeOutput();
			if(recipeResult != null){
				if(recipeResult.getItem() == resultItem.getItem() && recipeResult.getItemDamage() == resultItem.getItemDamage()){
					recipes.remove(scan);
					scan--;
				}
			}
		}
	}

}
