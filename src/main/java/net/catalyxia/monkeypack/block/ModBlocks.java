package net.catalyxia.monkeypack.block;

import net.catalyxia.monkeypack.Monkeypack;
import net.catalyxia.monkeypack.item.ModCreativeModeTab;
import net.catalyxia.monkeypack.item.Moditems;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Monkeypack.MOD_ID);

    public static final RegistryObject<Block> INCOMPLETE_ANCIENT_DEBRIS = registerblock("incomplete_ancient_debris",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(30f).requiresCorrectToolForDrops().sound(SoundType.ANCIENT_DEBRIS).explosionResistance(90f)), ModCreativeModeTab.MONKEYPACK_TAB);

    private static <T extends Block>RegistryObject<T> registerblock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;

    }

    private static <T extends  Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {

        return Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void  register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
