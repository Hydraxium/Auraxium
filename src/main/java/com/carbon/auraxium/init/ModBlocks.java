package com.carbon.auraxium.init;

import com.carbon.auraxium.block.*;
import com.carbon.auraxium.reference.Names;
import com.carbon.auraxium.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockAuraxium auraDustBlock = new BlockAuraDust();
    public static final BlockAuraxium auraInfusedPlanks = new BlockAuraInfusedPlanks();
    public static final BlockAuraxium auraInfusedIngotBlock = new BlockAuraInfusedIngotBlock();
    public static final BlockAuraxium auraInfusedGemBlock = new BlockAuraInfusedGemBlock();

    public static void init()
    {
        GameRegistry.registerBlock(auraDustBlock, Names.Blocks.auraDustBlock);
        GameRegistry.registerBlock(auraInfusedPlanks, Names.Blocks.auraInfusedPlanks);
        GameRegistry.registerBlock(auraInfusedIngotBlock, Names.Blocks.auraInfusedIngotBlock);
        GameRegistry.registerBlock(auraInfusedGemBlock, Names.Blocks.auraInfusedGemBlock);
    }
}
