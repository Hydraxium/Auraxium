package com.carbon.auraxium;

import com.carbon.auraxium.client.handler.KeyInputEventHandler;
import com.carbon.auraxium.handler.ConfigurationHandler;
import com.carbon.auraxium.init.ModBlocks;
import com.carbon.auraxium.init.ModItems;
import com.carbon.auraxium.init.Recipes;
import com.carbon.auraxium.proxy.CommonProxy;
import com.carbon.auraxium.reference.Reference;
import com.carbon.auraxium.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class Auraxium
{
    @Mod.Instance(Reference.MOD_ID)
    public static Auraxium instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.preInit();

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

        proxy.init();

        Recipes.init();

        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        /*/ For checking what is in the OreDictionary
        for(String oreName : OreDictionary.getOreNames())
        {
            LogHelper.info(oreName);
            OreDictionary.getOres(oreName);
        }
        */

        proxy.postInit();

        LogHelper.info("Post Initialization Complete!");
    }
}
