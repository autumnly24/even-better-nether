
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.evenbetternether.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.evenbetternether.EvenbetternetherMod;

public class EvenbetternetherModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EvenbetternetherMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EVEN_BETTER_NETHER_TAB = REGISTRY.register("even_better_nether_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.evenbetternether.even_better_nether_tab")).icon(() -> new ItemStack(EvenbetternetherModBlocks.VERDANT_NYLIUM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EvenbetternetherModBlocks.VERDANT_NYLIUM.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.VERDANT_ROOTS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.VERDANT_SPROUTS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.BONE_GROWTHS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.SMOOTH_BONE_BLOCK.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.SMOOTH_BONE_STAIRS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.SMOOTH_BONE_SLAB.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.SMOOTH_BONE_WALL.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.BONE_SPELEOTHEM.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.WITHERED_NYLIUM.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.BURNING_ROOTS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.BURNING_SPROUTS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.CHARRED_SPROUTS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.WITHER_BONE_GROWTHS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.NYCELIUM.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.MUSHROOM_WOOD.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.MUSHROOM_LOG.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.STRIPPED_MUSHROOM_LOG.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.STRIPPED_MUSHROOM_WOOD.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.MUSHROOM_PLANKS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.MUSHROOM_STAIRS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.MUSHROOM_SLAB.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.MUSHROOM_FENCE.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.MUSHROOM_FENCE_GATE.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.MUSHROOM_PRESSURE_PLATE.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.MUSHROOM_BUTTON.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.MUSHROOM_DOOR.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.MUSHROOM_TRAPDOOR.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.NETHER_MUSHROOM_CAP.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.BROWN_NETHER_MUSHROOM_CAP.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.NETHERSHROOM.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.TALL_NETHERSHROOM.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.FUNGAL_ROOTS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.FUNGAL_SPROUTS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.HANGING_MYCELIUM.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.LONG_HANGING_MYCELIUM.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.BULBOUS_HANGING_MYCELIUM.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.BARREL_CACTUS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.NETHER_SAGUARO.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.FEATHER_FERN.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.NETHER_AGAVE.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.SOUL_ROOTS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.SOUL_SPROUTS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.NETHERRACK_SPELEOTHEM.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.BASALT_SPELEOTHEM.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.BLACKSTONE_SPELEOTHEM.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.GLOWSTONE_SPELEOTHEM.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.STONE_SPELEOTHEM.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.DEEPSLATE_SPELEOTHEM.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.LIGNITE_ORE.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.NETHER_RUBY_ORE.get().asItem());
				tabData.accept(EvenbetternetherModItems.NETHER_RUBY.get());
				tabData.accept(EvenbetternetherModBlocks.NETHER_RUBY_BLOCK.get().asItem());
				tabData.accept(EvenbetternetherModItems.RUBY_PICKAXE.get());
				tabData.accept(EvenbetternetherModItems.RUBY_AXE.get());
				tabData.accept(EvenbetternetherModItems.RUBY_SWORD.get());
				tabData.accept(EvenbetternetherModItems.RUBY_SHOVEL.get());
				tabData.accept(EvenbetternetherModItems.RUBY_HOE.get());
				tabData.accept(EvenbetternetherModItems.RUBY_ARMOR_HELMET.get());
				tabData.accept(EvenbetternetherModItems.RUBY_ARMOR_CHESTPLATE.get());
				tabData.accept(EvenbetternetherModItems.RUBY_ARMOR_LEGGINGS.get());
				tabData.accept(EvenbetternetherModItems.RUBY_ARMOR_BOOTS.get());
				tabData.accept(EvenbetternetherModBlocks.NETHER_PYRITE_ORE.get().asItem());
				tabData.accept(EvenbetternetherModItems.RAW_PYRITE.get());
				tabData.accept(EvenbetternetherModItems.PYRITE_NUGGET.get());
				tabData.accept(EvenbetternetherModItems.PYRITE_INGOT.get());
				tabData.accept(EvenbetternetherModItems.PYRITE_PICKAXE.get());
				tabData.accept(EvenbetternetherModItems.PYRITE_AXE.get());
				tabData.accept(EvenbetternetherModItems.PYRITE_SWORD.get());
				tabData.accept(EvenbetternetherModItems.PYRITE_SHOVEL.get());
				tabData.accept(EvenbetternetherModItems.PYRITE_HOE.get());
				tabData.accept(EvenbetternetherModItems.PYRITE_ARMOR_HELMET.get());
				tabData.accept(EvenbetternetherModItems.PYRITE_ARMOR_CHESTPLATE.get());
				tabData.accept(EvenbetternetherModItems.PYRITE_ARMOR_LEGGINGS.get());
				tabData.accept(EvenbetternetherModItems.PYRITE_ARMOR_BOOTS.get());
				tabData.accept(EvenbetternetherModItems.DIAMOND_PYRITE_UPGRADE_SMITHING_TEMPLATE.get());
				tabData.accept(EvenbetternetherModItems.DIAMOND_PYRITE_PICKAXE.get());
				tabData.accept(EvenbetternetherModItems.DIAMOND_PYRITE_AXE.get());
				tabData.accept(EvenbetternetherModItems.DIAMOND_PYRITE_SWORD.get());
				tabData.accept(EvenbetternetherModItems.DIAMOND_PYRITE_SHOVEL.get());
				tabData.accept(EvenbetternetherModItems.DIAMOND_PYRITE_HOE.get());
				tabData.accept(EvenbetternetherModItems.DIAMOND_PYRITE_EXCAVATOR.get());
				tabData.accept(EvenbetternetherModItems.DIAMOND_PYRITE_ARMOUR_HELMET.get());
				tabData.accept(EvenbetternetherModItems.DIAMOND_PYRITE_ARMOUR_CHESTPLATE.get());
				tabData.accept(EvenbetternetherModItems.DIAMOND_PYRITE_ARMOUR_LEGGINGS.get());
				tabData.accept(EvenbetternetherModItems.DIAMOND_PYRITE_ARMOUR_BOOTS.get());
				tabData.accept(EvenbetternetherModBlocks.PYRITE_BLOCK.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.PYRITE_STAIRS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.PYRITE_SLAB.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.PYRITE_WALL.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.PYRITE_TILES.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.PYRITE_TILE_STAIRS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.PYRITE_TILE_SLAB.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.PYRITE_ROOFING.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.PYRITE_ROOFING_STAIRS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.PYRITE_ROOFING_SLAB.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.CARVED_PYRITE.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.CARVED_PYRITE_STAIRS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.CARVED_PYRITE_SLAB.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.CARVED_PYRITE_WALL.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.CHISELED_PYRITE.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.PYRITE_LAMP.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.PYRITE_BRICKS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.PYRITE_BRICK_STAIRS.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.PYRITE_BRICK_SLAB.get().asItem());
				tabData.accept(EvenbetternetherModBlocks.PYRITE_BRICK_PILLAR.get().asItem());
			})

					.build());
}
