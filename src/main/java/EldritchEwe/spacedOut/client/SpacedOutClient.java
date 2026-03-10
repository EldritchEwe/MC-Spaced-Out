package EldritchEwe.spacedOut.client;

import EldritchEwe.spacedOut.blocks.SO_Blocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.text.Text;

public class SpacedOutClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        ItemTooltipCallback.EVENT.register((itemStack, tooltipContext, tooltipType, lines) -> {

            if ( itemStack.isOf ( SO_Blocks.COARSE_DUST.asItem() ))
            {
                lines.add( Text.translatable( "text.spacedout.example" ));
            }

        });
    }
}
