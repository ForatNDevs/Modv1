package net.foratn.mod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

import java.util.Arrays;

public class LockedItemsContainer {
    static ItemLike[] items = ForgeRegistries.ITEMS.getKeys().toArray(ItemLike[]::new);
    public static ItemStack[] locked = new ItemStack[]{
            new ItemStack(items[0])
    };
}
