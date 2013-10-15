package _nyaa;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import _nyaa.Companion.entity.EntityBlazette;
import _nyaa.Companion.entity.EntityEnderlady;
import _nyaa.Companion.lib.ModInfo;
import _nyaa.Companion.model.ModelBlazette;
import _nyaa.Companion.model.ModelEnderlady;
import _nyaa.Companion.proxies.CommonProxy;
import _nyaa.Companion.render.RenderBlazette;
import _nyaa.Companion.render.RenderEnderlady;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(channels = { ModInfo.CHANNEL }, clientSideRequired = true, serverSideRequired = false)

public class CompanionBase {
    @SidedProxy(clientSide = ModInfo.PROXY + ".ClientProxy", serverSide = ModInfo.PROXY + ".CommonProxy")
    public static CommonProxy proxy;
    
    static int startEntityId = 300;
	
	@EventHandler
	public void preInit( FMLPreInitializationEvent event ) {
		
		cpw.mods.fml.common.registry.EntityRegistry.registerModEntity(EntityEnderlady.class, "Andr", 1, this, 500, 1, true);
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderlady.class, new RenderEnderlady(new ModelEnderlady(), 0.4F));
		cpw.mods.fml.common.registry.EntityRegistry.registerModEntity(EntityBlazette.class, "Blaze", 2, this, 500, 1, true);
		RenderingRegistry.registerEntityRenderingHandler(EntityBlazette.class, new RenderBlazette(new ModelBlazette(), 0.4F));
		proxy.registerRenderThings();

		LanguageRegistry.instance().addStringLocalization("entity.Enderlady.name", "Andr");
		LanguageRegistry.instance().addStringLocalization("entity.Blazette.name", "Blazette");

		registerEntityEgg(EntityEnderlady.class, 0x000000, 0xCC00FA);
		registerEntityEgg(EntityBlazette.class, 0xA34E01, 0xD37E01);
	}
	
	@EventHandler
	public void init( FMLInitializationEvent event ) {
		
	}
	
	@EventHandler
	public void postInit( FMLPostInitializationEvent event ) {
		
	}
	
	public static int getUniqueEntityId()
	{
		do
		{
			startEntityId++;
		}
		while (EntityList.getStringFromID(startEntityId)!= null);
		
		return startEntityId;
	}
	
	public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor)
	{
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
	}	
}
