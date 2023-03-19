package toyhippogriff.coalnugget.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import toyhippogriff.coalnugget.CoalNugget;

public class CoalNuggetBlocks
{
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(CoalNugget.MOD_ID, Registry.BLOCK_REGISTRY);

    public static final RegistrySupplier<Block> CHARCOAL_BLOCK = REGISTRY.register("charcoal_block", () ->
            new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
}