package net.zachsroom.vietnamsdelight.datagen;

import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.ItemTagProvider;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.RegistryWrapper;
import net.zachsroom.vietnamsdelight.item.ModItems;

public abstract class ModItemTagProvider extends ItemTagProvider {
   public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
      super(output, completableFuture);
   }

   protected void configure(RegistryWrapper arg) {
      this.getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR).add(ModItems.NONLA);
   }
}
