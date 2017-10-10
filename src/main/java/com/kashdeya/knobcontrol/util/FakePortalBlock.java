package com.kashdeya.knobcontrol.util;

import net.minecraft.block.BlockPortal;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FakePortalBlock extends BlockPortal{	
	
	public static final String registryName = "minecraft:portal";
	
	public boolean trySpawnPortal(World worldIn, BlockPos pos){
		return false;
	}
}
