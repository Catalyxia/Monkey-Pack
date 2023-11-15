package net.catalyxia.monkeypack.item;

import net.catalyxia.monkeypack.Monkeypack;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Monkeypack.MOD_ID);

    public static final RegistryObject<Item> WOOD_KNIFE = ITEMS.register("wood_knife",
            () -> new PickaxeItem(Tiers.WOOD,
                    new Item.Properties(.)
                            .tab(ModCreativeModeTab.MONKEYPACK_TAB).stacksTo(1)).);
    public static final RegistryObject<Item> STONE_KNIFE = ITEMS.register("stone_knife",
            () -> new SwordItem(Tiers.STONE,0, 0,
                    new Item.Properties().tab(ModCreativeModeTab.MONKEYPACK_TAB).stacksTo(1)));
    public static final RegistryObject<Item> IRON_KNIFE = ITEMS.register("iron_knife",
            () -> new SwordItem(Tiers.IRON,0, 0,
                    new Item.Properties().tab(ModCreativeModeTab.MONKEYPACK_TAB).stacksTo(1)));
    public static final RegistryObject<Item> GOLD_KNIFE = ITEMS.register("gold_knife",
            () -> new SwordItem(Tiers.GOLD,0, 0,
                    new Item.Properties().tab(ModCreativeModeTab.MONKEYPACK_TAB).stacksTo(1)));
    public static final RegistryObject<Item> DIAMOND_KNIFE = ITEMS.register("diamond_knife",
            () -> new SwordItem(Tiers.DIAMOND,0, 0,
                    new Item.Properties().tab(ModCreativeModeTab.MONKEYPACK_TAB).stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_KNIFE = ITEMS.register("netherite_knife",
            () -> new SwordItem(Tiers.NETHERITE,0, 0,
                    new Item.Properties().tab(ModCreativeModeTab.MONKEYPACK_TAB).stacksTo(1)));
    public static final RegistryObject<Item> GRASS_FIBRE = ITEMS.register("grass_fibre",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MONKEYPACK_TAB)));
    public static final RegistryObject<Item> GRASS_ROPE = ITEMS.register("grass_rope",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MONKEYPACK_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
