
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.evenbetternether.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.evenbetternether.item.RubySwordItem;
import net.mcreator.evenbetternether.item.RubyShovelItem;
import net.mcreator.evenbetternether.item.RubyPickaxeItem;
import net.mcreator.evenbetternether.item.RubyHoeItem;
import net.mcreator.evenbetternether.item.RubyAxeItem;
import net.mcreator.evenbetternether.item.RubyArmorItem;
import net.mcreator.evenbetternether.item.RawPyriteItem;
import net.mcreator.evenbetternether.item.PyriteSwordItem;
import net.mcreator.evenbetternether.item.PyriteShovelItem;
import net.mcreator.evenbetternether.item.PyritePickaxeItem;
import net.mcreator.evenbetternether.item.PyriteNuggetItem;
import net.mcreator.evenbetternether.item.PyriteIngotItem;
import net.mcreator.evenbetternether.item.PyriteHoeItem;
import net.mcreator.evenbetternether.item.PyriteAxeItem;
import net.mcreator.evenbetternether.item.PyriteArmorItem;
import net.mcreator.evenbetternether.item.NetherRubyItem;
import net.mcreator.evenbetternether.item.DiamondPyriteUpgradeSmithingTemplateItem;
import net.mcreator.evenbetternether.item.DiamondPyriteSwordItem;
import net.mcreator.evenbetternether.item.DiamondPyriteShovelItem;
import net.mcreator.evenbetternether.item.DiamondPyritePickaxeItem;
import net.mcreator.evenbetternether.item.DiamondPyriteHoeItem;
import net.mcreator.evenbetternether.item.DiamondPyriteExcavatorItem;
import net.mcreator.evenbetternether.item.DiamondPyriteAxeItem;
import net.mcreator.evenbetternether.item.DiamondPyriteArmourItem;
import net.mcreator.evenbetternether.EvenbetternetherMod;

