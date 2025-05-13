package net.mcreator.evenbetternether.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class EvenBetterNetherConfigsConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> GENERATEOVERWORLDSPELEOTHEMS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> GENERATENETHERSPELEOTHEMS;
	static {
		BUILDER.push("Worldgen");
		GENERATEOVERWORLDSPELEOTHEMS = BUILDER.comment("Whether to Generate Stone and Deepslate Speleothems in the Overworld").define("generateOverworldSpeleothems", true);
		GENERATENETHERSPELEOTHEMS = BUILDER.comment("Whether to Generate Speleothems in the Nether").define("generateNetherSpeleothems", true);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
