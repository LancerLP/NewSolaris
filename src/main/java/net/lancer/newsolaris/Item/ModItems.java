package net.lancer.newsolaris.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lancer.newsolaris.NewSolaris;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SOLANITE = registerItem("solanite", new Item(new FabricItemSettings()));
    public static final Item SOLANITE_PLATE = registerItem("solanite_plate", new Item(new FabricItemSettings()));
    public static final Item SOLANITE_CONDUIT = registerItem("solanite_conduit", new Item(new FabricItemSettings()));
    public static final Item EARTH_PATCH = registerItem("earth_patch", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(SOLANITE);
        entries.add(SOLANITE_PLATE);
        entries.add(SOLANITE_CONDUIT);
        entries.add(EARTH_PATCH);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NewSolaris.MOD_ID, name),item);
    }

    public static void registerModItems() {
        NewSolaris.LOGGER.info("Registering Mod Items for " + NewSolaris.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
