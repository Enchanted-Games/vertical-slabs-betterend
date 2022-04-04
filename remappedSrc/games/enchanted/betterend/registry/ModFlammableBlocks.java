package games.enchanted.betterend.registry;

import games.enchanted.betterend.BetterendBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlocks {

    public static void registerFlammables(){
        // Flammable blocks
        int Encouragement = 5;
        int Flammability = 20;

        FlammableBlockRegistry.getDefaultInstance().add(BetterendBlocks.VERTICAL_DRAGON_TREE_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(BetterendBlocks.VERTICAL_LUCERNIA_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(BetterendBlocks.VERTICAL_MOSSY_GLOWSHROOM_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(BetterendBlocks.VERTICAL_PYTHADENDRON_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(BetterendBlocks.VERTICAL_TENANEA_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(BetterendBlocks.VERTICAL_END_LOTUS_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(BetterendBlocks.VERTICAL_HELIX_TREE_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(BetterendBlocks.VERTICAL_JELLYSHROOM_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(BetterendBlocks.VERTICAL_LACUSGROVE_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(BetterendBlocks.VERTICAL_UMBRELLA_TREE_SLAB, Encouragement, Flammability);
    }

}
