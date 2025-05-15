package net.mcreator.evenbetternether.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.evenbetternether.init.EvenbetternetherModBlocks;

public class NetherReedAdditionalPlacinggrowthConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getFluidState(BlockPos.containing(x + 1, y - 1, z)).createLegacyBlock()).getBlock() == Blocks.LAVA || (world.getFluidState(BlockPos.containing(x - 1, y - 1, z)).createLegacyBlock()).getBlock() == Blocks.LAVA
				|| (world.getFluidState(BlockPos.containing(x, y - 1, z + 1)).createLegacyBlock()).getBlock() == Blocks.LAVA || (world.getFluidState(BlockPos.containing(x, y - 1, z - 1)).createLegacyBlock()).getBlock() == Blocks.LAVA) {
			return true;
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == EvenbetternetherModBlocks.NETHER_REED.get()) {
			return true;
		}
		return false;
	}
}
