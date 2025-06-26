package net.zachsroom.vietnamsdelight.mixin.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// i know it's not a good idea to leave commented code in the codebase
//@Environment(EnvType.CLIENT)
//@Mixin({MinecraftClient.class})
//public class ExampleClientMixin {
//    @Inject(
//        at = {@At("HEAD")},
//        method = {"run"}
//    )
//    private void run(CallbackInfo info) {
//        // This method is called when the Minecraft client starts running.
//        // You can add your initialization code here.
//        System.out.println("Vietnams Delight Client is running!");
//    }
//}
