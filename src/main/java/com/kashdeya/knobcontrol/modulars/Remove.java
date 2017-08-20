package com.kashdeya.knobcontrol.modulars;

import com.kashdeya.knobcontrol.crafting.RecipeRegistry;
import com.kashdeya.knobcontrol.handlers.ModularsHandler;
import com.kashdeya.knobcontrol.handlers.RemoveHandler;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Remove {
	
	public static void registerRecipes() {
		if (ModularsHandler.remove){
			// Tools
			if (RemoveHandler.woodenTools){
				RecipeRegistry.removeRecipe(new ItemStack(Items.WOODEN_AXE));
				RecipeRegistry.removeRecipe(new ItemStack(Items.WOODEN_HOE));
				RecipeRegistry.removeRecipe(new ItemStack(Items.WOODEN_SWORD));
				RecipeRegistry.removeRecipe(new ItemStack(Items.WOODEN_SHOVEL));
				RecipeRegistry.removeRecipe(new ItemStack(Items.WOODEN_PICKAXE));	
			}
			if (RemoveHandler.stoneTools){
				RecipeRegistry.removeRecipe(new ItemStack(Items.STONE_AXE));
				RecipeRegistry.removeRecipe(new ItemStack(Items.STONE_HOE));
				RecipeRegistry.removeRecipe(new ItemStack(Items.STONE_SWORD));
				RecipeRegistry.removeRecipe(new ItemStack(Items.STONE_SHOVEL));
				RecipeRegistry.removeRecipe(new ItemStack(Items.STONE_PICKAXE));	
			}
			if (RemoveHandler.ironTools){
				RecipeRegistry.removeRecipe(new ItemStack(Items.IRON_AXE));
				RecipeRegistry.removeRecipe(new ItemStack(Items.IRON_HOE));
				RecipeRegistry.removeRecipe(new ItemStack(Items.IRON_SWORD));
				RecipeRegistry.removeRecipe(new ItemStack(Items.IRON_SHOVEL));
				RecipeRegistry.removeRecipe(new ItemStack(Items.IRON_PICKAXE));	
			}
			if (RemoveHandler.goldenTools){
				RecipeRegistry.removeRecipe(new ItemStack(Items.GOLDEN_AXE));
				RecipeRegistry.removeRecipe(new ItemStack(Items.GOLDEN_HOE));
				RecipeRegistry.removeRecipe(new ItemStack(Items.GOLDEN_SWORD));
				RecipeRegistry.removeRecipe(new ItemStack(Items.GOLDEN_SHOVEL));
				RecipeRegistry.removeRecipe(new ItemStack(Items.GOLDEN_PICKAXE));	
			}
			if (RemoveHandler.diamondTools){
				RecipeRegistry.removeRecipe(new ItemStack(Items.DIAMOND_AXE));
				RecipeRegistry.removeRecipe(new ItemStack(Items.DIAMOND_HOE));
				RecipeRegistry.removeRecipe(new ItemStack(Items.DIAMOND_SWORD));
				RecipeRegistry.removeRecipe(new ItemStack(Items.DIAMOND_SHOVEL));
				RecipeRegistry.removeRecipe(new ItemStack(Items.DIAMOND_PICKAXE));	
			}
			// Armor
			if (RemoveHandler.ironArmor){
				RecipeRegistry.removeRecipe(new ItemStack(Items.IRON_HELMET));
				RecipeRegistry.removeRecipe(new ItemStack(Items.IRON_CHESTPLATE));
				RecipeRegistry.removeRecipe(new ItemStack(Items.IRON_LEGGINGS));
				RecipeRegistry.removeRecipe(new ItemStack(Items.IRON_BOOTS));	
			}
			
			if (RemoveHandler.goldenArmor){
				RecipeRegistry.removeRecipe(new ItemStack(Items.GOLDEN_HELMET));
				RecipeRegistry.removeRecipe(new ItemStack(Items.GOLDEN_CHESTPLATE));
				RecipeRegistry.removeRecipe(new ItemStack(Items.GOLDEN_LEGGINGS));
				RecipeRegistry.removeRecipe(new ItemStack(Items.GOLDEN_BOOTS));	
			}
			
			if (RemoveHandler.diamondArmor){
				RecipeRegistry.removeRecipe(new ItemStack(Items.DIAMOND_HELMET));
				RecipeRegistry.removeRecipe(new ItemStack(Items.DIAMOND_CHESTPLATE));
				RecipeRegistry.removeRecipe(new ItemStack(Items.DIAMOND_LEGGINGS));
				RecipeRegistry.removeRecipe(new ItemStack(Items.DIAMOND_BOOTS));	
			}
		}
	}

}
