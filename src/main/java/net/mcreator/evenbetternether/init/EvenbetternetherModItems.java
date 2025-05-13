
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.evenbetternether.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

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
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(EvenbetternetherMod.MODID);
	public static final DeferredItem<Item> VERDANT_NYLIUM = block(EvenbetternetherModBlocks.VERDANT_NYLIUM);
	public static final DeferredItem<Item> VERDANT_ROOTS = block(EvenbetternetherModBlocks.VERDANT_ROOTS);
	public static final DeferredItem<Item> BONE_GROWTHS = block(EvenbetternetherModBlocks.BONE_GROWTHS);
	public static final DeferredItem<Item> FEATHER_FERN = block(EvenbetternetherModBlocks.FEATHER_FERN);
	public static final DeferredItem<Item> SMOOTH_BONE_BLOCK = block(EvenbetternetherModBlocks.SMOOTH_BONE_BLOCK);
	public static final DeferredItem<Item> SMOOTH_BONE_STAIRS = block(EvenbetternetherModBlocks.SMOOTH_BONE_STAIRS);
	public static final DeferredItem<Item> SMOOTH_BONE_SLAB = block(EvenbetternetherModBlocks.SMOOTH_BONE_SLAB);
	public static final DeferredItem<Item> SMOOTH_BONE_WALL = block(EvenbetternetherModBlocks.SMOOTH_BONE_WALL);
	public static final DeferredItem<Item> NETHER_AGAVE = block(EvenbetternetherModBlocks.NETHER_AGAVE);
	public static final DeferredItem<Item> VERDANT_SPROUTS = block(EvenbetternetherModBlocks.VERDANT_SPROUTS);
	public static final DeferredItem<Item> NETHER_SAGUARO = doubleBlock(EvenbetternetherModBlocks.NETHER_SAGUARO);
	public static final DeferredItem<Item> BARREL_CACTUS = block(EvenbetternetherModBlocks.BARREL_CACTUS);
	public static final DeferredItem<Item> SOUL_ROOTS = block(EvenbetternetherModBlocks.SOUL_ROOTS);
	public static final DeferredItem<Item> SOUL_SPROUTS = block(EvenbetternetherModBlocks.SOUL_SPROUTS);
	public static final DeferredItem<Item> BASALT_SPELEOTHEM = block(EvenbetternetherModBlocks.BASALT_SPELEOTHEM);
	public static final DeferredItem<Item> NETHERRACK_SPELEOTHEM = block(EvenbetternetherModBlocks.NETHERRACK_SPELEOTHEM);
	public static final DeferredItem<Item> BLACKSTONE_SPELEOTHEM = block(EvenbetternetherModBlocks.BLACKSTONE_SPELEOTHEM);
	public static final DeferredItem<Item> GLOWSTONE_SPELEOTHEM = block(EvenbetternetherModBlocks.GLOWSTONE_SPELEOTHEM);
	public static final DeferredItem<Item> STONE_SPELEOTHEM = block(EvenbetternetherModBlocks.STONE_SPELEOTHEM);
	public static final DeferredItem<Item> DEEPSLATE_SPELEOTHEM = block(EvenbetternetherModBlocks.DEEPSLATE_SPELEOTHEM);
	public static final DeferredItem<Item> BONE_SPELEOTHEM = block(EvenbetternetherModBlocks.BONE_SPELEOTHEM);
	public static final DeferredItem<Item> NYCELIUM = block(EvenbetternetherModBlocks.NYCELIUM);
	public static final DeferredItem<Item> WITHERED_NYLIUM = block(EvenbetternetherModBlocks.WITHERED_NYLIUM);
	public static final DeferredItem<Item> BURNING_ROOTS = block(EvenbetternetherModBlocks.BURNING_ROOTS);
	public static final DeferredItem<Item> BURNING_SPROUTS = block(EvenbetternetherModBlocks.BURNING_SPROUTS);
	public static final DeferredItem<Item> CHARRED_SPROUTS = block(EvenbetternetherModBlocks.CHARRED_SPROUTS);
	public static final DeferredItem<Item> WITHER_BONE_GROWTHS = block(EvenbetternetherModBlocks.WITHER_BONE_GROWTHS);
	public static final DeferredItem<Item> NETHER_PYRITE_ORE = block(EvenbetternetherModBlocks.NETHER_PYRITE_ORE);
	public static final DeferredItem<Item> RAW_PYRITE = REGISTRY.register("raw_pyrite", RawPyriteItem::new);
	public static final DeferredItem<Item> PYRITE_INGOT = REGISTRY.register("pyrite_ingot", PyriteIngotItem::new);
	public static final DeferredItem<Item> PYRITE_NUGGET = REGISTRY.register("pyrite_nugget", PyriteNuggetItem::new);
	public static final DeferredItem<Item> PYRITE_BLOCK = block(EvenbetternetherModBlocks.PYRITE_BLOCK);
	public static final DeferredItem<Item> LIGNITE_ORE = block(EvenbetternetherModBlocks.LIGNITE_ORE);
	public static final DeferredItem<Item> PYRITE_PICKAXE = REGISTRY.register("pyrite_pickaxe", PyritePickaxeItem::new);
	public static final DeferredItem<Item> PYRITE_AXE = REGISTRY.register("pyrite_axe", PyriteAxeItem::new);
	public static final DeferredItem<Item> PYRITE_SWORD = REGISTRY.register("pyrite_sword", PyriteSwordItem::new);
	public static final DeferredItem<Item> PYRITE_SHOVEL = REGISTRY.register("pyrite_shovel", PyriteShovelItem::new);
	public static final DeferredItem<Item> PYRITE_HOE = REGISTRY.register("pyrite_hoe", PyriteHoeItem::new);
	public static final DeferredItem<Item> NETHER_RUBY_ORE = block(EvenbetternetherModBlocks.NETHER_RUBY_ORE);
	public static final DeferredItem<Item> NETHER_RUBY = REGISTRY.register("nether_ruby", NetherRubyItem::new);
	public static final DeferredItem<Item> NETHER_RUBY_BLOCK = block(EvenbetternetherModBlocks.NETHER_RUBY_BLOCK);
	public static final DeferredItem<Item> RUBY_PICKAXE = REGISTRY.register("ruby_pickaxe", RubyPickaxeItem::new);
	public static final DeferredItem<Item> RUBY_AXE = REGISTRY.register("ruby_axe", RubyAxeItem::new);
	public static final DeferredItem<Item> RUBY_SWORD = REGISTRY.register("ruby_sword", RubySwordItem::new);
	public static final DeferredItem<Item> RUBY_SHOVEL = REGISTRY.register("ruby_shovel", RubyShovelItem::new);
	public static final DeferredItem<Item> RUBY_HOE = REGISTRY.register("ruby_hoe", RubyHoeItem::new);
	public static final DeferredItem<Item> PYRITE_ARMOR_HELMET = REGISTRY.register("pyrite_armor_helmet", PyriteArmorItem.Helmet::new);
	public static final DeferredItem<Item> PYRITE_ARMOR_CHESTPLATE = REGISTRY.register("pyrite_armor_chestplate", PyriteArmorItem.Chestplate::new);
	public static final DeferredItem<Item> PYRITE_ARMOR_LEGGINGS = REGISTRY.register("pyrite_armor_leggings", PyriteArmorItem.Leggings::new);
	public static final DeferredItem<Item> PYRITE_ARMOR_BOOTS = REGISTRY.register("pyrite_armor_boots", PyriteArmorItem.Boots::new);
	public static final DeferredItem<Item> RUBY_ARMOR_HELMET = REGISTRY.register("ruby_armor_helmet", RubyArmorItem.Helmet::new);
	public static final DeferredItem<Item> RUBY_ARMOR_CHESTPLATE = REGISTRY.register("ruby_armor_chestplate", RubyArmorItem.Chestplate::new);
	public static final DeferredItem<Item> RUBY_ARMOR_LEGGINGS = REGISTRY.register("ruby_armor_leggings", RubyArmorItem.Leggings::new);
	public static final DeferredItem<Item> RUBY_ARMOR_BOOTS = REGISTRY.register("ruby_armor_boots", RubyArmorItem.Boots::new);
	public static final DeferredItem<Item> MUSHROOM_WOOD = block(EvenbetternetherModBlocks.MUSHROOM_WOOD);
	public static final DeferredItem<Item> MUSHROOM_LOG = block(EvenbetternetherModBlocks.MUSHROOM_LOG);
	public static final DeferredItem<Item> MUSHROOM_PLANKS = block(EvenbetternetherModBlocks.MUSHROOM_PLANKS);
	public static final DeferredItem<Item> MUSHROOM_STAIRS = block(EvenbetternetherModBlocks.MUSHROOM_STAIRS);
	public static final DeferredItem<Item> MUSHROOM_SLAB = block(EvenbetternetherModBlocks.MUSHROOM_SLAB);
	public static final DeferredItem<Item> MUSHROOM_FENCE = block(EvenbetternetherModBlocks.MUSHROOM_FENCE);
	public static final DeferredItem<Item> MUSHROOM_FENCE_GATE = block(EvenbetternetherModBlocks.MUSHROOM_FENCE_GATE);
	public static final DeferredItem<Item> MUSHROOM_PRESSURE_PLATE = block(EvenbetternetherModBlocks.MUSHROOM_PRESSURE_PLATE);
	public static final DeferredItem<Item> MUSHROOM_BUTTON = block(EvenbetternetherModBlocks.MUSHROOM_BUTTON);
	public static final DeferredItem<Item> MUSHROOM_DOOR = doubleBlock(EvenbetternetherModBlocks.MUSHROOM_DOOR);
	public static final DeferredItem<Item> MUSHROOM_TRAPDOOR = block(EvenbetternetherModBlocks.MUSHROOM_TRAPDOOR);
	public static final DeferredItem<Item> STRIPPED_MUSHROOM_LOG = block(EvenbetternetherModBlocks.STRIPPED_MUSHROOM_LOG);
	public static final DeferredItem<Item> STRIPPED_MUSHROOM_WOOD = block(EvenbetternetherModBlocks.STRIPPED_MUSHROOM_WOOD);
	public static final DeferredItem<Item> NETHER_MUSHROOM_CAP = block(EvenbetternetherModBlocks.NETHER_MUSHROOM_CAP);
	public static final DeferredItem<Item> BROWN_NETHER_MUSHROOM_CAP = block(EvenbetternetherModBlocks.BROWN_NETHER_MUSHROOM_CAP);
	public static final DeferredItem<Item> TALL_NETHERSHROOM = doubleBlock(EvenbetternetherModBlocks.TALL_NETHERSHROOM);
	public static final DeferredItem<Item> NETHERSHROOM = block(EvenbetternetherModBlocks.NETHERSHROOM);
	public static final DeferredItem<Item> FUNGAL_ROOTS = block(EvenbetternetherModBlocks.FUNGAL_ROOTS);
	public static final DeferredItem<Item> FUNGAL_SPROUTS = block(EvenbetternetherModBlocks.FUNGAL_SPROUTS);
	public static final DeferredItem<Item> HANGING_MYCELIUM = block(EvenbetternetherModBlocks.HANGING_MYCELIUM);
	public static final DeferredItem<Item> LONG_HANGING_MYCELIUM = block(EvenbetternetherModBlocks.LONG_HANGING_MYCELIUM);
	public static final DeferredItem<Item> BULBOUS_HANGING_MYCELIUM = block(EvenbetternetherModBlocks.BULBOUS_HANGING_MYCELIUM);
	public static final DeferredItem<Item> DIAMOND_PYRITE_PICKAXE = REGISTRY.register("diamond_pyrite_pickaxe", DiamondPyritePickaxeItem::new);
	public static final DeferredItem<Item> DIAMOND_PYRITE_AXE = REGISTRY.register("diamond_pyrite_axe", DiamondPyriteAxeItem::new);
	public static final DeferredItem<Item> DIAMOND_PYRITE_SWORD = REGISTRY.register("diamond_pyrite_sword", DiamondPyriteSwordItem::new);
	public static final DeferredItem<Item> DIAMOND_PYRITE_SHOVEL = REGISTRY.register("diamond_pyrite_shovel", DiamondPyriteShovelItem::new);
	public static final DeferredItem<Item> DIAMOND_PYRITE_HOE = REGISTRY.register("diamond_pyrite_hoe", DiamondPyriteHoeItem::new);
	public static final DeferredItem<Item> DIAMOND_PYRITE_ARMOUR_HELMET = REGISTRY.register("diamond_pyrite_armour_helmet", DiamondPyriteArmourItem.Helmet::new);
	public static final DeferredItem<Item> DIAMOND_PYRITE_ARMOUR_CHESTPLATE = REGISTRY.register("diamond_pyrite_armour_chestplate", DiamondPyriteArmourItem.Chestplate::new);
	public static final DeferredItem<Item> DIAMOND_PYRITE_ARMOUR_LEGGINGS = REGISTRY.register("diamond_pyrite_armour_leggings", DiamondPyriteArmourItem.Leggings::new);
	public static final DeferredItem<Item> DIAMOND_PYRITE_ARMOUR_BOOTS = REGISTRY.register("diamond_pyrite_armour_boots", DiamondPyriteArmourItem.Boots::new);
	public static final DeferredItem<Item> DIAMOND_PYRITE_UPGRADE_SMITHING_TEMPLATE = REGISTRY.register("diamond_pyrite_upgrade_smithing_template", DiamondPyriteUpgradeSmithingTemplateItem::new);
	public static final DeferredItem<Item> DIAMOND_PYRITE_EXCAVATOR = REGISTRY.register("diamond_pyrite_excavator", DiamondPyriteExcavatorItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
