package com.carbon.auraxium.init;

import com.carbon.auraxium.item.*;
import com.carbon.auraxium.reference.Names;
import com.carbon.auraxium.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemAuraxium auraDust = new ItemAuraDust();
    public static final ItemAuraxium smallAuraDust = new ItemSmallAuraDust();
    public static final ItemAuraxium auraRod = new ItemAuraRod();
    public static final ItemAuraxium auraInfusedIngot = new ItemAuraInfusedIngot();
    public static final ItemAuraxium auraInfusedGem = new ItemAuraInfusedGem();

    public static void init()
    {
        GameRegistry.registerItem(auraDust, Names.Items.auraDust);
        GameRegistry.registerItem(smallAuraDust, Names.Items.smallAuraDust);
        GameRegistry.registerItem(auraRod, Names.Items.auraRod);
        GameRegistry.registerItem(auraInfusedIngot, Names.Items.auraInfusedIngot);
        GameRegistry.registerItem(auraInfusedGem, Names.Items.auraInfusedGem);
    }
}
