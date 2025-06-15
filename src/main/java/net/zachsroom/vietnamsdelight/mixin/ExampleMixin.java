package net.zachsroom.vietnamsdelight.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({MinecraftServer.class})
public class ExampleMixin {
    @Inject(
        at = {@At("HEAD")},
        method = {"loadWorld"}
    )
    private void init(CallbackInfo info) {
        // This method is called when the Minecraft server starts loading a world.
        // You can add your initialization code here.
        System.out.println("Vietnams Delight Server is loading a world!");
    }
}
