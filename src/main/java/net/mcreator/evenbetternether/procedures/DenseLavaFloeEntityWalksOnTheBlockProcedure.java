package net.mcreator.evenbetternether.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.evenbetternether.EvenbetternetherMod;

public class DenseLavaFloeEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.dayTime() % 10 == 0) {
			if (Math.random() < 0.25) {
				EvenbetternetherMod.queueServerWork(7, () -> {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				});
			}
		}
	}
}
