package _nyaa.Companion.render;

import _nyaa.Companion.entity.EntityEnderlady;
import _nyaa.Companion.lib.ModInfo;
import _nyaa.Companion.model.ModelEnderlady;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderEnderlady extends RenderLiving
{
    private static final ResourceLocation texture = new ResourceLocation(ModInfo.ID + ":" + "textures/companions/EndAT2.png");
    private ModelEnderlady EnderladyModel;

    public RenderEnderlady(ModelEnderlady modelEnderlady, float f)
    {
        super(new ModelEnderlady(), 0.5F);
        this.EnderladyModel = (ModelEnderlady)super.mainModel;
        this.setRenderPassModel(this.EnderladyModel);
    }

    public void doRenderLiving(EntityEnderlady var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderEnderlady((EntityEnderlady)var1, var2, var4, var6, var8, var9);
    }

    public void doRender(EntityEnderlady var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderEnderlady((EntityEnderlady)var1, var2, var4, var6, var8, var9);
    }

	private void renderEnderlady(EntityEnderlady var1, double var2, double var4, double var6, float var8, float var9) {
		
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
}
