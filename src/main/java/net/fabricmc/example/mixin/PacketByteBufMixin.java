package net.fabricmc.example.mixin;

import net.minecraft.network.PacketByteBuf;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(PacketByteBuf.class)
public class PacketByteBufMixin {

    @ModifyConstant(method = "readCompoundTag", constant = @Constant(longValue = 2097152L))
    private long modify(long original) {
        return Long.MAX_VALUE;
    }
}
