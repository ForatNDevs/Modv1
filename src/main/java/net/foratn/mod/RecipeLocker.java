package net.foratn.mod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;

public class RecipeLocker {
    ItemStack[] lockedItems = LockedItemsContainer.locked;

    @SubscribeEvent
    public void onFMLServerStartedEvent(@NotNull ServerStartedEvent event) {
        RecipeManager recipeManager = event.getServer().getRecipeManager();
        Collection<Recipe<?>> recipes = recipeManager.getRecipes();
        for (Recipe<?> recipe : recipes) {
            if (recipe instanceof CraftingRecipe craftingRecipe) {
                if (Arrays.stream(lockedItems).toList().contains(craftingRecipe.getResultItem())) {
                    System.out.println("RecipeLocker: Recipe " + craftingRecipe.getResultItem().getDisplayName() + " is locked");
                }
            }
        }
    }
}
