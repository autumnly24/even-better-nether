package net.mcreator.evenbetternether.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.evenbetternether.init.EvenbetternetherModBlocks;

public class BarrelCactusOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		random = Mth.nextInt(RandomSource.create(), 1, 4);
		if (EvenbetternetherModBlocks.BARREL_CACTUS.get().defaultBlockState().canSurvive(world, BlockPos.containing(x + 1, y, z)) && random == 1) {
			world.setBlock(BlockPos.containing(x + 1, y, z), EvenbetternetherModBlocks.BARREL_CACTUS.get().defaultBlockState(), 3);
		}
		if (EvenbetternetherModBlocks.BARREL_CACTUS.get().defaultBlockState().canSurvive(world, BlockPos.containing(x - 1, y, z)) && random == 2) {
			world.setBlock(BlockPos.containing(x - 1, y, z), EvenbetternetherModBlocks.BARREL_CACTUS.get().defaultBlockState(), 3);
		}
		if (EvenbetternetherModBlocks.BARREL_CACTUS.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z + 1)) && random == 3) {
			world.setBlock(BlockPos.containing(x, y, z + 1), EvenbetternetherModBlocks.BARREL_CACTUS.get().defaultBlockState(), 3);
		}
		if (EvenbetternetherModBlocks.BARREL_CACTUS.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z - 1)) && random == 4) {
			world.setBlock(BlockPos.containing(x, y, z - 1), EvenbetternetherModBlocks.BARREL_CACTUS.get().defaultBlockState(), 3);
		}
	}
}
