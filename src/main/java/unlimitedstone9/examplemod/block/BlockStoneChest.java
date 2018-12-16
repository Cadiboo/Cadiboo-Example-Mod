package unlimitedstone9.examplemod.block;

import unlimitedstone9.examplemod.util.ModUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockStoneChest extends Block {

	public BlockStoneChest(String name) {
		super(Material.ROCK);
		ModUtil.setRegistryNames(this, name);
		// TODO Auto-generated constructor stub
	}

	onBlockActivated(World, BlockPos, IBlockState, EntityPlayer, EnumHand, EnumFacing, float, float, float)

}
