package net.zachsroom.vietnamsdelight.item;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.equipment.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;

import net.minecraft.registry.tag.TagKey;

import java.util.Map;

public class ModArmorMaterials implements ArmorMaterials {
    public static final int BASE_DURABILITY = 11;
    public static final RegistryKey<EquipmentAsset> NONLA_ARMOR_MATERIAL_KEY = RegistryKey.of(
        EquipmentAssetKeys.REGISTRY_KEY,
        net.minecraft.util.Identifier.of("vietnamsdelight", "non_la")
    );

    public static final TagKey<Item> REPAIRS_NONLA_ARMOR = TagKey.of(
        Registries.ITEM.getKey(),
        net.minecraft.util.Identifier.of("farmersdelight", "STRAW")
    );

    public static final ArmorMaterial INSTANCE = new ArmorMaterial(
        BASE_DURABILITY,
        Map.of(
            EquipmentType.BOOTS, 1,
            EquipmentType.LEGGINGS, 2,
            EquipmentType.CHESTPLATE, 2,
            EquipmentType.HELMET, 1
        ),
        10,
        net.minecraft.sound.SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
        0.0F,
        0.0F,
        REPAIRS_NONLA_ARMOR,
        NONLA_ARMOR_MATERIAL_KEY
    );

    public static final Item NONLA = Items.register(
        "non_la",
        new Item.Settings().armor(ModArmorMaterials.INSTANCE, EquipmentType.HELMET)
    );
}
