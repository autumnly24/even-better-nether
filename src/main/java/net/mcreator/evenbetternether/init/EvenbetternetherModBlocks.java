
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.evenbetternether.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.evenbetternether.block.WitheredNyliumBlock;
import net.mcreator.evenbetternether.block.WitherBoneGrowthsBlock;
import net.mcreator.evenbetternether.block.VerdantSproutsBlock;
import net.mcreator.evenbetternether.block.VerdantRootsBlock;
import net.mcreator.evenbetternether.block.VerdantNyliumBlock;
import net.mcreator.evenbetternether.block.TallNethershroomBlock;
import net.mcreator.evenbetternether.block.StrippedMushroomWoodBlock;
import net.mcreator.evenbetternether.block.StrippedMushroomLogBlock;
import net.mcreator.evenbetternether.block.StoneSpeleothemBlock;
import net.mcreator.evenbetternether.block.SoulSproutsBlock;
import net.mcreator.evenbetternether.block.SoulRootsBlock;
import net.mcreator.evenbetternether.block.SmoothBoneWallBlock;
import net.mcreator.evenbetternether.block.SmoothBoneStairsBlock;
import net.mcreator.evenbetternether.block.SmoothBoneSlabBlock;
import net.mcreator.evenbetternether.block.SmoothBoneBlockBlock;
import net.mcreator.evenbetternether.block.PyriteBlockBlock;
import net.mcreator.evenbetternether.block.NyceliumBlock;
import net.mcreator.evenbetternether.block.NethershroomBlock;
import net.mcreator.evenbetternether.block.NetherrackSpeleothemBlock;
import net.mcreator.evenbetternether.block.NetherSaguaroBlock;
import net.mcreator.evenbetternether.block.NetherRubyOreBlock;
import net.mcreator.evenbetternether.block.NetherRubyBlockBlock;
import net.mcreator.evenbetternether.block.NetherPyriteOreBlock;
import net.mcreator.evenbetternether.block.NetherMushroomCapBlock;
import net.mcreator.evenbetternether.block.NetherAgaveBlock;
import net.mcreator.evenbetternether.block.MushroomWoodBlock;
import net.mcreator.evenbetternether.block.MushroomTrapdoorBlock;
import net.mcreator.evenbetternether.block.MushroomStairsBlock;
import net.mcreator.evenbetternether.block.MushroomSlabBlock;
import net.mcreator.evenbetternether.block.MushroomPressurePlateBlock;
import net.mcreator.evenbetternether.block.MushroomPlanksBlock;
import net.mcreator.evenbetternether.block.MushroomLogBlock;
import net.mcreator.evenbetternether.block.MushroomFenceGateBlock;
import net.mcreator.evenbetternether.block.MushroomFenceBlock;
import net.mcreator.evenbetternether.block.MushroomDoorBlock;
import net.mcreator.evenbetternether.block.MushroomButtonBlock;
import net.mcreator.evenbetternether.block.LongHangingMyceliumBlock;
import net.mcreator.evenbetternether.block.LigniteOreBlock;
import net.mcreator.evenbetternether.block.HangingMyceliumBlock;
import net.mcreator.evenbetternether.block.GlowstoneSpeleothemBlock;
import net.mcreator.evenbetternether.block.FungalSproutsBlock;
import net.mcreator.evenbetternether.block.FungalRootsBlock;
import net.mcreator.evenbetternether.block.FeatherFernBlock;
import net.mcreator.evenbetternether.block.DeepslateSpeleothemBlock;
import net.mcreator.evenbetternether.block.CharredSproutsBlock;
import net.mcreator.evenbetternether.block.BurningSproutsBlock;
import net.mcreator.evenbetternether.block.BurningRootsBlock;
import net.mcreator.evenbetternether.block.BulbousHangingMyceliumBlock;
import net.mcreator.evenbetternether.block.BrownNetherMushroomCapBlock;
import net.mcreator.evenbetternether.block.BoneSpeleothemBlock;
import net.mcreator.evenbetternether.block.BoneGrowthsBlock;
import net.mcreator.evenbetternether.block.BlackstoneSpeleothemBlock;
import net.mcreator.evenbetternether.block.BasaltSpeleothemBlock;
import net.mcreator.evenbetternether.block.BarrelCactusBlock;
import net.mcreator.evenbetternether.EvenbetternetherMod;

