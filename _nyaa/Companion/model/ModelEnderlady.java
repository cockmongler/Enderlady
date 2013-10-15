package _nyaa.Companion.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelEnderlady extends ModelBase
{
	
    public boolean isCarrying = false;

    public ModelRenderer body;
    public ModelRenderer head;
    public ModelRenderer rightleg;
    public ModelRenderer leftleg;
    public ModelRenderer BustFront;
    public ModelRenderer BustTop;
    public ModelRenderer BustUnder;
    public ModelRenderer SkirtTop;
    public ModelRenderer Hood;
    public ModelRenderer HoodTop;
    public ModelRenderer HoodRight;
    public ModelRenderer HoodLeft;
    public ModelRenderer SkirtUnder;
    public ModelRenderer Neck;
    public ModelRenderer rightArm;
    public ModelRenderer rightArm2;
    public ModelRenderer leftArm;
    public ModelRenderer leftArm2;
    public ModelRenderer HFRight;
    public ModelRenderer HFLeft;
    public ModelRenderer HairBack;

  public ModelEnderlady()
  {
  
      this.textureWidth = 128;
      this.textureHeight = 64;
      this.body = new ModelRenderer(this, 12, 12);
      this.body.addBox(-3.5F, 1.0F, -1.5F, 7, 8, 3);
      this.body.setRotationPoint(0.0F, -3.0F, 0.0F);
      this.head = new ModelRenderer(this, 0, 0);
      this.head.addBox(-3.0F, -4.0F, -3.0F, 6, 4, 6);
      this.head.setRotationPoint(0.0F, -3.0F, 0.0F);
      this.rightleg = new ModelRenderer(this, 0, 12);
      this.rightleg.addBox(-1.5F, 0.0F, -1.5F, 3, 14, 3);
      this.rightleg.setRotationPoint(-2.0F, 10.0F, 0.0F);
      this.leftleg = new ModelRenderer(this, 0, 29);
      this.leftleg.addBox(-1.5F, 0.0F, -1.5F, 3, 14, 3);
      this.leftleg.setRotationPoint(2.0F, 10.0F, 0.0F);
      this.BustFront = new ModelRenderer(this, 40, 25);
      this.BustFront.addBox(0.0F, 0.0F, -1.0F, 6, 3, 3);
      this.BustFront.setRotationPoint(-3.0F, 0.0F, -3.0F);
      this.BustTop = new ModelRenderer(this, 42, 19);
      this.BustTop.addBox(-3.0F, 0.8F, 0.1F, 6, 4, 2);
      this.BustTop.setRotationPoint(0.0F, -2.9F, -0.1F);
      this.setRotation(this.BustTop, -0.9599311F, 0.0F, 0.0F);
      this.BustUnder = new ModelRenderer(this, 42, 31);
      this.BustUnder.addBox(0.0F, 0.0F, 0.0F, 6, 3, 2);
      this.BustUnder.setRotationPoint(-3.0F, 3.0F, -4.0F);
      this.setRotation(this.BustUnder, 1.169371F, 0.0F, 0.0F);
      this.SkirtTop = new ModelRenderer(this, 14, 25);
      this.SkirtTop.addBox(0.0F, 0.0F, 0.0F, 7, 2, 4);
      this.SkirtTop.setRotationPoint(-3.5F, 6.0F, -2.0F);
      this.Hood = new ModelRenderer(this, 86, 6);
      this.Hood.addBox(-4.0F, -8.5F, -3.0F, 8, 4, 6);
      this.Hood.setRotationPoint(0.0F, -2.5F, 0.0F);
      this.HoodTop = new ModelRenderer(this, 92, 0);
      this.HoodTop.addBox(-3.0F, -9.5F, -2.5F, 6, 1, 5);
      this.HoodTop.setRotationPoint(0.0F, -2.5F, 0.0F);
      this.HoodRight = new ModelRenderer(this, 114, 0);
      this.HoodRight.addBox(-4.0F, -4.0F, -3.0F, 1, 3, 6);
      this.HoodRight.setRotationPoint(0.0F, -3.0F, 0.0F);
      this.HoodRight.mirror = true;
      this.HoodLeft = new ModelRenderer(this, 114, 0);
      this.HoodLeft.addBox(3.0F, -4.0F, -3.0F, 1, 3, 6);
      this.HoodLeft.setRotationPoint(0.0F, -3.0F, 0.0F);
      this.HoodLeft.mirror = true;
      this.SkirtUnder = new ModelRenderer(this, 14, 31);
      this.SkirtUnder.addBox(0.0F, 0.0F, 0.0F, 8, 2, 5);
      this.SkirtUnder.setRotationPoint(-4.0F, 8.0F, -2.5F);
      this.Neck = new ModelRenderer(this, 24, 0);
      this.Neck.addBox(-3.5F, 0.0F, -3.0F, 7, 2, 6, 0.1F);
      this.Neck.setRotationPoint(0.0F, -3.0F, 0.0F);
      this.rightArm = new ModelRenderer(this, 0, 50);
      this.rightArm.addBox(-2.0F, 0.0F, -1.0F, 2, 12, 2);
      this.rightArm.setRotationPoint(-3.5F, -2.0F, 0.0F);
      this.rightArm.mirror = true;
      this.rightArm2 = new ModelRenderer(this, 8, 55);
      this.rightArm2.addBox(-2.5F, 5.0F, -1.5F, 3, 6, 3, -0.1F);
      this.rightArm2.setRotationPoint(-3.5F, -2.0F, 0.0F);
      this.rightArm2.mirror = true;
      this.leftArm = new ModelRenderer(this, 20, 50);
      this.leftArm.addBox(0.0F, 0.0F, -1.0F, 2, 12, 2);
      this.leftArm.setRotationPoint(3.5F, -2.0F, 0.0F);
      this.leftArm.mirror = true;
      this.leftArm2 = new ModelRenderer(this, 28, 55);
      this.leftArm2.addBox(-0.5F, 5.0F, -1.5F, 3, 6, 3, -0.1F);
      this.leftArm2.setRotationPoint(3.5F, -2.0F, 0.0F);
      this.leftArm2.mirror = true;
      this.HFRight = new ModelRenderer(this, 0, 0);
      this.HFRight.addBox(3.0F, -1.0F, -3.0F, 1, 3, 1);
      this.HFRight.setRotationPoint(0.0F, -3.0F, 0.0F);
      this.HFLeft = new ModelRenderer(this, 0, 0);
      this.HFLeft.addBox(-4.0F, -1.0F, -3.0F, 1, 3, 1);
      this.HFLeft.setRotationPoint(0.0F, -3.0F, 0.0F);
      this.HairBack = new ModelRenderer(this, 52, 0);
      this.HairBack.addBox(-3.0F, -4.0F, 2.0F, 6, 16, 1);
      this.HairBack.setRotationPoint(0.0F, -3.0F, 0.0F);
      this.HairBack.mirror = true;

  }


  public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
  {
      this.head.rotateAngleY = var4 / (180F / (float)Math.PI);
      this.head.rotateAngleX = var5 / (180F / (float)Math.PI);
      this.Hood.rotateAngleY = this.head.rotateAngleY;
      this.Hood.rotateAngleX = this.head.rotateAngleX;
      this.Neck.rotateAngleY = this.head.rotateAngleY;
      this.Neck.rotateAngleX = this.head.rotateAngleX;
      this.HoodLeft.rotateAngleY = this.head.rotateAngleY;
      this.HoodLeft.rotateAngleX = this.head.rotateAngleX;
      this.HoodRight.rotateAngleY = this.head.rotateAngleY;
      this.HoodRight.rotateAngleX = this.head.rotateAngleX;
      this.HoodTop.rotateAngleY = this.head.rotateAngleY;
      this.HoodTop.rotateAngleX = this.head.rotateAngleX;
      this.HFRight.rotateAngleY = this.head.rotateAngleY;
      this.HFRight.rotateAngleX = this.head.rotateAngleX;
      this.HFLeft.rotateAngleY = this.head.rotateAngleY;
      this.HFLeft.rotateAngleX = this.head.rotateAngleX;
      this.HairBack.rotateAngleY = this.head.rotateAngleY;
      this.HairBack.rotateAngleX = this.head.rotateAngleX;
      this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
      this.leftleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
      this.rightleg.rotateAngleY = 0.0F;
      this.leftleg.rotateAngleY = 0.0F;
      this.rightArm.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
      this.leftArm.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
      this.rightArm2.rotateAngleX = this.rightArm.rotateAngleX;
      this.leftArm2.rotateAngleX = this.leftArm.rotateAngleX;

      if (this.isCarrying)
      {
          this.rightArm.rotateAngleX = -0.5F;
          this.leftArm.rotateAngleX = -0.5F;
          this.rightArm2.rotateAngleX = -0.5F;
          this.leftArm2.rotateAngleX = -0.5F;
      }

      float var7 = 0.4F;

      if (this.rightArm.rotateAngleX > var7)
      {
          this.rightArm.rotateAngleX = var7;
      }

      if (this.leftArm.rotateAngleX > var7)
      {
          this.leftArm.rotateAngleX = var7;
      }

      if (this.rightArm.rotateAngleX < -var7)
      {
          this.rightArm.rotateAngleX = -var7;
      }

      if (this.leftArm.rotateAngleX < -var7)
      {
          this.leftArm.rotateAngleX = -var7;
      }

      if (this.rightArm2.rotateAngleX > var7)
      {
          this.rightArm.rotateAngleX = var7;
      }

      if (this.leftArm2.rotateAngleX > var7)
      {
          this.leftArm.rotateAngleX = var7;
      }

      if (this.rightArm2.rotateAngleX < -var7)
      {
          this.rightArm.rotateAngleX = -var7;
      }

      if (this.leftArm2.rotateAngleX < -var7)
      {
          this.leftArm.rotateAngleX = -var7;
      }

      if (this.rightleg.rotateAngleX > var7)
      {
          this.rightleg.rotateAngleX = var7;
      }

      if (this.leftleg.rotateAngleX > var7)
      {
          this.leftleg.rotateAngleX = var7;
      }

      if (this.rightleg.rotateAngleX < -var7)
      {
          this.rightleg.rotateAngleX = -var7;
      }

      if (this.leftleg.rotateAngleX < -var7)
      {
          this.leftleg.rotateAngleX = -var7;
      }

      this.rightArm.rotateAngleZ = 0.1F * MathHelper.sin(var3 * 0.1F) + 0.1F;
      this.leftArm.rotateAngleZ = -0.1F * MathHelper.sin(var3 * 0.1F) - 0.1F;
      this.rightArm2.rotateAngleZ = 0.1F * MathHelper.sin(var3 * 0.1F) + 0.1F;
      this.leftArm2.rotateAngleZ = -0.1F * MathHelper.sin(var3 * 0.1F) - 0.1F;
  }
  public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
  {
      this.setRotationAngles(var2, var3, var4, var5, var6, var7);
      this.body.render(var7);
      this.head.render(var7);
      this.rightleg.render(var7);
      this.leftleg.render(var7);
      this.BustFront.render(var7);
      this.BustTop.render(var7);
      this.BustUnder.render(var7);
      this.SkirtTop.render(var7);
      this.Hood.render(var7);
      this.HoodTop.render(var7);
      this.HoodRight.render(var7);
      this.HoodLeft.render(var7);
      this.SkirtUnder.render(var7);
      this.Neck.render(var7);
      this.rightArm.render(var7);
      this.rightArm2.render(var7);
      this.leftArm.render(var7);
      this.leftArm2.render(var7);
      this.HFRight.render(var7);
      this.HFLeft.render(var7);
      this.HairBack.render(var7);
  }

  private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
  {
      var1.rotateAngleX = var2;
      var1.rotateAngleY = var3;
      var1.rotateAngleZ = var4;
  }
}