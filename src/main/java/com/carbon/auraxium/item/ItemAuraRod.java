package com.carbon.auraxium.item;

import com.carbon.auraxium.reference.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemAuraRod extends ItemAuraxium
{
    public ItemAuraRod()
    {
        super();
        this.setUnlocalizedName(Names.Items.auraRod);
        this.maxStackSize = 8;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        list.add("This is a tooltip");
    }
}
