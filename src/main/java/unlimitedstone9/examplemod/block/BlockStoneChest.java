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

	@Override
    public boolean onBlockActivated(final World world, final BlockPos pos, final IBlockState state, final EntityPlayer player, final EnumHand hand, final EnumFacing facing, final float hitX, final float hitY, final float hitZ) {
        if (world.isRemote) {
            return true;
        }
        return true;
    }
}
