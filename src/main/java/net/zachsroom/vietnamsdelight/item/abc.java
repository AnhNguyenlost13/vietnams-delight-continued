package net.zachsroom.vietnamsdelight.item;

import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.RegistryKey;

import net.minecraft.registry.tag.TagKey;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.Map;

import static vectorwing.farmersdelight.common.registry.ModItems.*;

public class abc {
    public static final int BASE_DURABILITY = 10;
    public static final RegistryKey<EquipmentAsset> NONLA_ARMOR_MATERIAL_KEY = RegistryKey.of(
            EquipmentAssetKeys.REGISTRY_KEY,
            net.minecraft.util.Identifier.of("vietnamsdelight", "non_la")
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
            // todo: repair material
            NONLA_ARMOR_MATERIAL_KEY
            )
    )

}
