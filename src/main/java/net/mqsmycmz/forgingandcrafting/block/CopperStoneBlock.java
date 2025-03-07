
package net.mqsmycmz.forgingandcrafting.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModItems;

import java.util.List;
import java.util.Collections;

public class CopperStoneBlock extends Block{
	public CopperStoneBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(0.3f, 10f));
	}
	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
	@Override
	public List<ItemStack> getDrops(BlockState state,LootContext.Builder builder) {
		List<ItemStack> dropOriginal = super.getDrops(state, builder);
		if (!dropOriginal.isEmpty()) {
			return dropOriginal;
		} else {
			return Collections.singletonList(new ItemStack(ForgingAndCraftingModItems.COPPER_STONE.get()));
		}
	}
}