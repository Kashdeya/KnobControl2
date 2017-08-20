package com.kashdeya.knobcontrol.crafting;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class RecipeRegistry
{
    public static void addShapedRecipe(ItemStack output, Object... inputs)
    {
        int recipeIndex = 0;
        ResourceLocation name = output.getItem().getRegistryName();
        
        while(CraftingManager.REGISTRY.containsKey(name))
        {
            name = new ResourceLocation(name.getResourceDomain(), String.format("%s.%d", name.getResourcePath(), recipeIndex++));
        }
        
        addShapedRecipe(name.toString(), output, inputs);
    }
    
    public static void addShapedRecipe(String name, ItemStack output, Object... inputs)
    {
        addShapedRecipe(name, name, output, inputs);
    }
    
    public static void addShapedRecipe(String name, String group, ItemStack output, Object... inputs)
    {
        GameRegistry.addShapedRecipe(new ResourceLocation(name), new ResourceLocation(group), output, inputs);
    }
    
    public static void addShapelessRecipe(ItemStack output, Object... inputs)
    {
        int recipeIndex = 0;
        ResourceLocation name = output.getItem().getRegistryName();
        
        while(CraftingManager.REGISTRY.containsKey(name))
        {
            name = new ResourceLocation(name.getResourceDomain(), String.format("%s.%d", name.getResourcePath(), recipeIndex++));
        }
        
        addShapelessRecipe(name.toString(), output, inputs);
    }
    
    public static void addShapelessRecipe(String name, ItemStack output, Object... inputs)
    {
        addShapelessRecipe(name, name, output, inputs);
    }
    
    public static void addShapelessRecipe(String name, String group, ItemStack output, Object... inputs)
    {
        Ingredient[] ingredients = new Ingredient[inputs.length];
        
        for(int i = 0; i < inputs.length; i++)
        {
            ItemStack itemstack = ItemStack.EMPTY;
            Object input = inputs[i];
            
            if(input instanceof ItemStack)
            {
                itemstack = (ItemStack)input;
            }
            else if(input instanceof Block)
            {
                itemstack = new ItemStack((Block)input);
            }
            else if(input instanceof Item)
            {
                itemstack = new ItemStack((Item)input);
            }
            
            if(itemstack == ItemStack.EMPTY)
            {
                if(input instanceof String)
                {
                    List<ItemStack> oreDictList = OreDictionary.getOres((String)input);
                    ingredients[i] = Ingredient.fromStacks(oreDictList.toArray(new ItemStack[oreDictList.size()]));
                }
            }
            else
            {
                ingredients[i] = Ingredient.fromStacks(itemstack);
            }
        }
        
        GameRegistry.addShapelessRecipe(new ResourceLocation(name), new ResourceLocation(group), output, ingredients);
    }
    
    public static Set<ResourceLocation> removeList = Sets.newHashSet();
    
    public static void removeRecipe(ItemStack resultItem){
        CraftingManager.REGISTRY.forEach((recipe) -> {
            if(ItemStack.areItemsEqual(recipe.getRecipeOutput(), resultItem))
            {
                removeList.add(recipe.getRegistryName());
            }
        });
    }
}
