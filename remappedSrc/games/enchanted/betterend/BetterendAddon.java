package games.enchanted.betterend;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import games.enchanted.VerticalSlabsBetterend;
import games.enchanted.betterend.registry.ModFlammableBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class BetterendAddon {
    public static final Logger LOGGER = LogManager.getLogger("Enchanted Vertical Slabs - Betterend edition");

    public static void build() {
        
        // registers betterend slabs and their items
        BetterendBlocks.registerBlocks();
        BetterendItems.registerItems();

        // registers flammable blocks
        ModFlammableBlocks.registerFlammables();

        // Created item group for betterend stuff
        @SuppressWarnings("unused")
            final ItemGroup VERTICAL_SLABS_BETTEREND_GROUP = FabricItemGroupBuilder.create(
            new Identifier(VerticalSlabsBetterend.MOD_ID, "vertical_betterend_slabs"))
            // group icon
            .icon(() -> new ItemStack(BetterendBlocks.VERTICAL_END_LOTUS_SLAB))
            // items in the group
            .appendItems(stacks -> {

                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_AZURE_JADESTONE_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_AZURE_JADESTONE_BRICK_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_DRAGON_BONE_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_DRAGON_TREE_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_END_LOTUS_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_FLAVOLITE_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_FLAVOLITE_BRICK_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_HELIX_TREE_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_JELLYSHROOM_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_LACUSGROVE_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_LUCERNIA_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_MOSSY_GLOWSHROOM_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_NEON_CACTUS_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_PYTHADENDRON_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_SANDY_JADESTONE_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_SANDY_JADESTONE_BRICK_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_SMARAGDANT_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_SMARAGDANT_BRICK_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_SULPHURIC_ROCK_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_SULPHURIC_ROCK_BRICK_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_TENANEA_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_TERMINITE_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_THALLASIUM_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_UMBRALITH_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_UMBRELLA_TREE_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_UMBRALITH_BRICK_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_VIOLECITE_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_VIOLECITE_BRICK_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_VIRID_JADESTONE_SLAB));
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_VIRID_JADESTONE_BRICK_SLAB));

            }
        ).build();

    }
}
