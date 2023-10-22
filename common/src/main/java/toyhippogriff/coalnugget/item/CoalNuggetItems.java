package toyhippogriff.coalnugget.item;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.fuel.FuelRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import toyhippogriff.coalnugget.CoalNugget;
import toyhippogriff.coalnugget.block.CoalNuggetBlocks;

public class CoalNuggetItems
{
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(CoalNugget.MOD_ID, Registry.ITEM_REGISTRY);

    public static final RegistrySupplier<Item> CHARCOAL_BLOCK = REGISTRY.register("charcoal_block", () ->
            new BlockItem(CoalNuggetBlocks.CHARCOAL_BLOCK.get(), new Item.Properties().tab(CoalNuggetItems.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COAL_NUGGET = REGISTRY.register("coal_nugget", () ->
            new Item(new Item.Properties().tab(CoalNuggetItems.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> CHARCOAL_NUGGET = REGISTRY.register("charcoal_nugget", () ->
            new Item(new Item.Properties().tab(CoalNuggetItems.CREATIVE_TAB)));

    public static final CreativeModeTab CREATIVE_TAB = CreativeTabRegistry.create(new ResourceLocation(CoalNugget.MOD_ID, "creative_tab"), () ->
            new ItemStack(COAL_NUGGET.get()));

    public static void init()
    {
        FuelRegistry.register(16000, CHARCOAL_BLOCK.get());
        FuelRegistry.register(200, COAL_NUGGET.get(), CHARCOAL_NUGGET.get());
    }
}