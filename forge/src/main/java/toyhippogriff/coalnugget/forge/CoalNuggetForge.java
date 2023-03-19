package toyhippogriff.coalnugget.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import toyhippogriff.coalnugget.CoalNugget;
import toyhippogriff.coalnugget.item.CoalNuggetItems;

@Mod(CoalNugget.MOD_ID)
public class CoalNuggetForge
{
    public CoalNuggetForge()
    {
        EventBuses.registerModEventBus(CoalNugget.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        CoalNugget.init();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    public void setup(FMLCommonSetupEvent event)
    {
        CoalNuggetItems.registerFuels();
    }
}