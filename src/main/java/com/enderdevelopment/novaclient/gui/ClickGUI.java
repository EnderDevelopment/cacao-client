package com.enderdevelopment.novaclient.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.fml.client.config.GuiUtils;

public class ClickGUI extends GuiScreen {
    private static final String[] CATEGORIES = {"Combat", "Movement", "Render", "Player", "World", "HUD", "Misc"};

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        ScaledResolution sr = new ScaledResolution(mc);
        int width = sr.getScaledWidth();
        int height = sr.getScaledHeight();

        // Draw background
        GuiUtils.drawGradientRect(0, 0, width, height, 0x80000000, 0x80000000);

        // Draw categories
        for (int i = 0; i < CATEGORIES.length; i++) {
            int x = width / 2 - 100 + (i % 4) * 50;
            int y = height / 2 - 50 + (i / 4) * 30;
            GuiUtils.drawGradientRect(x, y, x + 40, y + 20, 0xFF202020, 0xFF202020);
            drawCenteredString(fontRendererObj, CATEGORIES[i], x + 20, y + 6, 0xFFFFFF);
        }
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode) {
        if (keyCode == 1) { // Escape key
            mc.displayGuiScreen(null);
        }
    }
}