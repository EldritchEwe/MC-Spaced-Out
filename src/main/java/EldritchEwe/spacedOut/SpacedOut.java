package EldritchEwe.spacedOut;

import EldritchEwe.spacedOut.blocks.SO_Blocks;
import EldritchEwe.spacedOut.items.SO_Items;
import EldritchEwe.spacedOut.util.SO_CreativeTabs;
import net.fabricmc.api.ModInitializer;
import net.minecraft.SharedConstants;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class SpacedOut implements ModInitializer {


    public static final String MOD_ID = "spacedout";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize()
    {
        SO_Items.registerModItems();
        SO_Blocks.registerModBlocks();
        SO_CreativeTabs.registerItemGroups();
    }
}

