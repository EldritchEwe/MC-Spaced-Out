package EldritchEwe.spacedOut;

import EldritchEwe.spacedOut.blocks.SO_Blocks;
import EldritchEwe.spacedOut.items.SO_Items;
import EldritchEwe.spacedOut.items.SO_ItemGroups;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpacedOut implements ModInitializer {


    public static final String MOD_ID = "spacedout";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize()
    {
        SO_Items.registerModItems();
        SO_Blocks.registerModBlocks();
        SO_ItemGroups.registerItemGroups();
    }
}

