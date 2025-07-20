package net.zachsroom.vietnamsdelight.item;

// todo: cleanup and testing
//import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset; // pffft
import net.minecraft.item.Item; // Importing Item for item registration
import net.minecraft.item.Items; // Importing class_1802 for food items
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registry; // Importing class_2378 for item registration
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier; // Importing class_2960 for resource location
import net.minecraft.registry.Registries; // Importing class_7923 for item registry
//import net.minecraft.class_1738.class_8051; // Importing class_8051 for armor material

import vectorwing.farmersdelight.common.item.ConsumableItem;


import net.zachsroom.vietnamsdelight.VietnamsDelight;
import vectorwing.farmersdelight.common.item.ConsumableItem;

import static net.minecraft.item.Items.BOWL;
import static net.minecraft.item.Items.RESIN_BLOCK;

public class ModItems {
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VietnamsDelight.MOD_ID, name), item);
    }

    public static final Item RICEFLOUR = registerItem(
        "rice_flour",
        new Item(
            new Item.Settings().registryKey(
                RegistryKey.of(
                    RegistryKeys.ITEM,
                    Identifier.of(VietnamsDelight.MOD_ID
                    )
                )
            )
        )
    );

    public static final Item BANHMI = registerItem(
        "banh_mi",
        new Item(
            new Item.Settings()
                .food(ModFoodComponents.BANHMI)
                .registryKey(
                    RegistryKey.of(
                        RegistryKeys.ITEM,
                        Identifier.of(VietnamsDelight.MOD_ID)
                    )
                )
        )
    );
    public static final Item RICEMIXEDDOUGH = registerItem(
        "rice_mixed_wheat_dough",
        new Item(
            new Item.Settings()
                .food(ModFoodComponents.RICEMIXEDDOUGH_FOOD_COMPONENT)
                .recipeRemainder(BOWL)
                .maxCount(16)
                .registryKey(
                    RegistryKey.of(
                        RegistryKeys.ITEM,
                        Identifier.of(VietnamsDelight.MOD_ID)
                    )
                )
            )
        );

    public static final Item RICEBATTER = registerItem(
            "rice_batter",
            new ConsumableItem(
                new Item.Settings()
                    .food(ModFoodComponents.RICEBATTER_FOOD_COMPONENT)
                .recipeRemainder(BOWL)
                .maxCount(16)
                .registryKey(
                    RegistryKey.of(
                        RegistryKeys.ITEM,
                        Identifier.of(VietnamsDelight.MOD_ID)
                    )
                ),
                false,
                false
            )
    );

    public static final Item RICENOODLESHEET = registerItem(
        "rice_noodle_sheet",
        new Item(
            new Item.Settings()
                .food(ModFoodComponents.RICENOODLESHEET)
                .recipeRemainder(BOWL)
                .maxCount(16)
                .registryKey(
                    RegistryKey.of(
                        RegistryKeys.ITEM,
                        Identifier.of(VietnamsDelight.MOD_ID)
                    )
                )
        )
    );

    public static final Item FLATRICENOODLE = registerItem(
        "flat_rice_noodle",
        new Item(
            new Item.Settings()
                .food(ModFoodComponents.FLATRICENOODLE)
                .recipeRemainder(BOWL)
                .maxCount(16)
                .registryKey(
                    RegistryKey.of(
                        RegistryKeys.ITEM,
                        Identifier.of(VietnamsDelight.MOD_ID)
                    )
                )
        )
    );

    public static final Item PHO = registerItem(
        "pho",
        new ConsumableItem(
            new Item.Settings()
                .food(ModFoodComponents.PHO)
                .recipeRemainder(BOWL)
                .maxCount(16)
                .registryKey(
                    RegistryKey.of(
                        RegistryKeys.ITEM,
                        Identifier.of(VietnamsDelight.MOD_ID)
                    )
                ),
            true,
            false)
    );

    public static final Item BEEFPHO = registerItem( // todo: figure out where do i even put the consumable component
        "beef_pho",
        new ConsumableItem(
            new Item.Settings()
                .food(ModFoodComponents.BEEFPHO_FOOD_COMPONENT)
                .recipeRemainder(BOWL)
                .maxCount(16)
                .registryKey(
                    RegistryKey.of(
                        RegistryKeys.ITEM,
                        Identifier.of(VietnamsDelight.MOD_ID)
                    )
                ),
            true,
            false)
    );

    public static final Item CORNSTARCH = registerItem(
        "corn_starch",
        new ConsumableItem(
            new Item.Settings()
            .registryKey(
                RegistryKey.of(
                    RegistryKeys.ITEM,
                    Identifier.of(VietnamsDelight.MOD_ID)
                )
            ),
            false,
            false
        )
    );

    public static final Item CHICKENPHO = registerItem(
            "chicken_pho",
            new ConsumableItem(
                new Item.Settings()
                    .food(
                        ModFoodComponents.CHICKENPHO_FOOD_COMPONENT)
                    .recipeRemainder(BOWL)
                    .maxCount(16)
                    .registryKey(
                        RegistryKey.of(
                            RegistryKeys.ITEM,
                            Identifier.of(VietnamsDelight.MOD_ID)
                        )
                    ),
                true,
                false
            )
    );
//    public static final Item NONLA = registerItem("non_la", (ItemConvertible) new Item.Settings().armor(ModArmorMaterials.INSTANCE, EquipmentType.HELMET));

    public static void registerModItems() {
        VietnamsDelight.LOGGER.info("Registering Mod Items for vietnamsdelight");

//        registerItem("rice_flour", RICEFLOUR);
//        registerItem("banh_mi", BANHMI);
//        registerItem("rice_mixed_wheat_dough", RICEMIXEDDOUGH);
//        registerItem("rice_batter", RICEBATTER);
//        registerItem("rice_noodle_sheet", RICENOODLESHEET);
//        registerItem("flat_rice_noodle", FLATRICENOODLE);
//        registerItem("pho", PHO);
//        registerItem("beef_pho", BEEFPHO);
//        registerItem("corn_starch", CORNSTARCH);
//        registerItem("chicken_pho", CHICKENPHO);
//        registerItem("non_la", NONLA);

        // Armor materials are registered in ModArmorMaterials class
    }
}