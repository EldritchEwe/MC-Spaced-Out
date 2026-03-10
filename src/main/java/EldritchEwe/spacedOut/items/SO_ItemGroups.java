package EldritchEwe.spacedOut.items;

import EldritchEwe.spacedOut.blocks.SO_Blocks;
import EldritchEwe.spacedOut.SpacedOut;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SO_ItemGroups
{
    public static final ItemGroup DESOLATEDUNES_TAB = Registry.register ( Registries.ITEM_GROUP,
        Identifier.of(SpacedOut.MOD_ID, "dunes"),
        FabricItemGroup.builder().icon(() -> new ItemStack(SO_Items.COARSE_DUST_CLUMP))
            .displayName(Text.translatable("itemGroup.spacedout.dunes"))
            .entries((displayContext, entries) ->
            {
                entries.add ( SO_Blocks. COARSE_DUST          );
                entries.add ( SO_Items.  COARSE_DUST_CLUMP    );
                entries.add ( SO_Blocks. SPECKLED_DUST        );
                entries.add ( SO_Items.  SPECKLED_DUST_CLUMP  );
                entries.add ( SO_Blocks. SILVERY_DUST         );
                entries.add ( SO_Items.  SILVERY_DUST_CLUMP   );
                entries.add ( SO_Blocks. COMPACTED_DUST       );
                entries.add ( SO_Items.  COMPACTED_DUST_CLUMP );

                entries.add ( SO_Blocks. ANCIENT_RUBBLE       );
                entries.add ( SO_Items.  ANCIENT_GEARS        );
                entries.add ( SO_Items.  ANCIENT_SHEET_METAL  );
                entries.add ( SO_Items.  ANCIENT_RATION_PACK  );
                entries.add ( SO_Items.  ANCIENT_WATER_PACK   );
    }).build());

    public static void registerItemGroups() {
        SpacedOut.LOGGER.info("Registering Item Groups for " + SpacedOut.MOD_ID);
    }
}
