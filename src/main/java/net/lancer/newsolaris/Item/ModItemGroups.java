package net.lancer.newsolaris.Item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lancer.newsolaris.NewSolaris;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SOLARITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NewSolaris.MOD_ID, "solanite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.solanite"))
                    .icon(() -> new ItemStack(ModItems.EARTH_PATCH)).entries((displayContext, entries) -> {
                        entries.add(ModItems.EARTH_PATCH);
                        entries.add(ModItems.SOLANITE);
                        entries.add(ModItems.SOLANITE_PLATE);
                        entries.add(ModItems.SOLANITE_CONDUIT);
                    }).build());

    public static void registerItemGroups() {
        NewSolaris.LOGGER.info("Registering Item Groups for " + NewSolaris.MOD_ID);
    }
}
