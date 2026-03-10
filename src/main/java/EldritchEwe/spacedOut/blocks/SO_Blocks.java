package EldritchEwe.spacedOut.blocks;

import EldritchEwe.spacedOut.SpacedOut;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class SO_Blocks
{
    public static final Block COARSE_DUST = registerBlock
    ( "dunes/dust/coarse", new Block (
        AbstractBlock.Settings.create().sounds ( BlockSoundGroup.SAND ).strength ( 8, 4 )));
    public static final Block SPECKLED_DUST = registerBlock
    ( "dunes/dust/speckled", new Block (
        AbstractBlock.Settings.create().sounds ( BlockSoundGroup.SAND ).strength ( 12, 8 )));
    public static final Block SILVERY_DUST = registerBlock
    ( "dunes/dust/silvery", new Block (
        AbstractBlock.Settings.create().sounds ( BlockSoundGroup.SAND ).strength ( 24, 16 )));
    public static final Block COMPACTED_DUST = registerBlock
    ( "dunes/dust/compacted", new Block (
        AbstractBlock.Settings.create().sounds ( BlockSoundGroup.SAND ).strength ( 40, 24 )));

    public static final Block ANCIENT_RUBBLE = registerBlock
    ( "dunes/ancient/rubble", new Block (
        AbstractBlock.Settings.create().sounds ( BlockSoundGroup.GRAVEL ).strength ( 16, 8 )));



    private static Block registerBlock ( String name, Block block, Item.Settings settings )
    {
        registerBlockItem ( name, block, settings );
        return Registry.register ( Registries.BLOCK, Identifier.of ( SpacedOut.MOD_ID, name ), block );
    }

    private static Block registerBlock ( String name, Block block )
    {
        registerBlockItem ( name, block, new Item.Settings() );
        return Registry.register ( Registries.BLOCK, Identifier.of ( SpacedOut.MOD_ID, name ), block );
    }

    private static void registerBlockItem ( String name, Block block, Item.Settings settings )
    {
        Registry.register ( Registries.ITEM, Identifier.of ( SpacedOut.MOD_ID, name ),
            new BlockItem( block, settings ));
    }

    public static void registerModBlocks() {
        SpacedOut.LOGGER.info("Registering Mod Blocks for " + SpacedOut.MOD_ID);
    }
}