package net.zachsroom.vietnamsdelight;

import net.fabricmc.api.ModInitializer;
import net.zachsroom.vietnamsdelight.item.ModItemGroups;
import net.zachsroom.vietnamsdelight.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VietnamsDelight implements ModInitializer {
   public static final String MOD_ID = "vietnamsdelight";
   public static final Logger LOGGER = LoggerFactory.getLogger("vietnamsdelight");

   public void onInitialize() {
      ModItemGroups.registerItemGroups();
      ModItems.registerModItems();
   }
}
