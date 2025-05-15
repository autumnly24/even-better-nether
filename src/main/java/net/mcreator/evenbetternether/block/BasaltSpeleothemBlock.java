
package net.mcreator.evenbetternether.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class BasaltSpeleothemBlock extends Block implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final EnumProperty<AttachFace> FACE = FaceAttachedHorizontalDirectionalBlock.FACE;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public BasaltSpeleothemBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.DEEPSLATE).sound(SoundType.BASALT).strength(1.5f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false)
				.dynamicShape().offsetType(Block.OffsetType.XZ));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL).setValue(WATERLOGGED, false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return (switch (state.getValue(FACING)) {
			default -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(3, 0, 3, 13, 7, 13), box(4, 7, 4, 12, 13, 12), box(5, 13, 5, 11, 19, 11), box(7, 25, 7, 9, 32, 9), box(6, 19, 6, 10, 25, 10));
				case WALL -> Shapes.or(box(3, 3, 0, 13, 13, 7), box(4, 4, 7, 12, 12, 13), box(5, 5, 13, 11, 11, 19), box(7, 7, 25, 9, 9, 32), box(6, 6, 19, 10, 10, 25));
				case CEILING -> Shapes.or(box(3, 9, 3, 13, 16, 13), box(4, 3, 4, 12, 9, 12), box(5, -3, 5, 11, 3, 11), box(7, -16, 7, 9, -9, 9), box(6, -9, 6, 10, -3, 10));
			};
			case NORTH -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(3, 0, 3, 13, 7, 13), box(4, 7, 4, 12, 13, 12), box(5, 13, 5, 11, 19, 11), box(7, 25, 7, 9, 32, 9), box(6, 19, 6, 10, 25, 10));
				case WALL -> Shapes.or(box(3, 3, 9, 13, 13, 16), box(4, 4, 3, 12, 12, 9), box(5, 5, -3, 11, 11, 3), box(7, 7, -16, 9, 9, -9), box(6, 6, -9, 10, 10, -3));
				case CEILING -> Shapes.or(box(3, 9, 3, 13, 16, 13), box(4, 3, 4, 12, 9, 12), box(5, -3, 5, 11, 3, 11), box(7, -16, 7, 9, -9, 9), box(6, -9, 6, 10, -3, 10));
			};
			case EAST -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(3, 0, 3, 13, 7, 13), box(4, 7, 4, 12, 13, 12), box(5, 13, 5, 11, 19, 11), box(7, 25, 7, 9, 32, 9), box(6, 19, 6, 10, 25, 10));
				case WALL -> Shapes.or(box(0, 3, 3, 7, 13, 13), box(7, 4, 4, 13, 12, 12), box(13, 5, 5, 19, 11, 11), box(25, 7, 7, 32, 9, 9), box(19, 6, 6, 25, 10, 10));
				case CEILING -> Shapes.or(box(3, 9, 3, 13, 16, 13), box(4, 3, 4, 12, 9, 12), box(5, -3, 5, 11, 3, 11), box(7, -16, 7, 9, -9, 9), box(6, -9, 6, 10, -3, 10));
			};
			case WEST -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(3, 0, 3, 13, 7, 13), box(4, 7, 4, 12, 13, 12), box(5, 13, 5, 11, 19, 11), box(7, 25, 7, 9, 32, 9), box(6, 19, 6, 10, 25, 10));
				case WALL -> Shapes.or(box(9, 3, 3, 16, 13, 13), box(3, 4, 4, 9, 12, 12), box(-3, 5, 5, 3, 11, 11), box(-16, 7, 7, -9, 9, 9), box(-9, 6, 6, -3, 10, 10));
				case CEILING -> Shapes.or(box(3, 9, 3, 13, 16, 13), box(4, 3, 4, 12, 9, 12), box(5, -3, 5, 11, 3, 11), box(7, -16, 7, 9, -9, 9), box(6, -9, 6, 10, -3, 10));
			};
		}).move(offset.x, offset.y, offset.z);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, FACE, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return super.getStateForPlacement(context).setValue(FACE, faceForDirection(context.getNearestLookingDirection())).setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	private AttachFace faceForDirection(Direction direction) {
		if (direction.getAxis() == Direction.Axis.Y)
			return direction == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR;
		else
			return AttachFace.WALL;
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}
}
