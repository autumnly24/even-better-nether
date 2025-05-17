package net.mcreator.evenbetternether.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

public class BarrelCactusEntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameTime() % 10 == 0) {
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.CACTUS)), 1);
		}
	}
}
