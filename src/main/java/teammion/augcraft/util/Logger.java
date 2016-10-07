package teammion.augcraft.util;

import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;
import teammion.augcraft.AugCraft;

/**
 * Created on 07.10.16 at 21:38
 *
 * @author Stefan Wimmer {@literal <stefanwimmer128@gmail.com>}
 */
public class Logger
{
    public static void log(Level level, String msg)
    {
        FMLLog.log(AugCraft.MODID, level, msg);
    }
    
    public static void info(String msg)
    {
        log(Level.INFO, msg);
    }
    
    public static void warn(String msg)
    {
        log(Level.WARN, msg);
    }
    
    public static void error(String msg)
    {
        log(Level.ERROR, msg);
    }
}
