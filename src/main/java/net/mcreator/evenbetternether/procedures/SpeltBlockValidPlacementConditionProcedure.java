package net.mcreator.evenbetternether.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.evenbetternether.init.EvenbetternetherModBlocks;

public class SpeltBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == EvenbetternetherModBlocks.SOUL_FARMLAND.get()) {
			return true;
		}
		return false;
	}
}
