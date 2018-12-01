package unlimitedstone9.examplemod.util;

import unlimitedstone9.examplemod.ExampleMod;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Some basic functions that differ depending on the physical side
 *
 * @author Cadiboo
 */
public interface IProxy {

	String localize(String unlocalized);

	String localizeAndFormat(String unlocalized, Object... args);

	default void logPhysicalSide() {
		ExampleMod.info("Physical Side: " + getPhysicalSide());
	}

	Side getPhysicalSide();
}