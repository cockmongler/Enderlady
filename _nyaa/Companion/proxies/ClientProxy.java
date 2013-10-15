package _nyaa.Companion.proxies;

import _nyaa.Companion.entity.EntityBlazette;
import _nyaa.Companion.entity.EntityEnderlady;
import _nyaa.Companion.model.ModelBlazette;
import _nyaa.Companion.model.ModelEnderlady;
import _nyaa.Companion.render.RenderBlazette;
import _nyaa.Companion.render.RenderEnderlady;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenderThings() 		
	{
	RenderingRegistry.registerEntityRenderingHandler(EntityEnderlady.class, new RenderEnderlady(new ModelEnderlady(), 0.4F));
	RenderingRegistry.registerEntityRenderingHandler(EntityBlazette.class, new RenderBlazette(new ModelBlazette(), 0.4F));
	}
}
