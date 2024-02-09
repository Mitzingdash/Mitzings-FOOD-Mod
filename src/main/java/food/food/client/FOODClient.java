package food.food.client;

import food.food.client.gui.MitzFoodStatsTab;
import io.github.thecsdev.betterstats.api.client.registry.BSClientRegistries;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;

public final class FOODClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
    	//check if "Better Statistics Screen" is installed
        if(FabricLoader.getInstance().isModLoaded("betterstats"))
        {
            //if it is, use its API to register the stats tab
            BSClientRegistries.STATS_TAB.register(new Identifier("food", "mitz_food_stats"), new MitzFoodStatsTab());
        }
    }

}
