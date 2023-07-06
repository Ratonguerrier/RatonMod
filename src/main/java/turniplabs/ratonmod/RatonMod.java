package turniplabs.ratonmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RatonMod implements ModInitializer
{
    public static final String MOD_ID = "ratonmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("RatonMod initialized.");
    }
}
