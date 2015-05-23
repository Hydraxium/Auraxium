package com.carbon.auraxium.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        // Shaped Ore Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.auraInfusedPlanks), "www", "waw", "www", 'w', "plankWood",
                'a', new ItemStack(ModItems.auraDust)));

        // Shapeless Ore Recipes
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.auraInfusedPlanks), "plankWood", "plankWood",
                new ItemStack(ModItems.smallAuraDust)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.auraInfusedPlanks), "plankWood", "plankWood",
                "plankWood", "plankWood", "plankWood", "plankWood", "plankWood", "plankWood", new ItemStack(ModItems.auraDust)));

        // Shaped Item Recipes
        GameRegistry.addRecipe(new ItemStack(ModItems.auraRod), "  a", " i ", "a  ", 'a', new ItemStack(ModItems.auraDust), 'i',
                new ItemStack(Items.iron_ingot));

        //Shaped Block Recipes
        GameRegistry.addRecipe(new ItemStack(ModBlocks.auraDustBlock), "aaa", "aaa", "aaa", 'a', new ItemStack(ModItems.auraDust));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.auraInfusedIngotBlock), "iii", "iii", "iii", 'i',
                new ItemStack(ModItems.auraInfusedIngot));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.auraInfusedGemBlock), "ggg", "ggg", "ggg", 'g',
                new ItemStack(ModItems.auraInfusedGem));

        // Shapeless Item Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.auraInfusedGem, 9), new ItemStack(ModBlocks.auraInfusedGemBlock));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.auraDust, 9), new ItemStack(ModBlocks.auraDustBlock));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.auraDust), new ItemStack(ModItems.smallAuraDust),
                new ItemStack(ModItems.smallAuraDust), new ItemStack(ModItems.smallAuraDust), new ItemStack(ModItems.smallAuraDust));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.smallAuraDust, 4), new ItemStack(ModItems.auraDust));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.auraInfusedGem), new ItemStack(ModItems.auraDust),
                new ItemStack(Items.diamond));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.auraInfusedIngot, 9), new ItemStack(ModBlocks.auraInfusedIngotBlock));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.auraInfusedIngot), new ItemStack(ModItems.auraDust),
                new ItemStack(Items.iron_ingot));

        // Shapeless Block Recipes
    }
}
