package net.zachsroom.vietnamsdelight.item;

//import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset; // pffft
import net.minecraft.item.Item; // Importing Item for item registration
import net.minecraft.item.Items; // Importing class_1802 for food items
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registry; // Importing class_2378 for item registration
import net.minecraft.util.Identifier; // Importing class_2960 for resource location
import net.minecraft.registry.Registries; // Importing class_7923 for item registry
//import net.minecraft.class_1738.class_8051; // Importing class_8051 for armor material

import vectorwing.farmersdelight.common.item.ConsumableItem;


import net.zachsroom.vietnamsdelight.VietnamsDelight;
import vectorwing.farmersdelight.common.item.ConsumableItem;

import static net.minecraft.item.Items.BOWL;

public class ModItems {
   public static final Item RICEFLOUR = registerItem("rice_flour", new Item(new Item.Settings()));
   public static final Item BANHMI = registerItem("banh_mi", new Item(new Item.Settings().food(ModFoodComponents.BANHMI)));
   public static final Item RICEMIXEDDOUGH = registerItem(
      "rice_mixed_wheat_dough", new Item(new Item.Settings().food(ModFoodComponents.RICEMIXEDDOUGH_FOOD_COMPONENT))
   );
   public static final Item RICEBATTER = registerItem(
      "rice_batter",
      new ConsumableItem(
//         vectorwing.farmersdelight.common.registry.ModItems.foodItem(ModFoodComponents.RICEBATTER_FOOD_COMPONENT.method_7896(class_1802.field_8428).method_7889(16),
              vectorwing.farmersdelight.common.registry.ModItems.foodItem(ModFoodComponents.RICEBATTER_FOOD_COMPONENT), // this is definitely wrong, I'm just desperate making this compile
         false,
         false
      )
   );
   public static final Item RICENOODLESHEET = registerItem(
      "rice_noodle_sheet", new Item(new Item.Settings().food(ModFoodComponents.RICENOODLESHEET))
   );
   public static final Item FLATRICENOODLE = registerItem(
      "flat_rice_noodle", new Item(new Item.Settings().food(ModFoodComponents.FLATRICENOODLE))
   );
   public static final Item PHO = registerItem(
      "pho", new ConsumableItem(new Item.Settings().food(ModFoodComponents.PHO).recipeRemainder(BOWL).maxCount(16), true, false)
   );
   public static final Item BEEFPHO = registerItem( // todo: figure out where do i even put the consumable component
      "beef_pho", new ConsumableItem(new Item.Settings().food(ModFoodComponents.BEEFPHO_FOOD_COMPONENT).recipeRemainder(BOWL).maxCount(16), true, false)
   );
   public static final Item CORNSTARCH = registerItem("corn_starch", new ConsumableItem(new Item.Settings()));
   public static final Item CHICKENPHO = registerItem(
      "chicken_pho",
      new ConsumableItem(new Item.Settings().food(ModFoodComponents.CHICKENPHO_FOOD_COMPONENT).recipeRemainder(BOWL).maxCount(16), true, false)
   );
   public static final Item NONLA = registerItem("non_la", new ArmorItem(ModArmorMaterials.NONLA, EquipmentType.HELMET, new Item.Settings()));

//   static Item registerItem(String name, Item item) {
//      return (Item)class_2378.method_10230(class_7923.field_41178, new class_2960("vietnamsdelight", name), item);
//   }

   public static void registerModItems() {
      VietnamsDelight.LOGGER.info("Registering Mod Items for vietnamsdelight");
   }
}
