package com.kashdeya.knobcontrol.modulars;

import java.util.ArrayList;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.knobcontrol.handlers.ModularsHandler;
import com.kashdeya.knobcontrol.handlers.RemoveHandler;

public class Remove {
	
	public static void registerRecipes() {
		if (ModularsHandler.remove){
			// Tools
			if (RemoveHandler.woodenTools){
				removeRecipe(new ItemStack(Items.WOODEN_AXE));
				removeRecipe(new ItemStack(Items.WOODEN_HOE));
				removeRecipe(new ItemStack(Items.WOODEN_SWORD));
				removeRecipe(new ItemStack(Items.WOODEN_SHOVEL));
				removeRecipe(new ItemStack(Items.WOODEN_PICKAXE));	
			}
			if (RemoveHandler.stoneTools){
				removeRecipe(new ItemStack(Items.STONE_AXE));
				removeRecipe(new ItemStack(Items.STONE_HOE));
				removeRecipe(new ItemStack(Items.STONE_SWORD));
				removeRecipe(new ItemStack(Items.STONE_SHOVEL));
				removeRecipe(new ItemStack(Items.STONE_PICKAXE));	
			}
			if (RemoveHandler.ironTools){
				removeRecipe(new ItemStack(Items.IRON_AXE));
				removeRecipe(new ItemStack(Items.IRON_HOE));
				removeRecipe(new ItemStack(Items.IRON_SWORD));
				removeRecipe(new ItemStack(Items.IRON_SHOVEL));
				removeRecipe(new ItemStack(Items.IRON_PICKAXE));	
			}
			if (RemoveHandler.goldenTools){
				removeRecipe(new ItemStack(Items.GOLDEN_AXE));
				removeRecipe(new ItemStack(Items.GOLDEN_HOE));
				removeRecipe(new ItemStack(Items.GOLDEN_SWORD));
				removeRecipe(new ItemStack(Items.GOLDEN_SHOVEL));
				removeRecipe(new ItemStack(Items.GOLDEN_PICKAXE));	
			}
			if (RemoveHandler.diamondTools){
				removeRecipe(new ItemStack(Items.DIAMOND_AXE));
				removeRecipe(new ItemStack(Items.DIAMOND_HOE));
				removeRecipe(new ItemStack(Items.DIAMOND_SWORD));
				removeRecipe(new ItemStack(Items.DIAMOND_SHOVEL));
				removeRecipe(new ItemStack(Items.DIAMOND_PICKAXE));	
			}
			// Armor
			if (RemoveHandler.ironArmor){
				removeRecipe(new ItemStack(Items.IRON_HELMET));
				removeRecipe(new ItemStack(Items.IRON_CHESTPLATE));
				removeRecipe(new ItemStack(Items.IRON_LEGGINGS));
				removeRecipe(new ItemStack(Items.IRON_BOOTS));	
			}
			
			if (RemoveHandler.goldenArmor){
				removeRecipe(new ItemStack(Items.GOLDEN_HELMET));
				removeRecipe(new ItemStack(Items.GOLDEN_CHESTPLATE));
				removeRecipe(new ItemStack(Items.GOLDEN_LEGGINGS));
				removeRecipe(new ItemStack(Items.GOLDEN_BOOTS));	
			}
			
			if (RemoveHandler.diamondArmor){
				removeRecipe(new ItemStack(Items.DIAMOND_HELMET));
				removeRecipe(new ItemStack(Items.DIAMOND_CHESTPLATE));
				removeRecipe(new ItemStack(Items.DIAMOND_LEGGINGS));
				removeRecipe(new ItemStack(Items.DIAMOND_BOOTS));	
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
