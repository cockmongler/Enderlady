package _nyaa.Companion.model;

import _nyaa.CompanionBase;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
	
public class ModelBlazette extends ModelBase
	{
	    ModelRenderer body;
	    ModelRenderer head;
	    ModelRenderer rightleg;
	    ModelRenderer leftleg;
	    ModelRenderer Skirt;
	    ModelRenderer Hair;
	    ModelRenderer HTop;
	    ModelRenderer body2;
	    ModelRenderer RArm;
	    ModelRenderer LArm;
	    ModelRenderer RArm2;
	    ModelRenderer LArm2;
	    ModelRenderer BustFront;
	    ModelRenderer BustTop;
	    ModelRenderer BustUnder;
	    ModelRenderer LHair;
	    ModelRenderer HTop2;
	    ModelRenderer Rod1;
	    ModelRenderer Rod2;
	    ModelRenderer Rod3;
	    ModelRenderer Rod4;

	    public ModelBlazette()
	    {
	        this.textureWidth = 128;
	        this.textureHeight = 64;
	        this.body = new ModelRenderer(this, 0, 31);
	        this.body.addBox(-3.5F, 0.0F, -2.0F, 7, 6, 4);
	        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.body.mirror = true;
	        this.head = new ModelRenderer(this, 0, 0);
	        this.head.addBox(-4.0F, -8.0F, -3.0F, 8, 8, 6);
	        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.rightleg = new ModelRenderer(this, 28, 0);
	        this.rightleg.addBox(-1.5F, 0.0F, -1.5F, 3, 12, 3);
	        this.rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
	        this.leftleg = new ModelRenderer(this, 40, 0);
	        this.leftleg.addBox(-1.5F, 0.0F, -1.5F, 3, 12, 3);
	        this.leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
	        this.Skirt = new ModelRenderer(this, 0, 48);
	        this.Skirt.addBox(-3.5F, 0.0F, -1.5F, 7, 3, 3);
	        this.Skirt.setRotationPoint(0.0F, 10.0F, 0.0F);
	        this.Skirt.mirror = true;
	        this.Hair = new ModelRenderer(this, 100, 0);
	        this.Hair.addBox(-4.0F, -8.0F, -3.0F, 8, 9, 6, 0.1F);
	        this.Hair.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.Hair.mirror = true;
	        this.HTop = new ModelRenderer(this, 76, 0);
	        this.HTop.addBox(-3.0F, -9.0F, -3.0F, 6, 1, 6, 0.1F);
	        this.HTop.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.body2 = new ModelRenderer(this, 0, 41);
	        this.body2.addBox(-3.0F, 6.0F, -1.5F, 6, 4, 3);
	        this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.RArm = new ModelRenderer(this, 0, 14);
	        this.RArm.addBox(-2.0F, 0.0F, -1.0F, 2, 6, 2);
	        this.RArm.setRotationPoint(-3.5F, 1.0F, 0.0F);
	        this.LArm = new ModelRenderer(this, 8, 14);
	        this.LArm.addBox(0.0F, 0.0F, -1.0F, 2, 6, 2);
	        this.LArm.setRotationPoint(3.5F, 1.0F, 0.0F);
	        this.RArm2 = new ModelRenderer(this, 0, 22);
	        this.RArm2.addBox(-2.5F, 6.0F, -1.5F, 3, 6, 3);
	        this.RArm2.setRotationPoint(-3.5F, 1.0F, 0.0F);
	        this.LArm2 = new ModelRenderer(this, 12, 22);
	        this.LArm2.addBox(-0.5F, 6.0F, -1.5F, 3, 6, 3);
	        this.LArm2.setRotationPoint(3.5F, 1.0F, 0.0F);
	        this.BustFront = new ModelRenderer(this, 112, 20);
	        this.BustFront.addBox(-3.0F, 0.0F, -1.0F, 6, 2, 2);
	        this.BustFront.setRotationPoint(0.0F, 3.0F, -3.0F);
	        this.BustTop = new ModelRenderer(this, 110, 15);
	        this.BustTop.addBox(-3.0F, -0.5F, 0.0F, 6, 1, 4);
	        this.BustTop.setRotationPoint(0.0F, 3.4F, -3.7F);
	        this.setRotation(this.BustTop, 0.5061455F, 0.0F, 0.0F);
	        this.BustUnder = new ModelRenderer(this, 110, 24);
	        this.BustUnder.addBox(-3.0F, -0.5F, 0.0F, 6, 1, 3);
	        this.BustUnder.setRotationPoint(0.0F, 4.5F, -3.8F);
	        this.setRotation(this.BustUnder, -0.296706F, 0.0F, 0.0F);
	        this.LHair = new ModelRenderer(this, 52, 0);
	        this.LHair.addBox(-4.0F, 0.0F, 2.1F, 8, 13, 1);
	        this.LHair.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.LHair.mirror = true;
	        this.HTop2 = new ModelRenderer(this, 0, 60);
	        this.HTop2.addBox(-2.0F, -13.0F, 0.0F, 4, 4, 0);
	        this.HTop2.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.HTop2.mirror = true;
	        this.Rod1 = new ModelRenderer(this, 8, 59);
	        this.Rod1.addBox(-9.0F, 2.0F, -0.5F, 1, 4, 1);
	        this.Rod1.setRotationPoint(0.0F, 6.0F, 0.0F);
	        this.Rod2 = new ModelRenderer(this, 8, 59);
	        this.Rod2.addBox(8.0F, 2.0F, -0.5F, 1, 4, 1);
	        this.Rod2.setRotationPoint(0.0F, 6.0F, 0.0F);
	        this.Rod3 = new ModelRenderer(this, 8, 59);
	        this.Rod3.addBox(-9.0F, -7.0F, -0.5F, 1, 4, 1);
	        this.Rod3.setRotationPoint(0.0F, 6.0F, 0.0F);
	        this.Rod4 = new ModelRenderer(this, 8, 59);
	        this.Rod4.addBox(8.0F, -7.0F, -0.5F, 1, 4, 1);
	        this.Rod4.setRotationPoint(0.0F, 6.0F, 0.0F);
	    }

	    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
	    {
	        this.head.rotateAngleY = var4 / (180F / (float)Math.PI);
	        this.head.rotateAngleX = var5 / (180F / (float)Math.PI);
	        this.Hair.rotateAngleY = this.head.rotateAngleY;
	        this.Hair.rotateAngleX = this.head.rotateAngleX;
	        this.LHair.rotateAngleY = this.head.rotateAngleY;
	        this.LHair.rotateAngleX = this.head.rotateAngleX;
	        this.HTop2.rotateAngleY = this.head.rotateAngleY;
	        this.HTop2.rotateAngleX = this.head.rotateAngleX;
	        this.HTop.rotateAngleY = this.head.rotateAngleY;
	        this.HTop.rotateAngleX = this.head.rotateAngleX;
	        this.RArm.rotateAngleZ = 0.1F * MathHelper.sin(var3 * 0.1F) + 0.3F;
	        this.LArm.rotateAngleZ = -0.1F * MathHelper.sin(var3 * 0.1F) - 0.3F;
	        this.RArm2.rotateAngleZ = 0.1F * MathHelper.sin(var3 * 0.1F) + 0.3F;
	        this.LArm2.rotateAngleZ = -0.1F * MathHelper.sin(var3 * 0.1F) - 0.3F;
	        this.rightleg.rotateAngleX = 0.1F * MathHelper.sin(var3 * 0.1F);
	        this.leftleg.rotateAngleX = 0.15F * MathHelper.sin(var3 * 0.1F);
	        this.Rod1.rotateAngleY = var3 * 0.8F + var4 / 10.0F;
	        this.Rod2.rotateAngleY = var3 * 0.8F + var4 / 10.0F;
	        this.Rod3.rotateAngleY = var3 * 0.7F;
	        this.Rod4.rotateAngleY = var3 * 0.7F;
	    }

	    /**
	     * Sets the models various rotation angles then renders the model.
	     */
	    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
	    {
	        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
	        this.body.render(var7);
	        this.head.render(var7);
	        this.rightleg.render(var7);
	        this.leftleg.render(var7);
	        this.Skirt.render(var7);
	        this.Hair.render(var7);
	        this.HTop.render(var7);
	        this.body2.render(var7);
	        this.RArm.render(var7);
	        this.LArm.render(var7);
	        this.RArm2.render(var7);
	        this.LArm2.render(var7);
	        this.BustFront.render(var7);
	        this.BustTop.render(var7);
	        this.BustUnder.render(var7);
	        this.LHair.render(var7);
	        this.HTop2.render(var7);
	        this.Rod1.render(var7);
	        this.Rod2.render(var7);
	        this.Rod3.render(var7);
	        this.Rod4.render(var7);
	    }

	    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
	    {
	        var1.rotateAngleX = var2;
	        var1.rotateAngleY = var3;
	        var1.rotateAngleZ = var4;
	    }
	}

