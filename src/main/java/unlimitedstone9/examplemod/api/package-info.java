/**
 * API (Application Programming Interface) to allow other Mods to do stuff with/to our mod
 *
 * @author Cadiboo
 */
@API(apiVersion = "" + MAJOR_API_VERSION, owner = MOD_ID, provides = MOD_NAME + " API")
package unlimitedstone9.examplemod.api;

import static unlimitedstone9.examplemod.util.ModReference.MOD_ID;
import static unlimitedstone9.examplemod.util.ModReference.MOD_NAME;
import static unlimitedstone9.examplemod.util.ModReference.Version.MAJOR_API_VERSION;
import net.minecraftforge.fml.common.API;;