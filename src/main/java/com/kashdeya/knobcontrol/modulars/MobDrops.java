package com.kashdeya.knobcontrol.modulars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class MobDrops 
{

	// Key: MobID
	// Done
	public static final HashMap<ResourceLocation, ArrayList<ItemDrop>> MOB_DROP_LIST = new HashMap<ResourceLocation, ArrayList<ItemDrop>>();
	public static final HashMap<ResourceLocation, ArrayList<ItemDrop>> MOB_DROP_LIST_PLAYER_KILL = new HashMap<ResourceLocation, ArrayList<ItemDrop>>();
	
	
	// Run this on post loading so that way all entities and items should already be loaded into the game.
	// Done
	public static void generateConfigFile(Configuration config)
	{
		
		MOB_DROP_LIST.clear();
		MOB_DROP_LIST_PLAYER_KILL.clear();
		
		for(Entry<ResourceLocation, EntityEntry> entity : ForgeRegistries.ENTITIES.getEntries())
		{
			
			Class<? extends Entity> clazz = entity.getValue().getEntityClass();
			
			// Checks if its based of EntityLivingBase
			if(EntityLivingBase.class.isAssignableFrom(clazz))
			{
				config.addCustomCategoryComment(entity.getKey().toString(), "Adding Drops Example: \nModID:Item:Meta:Qty(Random 1 - number set):Chance(0.01 - 1) \nminecraft:glass:0:15:1 ");
				
				MOB_DROP_LIST.put(entity.getKey(), ItemDrop.getArrayItemDrops(config.get(entity.getKey().toString(), "drops", new String[0]).getStringList()));
				
				MOB_DROP_LIST_PLAYER_KILL.put(entity.getKey(), ItemDrop.getArrayItemDrops(config.get(entity.getKey().toString(), "player kill drops", new String[0]).getStringList()));
				
			}
		}
		
		config.save();
	}
	
	// I dont have the actual @SubscribeEvent event registered..
	// Done
	@SubscribeEvent
	public void onEntityDeath(LivingDropsEvent event)
	{
		
		if(!(event.getEntity() instanceof EntityLivingBase)) return;

		EntityLivingBase entityliving = event.getEntityLiving();

		
		//Any mob death.
		if(MOB_DROP_LIST.containsKey(EntityList.getKey(entityliving.getClass())))
		{
			for(ItemDrop drop : MOB_DROP_LIST.get(EntityList.getKey(entityliving.getClass())))
			{
				if(drop.shouldDrop(entityliving.getRNG()))
				{
					// you may need to edit this stuff.
					entityliving.entityDropItem(drop.getStack(entityliving.getRNG()), 0.0f);
				}
			}
		}
		
		
		// Player only kills
		if(isPlayerKill(event.getSource()))
		{
			if(MOB_DROP_LIST_PLAYER_KILL.containsKey(EntityList.getKey(entityliving.getClass())))
			{
				for(ItemDrop drop : MOB_DROP_LIST_PLAYER_KILL.get(EntityList.getKey(entityliving.getClass())))
				{
					if(drop.shouldDrop(entityliving.getRNG()))
					{
						// you may need to edit this stuff.
						entityliving.entityDropItem(drop.getStack(entityliving.getRNG()), 0.0f);
					}
				}
			}	
		}
		
		
	}
	
	/**
	 * checks to make sure its considered a player kill... should work
	 * 
	 * @param source
	 * @return
	 */
	private boolean isPlayerKill(DamageSource source)
	{
		return source.getTrueSource() instanceof EntityPlayer;
	}
	
	
	/**
	 * 
	 * Adds a custom loot table to pull from.
	 * 
	 * @author GenDeathrow
	 */
	public static class ItemDrop
	{
		String itemID;
		int metaID;
		double chance;
		int qty;
		
		public ItemDrop(String itemID, int metaID, double chance, int qty)
		{
			this.itemID = itemID;
			this.metaID = metaID;
			this.chance = chance;
			this.qty = qty;
		}
		
		/**
		 * Pass in an arraylist of dropable items from config file <Br>
		 * and parse it back into an array of drops<br>
		 * 
		 * @param itemList
		 * @return
		 */
		public static ArrayList<ItemDrop> getArrayItemDrops(String[] itemList)
		{
			ArrayList<ItemDrop> drops = new ArrayList<ItemDrop>();
			
			for(String item : itemList)
			{
				try
				{
					drops.add(getItemDrop(item));
				}
				catch(NumberFormatException e)
				{
					e.printStackTrace();
				}
			}
			return drops;
		}
		
		public Item getItem()
		{
			return Item.getByNameOrId(this.itemID);
		}
		
		public int getMeta()
		{
			return this.metaID;
		}
		
		/**
		 * Parses the String from the Config file and creates the ItemDrop Class
		 * @param data
		 * @return
		 * @throws NumberFormatException
		 */
		public static ItemDrop getItemDrop(String data) throws NumberFormatException
		{
			String[] split = data.split(":");

			String itemID = split[0]+":"+split[1];
			int metaID = Integer.parseInt(split[2]);
			double chance= Double.parseDouble(split[4]);
			int qty = Integer.parseInt(split[3]);
			
			
			return new ItemDrop(itemID, metaID,chance,qty);
		}
		
		
		/**
		 * Pass a random and will check against a % chance set from Configs
		 * 
		 * @param rand
		 * @return
		 */
		public boolean shouldDrop(Random rand)
		{
			return rand.nextDouble() <= this.chance;
		}
		
		/**
		 * Gets a stack with a random amount based off config file 
		 * @param rand
		 * @return
		 */
		public ItemStack getStack(Random rand)
		{
			return new ItemStack(Item.getByNameOrId(this.itemID), this.qty > 1 ? rand.nextInt(this.qty-1)+1 : this.qty, this.metaID);
		}
	}
	
	
}
