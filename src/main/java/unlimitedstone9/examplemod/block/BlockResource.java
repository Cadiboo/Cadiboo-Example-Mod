package unlimitedstone9.examplemod.block;

import unlimitedstone9.examplemod.util.ModUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * The same as a block of Iron or a block of Gold but for all materials
 *
 * @author Cadiboo
 */
public class BlockResource extends Block implements IModBlock {

	public BlockResource(final String name) {
		super(Material.IRON);
		ModUtil.setRegistryNames(this, name);
	}

}
