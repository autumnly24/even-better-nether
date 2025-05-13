
package net.mcreator.evenbetternether.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.DoorBlock;

public class MushroomDoorBlock extends DoorBlock {
	public MushroomDoorBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.NETHER_WOOD).strength(2f, 3f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape(),
				BlockSetType.OAK);
	}
}
