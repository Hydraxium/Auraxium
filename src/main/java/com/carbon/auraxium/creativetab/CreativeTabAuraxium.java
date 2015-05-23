package com.carbon.auraxium.creativetab;

import com.carbon.auraxium.init.ModItems;
import com.carbon.auraxium.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabAuraxium
{
    public static final CreativeTabs AURAXIUM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.auraDust;
        }
    };
}
