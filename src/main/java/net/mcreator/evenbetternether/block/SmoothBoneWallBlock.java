
package net.mcreator.evenbetternether.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class SmoothBoneWallBlock extends WallBlock {
	public SmoothBoneWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.METAL).sound(SoundType.BONE_BLOCK).strength(1f, 3f).dynamicShape().forceSolidOn());
	}
}
