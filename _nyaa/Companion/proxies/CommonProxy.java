package _nyaa.Companion.proxies;

import _nyaa.Companion.entity.EntityBlazette;
import _nyaa.Companion.entity.EntityEnderlady;
import cpw.mods.fml.common.registry.EntityRegistry;

public class CommonProxy {
	
	public void init() {
		EntityRegistry.registerModEntity(EntityEnderlady.class, "Andr", 1, EntityEnderlady.class, 10, 10, true);
		EntityRegistry.registerModEntity(EntityBlazette.class, "Blazette", 2, EntityBlazette.class, 10, 10, true);
		}
	
	public void registerRenderThings() {
	}
}