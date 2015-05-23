package com.carbon.auraxium.client.handler;

import com.carbon.auraxium.client.settings.KeyBindings;
import com.carbon.auraxium.reference.Key;
import com.carbon.auraxium.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler
{
    private static Key getPressedKeyBinding()
    {
        if(KeyBindings.charge.isPressed())
        {
            return Key.CHARGE;
        }
        else if(KeyBindings.release.isPressed())
        {
            return Key.RELEASE;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info(getPressedKeyBinding());
    }
}
