package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {

    public static int MAX_TIN = 69421;

    @Override
    public void onInitialize() {
        System.out.println("R.I.P B0undaryBreaker. Died of Tin Poisoning.");
        for (int i = 0; i < MAX_TIN; i++) {
            Identifier tin = new Identifier("tiny_tintato", "tin_" + i);
            Registry.register(Registry.ITEM, tin, new Item(new Item.Settings().maxCount(69).fireproof().group(ItemGroup.MATERIALS))); //nice
        }
    }
}
