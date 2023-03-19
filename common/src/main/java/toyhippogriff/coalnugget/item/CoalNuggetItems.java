package toyhippogriff.coalnugget.item;

import dev.architectury.registry.fuel.FuelRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import toyhippogriff.coalnugget.CoalNugget;
import toyhippogriff.coalnugget.block.CoalNuggetBlocks;

public class CoalNuggetItems
{
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(CoalNugget.MOD_ID, Registry.ITEM_REGISTRY);

    public static final RegistrySupplier<Item> CHARCOAL_BLOCK = REGISTRY.register("charcoal_block", () ->
            new BlockItem(CoalNuggetBlocks.CHARCOAL_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistrySupplier<Item> COAL_NUGGET = REGISTRY.register("coal_nugget", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistrySupplier<Item> CHARCOAL_NUGGET = REGISTRY.register("charcoal_nugget", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void registerFuels()
    {
        FuelRegistry.register(16000, CHARCOAL_BLOCK.get());
        FuelRegistry.register(200, COAL_NUGGET.get(), CHARCOAL_NUGGET.get());
    }
}