package _nyaa.Companion.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import _nyaa.Companion.entity.EntityEnderlady;
import _nyaa.Companion.lib.ModInfo;

public class GuiEnderladyInventory extends GuiContainer {
public static final ResourceLocation texture = new ResourceLocation(ModInfo.ID.toLowerCase(), "textures/gui/inv.png");

	public GuiEnderladyInventory(Container par1Container) {
		super(par1Container);
	}
	
	public GuiEnderladyInventory(InventoryPlayer invPlayer, EntityEnderlady entity) {
		super(new ContainerEnderladyInventory(invPlayer, entity));
		
		xSize = 176;
		ySize = 166;
		}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) 
	{
		GL11.glColor4f(1F, 1F, 1F, 1F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}
 
}
