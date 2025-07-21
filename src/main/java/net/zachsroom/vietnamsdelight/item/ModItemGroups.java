package net.zachsroom.vietnamsdelight.item;

import net.zachsroom.vietnamsdelight.VietnamsDelight;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup; // class_1761
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> VD_GROUP_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(),
            Identifier.of("vietnamsdelight", "vd_group")
    );

    public static final ItemGroup VD_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.BANHMI))
            .displayName(Text.translatable("itemGroup.VD_GROUP"))
            .build();

    public static void registerItemGroups() {
        VietnamsDelight.LOGGER.info("Registering Item Group!");
        Registry.register(Registries.ITEM_GROUP, VD_GROUP_KEY.getValue(), VD_GROUP);

        ItemGroupEvents.modifyEntriesEvent(VD_GROUP_KEY).register(meow -> {
            meow.add(ModItems.RICEFLOUR);
            meow.add(ModItems.CORNSTARCH);
            meow.add(ModItems.RICEMIXEDDOUGH);
            meow.add(ModItems.RICEBATTER);
            meow.add(ModItems.BANHMI);
            meow.add(ModItems.RICENOODLESHEET);
            meow.add(ModItems.FLATRICENOODLE);
            meow.add(ModItems.PHO);
            meow.add(ModItems.CHICKENPHO);
            meow.add(ModItems.BEEFPHO);
            meow.add(ModArmorMaterials.NONLA);
        });
    }
}
