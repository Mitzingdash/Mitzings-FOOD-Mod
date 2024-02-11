package food.food;

import food.food.Item.EscapePlan;
import food.food.Item.FlightPlan;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FOOD implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("mitz_food");

    public static final Item ESCAPE_PLAN =
            Registry.register(Registries.ITEM, new Identifier("mitz_food", "food"),
                    new EscapePlan());

    public static final Item FLIGHT_PLAN =
            Registry.register(Registries.ITEM, new Identifier("mitz_food", "flight_plan"),
                    new FlightPlan());

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
    	
    	final var myStatId = new Identifier("mitz_food", "mitz_food_effects");
    	Registry.register(Registries.CUSTOM_STAT, myStatId, myStatId);
    	Stats.CUSTOM.getOrCreateStat(myStatId, StatFormatter.TIME);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
            content.add(ESCAPE_PLAN);
            content.add(FLIGHT_PLAN);
        });

        LOGGER.info("Main load done");
    }
}
