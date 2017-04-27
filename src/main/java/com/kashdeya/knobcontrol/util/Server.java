package com.kashdeya.knobcontrol.util;

import java.util.HashSet;
import java.util.Random;

import com.kashdeya.knobcontrol.handlers.ModularsHandler;
import com.kashdeya.knobcontrol.handlers.ServerHandler;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteractSpecific;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Server {
	
	public static boolean setSpawnDay;
	
	@SubscribeEvent
	public void hardcoreEvent(LivingHurtEvent event){
		if (ModularsHandler.hardcore){
			if (ServerHandler.airOff){
				if (event.getSource().equals(DamageSource.drown)) {
					event.setAmount(Float.MAX_VALUE);
				}
			}
			if (ServerHandler.CactusHurts){
				if (event.getSource().equals(DamageSource.cactus)) {
					event.setAmount(Float.MAX_VALUE);
				}
			}
			if (ServerHandler.dragonBreath){
				if (event.getSource().equals(DamageSource.dragonBreath)) {
					event.setAmount(Float.MAX_VALUE);
				}
			}
			if (ServerHandler.FallDamage) {
		    	if (event.getSource().equals(DamageSource.fall)) {
		    		event.setAmount(Float.MAX_VALUE);
		    	}
		    }
			if (ServerHandler.FallingBlock) {
				if (event.getSource().equals(DamageSource.fallingBlock)) {
					event.setAmount(Float.MAX_VALUE);
				}
			}
			if (ServerHandler.FoodOverhaul) {
		    	if (event.getSource().equals(DamageSource.starve)) {
		    		event.setAmount(Float.MAX_VALUE);
		    	}
		    }
			if (ServerHandler.LavaHurts) {
		    	if (event.getSource().equals(DamageSource.lava)) {
		    		event.setAmount(Float.MAX_VALUE);
		    	}
		    }
			if (ServerHandler.witherDeath){
				if (event.getSource().equals(DamageSource.wither)) {
					event.setAmount(Float.MAX_VALUE);
				}
			}
			if(ServerHandler.inFire){
				if (event.getSource().equals(DamageSource.inFire)) {
					event.setAmount(Float.MAX_VALUE);
				}
			}
			if (ServerHandler.onFire){
		    	if (event.getSource().equals(DamageSource.onFire)) {
		    		event.setAmount(Float.MAX_VALUE);
		    	}
		    }
			if (ServerHandler.inWall){
		    	if (event.getSource().equals(DamageSource.inWall)) {
		    		event.setAmount(0.0F);
		    	}
		    }
			if (ServerHandler.Lightning) {
		    	if (event.getSource().equals(DamageSource.lightningBolt)) {
		    		event.setAmount(Float.MAX_VALUE);
		    	}
		    }
		}
	}
	
	@SubscribeEvent
	public void onPlayerSleep(PlayerSleepInBedEvent event)
	{
		if (ServerHandler.noSleep){
			event.setResult(EntityPlayer.SleepResult.OTHER_PROBLEM);

			World world = event.getEntityPlayer().getEntityWorld();

			if(world.provider.canRespawnHere() && world.provider.getBiomeForCoords(event.getPos()) != Biomes.HELL)
			{
				EntityPlayer entityPlayer = event.getEntityPlayer();
				entityPlayer.setSpawnPoint(event.getPos(), false);
				entityPlayer.setSpawnChunk(event.getPos(), false, event.getEntityPlayer().dimension);
				entityPlayer.addChatComponentMessage(new TextComponentTranslation("Spawn Set!"));
			}
		}
	}
	
	Random rand = new Random();
	
	@SubscribeEvent
	public void onLivingAttackEvent(LivingAttackEvent event) {
		if (ServerHandler.spidersApplySlowness) {
			if (event.getSource().getDamageType().equals("mob") && event.getSource().getEntity() instanceof EntitySpider) {
				event.getEntityLiving().addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 200, 1));
			}
		}

		if (ServerHandler.CaveSpiderPoison) {
			HashSet<EntityLivingBase> poisonedEntities = new HashSet<>();
			if (event.getSource().getDamageType().equals("mob") && event.getSource().getEntity() instanceof EntityCaveSpider) {
				poisonedEntities.add(event.getEntityLiving());
			}
		}
		
	}
	
	@SubscribeEvent
	public void onLivingUpdateEvent(LivingUpdateEvent event) {
		HashSet<EntityLivingBase> poisonedEntities = new HashSet<>();
		if (poisonedEntities.contains(event.getEntityLiving())) {
			event.getEntityLiving().removePotionEffect(MobEffects.POISON);
			event.getEntityLiving().addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 15 * 20));
			poisonedEntities.remove(event.getEntityLiving());
		}
}
	
    @SubscribeEvent
    public void interact(EntityInteractSpecific entityInteractEvent){
    	if (ServerHandler.villagerTrading){
    		if(entityInteractEvent.getTarget() instanceof EntityVillager){
    			entityInteractEvent.setCanceled(true);
    			} 
    		}
    }
	
	@SubscribeEvent
	public void onWorldTick(TickEvent.WorldTickEvent event)
	{
		if(ServerHandler.regenOff){
			event.world.getGameRules().setOrCreateGameRule("naturalRegeneration", "false");
		}
		
	}
	
	@SubscribeEvent
    public void harvest(BlockEvent.HarvestDropsEvent event) {
		if(ServerHandler.melonDrop){
        if (event.getState().getBlock().equals(Blocks.MELON_BLOCK)) {
            event.getDrops().clear();
            event.getDrops().add(new ItemStack(Blocks.MELON_BLOCK, 1));
        }
        ItemStack block = new ItemStack(Blocks.MELON_BLOCK, 1);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.MELON, 4), block);
		}
    }
	
    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent.RightClickBlock event) {
    	if (ServerHandler.passThrough){
    		IBlockState state = event.getWorld().getBlockState(event.getPos());
    		Block block = state.getBlock();
    		EnumFacing facing = EnumFacing.getFront(state.getBlock().getMetaFromState(state)).getOpposite();
    		
    		if (block == Blocks.WALL_SIGN) {
    			ItemStack held = event.getEntityPlayer().getHeldItem(event.getHand());
    			
    			if (held != null && held.getItem() instanceof ItemBlock) {
    				event.setUseItem(Result.DENY);
    			}
    			
    			if (!event.getEntityPlayer().isSneaking()) {
    				BlockPos posOffset = new BlockPos(event.getPos().getX() + facing.getFrontOffsetX(), event.getPos().getY() + facing.getFrontOffsetY(), event.getPos().getZ() + facing.getFrontOffsetZ());
    				Block attached = event.getWorld().getBlockState(posOffset).getBlock();
    				
    				if (!attached.isAir(state, event.getWorld(), posOffset)) {
    					attached.onBlockActivated(event.getWorld(), posOffset, event.getWorld().getBlockState(posOffset), event.getEntityPlayer(), event.getHand(), held, event.getFace(), 0, 0, 0);
    				}
                }
            }
        }
    }
	
	@SubscribeEvent
	public void onAttacked(LivingAttackEvent event) {
		if (ServerHandler.safeOff){
			if(event.getSource() != null) {
				Entity attacker = event.getSource().getEntity();
				if(attacker != null && attacker.getRidingEntity() == event.getEntity())
					event.setCanceled(true);
			}
		}
	}
	
	@SubscribeEvent
	public void notifyNeighbors(BlockEvent.NeighborNotifyEvent event)
	  {
		if (ServerHandler.leafDecay){
			for (EnumFacing facing : event.getNotifiedSides()){
				BlockPos pos = event.getPos().offset(facing);
				if (event.getWorld().isBlockLoaded(pos)){
					IBlockState state = event.getWorld().getBlockState(pos);
					if (state.getBlock().isLeaves(state, event.getWorld(), pos)) {
						event.getWorld().scheduleUpdate(pos, state.getBlock(), ServerHandler.DecaySpeed + (ServerHandler.DecayFuzz > 0 ? rand.nextInt(ServerHandler.DecayFuzz) : 0));
	        }
	      }
	    }
	  }
	}
	
	@SubscribeEvent
	public void onLivingUpdate(LivingEvent.LivingUpdateEvent event){
		if (ServerHandler.NoSwim) {
			if ((event.getEntity() instanceof EntityPlayer)) {
				if (event.getEntity().worldObj.isRemote) {
					if (event.getEntity().isInWater()) {
						if (GameSettings.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindJump)) {
							event.getEntity().motionY -= 0.03D;
							}
						}
					}
				}
			}
		if (ServerHandler.featherDrops){
			EntityChicken chicken;
			if (event.getEntity().worldObj.isRemote || !(event.getEntity() instanceof EntityChicken))
				return;
			chicken = (EntityChicken) event.getEntity();
			if (chicken.isChild() && ServerHandler.chicksDropFeathers)
				return;
			if(chicken.worldObj.rand.nextInt(ServerHandler.dropFreq) == 1)
			chicken.dropItem(Items.FEATHER, 1);
		}
	}
	
	@SubscribeEvent
	public void onLivingDrops(LivingDropsEvent event) {
		if (ServerHandler.featherDrops){
			boolean setFeather = false;
			EntityChicken chicken;
			if (event.getEntity().worldObj.isRemote || ServerHandler.forceFeatherDrop || !(event.getEntity() instanceof EntityChicken) || !((EntityChicken)event.getEntity()).isChild() && ServerHandler.chicksDropFeathers)
				return;
			chicken = (EntityChicken) event.getEntity();
			for (EntityItem item : event.getDrops()) {
				if (item != null && item.getEntityItem().getItem().equals(Items.FEATHER)) {
					setFeather = true;
					item.getEntityItem().stackSize = MathHelper.getRandomIntegerInRange(item.worldObj.rand, 1, 2);
				}
			}
			if (!setFeather) {
				event.getDrops().add(new EntityItem(event.getEntity().worldObj, chicken.posX, chicken.posY, chicken.posZ, new ItemStack(Items.FEATHER, MathHelper.getRandomIntegerInRange(event.getEntity().worldObj.rand, 1, 2))));
			}
		}
	}
	
	@SubscribeEvent
	public void sleephunger(PlayerWakeUpEvent event){
	    if ((ServerHandler.SleepHunger) && (!event.updateWorld()) && (!event.getEntityPlayer().capabilities.isCreativeMode) && (!event.getEntityPlayer().isDead) && (!event.getEntityPlayer().worldObj.isRemote)){
	      World world = event.getEntityPlayer().worldObj;
	      long sleepTime = 24000L - world.getWorldTime();
	      int hungerInterval = 300;
	      float hungerLoss = Math.round((float)(sleepTime / hungerInterval));
	      event.getEntityPlayer().getFoodStats().addExhaustion(hungerLoss);
	      }
	    }
	  
	@SubscribeEvent
	public void PlayerHurt(LivingHurtEvent event){
		if ((event.getEntityLiving() instanceof EntityPlayer)){
			EntityPlayer player = (EntityPlayer)event.getEntityLiving();
			if ((player.isPotionActive(Potion.getPotionById(19))) && (ServerHandler.ReducePoison) && (event.getSource().damageType == DamageSource.magic.getDamageType())) {
				event.setAmount(ServerHandler.DmgDecrease);
				}
			}
		}
	
	@SubscribeEvent
	public void hungerLoss(LivingEvent.LivingUpdateEvent event){
	    if (((event.getEntityLiving() instanceof EntityPlayer)) && (ServerHandler.hungerLoss)){
	      EntityPlayer player = (EntityPlayer)event.getEntityLiving();
	      if (player.worldObj.isRemote || player.isCreative()) {
	      }
	      else{
	        player.getFoodStats().addExhaustion(ServerHandler.exhaustion);
	      }
	    }
	  }
	
	@SubscribeEvent
	public void entityUpdate(LivingUpdateEvent event) {
		if(((event.getEntity() instanceof EntityZombie)) && (ServerHandler.BurnBaby)) {
			EntityZombie zombie = (EntityZombie) event.getEntity();

			if(zombie.worldObj.isDaytime() && !zombie.worldObj.isRemote && zombie.isChild()) {
				float f = zombie.getBrightness(1.0F);
				BlockPos blockpos = zombie.getRidingEntity() instanceof EntityBoat ? new BlockPos(zombie.posX, Math.round(zombie.posY), zombie.posZ).up() : new BlockPos(zombie.posX, Math.round(zombie.posY), zombie.posZ);

				if(f > 0.5F && zombie.worldObj.rand.nextFloat() * 20.0F < (f - 0.4F) * 2.0F && zombie.worldObj.canSeeSky(blockpos)) {
					boolean flag = true;
					ItemStack itemstack = zombie.getItemStackFromSlot(EntityEquipmentSlot.HEAD);

					if(itemstack != null) {
						if(itemstack.isItemStackDamageable()) {
							itemstack.setItemDamage(itemstack.getItemDamage() + zombie.worldObj.rand.nextInt(2));

							if(itemstack.getItemDamage() >= itemstack.getMaxDamage()) {
								zombie.renderBrokenItemStack(itemstack);
								zombie.setItemStackToSlot(EntityEquipmentSlot.HEAD, (ItemStack)null);
							}
						}

						flag = false;
					}

					if(flag)
						zombie.setFire(100);
				}
			}
		}
		
		if(((event.getEntity() instanceof EntityBat)) && (ServerHandler.BurnBat)) {
			EntityBat bat = (EntityBat) event.getEntity();

			if(bat.worldObj.isDaytime() && !bat.worldObj.isRemote) {
				float f = bat.getBrightness(1.0F);
				BlockPos blockpos = new BlockPos(bat.posX, Math.round(bat.posY), bat.posZ);

				if(f > 0.5F && bat.worldObj.rand.nextFloat() * 20.0F < (f - 0.4F) * 2.0F && bat.worldObj.canSeeSky(blockpos)) {
					boolean flag = true;
					ItemStack itemstack = bat.getItemStackFromSlot(EntityEquipmentSlot.HEAD);

					if(itemstack != null) {
						if(itemstack.isItemStackDamageable()) {
							itemstack.setItemDamage(itemstack.getItemDamage() + bat.worldObj.rand.nextInt(2));

							if(itemstack.getItemDamage() >= itemstack.getMaxDamage()) {
								bat.renderBrokenItemStack(itemstack);
								bat.setItemStackToSlot(EntityEquipmentSlot.HEAD, (ItemStack)null);
							}
						}

						flag = false;
					}

					if(flag)
						bat.setFire(100);
				}
			}
		}
	}
	
	@SubscribeEvent
    public void worldTick(TickEvent.WorldTickEvent event) {
		if (ServerHandler.NoMoreRain) {
        if (event.world.getWorldInfo().isRaining())
            event.world.getWorldInfo().setRaining(false);
        }

		if (ServerHandler.NoMoreThunder) {
        if (event.world.getWorldInfo().isThundering())
            event.world.getWorldInfo().setThundering(false);
        }
	}
}
