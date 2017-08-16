package com.kashdeya.knobcontrol.modulars;

import com.kashdeya.knobcontrol.handlers.ModularsHandler;
import com.kashdeya.knobcontrol.handlers.RemoveHandler;
import com.kashdeya.knobcontrol.util.Recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Remove {
	
	public static void registerRecipes() {
		if (ModularsHandler.remove){
			// Tools
			if (RemoveHandler.woodenTools){
				Recipes.removeRecipe(new ItemStack(Items.WOODEN_AXE));
				Recipes.removeRecipe(new ItemStack(Items.WOODEN_HOE));
				Recipes.removeRecipe(new ItemStack(Items.WOODEN_SWORD));
				Recipes.removeRecipe(new ItemStack(Items.WOODEN_SHOVEL));
				Recipes.removeRecipe(new ItemStack(Items.WOODEN_PICKAXE));	
			}
			if (RemoveHandler.stoneTools){
				Recipes.removeRecipe(new ItemStack(Items.STONE_AXE));
				Recipes.removeRecipe(new ItemStack(Items.STONE_HOE));
				Recipes.removeRecipe(new ItemStack(Items.STONE_SWORD));
				Recipes.removeRecipe(new ItemStack(Items.STONE_SHOVEL));
				Recipes.removeRecipe(new ItemStack(Items.STONE_PICKAXE));	
			}
			if (RemoveHandler.ironTools){
				Recipes.removeRecipe(new ItemStack(Items.IRON_AXE));
				Recipes.removeRecipe(new ItemStack(Items.IRON_HOE));
				Recipes.removeRecipe(new ItemStack(Items.IRON_SWORD));
				Recipes.removeRecipe(new ItemStack(Items.IRON_SHOVEL));
				Recipes.removeRecipe(new ItemStack(Items.IRON_PICKAXE));	
			}
			if (RemoveHandler.goldenTools){
				Recipes.removeRecipe(new ItemStack(Items.GOLDEN_AXE));
				Recipes.removeRecipe(new ItemStack(Items.GOLDEN_HOE));
				Recipes.removeRecipe(new ItemStack(Items.GOLDEN_SWORD));
				Recipes.removeRecipe(new ItemStack(Items.GOLDEN_SHOVEL));
				Recipes.removeRecipe(new ItemStack(Items.GOLDEN_PICKAXE));	
			}
			if (RemoveHandler.diamondTools){
				Recipes.removeRecipe(new ItemStack(Items.DIAMOND_AXE));
				Recipes.removeRecipe(new ItemStack(Items.DIAMOND_HOE));
				Recipes.removeRecipe(new ItemStack(Items.DIAMOND_SWORD));
				Recipes.removeRecipe(new ItemStack(Items.DIAMOND_SHOVEL));
				Recipes.removeRecipe(new ItemStack(Items.DIAMOND_PICKAXE));	
			}
			// Armor
			if (RemoveHandler.ironArmor){
				Recipes.removeRecipe(new ItemStack(Items.IRON_HELMET));
				Recipes.removeRecipe(new ItemStack(Items.IRON_CHESTPLATE));
				Recipes.removeRecipe(new ItemStack(Items.IRON_LEGGINGS));
				Recipes.removeRecipe(new ItemStack(Items.IRON_BOOTS));	
			}
			
			if (RemoveHandler.goldenArmor){
				Recipes.removeRecipe(new ItemStack(Items.GOLDEN_HELMET));
				Recipes.removeRecipe(new ItemStack(Items.GOLDEN_CHESTPLATE));
				Recipes.removeRecipe(new ItemStack(Items.GOLDEN_LEGGINGS));
				Recipes.removeRecipe(new ItemStack(Items.GOLDEN_BOOTS));	
			}
			
			if (RemoveHandler.diamondArmor){
				Recipes.removeRecipe(new ItemStack(Items.DIAMOND_HELMET));
				Recipes.removeRecipe(new ItemStack(Items.DIAMOND_CHESTPLATE));
				Recipes.removeRecipe(new ItemStack(Items.DIAMOND_LEGGINGS));
				Recipes.removeRecipe(new ItemStack(Items.DIAMOND_BOOTS));	
			}
		}
	}

}
