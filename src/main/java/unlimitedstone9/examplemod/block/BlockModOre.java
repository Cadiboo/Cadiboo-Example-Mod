package unlimitedstone9.examplemod.block;

import unlimitedstone9.examplemod.util.ModUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockModOre extends Block implements IModBlock {

	public BlockModOre(final String name) {
		super(Material.ROCK);
		ModUtil.setRegistryNames(this, name);
	}

}
