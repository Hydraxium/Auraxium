package com.carbon.auraxium.proxy;

import com.carbon.auraxium.client.settings.KeyBindings;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit()
    {
        registerKeyBindings();
    }

    private void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(KeyBindings.charge);
        ClientRegistry.registerKeyBinding(KeyBindings.release);
    }

    @Override
    public void init()
    {

    }

    @Override
    public void postInit()
    {

    }
}
