package net.mcreator.evenbetternether.procedures;

import net.mcreator.evenbetternether.configuration.EvenBetterNetherConfigsConfiguration;

public class NetherrackStalagmiteAdditionalGenerationConditionProcedure {
	public static boolean execute() {
		return EvenBetterNetherConfigsConfiguration.GENERATENETHERSPELEOTHEMS.get();
	}
}
