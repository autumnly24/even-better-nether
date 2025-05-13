package net.mcreator.evenbetternether.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.mcreator.evenbetternether.configuration.EvenBetterNetherConfigsConfiguration;
import net.mcreator.evenbetternether.EvenbetternetherMod;

@Mod.EventBusSubscriber(modid = EvenbetternetherMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EvenbetternetherModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, EvenBetterNetherConfigsConfiguration.SPEC, "evenbetternether.toml");
		});
	}
}
