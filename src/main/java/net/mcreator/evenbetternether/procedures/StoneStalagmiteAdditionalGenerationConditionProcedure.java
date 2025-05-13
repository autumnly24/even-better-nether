package net.mcreator.evenbetternether.procedures;

import net.mcreator.evenbetternether.configuration.EvenBetterNetherConfigsConfiguration;

public class StoneStalagmiteAdditionalGenerationConditionProcedure {
	public static boolean execute() {
		return EvenBetterNetherConfigsConfiguration.GENERATEOVERWORLDSPELEOTHEMS.get();
	}
}
