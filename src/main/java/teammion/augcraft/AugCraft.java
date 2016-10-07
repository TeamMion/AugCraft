package teammion.augcraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import teammion.augcraft.proxy.Proxy;

/**
 * Created on 07.10.16 at 21:34
 *
 * @author Stefan Wimmer {@literal <stefanwimmer128@gmail.com>}
 */
@Mod(modid = AugCraft.MODID, dependencies = "required-after:mioncore@[1.0.0-rc.2,)")
public class AugCraft
{
    public static final String MODID = "augcraft";
    
    @SidedProxy(
        serverSide = Proxy.SERVER,
        clientSide = Proxy.CLIENT
    )
    private static Proxy proxy;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        proxy.preInit(e);
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {
        proxy.init(e);
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        proxy.postInit(e);
    }
}