public class EvenbetternetherModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EvenbetternetherMod.MODID);
	public static final RegistryObject<Item> VERDANT_NYLIUM = block(EvenbetternetherModBlocks.VERDANT_NYLIUM);
	public static final RegistryObject<Item> VERDANT_ROOTS = block(EvenbetternetherModBlocks.VERDANT_ROOTS);
	public static final RegistryObject<Item> BONE_GROWTHS = block(EvenbetternetherModBlocks.BONE_GROWTHS);
	public static final RegistryObject<Item> FEATHER_FERN = block(EvenbetternetherModBlocks.FEATHER_FERN);
	public static final RegistryObject<Item> SMOOTH_BONE_BLOCK = block(EvenbetternetherModBlocks.SMOOTH_BONE_BLOCK);
	public static final RegistryObject<Item> SMOOTH_BONE_STAIRS = block(EvenbetternetherModBlocks.SMOOTH_BONE_STAIRS);
	public static final RegistryObject<Item> SMOOTH_BONE_SLAB = block(EvenbetternetherModBlocks.SMOOTH_BONE_SLAB);
	public static final RegistryObject<Item> SMOOTH_BONE_WALL = block(EvenbetternetherModBlocks.SMOOTH_BONE_WALL);
	public static final RegistryObject<Item> NETHER_AGAVE = block(EvenbetternetherModBlocks.NETHER_AGAVE);
	public static final RegistryObject<Item> VERDANT_SPROUTS = block(EvenbetternetherModBlocks.VERDANT_SPROUTS);
	public static final RegistryObject<Item> NETHER_SAGUARO = doubleBlock(EvenbetternetherModBlocks.NETHER_SAGUARO);
	public static final RegistryObject<Item> BARREL_CACTUS = block(EvenbetternetherModBlocks.BARREL_CACTUS);
	public static final RegistryObject<Item> SOUL_ROOTS = block(EvenbetternetherModBlocks.SOUL_ROOTS);
	public static final RegistryObject<Item> SOUL_SPROUTS = block(EvenbetternetherModBlocks.SOUL_SPROUTS);
	public static final RegistryObject<Item> BASALT_SPELEOTHEM = block(EvenbetternetherModBlocks.BASALT_SPELEOTHEM);
	public static final RegistryObject<Item> NETHERRACK_SPELEOTHEM = block(EvenbetternetherModBlocks.NETHERRACK_SPELEOTHEM);
	public static final RegistryObject<Item> BLACKSTONE_SPELEOTHEM = block(EvenbetternetherModBlocks.BLACKSTONE_SPELEOTHEM);
	public static final RegistryObject<Item> GLOWSTONE_SPELEOTHEM = block(EvenbetternetherModBlocks.GLOWSTONE_SPELEOTHEM);
	public static final RegistryObject<Item> STONE_SPELEOTHEM = block(EvenbetternetherModBlocks.STONE_SPELEOTHEM);
	public static final RegistryObject<Item> DEEPSLATE_SPELEOTHEM = block(EvenbetternetherModBlocks.DEEPSLATE_SPELEOTHEM);
	public static final RegistryObject<Item> BONE_SPELEOTHEM = block(EvenbetternetherModBlocks.BONE_SPELEOTHEM);
	public static final RegistryObject<Item> NYCELIUM = block(EvenbetternetherModBlocks.NYCELIUM);
	public static final RegistryObject<Item> WITHERED_NYLIUM = block(EvenbetternetherModBlocks.WITHERED_NYLIUM);
	public static final RegistryObject<Item> BURNING_ROOTS = block(EvenbetternetherModBlocks.BURNING_ROOTS);
	public static final RegistryObject<Item> BURNING_SPROUTS = block(EvenbetternetherModBlocks.BURNING_SPROUTS);
	public static final RegistryObject<Item> CHARRED_SPROUTS = block(EvenbetternetherModBlocks.CHARRED_SPROUTS);
	public static final RegistryObject<Item> WITHER_BONE_GROWTHS = block(EvenbetternetherModBlocks.WITHER_BONE_GROWTHS);
	public static final RegistryObject<Item> NETHER_PYRITE_ORE = block(EvenbetternetherModBlocks.NETHER_PYRITE_ORE);
	public static final RegistryObject<Item> RAW_PYRITE = REGISTRY.register("raw_pyrite", () -> new RawPyriteItem());
	public static final RegistryObject<Item> PYRITE_INGOT = REGISTRY.register("pyrite_ingot", () -> new PyriteIngotItem());
	public static final RegistryObject<Item> PYRITE_NUGGET = REGISTRY.register("pyrite_nugget", () -> new PyriteNuggetItem());
	public static final RegistryObject<Item> PYRITE_BLOCK = block(EvenbetternetherModBlocks.PYRITE_BLOCK);
	public static final RegistryObject<Item> LIGNITE_ORE = block(EvenbetternetherModBlocks.LIGNITE_ORE);
	public static final RegistryObject<Item> PYRITE_PICKAXE = REGISTRY.register("pyrite_pickaxe", () -> new PyritePickaxeItem());
	public static final RegistryObject<Item> PYRITE_AXE = REGISTRY.register("pyrite_axe", () -> new PyriteAxeItem());
	public static final RegistryObject<Item> PYRITE_SWORD = REGISTRY.register("pyrite_sword", () -> new PyriteSwordItem());
	public static final RegistryObject<Item> PYRITE_SHOVEL = REGISTRY.register("pyrite_shovel", () -> new PyriteShovelItem());
	public static final RegistryObject<Item> PYRITE_HOE = REGISTRY.register("pyrite_hoe", () -> new PyriteHoeItem());
	public static final RegistryObject<Item> NETHER_RUBY_ORE = block(EvenbetternetherModBlocks.NETHER_RUBY_ORE);
	public static final RegistryObject<Item> NETHER_RUBY = REGISTRY.register("nether_ruby", () -> new NetherRubyItem());
	public static final RegistryObject<Item> NETHER_RUBY_BLOCK = block(EvenbetternetherModBlocks.NETHER_RUBY_BLOCK);
	public static final RegistryObject<Item> RUBY_PICKAXE = REGISTRY.register("ruby_pickaxe", () -> new RubyPickaxeItem());
	public static final RegistryObject<Item> RUBY_AXE = REGISTRY.register("ruby_axe", () -> new RubyAxeItem());
	public static final RegistryObject<Item> RUBY_SWORD = REGISTRY.register("ruby_sword", () -> new RubySwordItem());
	public static final RegistryObject<Item> RUBY_SHOVEL = REGISTRY.register("ruby_shovel", () -> new RubyShovelItem());
	public static final RegistryObject<Item> RUBY_HOE = REGISTRY.register("ruby_hoe", () -> new RubyHoeItem());
	public static final RegistryObject<Item> PYRITE_ARMOR_HELMET = REGISTRY.register("pyrite_armor_helmet", () -> new PyriteArmorItem.Helmet());
	public static final RegistryObject<Item> PYRITE_ARMOR_CHESTPLATE = REGISTRY.register("pyrite_armor_chestplate", () -> new PyriteArmorItem.Chestplate());
	public static final RegistryObject<Item> PYRITE_ARMOR_LEGGINGS = REGISTRY.register("pyrite_armor_leggings", () -> new PyriteArmorItem.Leggings());
	public static final RegistryObject<Item> PYRITE_ARMOR_BOOTS = REGISTRY.register("pyrite_armor_boots", () -> new PyriteArmorItem.Boots());
	public static final RegistryObject<Item> RUBY_ARMOR_HELMET = REGISTRY.register("ruby_armor_helmet", () -> new RubyArmorItem.Helmet());
	public static final RegistryObject<Item> RUBY_ARMOR_CHESTPLATE = REGISTRY.register("ruby_armor_chestplate", () -> new RubyArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBY_ARMOR_LEGGINGS = REGISTRY.register("ruby_armor_leggings", () -> new RubyArmorItem.Leggings());
	public static final RegistryObject<Item> RUBY_ARMOR_BOOTS = REGISTRY.register("ruby_armor_boots", () -> new RubyArmorItem.Boots());
	public static final RegistryObject<Item> MUSHROOM_WOOD = block(EvenbetternetherModBlocks.MUSHROOM_WOOD);
	public static final RegistryObject<Item> MUSHROOM_LOG = block(EvenbetternetherModBlocks.MUSHROOM_LOG);
	public static final RegistryObject<Item> MUSHROOM_PLANKS = block(EvenbetternetherModBlocks.MUSHROOM_PLANKS);
	public static final RegistryObject<Item> MUSHROOM_STAIRS = block(EvenbetternetherModBlocks.MUSHROOM_STAIRS);
	public static final RegistryObject<Item> MUSHROOM_SLAB = block(EvenbetternetherModBlocks.MUSHROOM_SLAB);
	public static final RegistryObject<Item> MUSHROOM_FENCE = block(EvenbetternetherModBlocks.MUSHROOM_FENCE);
	public static final RegistryObject<Item> MUSHROOM_FENCE_GATE = block(EvenbetternetherModBlocks.MUSHROOM_FENCE_GATE);
	public static final RegistryObject<Item> MUSHROOM_PRESSURE_PLATE = block(EvenbetternetherModBlocks.MUSHROOM_PRESSURE_PLATE);
	public static final RegistryObject<Item> MUSHROOM_BUTTON = block(EvenbetternetherModBlocks.MUSHROOM_BUTTON);
	public static final RegistryObject<Item> MUSHROOM_DOOR = doubleBlock(EvenbetternetherModBlocks.MUSHROOM_DOOR);
	public static final RegistryObject<Item> MUSHROOM_TRAPDOOR = block(EvenbetternetherModBlocks.MUSHROOM_TRAPDOOR);
	public static final RegistryObject<Item> STRIPPED_MUSHROOM_LOG = block(EvenbetternetherModBlocks.STRIPPED_MUSHROOM_LOG);
	public static final RegistryObject<Item> STRIPPED_MUSHROOM_WOOD = block(EvenbetternetherModBlocks.STRIPPED_MUSHROOM_WOOD);
	public static final RegistryObject<Item> NETHER_MUSHROOM_CAP = block(EvenbetternetherModBlocks.NETHER_MUSHROOM_CAP);
	public static final RegistryObject<Item> BROWN_NETHER_MUSHROOM_CAP = block(EvenbetternetherModBlocks.BROWN_NETHER_MUSHROOM_CAP);
	public static final RegistryObject<Item> TALL_NETHERSHROOM = doubleBlock(EvenbetternetherModBlocks.TALL_NETHERSHROOM);
	public static final RegistryObject<Item> NETHERSHROOM = block(EvenbetternetherModBlocks.NETHERSHROOM);
	public static final RegistryObject<Item> FUNGAL_ROOTS = block(EvenbetternetherModBlocks.FUNGAL_ROOTS);
	public static final RegistryObject<Item> FUNGAL_SPROUTS = block(EvenbetternetherModBlocks.FUNGAL_SPROUTS);
	public static final RegistryObject<Item> HANGING_MYCELIUM = block(EvenbetternetherModBlocks.HANGING_MYCELIUM);
	public static final RegistryObject<Item> LONG_HANGING_MYCELIUM = block(EvenbetternetherModBlocks.LONG_HANGING_MYCELIUM);
	public static final RegistryObject<Item> BULBOUS_HANGING_MYCELIUM = block(EvenbetternetherModBlocks.BULBOUS_HANGING_MYCELIUM);
	public static final RegistryObject<Item> DIAMOND_PYRITE_PICKAXE = REGISTRY.register("diamond_pyrite_pickaxe", () -> new DiamondPyritePickaxeItem());
	public static final RegistryObject<Item> DIAMOND_PYRITE_AXE = REGISTRY.register("diamond_pyrite_axe", () -> new DiamondPyriteAxeItem());
	public static final RegistryObject<Item> DIAMOND_PYRITE_SWORD = REGISTRY.register("diamond_pyrite_sword", () -> new DiamondPyriteSwordItem());
	public static final RegistryObject<Item> DIAMOND_PYRITE_SHOVEL = REGISTRY.register("diamond_pyrite_shovel", () -> new DiamondPyriteShovelItem());
	public static final RegistryObject<Item> DIAMOND_PYRITE_HOE = REGISTRY.register("diamond_pyrite_hoe", () -> new DiamondPyriteHoeItem());
	public static final RegistryObject<Item> DIAMOND_PYRITE_ARMOUR_HELMET = REGISTRY.register("diamond_pyrite_armour_helmet", () -> new DiamondPyriteArmourItem.Helmet());
	public static final RegistryObject<Item> DIAMOND_PYRITE_ARMOUR_CHESTPLATE = REGISTRY.register("diamond_pyrite_armour_chestplate", () -> new DiamondPyriteArmourItem.Chestplate());
	public static final RegistryObject<Item> DIAMOND_PYRITE_ARMOUR_LEGGINGS = REGISTRY.register("diamond_pyrite_armour_leggings", () -> new DiamondPyriteArmourItem.Leggings());
	public static final RegistryObject<Item> DIAMOND_PYRITE_ARMOUR_BOOTS = REGISTRY.register("diamond_pyrite_armour_boots", () -> new DiamondPyriteArmourItem.Boots());
	public static final RegistryObject<Item> DIAMOND_PYRITE_UPGRADE_SMITHING_TEMPLATE = REGISTRY.register("diamond_pyrite_upgrade_smithing_template", () -> new DiamondPyriteUpgradeSmithingTemplateItem());
	public static final RegistryObject<Item> DIAMOND_PYRITE_EXCAVATOR = REGISTRY.register("diamond_pyrite_excavator", () -> new DiamondPyriteExcavatorItem());
	public static final RegistryObject<Item> PYRITE_SLAB = block(EvenbetternetherModBlocks.PYRITE_SLAB);
	public static final RegistryObject<Item> PYRITE_STAIRS = block(EvenbetternetherModBlocks.PYRITE_STAIRS);
	public static final RegistryObject<Item> PYRITE_TILES = block(EvenbetternetherModBlocks.PYRITE_TILES);
	public static final RegistryObject<Item> PYRITE_TILE_STAIRS = block(EvenbetternetherModBlocks.PYRITE_TILE_STAIRS);
	public static final RegistryObject<Item> PYRITE_TILE_SLAB = block(EvenbetternetherModBlocks.PYRITE_TILE_SLAB);
	public static final RegistryObject<Item> PYRITE_WALL = block(EvenbetternetherModBlocks.PYRITE_WALL);
	public static final RegistryObject<Item> PYRITE_ROOFING = block(EvenbetternetherModBlocks.PYRITE_ROOFING);
	public static final RegistryObject<Item> PYRITE_ROOFING_STAIRS = block(EvenbetternetherModBlocks.PYRITE_ROOFING_STAIRS);
	public static final RegistryObject<Item> PYRITE_ROOFING_SLAB = block(EvenbetternetherModBlocks.PYRITE_ROOFING_SLAB);
	public static final RegistryObject<Item> CARVED_PYRITE = block(EvenbetternetherModBlocks.CARVED_PYRITE);
	public static final RegistryObject<Item> CARVED_PYRITE_STAIRS = block(EvenbetternetherModBlocks.CARVED_PYRITE_STAIRS);
	public static final RegistryObject<Item> CARVED_PYRITE_SLAB = block(EvenbetternetherModBlocks.CARVED_PYRITE_SLAB);
	public static final RegistryObject<Item> CARVED_PYRITE_WALL = block(EvenbetternetherModBlocks.CARVED_PYRITE_WALL);
	public static final RegistryObject<Item> CHISELED_PYRITE = block(EvenbetternetherModBlocks.CHISELED_PYRITE);
	public static final RegistryObject<Item> PYRITE_LAMP = block(EvenbetternetherModBlocks.PYRITE_LAMP);
	public static final RegistryObject<Item> PYRITE_BRICKS = block(EvenbetternetherModBlocks.PYRITE_BRICKS);
	public static final RegistryObject<Item> PYRITE_BRICK_STAIRS = block(EvenbetternetherModBlocks.PYRITE_BRICK_STAIRS);
	public static final RegistryObject<Item> PYRITE_BRICK_SLAB = block(EvenbetternetherModBlocks.PYRITE_BRICK_SLAB);
	public static final RegistryObject<Item> PYRITE_BRICK_PILLAR = block(EvenbetternetherModBlocks.PYRITE_BRICK_PILLAR);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
