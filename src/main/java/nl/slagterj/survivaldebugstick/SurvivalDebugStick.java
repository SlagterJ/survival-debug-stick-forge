package nl.slagterj.survivaldebugstick;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SurvivalDebugStick.modID)
public class SurvivalDebugStick {
  public static final String modID = "survivaldebugstick";
  private static final Logger logger = LogManager.getLogger();

  public SurvivalDebugStick() {
    logger.info("Loading Survival Debug Stick...");
    MinecraftForge.EVENT_BUS.register(this);
  }
}
