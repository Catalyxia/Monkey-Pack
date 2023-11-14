package net.catalyxia.monkeypack.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MONKEYPACK_TAB = new CreativeModeTab("monkeypacktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.NETHERITE_KNIFE.get());
        }
    };
}
