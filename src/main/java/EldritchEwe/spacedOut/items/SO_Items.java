package EldritchEwe.spacedOut.items;

import EldritchEwe.spacedOut.SpacedOut;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class SO_Items
{
    /**
     * Natural items found on Desolate Dunes.
    */
    public static final Item COARSE_DUST_CLUMP =
    registerItem ( "dunes/dust/coarse/clump",    new Item ( new Item.Settings() ));

    public static final Item SPECKLED_DUST_CLUMP =
    registerItem ( "dunes/dust/speckled/clump",  new Item ( new Item.Settings() ));

    public static final Item SILVERY_DUST_CLUMP =
    registerItem ( "dunes/dust/silvery/clump",   new Item ( new Item.Settings() ));

    public static final Item COMPACTED_DUST_CLUMP =
    registerItem ( "dunes/dust/compacted/clump", new Item ( new Item.Settings() ));


    /**
     * Artificial items found on Desolate Dunes.
     */
    public static final Item ANCIENT_SHEET_METAL =
    registerItem ( "dunes/ancient/sheet_metal",      new Item ( new Item.Settings() ));

    public static final Item ANCIENT_GEARS =
    registerItem ( "dunes/dust/ancient/gears",       new Item ( new Item.Settings() ));

    public static final Item ANCIENT_RATION_PACK =
    registerItem ( "dunes/dust/ancient/ration_pack", new Item ( new Item.Settings() ));

    public static final Item ANCIENT_WATER_PACK =
    registerItem ( "dunes/dust/ancient/water_pack",  new Item ( new Item.Settings() ));





    private static Item registerItem ( String name, Item item )
    {
        return Registry.register( Registries.ITEM, Identifier.of ( SpacedOut.MOD_ID, name ), item );
    }

    public static void registerModItems ()
    {
        SpacedOut.LOGGER.info ( "Registering Mod Items for " + SpacedOut.MOD_ID );
    }
}
