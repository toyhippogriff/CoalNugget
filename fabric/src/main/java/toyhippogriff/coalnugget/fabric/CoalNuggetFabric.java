package toyhippogriff.coalnugget.fabric;

import net.fabricmc.api.ModInitializer;
import toyhippogriff.coalnugget.CoalNugget;
import toyhippogriff.coalnugget.item.CoalNuggetItems;

public class CoalNuggetFabric implements ModInitializer
{
    @Override
    public void onInitialize()
    {
        CoalNugget.init();
        CoalNuggetItems.registerFuels();
    }
}