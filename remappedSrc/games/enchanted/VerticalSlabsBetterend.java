package games.enchanted;

import net.fabricmc.api.ModInitializer;
import net.minecraft.MinecraftVersion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import games.enchanted.betterend.BetterendAddon;

public class VerticalSlabsBetterend implements ModInitializer{

    // mod id
    public static final String MOD_ID = "evs-betterend";
    public static final String loggerID = "[" + MOD_ID + "] ";
    public static String minecraftCurrentVersion = MinecraftVersion.CURRENT.getReleaseTarget();
    // logger
    public static final Logger LOGGER = LogManager.getLogger("Enchanted Vertical Slabs - Betterend edition");

    @Override
    public void onInitialize() {
        LOGGER.info(loggerID + "Detected Minecraft " + minecraftCurrentVersion + " (release target)");
        LOGGER.info(loggerID + "Starting to load mod...");

        // looads the better end addon class
        BetterendAddon.build();

        // logs to console that the mod is ready
        LOGGER.info(loggerID + "Enchanted Vertical Slabs Betterend addon initialized!");
    }

}