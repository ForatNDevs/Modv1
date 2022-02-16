package net.foratn.mod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

import java.util.Arrays;

public class LockedItemsContainer {
    // https://discord.com/channels/176780432371744769/914076058733674537/943527458592948264
    public static ItemStack[] locked = new ItemStack[]{
            new ItemStack(ItemLike())
    };
}
