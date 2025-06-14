package net.zachsroom.vietnamsdelight.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.class_1761;
import net.minecraft.class_1799;
import net.minecraft.class_2378;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_7923;
import net.zachsroom.vietnamsdelight.VietnamsDelight;

public class ModItemGroups {
   public static final class_1761 VD_GROUP = (class_1761)class_2378.method_10230(
      class_7923.field_44687,
      new class_2960("vietnamsdelight"),
      FabricItemGroup.builder()
         .method_47321(class_2561.method_43471("itemgroup.VD_GROUP"))
         .method_47320(() -> new class_1799(ModItems.BANHMI))
         .method_47317((displayContext, entries) -> {
            entries.method_45421(ModItems.RICEFLOUR);
            entries.method_45421(ModItems.CORNSTARCH);
            entries.method_45421(ModItems.RICEMIXEDDOUGH);
            entries.method_45421(ModItems.RICEBATTER);
            entries.method_45421(ModItems.BANHMI);
            entries.method_45421(ModItems.RICENOODLESHEET);
            entries.method_45421(ModItems.FLATRICENOODLE);
            entries.method_45421(ModItems.PHO);
            entries.method_45421(ModItems.CHICKENPHO);
            entries.method_45421(ModItems.BEEFPHO);
            entries.method_45421(ModItems.NONLA);
         })
         .method_47324()
   );

   public static void registerItemGroups() {
      VietnamsDelight.LOGGER.info("Registering Item Group for vietnamsdelight");
   }
}
