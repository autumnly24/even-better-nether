
package net.mcreator.evenbetternether.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.SoundType;

public class NetherReedTrapdoorBlock extends TrapDoorBlock {
	public NetherReedTrapdoorBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).sound(SoundType.BAMBOO_WOOD).strength(2f, 1f).dynamicShape(), BlockSetType.STONE);
	}
}
