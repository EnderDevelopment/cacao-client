package com.enderdevelopment.novaclient.handler;

import com.enderdevelopment.novaclient.gui.ClickGUI;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

public class KeybindHandler {
    private static final KeyBinding clickGUIKey = new KeyBinding("Open ClickGUI", Keyboard.KEY_RSHIFT, "Nova Client");

    public KeybindHandler() {
        ClientRegistry.registerKeyBinding(clickGUIKey);
    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (clickGUIKey.isPressed()) {
            mc.displayGuiScreen(new ClickGUI());
        }
    }
}