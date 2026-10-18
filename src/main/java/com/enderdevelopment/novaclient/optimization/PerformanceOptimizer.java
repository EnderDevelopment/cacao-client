package com.enderdevelopment.novaclient.optimization;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EffectRenderer;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PerformanceOptimizer {
    private final Minecraft mc = Minecraft.getMinecraft();

    @SubscribeEvent
    public void onRenderWorldLast(RenderWorldLastEvent event) {
        if (mc.gameSettings.particleSetting == 2) { // Minimal particles
            EffectRenderer effectRenderer = mc.effectRenderer;
            effectRenderer.clearEffects();
        }
    }
}