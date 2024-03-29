package toyhippogriff.coalnugget.item;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.fuel.FuelRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import toyhippogriff.coalnugget.CoalNugget;
import toyhippogriff.coalnugget.block.CoalNuggetBlocks;

public class CoalNuggetItems
{
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(CoalNugget.MOD_ID, Registries.ITEM);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_REGISTRY = DeferredRegister.create(CoalNugget.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<Item> CHARCOAL_BLOCK = REGISTRY.register("charcoal_block", () ->
            new BlockItem(CoalNuggetBlocks.CHARCOAL_BLOCK.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> COAL_NUGGET = REGISTRY.register("coal_nugget", () ->
            new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> CHARCOAL_NUGGET = REGISTRY.register("charcoal_nugget", () ->
            new Item(new Item.Properties()));

    public static final RegistrySupplier<CreativeModeTab> CREATIVE_TAB = CREATIVE_TAB_REGISTRY.register("creative_tab", () ->
            CreativeTabRegistry.create(Component.translatable("%s.creative_tab".formatted(CoalNugget.MOD_ID)), () ->
                    new ItemStack(COAL_NUGGET.get())));

    public static void init()
    {
        CreativeTabRegistry.append(CREATIVE_TAB,
                CHARCOAL_BLOCK.get(),
                COAL_NUGGET.get(),
                CHARCOAL_NUGGET.get());

        FuelRegistry.register(16000, CHARCOAL_BLOCK.get());
        FuelRegistry.register(200, COAL_NUGGET.get(), CHARCOAL_NUGGET.get());
    }
}