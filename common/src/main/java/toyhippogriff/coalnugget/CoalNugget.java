package toyhippogriff.coalnugget;

import toyhippogriff.coalnugget.block.CoalNuggetBlocks;
import toyhippogriff.coalnugget.item.CoalNuggetItems;

public class CoalNugget
{
    public static final String MOD_ID = "coalnugget";

    public static void init()
    {
        CoalNuggetBlocks.REGISTRY.register();
        CoalNuggetItems.REGISTRY.register();
    }
}