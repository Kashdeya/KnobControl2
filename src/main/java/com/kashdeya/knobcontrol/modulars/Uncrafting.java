package com.kashdeya.knobcontrol.modulars;

import com.kashdeya.knobcontrol.crafting.RecipeRegistry;
import com.kashdeya.knobcontrol.handlers.ModularsHandler;
import com.kashdeya.knobcontrol.handlers.UncraftingHandler;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Uncrafting {
	
	public static void registerRecipes() {
		
		if (ModularsHandler.uncrafting){
			if (UncraftingHandler.uncraftSeedsOff){
				RecipeRegistry.addShapelessRecipe(new ItemStack(Items.WHEAT_SEEDS), new ItemStack(Items.WHEAT));
			}
			
			if (UncraftingHandler.crafting_table){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS,4), new Object[] {new ItemStack(Blocks.CRAFTING_TABLE)});
			}
				
			if (UncraftingHandler.glowstone){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Items.GLOWSTONE_DUST,4), new Object[] {new ItemStack(Blocks.GLOWSTONE)});
			}
				
			if (UncraftingHandler.furnace){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE,8), new Object[] {new ItemStack(Blocks.FURNACE)});
			}
			
			if (UncraftingHandler.sandstone){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.SAND,4), new Object[] {new ItemStack(Blocks.SANDSTONE)});
			}
			
			if (UncraftingHandler.sandstone2){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.SANDSTONE), new Object[] {new ItemStack(Blocks.SANDSTONE,0,2)});
			}
			
			if (UncraftingHandler.sandstone1){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE_SLAB,2,1), new Object[] {new ItemStack(Blocks.SANDSTONE,0,1)});
			}
			
			if (UncraftingHandler.brick_block){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Items.BRICK,4), new Object[] {new ItemStack(Blocks.BRICK_BLOCK)});
			}
			
			if (UncraftingHandler.wool){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Items.STRING,4), new Object[] {new ItemStack(Blocks.WOOL)});
			}
			
			if (UncraftingHandler.sticks){
			    RecipeRegistry.addShapedRecipe(new ItemStack(Blocks.PLANKS), new Object[] {"ss", "ss", 's', new ItemStack(Items.STICK)});
			}
			
			if (UncraftingHandler.ladder){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Items.STICK,7), new Object[] {new ItemStack(Blocks.LADDER)});
			}
			
			if (UncraftingHandler.stonebrick){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE,4), new Object[] {new ItemStack(Blocks.STONEBRICK)});
			}
			
			if (UncraftingHandler.nether_brick){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Items.NETHERBRICK,4), new Object[] {new ItemStack(Blocks.NETHER_BRICK)});
			}
			
			if (UncraftingHandler.quartz_block){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Items.QUARTZ,4), new Object[] {new ItemStack(Blocks.QUARTZ_BLOCK)});
			}
			
			if (UncraftingHandler.quartz_block2){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.QUARTZ_BLOCK,2), new Object[] {new ItemStack(Blocks.QUARTZ_BLOCK,0,2)});
			}
			
			if (UncraftingHandler.quartz_block1){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE_SLAB,2,7), new Object[] {new ItemStack(Blocks.QUARTZ_BLOCK,0,1)});
			}
			
			if (UncraftingHandler.stone2){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE,1,1), new Object[] {new ItemStack(Blocks.STONE,0,2)});
			}
			
			if (UncraftingHandler.stone4){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE,1,3), new Object[] {new ItemStack(Blocks.STONE,0,4)});
			}
			
			if (UncraftingHandler.stone6){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE,1,5), new Object[] {new ItemStack(Blocks.STONE,0,6)});
			}
			
			if (UncraftingHandler.prizmarine){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Items.PRISMARINE_SHARD,4), new Object[] {new ItemStack(Blocks.PRISMARINE)});
			}
			
			if (UncraftingHandler.stonebrick3){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE_SLAB,2,5), new Object[] {new ItemStack(Blocks.STONEBRICK,0,3)});
			}
			
			if (UncraftingHandler.red_sandstone){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.SAND,4,1), new Object[] {new ItemStack(Blocks.RED_SANDSTONE)});
			}
			
			if (UncraftingHandler.red_sandstone2){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.RED_SANDSTONE,4), new Object[] {new ItemStack(Blocks.RED_SANDSTONE,0,2)});
			}
			
			if (UncraftingHandler.glass_bottle){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.GLASS,3), new Object[] {new ItemStack(Items.GLASS_BOTTLE)});
			}
			
			if (UncraftingHandler.blaze_powder){
			    RecipeRegistry.addShapedRecipe(new ItemStack(Items.BLAZE_ROD), new Object[] {"b ", " b", 'b', new ItemStack(Items.BLAZE_POWDER)});
			}
			
			if (UncraftingHandler.bowl){
			    RecipeRegistry.addShapedRecipe(new ItemStack(Blocks.PLANKS,3), new Object[] {"bb", "bb", 'b', new ItemStack(Items.BOWL)});
			}
			
			if (UncraftingHandler.paper){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Items.REEDS), new Object[] {new ItemStack(Items.PAPER)});
			}
			if (UncraftingHandler.leather){
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Items.LEATHER, 5), new ItemStack(Items.LEATHER_HELMET));
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Items.LEATHER, 8), new ItemStack(Items.LEATHER_CHESTPLATE));
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Items.LEATHER, 7), new ItemStack(Items.LEATHER_LEGGINGS));
			    RecipeRegistry.addShapelessRecipe(new ItemStack(Items.LEATHER, 4), new ItemStack(Items.LEATHER_BOOTS));
			}
		}
	}
}
