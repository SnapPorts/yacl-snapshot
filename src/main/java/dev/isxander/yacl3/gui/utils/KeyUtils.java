package dev.isxander.yacl3.gui.utils;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.Minecraft;

public final class KeyUtils {

    public static boolean hasShiftDown() {
        var window = Minecraft.getInstance().getWindow();
        /*? if >=26.3 {*/
        return InputConstants.isKeyDown(InputConstants.KEY_LSHIFT) ||
               InputConstants.isKeyDown(InputConstants.KEY_RSHIFT);
        /*?} else {*/
        /*var window = Minecraft.getInstance().getWindow();
        return InputConstants.isKeyDown(window, InputConstants.KEY_LSHIFT) ||
               InputConstants.isKeyDown(window, InputConstants.KEY_RSHIFT);
               InputConstants.isKeyDown(window, InputConstants.KEY_RSHIFT);*//*?}*/
    }

    public static boolean hasControlDown() {
        var window = Minecraft.getInstance().getWindow();
        /*? if >=26.3 {*/
        return InputConstants.isKeyDown(InputConstants.KEY_LCONTROL) ||
               InputConstants.isKeyDown(InputConstants.KEY_RCONTROL);
        /*?} else {*/
        /*var window = Minecraft.getInstance().getWindow();
        return InputConstants.isKeyDown(window, InputConstants.KEY_LCONTROL) ||
               InputConstants.isKeyDown(window, InputConstants.KEY_RCONTROL);
               InputConstants.isKeyDown(window, InputConstants.KEY_RCONTROL);*//*?}*/
    }

    private KeyUtils() {
    }
}

