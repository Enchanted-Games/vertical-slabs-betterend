package games.enchanted.betterend.registry.types;

import games.enchanted.VerticalSlabsBetterend;
import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class BlockItemWithLore extends BlockItem {

    String blockNameString;

    public BlockItemWithLore(Block block, Settings settings, String blockString) {
        super(block, settings);
        blockNameString = blockString;
    }

    // override tooltip method and add description
    @Override
    public void appendTooltip(ItemStack itemStack, World world, java.util.List<net.minecraft.text.Text> tooltip, TooltipContext tooltipContext) {
    
        // grey tooltip
        tooltip.add( Text.translatable("block." + VerticalSlabsBetterend.MOD_ID + "." + blockNameString + ".lore").formatted(Formatting.GRAY) );

    }

}