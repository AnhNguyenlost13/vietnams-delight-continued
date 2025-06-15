package net.zachsroom.vietnamsdelight.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.entity.effect.StatusEffectInstance; // class_1293
import net.minecraft.entity.effect.StatusEffects; // class_1294
import net.minecraft.component.type.FoodComponent; // class_4174
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ModFoodComponents {
    public static final ConsumableComponent RICEMIXEDDOUGH_CONSUMABLE_COMPONENT = ConsumableComponents.food()
        .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600), 0.3F)) // that's so evil!!
        .build(); // method_19242 is used to build the food component

    public static final FoodComponent RICEMIXEDDOUGH_FOOD_COMPONENT = new FoodComponent.Builder()
        .nutrition(1) // method_19238 is used to set the hunger points
        .saturationModifier(1.0F) // method_19237 is used to set the saturation modifier
        .build();

    public static final FoodComponent RICEBATTER_FOOD_COMPONENT = new FoodComponent.Builder()
        .nutrition(2)
        .saturationModifier(0.8F)
        .build();

    public static final ConsumableComponent RICEBATTER_CONSUMABLE_COMPONENT = ConsumableComponents.food()
        .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600), 0.3F))
        .build();

    public static final FoodComponent RICENOODLESHEET = new FoodComponent.Builder()
        .nutrition(4)
        .saturationModifier(0.25F)
        .build();

    public static final FoodComponent FLATRICENOODLE = new FoodComponent.Builder()
        .nutrition(3)
        .saturationModifier(0.3333F)
        .alwaysEdible()
        .build();

    public static final FoodComponent PHO = new FoodComponent.Builder()
        .nutrition(10)
        .saturationModifier(0.8F)
        .build();

    public static final FoodComponent BEEFPHO_FOOD_COMPONENT = new FoodComponent.Builder()
        .nutrition(15)
        .saturationModifier(0.75F)
        .build();

    public static ConsumableComponent BEEFPHO_CONSUMABLE_COMPONENT = ConsumableComponents.food()
        .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(ModEffects.NOURISHMENT, 6000, 0), 1.0F))
        .build();

    public static final FoodComponent CHICKENPHO_FOOD_COMPONENT = new FoodComponent.Builder()
        .nutrition(12)
        .saturationModifier(0.75F)
        .build();

    public static final ConsumableComponent CHICKENPHO_CONSUMABLE_COMPONENT = ConsumableComponents.food()
        .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(ModEffects.COMFORT, 6000, 0), 1.0F))
        .build();

    public static final FoodComponent BANHMI = new FoodComponent.Builder()
        .nutrition(3)
        .saturationModifier((float) 4/3)
        .build();
}
