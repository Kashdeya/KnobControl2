package com.kashdeya.knobcontrol.modulars;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.knobcontrol.handlers.ModularsHandler;
import com.kashdeya.knobcontrol.handlers.UncraftingHandler;

public class Uncrafting {
	
	public static void registerRecipes() {
		
		if (ModularsHandler.uncrafting){
			if (UncraftingHandler.uncraftSeedsOff){
				GameRegistry.addShapelessRecipe(new ItemStack(Items.WHEAT_SEEDS), new ItemStack(Items.WHEAT));
			}
			
			if (UncraftingHandler.crafting_table){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS,4), new Object[] {new ItemStack(Blocks.CRAFTING_TABLE)});
			}
				
			if (UncraftingHandler.glowstone){
				GameRegistry.addShapelessRecipe(new ItemStack(Items.GLOWSTONE_DUST,4), new Object[] {new ItemStack(Blocks.GLOWSTONE)});
			}
				
			if (UncraftingHandler.furnace){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE,8), new Object[] {new ItemStack(Blocks.FURNACE)});
			}
			
			if (UncraftingHandler.sandstone){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAND,4), new Object[] {new ItemStack(Blocks.SANDSTONE)});
			}
			
			if (UncraftingHandler.sandstone2){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SANDSTONE), new Object[] {new ItemStack(Blocks.SANDSTONE,0,2)});
			}
			
			if (UncraftingHandler.sandstone1){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE_SLAB,2,1), new Object[] {new ItemStack(Blocks.SANDSTONE,0,1)});
			}
			
			if (UncraftingHandler.brick_block){
				GameRegistry.addShapelessRecipe(new ItemStack(Items.BRICK,4), new Object[] {new ItemStack(Blocks.BRICK_BLOCK)});
			}
			
			if (UncraftingHandler.wool){
				GameRegistry.addShapelessRecipe(new ItemStack(Items.STRING,4), new Object[] {new ItemStack(Blocks.WOOL)});
			}
			
			if (UncraftingHandler.sticks){
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.PLANKS), new Object[] {"ss", "ss", 's', new ItemStack(Items.STICK)});
			}
			
			if (UncraftingHandler.ladder){
				GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK,7), new Object[] {new ItemStack(Blocks.LADDER)});
			}
			
			if (UncraftingHandler.stonebrick){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE,4), new Object[] {new ItemStack(Blocks.STONEBRICK)});
			}
			
			if (UncraftingHandler.nether_brick){
				GameRegistry.addShapelessRecipe(new ItemStack(Items.NETHERBRICK,4), new Object[] {new ItemStack(Blocks.NETHER_BRICK)});
			}
			
			if (UncraftingHandler.quartz_block){
				GameRegistry.addShapelessRecipe(new ItemStack(Items.QUARTZ,4), new Object[] {new ItemStack(Blocks.QUARTZ_BLOCK)});
			}
			
			if (UncraftingHandler.quartz_block2){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.QUARTZ_BLOCK,2), new Object[] {new ItemStack(Blocks.QUARTZ_BLOCK,0,2)});
			}
			
			if (UncraftingHandler.quartz_block1){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE_SLAB,2,7), new Object[] {new ItemStack(Blocks.QUARTZ_BLOCK,0,1)});
			}
			
			if (UncraftingHandler.stone2){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE,1,1), new Object[] {new ItemStack(Blocks.STONE,0,2)});
			}
			
			if (UncraftingHandler.stone4){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE,1,3), new Object[] {new ItemStack(Blocks.STONE,0,4)});
			}
			
			if (UncraftingHandler.stone6){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE,1,5), new Object[] {new ItemStack(Blocks.STONE,0,6)});
			}
			
			if (UncraftingHandler.prizmarine){
				GameRegistry.addShapelessRecipe(new ItemStack(Items.PRISMARINE_SHARD,4), new Object[] {new ItemStack(Blocks.PRISMARINE)});
			}
			
			if (UncraftingHandler.stonebrick3){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE_SLAB,2,5), new Object[] {new ItemStack(Blocks.STONEBRICK,0,3)});
			}
			
			if (UncraftingHandler.red_sandstone){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAND,4,1), new Object[] {new ItemStack(Blocks.RED_SANDSTONE)});
			}
			
			if (UncraftingHandler.red_sandstone2){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.RED_SANDSTONE,4), new Object[] {new ItemStack(Blocks.RED_SANDSTONE,0,2)});
			}
			
			if (UncraftingHandler.glass_bottle){
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GLASS,3), new Object[] {new ItemStack(Items.GLASS_BOTTLE)});
			}
			
			if (UncraftingHandler.blaze_powder){
				GameRegistry.addShapedRecipe(new ItemStack(Items.BLAZE_ROD), new Object[] {"b ", " b", 'b', new ItemStack(Items.BLAZE_POWDER)});
			}
			
			if (UncraftingHandler.bowl){
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.PLANKS,3), new Object[] {"bb", "bb", 'b', new ItemStack(Items.BOWL)});
			}
			
			if (UncraftingHandler.paper){
				GameRegistry.addShapelessRecipe(new ItemStack(Items.REEDS), new Object[] {new ItemStack(Items.PAPER)});
			}
			if (UncraftingHandler.leather){
				GameRegistry.addShapelessRecipe(new ItemStack(Items.LEATHER, 5), new ItemStack(Items.LEATHER_HELMET));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.LEATHER, 8), new ItemStack(Items.LEATHER_CHESTPLATE));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.LEATHER, 7), new ItemStack(Items.LEATHER_LEGGINGS));
				GameRegistry.addShapelessRecipe(new ItemStack(Items.LEATHER, 4), new ItemStack(Items.LEATHER_BOOTS));
			}
		}
	}
}