public class EvenbetternetherModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(EvenbetternetherMod.MODID);
	public static final DeferredBlock<Block> VERDANT_NYLIUM = REGISTRY.register("verdant_nylium", VerdantNyliumBlock::new);
	public static final DeferredBlock<Block> VERDANT_ROOTS = REGISTRY.register("verdant_roots", VerdantRootsBlock::new);
	public static final DeferredBlock<Block> BONE_GROWTHS = REGISTRY.register("bone_growths", BoneGrowthsBlock::new);
	public static final DeferredBlock<Block> FEATHER_FERN = REGISTRY.register("feather_fern", FeatherFernBlock::new);
	public static final DeferredBlock<Block> SMOOTH_BONE_BLOCK = REGISTRY.register("smooth_bone_block", SmoothBoneBlockBlock::new);
	public static final DeferredBlock<Block> SMOOTH_BONE_STAIRS = REGISTRY.register("smooth_bone_stairs", SmoothBoneStairsBlock::new);
	public static final DeferredBlock<Block> SMOOTH_BONE_SLAB = REGISTRY.register("smooth_bone_slab", SmoothBoneSlabBlock::new);
	public static final DeferredBlock<Block> SMOOTH_BONE_WALL = REGISTRY.register("smooth_bone_wall", SmoothBoneWallBlock::new);
	public static final DeferredBlock<Block> NETHER_AGAVE = REGISTRY.register("nether_agave", NetherAgaveBlock::new);
	public static final DeferredBlock<Block> VERDANT_SPROUTS = REGISTRY.register("verdant_sprouts", VerdantSproutsBlock::new);
	public static final DeferredBlock<Block> NETHER_SAGUARO = REGISTRY.register("nether_saguaro", NetherSaguaroBlock::new);
	public static final DeferredBlock<Block> BARREL_CACTUS = REGISTRY.register("barrel_cactus", BarrelCactusBlock::new);
	public static final DeferredBlock<Block> SOUL_ROOTS = REGISTRY.register("soul_roots", SoulRootsBlock::new);
	public static final DeferredBlock<Block> SOUL_SPROUTS = REGISTRY.register("soul_sprouts", SoulSproutsBlock::new);
	public static final DeferredBlock<Block> BASALT_SPELEOTHEM = REGISTRY.register("basalt_speleothem", BasaltSpeleothemBlock::new);
	public static final DeferredBlock<Block> NETHERRACK_SPELEOTHEM = REGISTRY.register("netherrack_speleothem", NetherrackSpeleothemBlock::new);
	public static final DeferredBlock<Block> BLACKSTONE_SPELEOTHEM = REGISTRY.register("blackstone_speleothem", BlackstoneSpeleothemBlock::new);
	public static final DeferredBlock<Block> GLOWSTONE_SPELEOTHEM = REGISTRY.register("glowstone_speleothem", GlowstoneSpeleothemBlock::new);
	public static final DeferredBlock<Block> STONE_SPELEOTHEM = REGISTRY.register("stone_speleothem", StoneSpeleothemBlock::new);
	public static final DeferredBlock<Block> DEEPSLATE_SPELEOTHEM = REGISTRY.register("deepslate_speleothem", DeepslateSpeleothemBlock::new);
	public static final DeferredBlock<Block> BONE_SPELEOTHEM = REGISTRY.register("bone_speleothem", BoneSpeleothemBlock::new);
	public static final DeferredBlock<Block> NYCELIUM = REGISTRY.register("nycelium", NyceliumBlock::new);
	public static final DeferredBlock<Block> WITHERED_NYLIUM = REGISTRY.register("withered_nylium", WitheredNyliumBlock::new);
	public static final DeferredBlock<Block> BURNING_ROOTS = REGISTRY.register("burning_roots", BurningRootsBlock::new);
	public static final DeferredBlock<Block> BURNING_SPROUTS = REGISTRY.register("burning_sprouts", BurningSproutsBlock::new);
	public static final DeferredBlock<Block> CHARRED_SPROUTS = REGISTRY.register("charred_sprouts", CharredSproutsBlock::new);
	public static final DeferredBlock<Block> WITHER_BONE_GROWTHS = REGISTRY.register("wither_bone_growths", WitherBoneGrowthsBlock::new);
	public static final DeferredBlock<Block> NETHER_PYRITE_ORE = REGISTRY.register("nether_pyrite_ore", NetherPyriteOreBlock::new);
	public static final DeferredBlock<Block> PYRITE_BLOCK = REGISTRY.register("pyrite_block", PyriteBlockBlock::new);
	public static final DeferredBlock<Block> LIGNITE_ORE = REGISTRY.register("lignite_ore", LigniteOreBlock::new);
	public static final DeferredBlock<Block> NETHER_RUBY_ORE = REGISTRY.register("nether_ruby_ore", NetherRubyOreBlock::new);
	public static final DeferredBlock<Block> NETHER_RUBY_BLOCK = REGISTRY.register("nether_ruby_block", NetherRubyBlockBlock::new);
	public static final DeferredBlock<Block> MUSHROOM_WOOD = REGISTRY.register("mushroom_wood", MushroomWoodBlock::new);
	public static final DeferredBlock<Block> MUSHROOM_LOG = REGISTRY.register("mushroom_log", MushroomLogBlock::new);
	public static final DeferredBlock<Block> MUSHROOM_PLANKS = REGISTRY.register("mushroom_planks", MushroomPlanksBlock::new);
	public static final DeferredBlock<Block> MUSHROOM_STAIRS = REGISTRY.register("mushroom_stairs", MushroomStairsBlock::new);
	public static final DeferredBlock<Block> MUSHROOM_SLAB = REGISTRY.register("mushroom_slab", MushroomSlabBlock::new);
	public static final DeferredBlock<Block> MUSHROOM_FENCE = REGISTRY.register("mushroom_fence", MushroomFenceBlock::new);
	public static final DeferredBlock<Block> MUSHROOM_FENCE_GATE = REGISTRY.register("mushroom_fence_gate", MushroomFenceGateBlock::new);
	public static final DeferredBlock<Block> MUSHROOM_PRESSURE_PLATE = REGISTRY.register("mushroom_pressure_plate", MushroomPressurePlateBlock::new);
	public static final DeferredBlock<Block> MUSHROOM_BUTTON = REGISTRY.register("mushroom_button", MushroomButtonBlock::new);
	public static final DeferredBlock<Block> MUSHROOM_DOOR = REGISTRY.register("mushroom_door", MushroomDoorBlock::new);
	public static final DeferredBlock<Block> MUSHROOM_TRAPDOOR = REGISTRY.register("mushroom_trapdoor", MushroomTrapdoorBlock::new);
	public static final DeferredBlock<Block> STRIPPED_MUSHROOM_LOG = REGISTRY.register("stripped_mushroom_log", StrippedMushroomLogBlock::new);
	public static final DeferredBlock<Block> STRIPPED_MUSHROOM_WOOD = REGISTRY.register("stripped_mushroom_wood", StrippedMushroomWoodBlock::new);
	public static final DeferredBlock<Block> NETHER_MUSHROOM_CAP = REGISTRY.register("nether_mushroom_cap", NetherMushroomCapBlock::new);
	public static final DeferredBlock<Block> BROWN_NETHER_MUSHROOM_CAP = REGISTRY.register("brown_nether_mushroom_cap", BrownNetherMushroomCapBlock::new);
	public static final DeferredBlock<Block> TALL_NETHERSHROOM = REGISTRY.register("tall_nethershroom", TallNethershroomBlock::new);
	public static final DeferredBlock<Block> NETHERSHROOM = REGISTRY.register("nethershroom", NethershroomBlock::new);
	public static final DeferredBlock<Block> FUNGAL_ROOTS = REGISTRY.register("fungal_roots", FungalRootsBlock::new);
	public static final DeferredBlock<Block> FUNGAL_SPROUTS = REGISTRY.register("fungal_sprouts", FungalSproutsBlock::new);
	public static final DeferredBlock<Block> HANGING_MYCELIUM = REGISTRY.register("hanging_mycelium", HangingMyceliumBlock::new);
	public static final DeferredBlock<Block> LONG_HANGING_MYCELIUM = REGISTRY.register("long_hanging_mycelium", LongHangingMyceliumBlock::new);
	public static final DeferredBlock<Block> BULBOUS_HANGING_MYCELIUM = REGISTRY.register("bulbous_hanging_mycelium", BulbousHangingMyceliumBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
