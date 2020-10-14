package net.fabricmc.example.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(net.minecraft.network.packet.s2c.play.CustomPayloadS2CPacket.class)
public class CustomPayloadS2CPacketMixin {
    @ModifyConstant(method = "<init>(Lnet/minecraft/util/Identifier;Lnet/minecraft/network/PacketByteBuf;)V", constant = @Constant(intValue = 1048576))
    private static int yes(int no) {
        return Integer.MAX_VALUE;
    }

    @ModifyConstant(method = "read", constant = @Constant(intValue = 1048576))
    private int yes2(int no) {
        return Integer.MAX_VALUE;
    }
}
