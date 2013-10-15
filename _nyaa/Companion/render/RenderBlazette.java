package _nyaa.Companion.render;

import _nyaa.Companion.entity.EntityBlazette;
import _nyaa.Companion.lib.ModInfo;
import _nyaa.Companion.model.ModelBlazette;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderBlazette extends RenderLiving
{
    private static final ResourceLocation texture = new ResourceLocation(ModInfo.ID + ":" + "textures/companions/Blaze.png");
    private ModelBlazette CuteBlazeModel;

    public RenderBlazette(ModelBlazette modelCuteBlaze, float f)
    {
        super(new ModelBlazette(), 0.5F);
        this.CuteBlazeModel = (ModelBlazette)super.mainModel;
        this.setRenderPassModel(this.CuteBlazeModel);
    }

    public void doRenderLiving(EntityBlazette var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderCuteBlaze((EntityBlazette)var1, var2, var4, var6, var8, var9);
    }

    public void doRender(EntityBlazette var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderCuteBlaze((EntityBlazette)var1, var2, var4, var6, var8, var9);
    }

	private void renderCuteBlaze(EntityBlazette var1, double var2, double var4, double var6, float var8, float var9) {
		
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
}
