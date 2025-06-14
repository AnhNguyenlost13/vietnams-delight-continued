package net.zachsroom.vietnamsdelight.item;

import java.util.Map;
import java.util.function.Supplier;

import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.ArmorMaterials; // probably class_1761
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.recipe.Ingredient; // class_1856 is the Ingredient class
import net.minecraft.item.ItemConvertible; // class_1935 is the Item class
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvent; // class_3414 is the SoundEvent class
import net.minecraft.sound.SoundEvents; // class_3417 is the SoundEvents class
import net.minecraft.item.equipment.EquipmentType; // class_8051 is the EquipmentType class
import net.minecraft.util.Identifier;
import vectorwing.farmersdelight.common.registry.ModItems;

import static net.zachsroom.vietnamsdelight.VietnamsDelight.MOD_ID;

public enum ModArmorMaterials implements ArmorMaterials {
   NONLA(
      "non_la",
      10,
      ArmorMaterials.createDefenseMap(1, 2, 2, 1, 10),
      10,
           RegistryEntry.of(SoundEvents.ITEM_ARMOR_EQUIP_LEATHER),
      0.0F,
      0.0F,
      () -> Ingredient.ofItems((ItemConvertible) ModItems.STRAW),
      new int[]{11, 16, 16, 13},
      false
   );

   private final String name;
   private static int durabilityMultiplier = 10;
   private final Map<EquipmentType, Integer> protectionAmounts;
   private final int enchantability;
   private final SoundEvent equipSound;
   private final float toughness;
   private final float knockbackResistance;
   private final Supplier<Ingredient> repairIngredient;
   private static final int[] baseDurability = new int[]{11, 16, 16, 13};
   private final boolean dyeable;

   ModArmorMaterials(
           String name,
           int durabilityMultiplier,
           Map<EquipmentType, Integer> protectionAmounts,
           int enchantmentValue,
           RegistryEntry<SoundEvent> equipSound,
           float toughness,
           float knockbackResistance,
           Supplier<Ingredient> repairIngredient,
           int[] baseDurability,
           boolean dyeable
   ) {
      this.name = name;
      this.durabilityMultiplier = durabilityMultiplier;
      this.protectionAmounts = protectionAmounts;
      this.enchantability = enchantmentValue;
      this.equipSound = equipSound;
      this.toughness = toughness;
      this.knockbackResistance = knockbackResistance;
      this.repairIngredient = repairIngredient;
      this.baseDurability = baseDurability;
      this.dyeable = dyeable;
    }

   public int getProtection(EquipmentType type) {
        return this.protectionAmounts.getOrDefault(type, 0);
   }

   public int getEnchantability() {
      return this.enchantability;
   }

   public SoundEvent getEquipSound() {
      return this.equipSound;
   }

   public Ingredient getRepairIngredient() {
      return this.repairIngredient.get();
   }

   // i'd assume these names are correct...
   public String getName() {
      return "vietnamsdelight:" + this.name;
   }

   public float getToughness() {
      return this.toughness;
   }

   public float getKnockbackResistance() {
      return this.knockbackResistance;
   }

   public static int getDurability(EquipmentType type) {
      return baseDurability[type.ordinal()] * durabilityMultiplier;
   }

    public boolean isDyeable() {
        return this.dyeable;
    }
}
