package net.zachsroom.vietnamsdelight.datagen;

import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.ItemTagProvider;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.RegistryWrapper;
import net.zachsroom.vietnamsdelight.item.ModArmorMaterials;

public class ModItemTagProvider extends ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    protected void configure(RegistryWrapper.WrapperLookup registries) {
        this.getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR).add(ModArmorMaterials.NONLA);
    }
}
