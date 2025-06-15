package net.zachsroom.vietnamsdelight;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class VietnamsDelightClient implements ClientModInitializer {
    public void onInitializeClient() {
        // This method is called when the client mod is initialized.
        // You can add your client-side initialization code here.
        System.out.println("Vietnams Delight Client is running!");
        // Additional client-side setup can be done here, such as registering renderers or event listeners.
    }
}
