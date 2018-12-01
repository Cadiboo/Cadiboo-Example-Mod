package unlimitedstone9.examplemod.server;

/**you can also import constants directly*/
import static net.minecraftforge.fml.relauncher.Side.CLIENT;
import static unlimitedstone9.examplemod.util.ModReference.MOD_ID;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MOD_ID, value = CLIENT)
public final class ServerEventSubscriber {

}