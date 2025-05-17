package net.mcreator.evenbetternether.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.evenbetternether.init.EvenbetternetherModBlocks;

public class SpeltStage0OnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double SpeltStage = 0;
		String TempText = "";
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == EvenbetternetherModBlocks.SPELT_STAGE_6.get())) {
			TempText = BuiltInRegistries.BLOCK.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString();
			TempText = TempText.substring((int) (TempText.indexOf(":") + 1), (TempText).length());
			TempText = TempText.substring(12);
			SpeltStage = new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(TempText);
			SpeltStage = SpeltStage + Mth.nextInt(RandomSource.create(), 2, 5);
			if (SpeltStage > 6) {
				SpeltStage = 6;
			}
			world.setBlock(BlockPos.containing(x, y, z),
					BuiltInRegistries.BLOCK.get(ResourceLocation.parse((("evenbetternether:spelt_stage_" + new java.text.DecimalFormat("##").format(SpeltStage))).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState(), 3);
		}
	}
}
