package toyhippogriff.coalnugget.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import toyhippogriff.coalnugget.CoalNugget;

public class CoalNuggetBlocks
{
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(CoalNugget.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> CHARCOAL_BLOCK = REGISTRY.register("charcoal_block", () ->
            new Block(Block.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
}