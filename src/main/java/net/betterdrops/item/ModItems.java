package net.betterdrops.item;

import net.betterdrops.BetterDrops;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ARMADILLO_STEW = registerItem("armadillo_stew", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "armadillo_stew")))));
    public static final Item RAW_ARMADILLO = registerItem("raw_armadillo", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "raw_armadillo")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BetterDrops.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterDrops.LOGGER.info("Registering Mod Items for " + BetterDrops.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ARMADILLO_STEW);
            entries.add(RAW_ARMADILLO);
        });
    }
}