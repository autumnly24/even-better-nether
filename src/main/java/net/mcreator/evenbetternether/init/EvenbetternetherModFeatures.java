
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.evenbetternether.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.core.registries.Registries;

import net.mcreator.evenbetternether.world.features.StoneStalagtiteFeature;
import net.mcreator.evenbetternether.world.features.StoneStalagmiteFeature;
import net.mcreator.evenbetternether.world.features.SSVBasaltStalagtiteFeature;
import net.mcreator.evenbetternether.world.features.SSVBasaltStalagmiteFeature;
import net.mcreator.evenbetternether.world.features.NetherrackStalagtiteFeature;
import net.mcreator.evenbetternether.world.features.NetherrackStalagmiteFeature;
import net.mcreator.evenbetternether.world.features.LongHangingMyceliumFeatureFeature;
import net.mcreator.evenbetternether.world.features.HangingMyceliumFeatureFeature;
import net.mcreator.evenbetternether.world.features.GlowstoneStalagtiteFeature;
import net.mcreator.evenbetternether.world.features.GlowstoneStalagmiteFeature;
import net.mcreator.evenbetternether.world.features.DeepslateStalagtiteFeature;
import net.mcreator.evenbetternether.world.features.DeepslateStalagmiteFeature;
import net.mcreator.evenbetternether.world.features.BulbousHangingMyceliumFeatureFeature;
import net.mcreator.evenbetternether.world.features.BoneStalagtiteFeature;
import net.mcreator.evenbetternether.world.features.BoneStalagmiteFeature;
import net.mcreator.evenbetternether.world.features.BlackstoneStalagtiteFeature;
import net.mcreator.evenbetternether.world.features.BlackstoneStalagmiteFeature;
import net.mcreator.evenbetternether.world.features.BasaltStalagtiteFeature;
import net.mcreator.evenbetternether.world.features.BasaltStalagmiteFeature;
import net.mcreator.evenbetternether.EvenbetternetherMod;

public class EvenbetternetherModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(Registries.FEATURE, EvenbetternetherMod.MODID);
	public static final DeferredHolder<Feature<?>, Feature<?>> NETHERRACK_STALAGMITE = REGISTRY.register("netherrack_stalagmite", NetherrackStalagmiteFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> NETHERRACK_STALAGTITE = REGISTRY.register("netherrack_stalagtite", NetherrackStalagtiteFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> BASALT_STALAGMITE = REGISTRY.register("basalt_stalagmite", BasaltStalagmiteFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> BASALT_STALAGTITE = REGISTRY.register("basalt_stalagtite", BasaltStalagtiteFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> BLACKSTONE_STALAGMITE = REGISTRY.register("blackstone_stalagmite", BlackstoneStalagmiteFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> BLACKSTONE_STALAGTITE = REGISTRY.register("blackstone_stalagtite", BlackstoneStalagtiteFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> GLOWSTONE_STALAGMITE = REGISTRY.register("glowstone_stalagmite", GlowstoneStalagmiteFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> GLOWSTONE_STALAGTITE = REGISTRY.register("glowstone_stalagtite", GlowstoneStalagtiteFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> SSV_BASALT_STALAGMITE = REGISTRY.register("ssv_basalt_stalagmite", SSVBasaltStalagmiteFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> SSV_BASALT_STALAGTITE = REGISTRY.register("ssv_basalt_stalagtite", SSVBasaltStalagtiteFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> BONE_STALAGMITE = REGISTRY.register("bone_stalagmite", BoneStalagmiteFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> BONE_STALAGTITE = REGISTRY.register("bone_stalagtite", BoneStalagtiteFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> STONE_STALAGMITE = REGISTRY.register("stone_stalagmite", StoneStalagmiteFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> STONE_STALAGTITE = REGISTRY.register("stone_stalagtite", StoneStalagtiteFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> DEEPSLATE_STALAGMITE = REGISTRY.register("deepslate_stalagmite", DeepslateStalagmiteFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> DEEPSLATE_STALAGTITE = REGISTRY.register("deepslate_stalagtite", DeepslateStalagtiteFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> HANGING_MYCELIUM_FEATURE = REGISTRY.register("hanging_mycelium_feature", HangingMyceliumFeatureFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> LONG_HANGING_MYCELIUM_FEATURE = REGISTRY.register("long_hanging_mycelium_feature", LongHangingMyceliumFeatureFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> BULBOUS_HANGING_MYCELIUM_FEATURE = REGISTRY.register("bulbous_hanging_mycelium_feature", BulbousHangingMyceliumFeatureFeature::new);
}
