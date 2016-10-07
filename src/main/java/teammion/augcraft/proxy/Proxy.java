package teammion.augcraft.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import teammion.augcraft.util.Logger;

/**
 * Created on 07.10.16 at 21:36
 *
 * @author Stefan Wimmer {@literal <stefanwimmer128@gmail.com>}
 */
public class Proxy
{
    public static final String SERVER = "teammion.augcraft.proxy.CommonProxy";
    public static final String CLIENT = "teammion.augcraft.proxy.ClientProxy";
    
    public void preInit(FMLPreInitializationEvent e)
    {
        Logger.info("PreInitialization");
    }
    
    public void init(FMLInitializationEvent e)
    {
        Logger.info("Initialization");
    }
    
    public void postInit(FMLPostInitializationEvent e)
    {
        Logger.info("PostInitialization");
    }
}
