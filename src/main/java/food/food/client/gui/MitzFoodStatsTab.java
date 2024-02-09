package food.food.client.gui;

import io.github.thecsdev.betterstats.api.client.gui.util.StatsTabUtils;
import io.github.thecsdev.betterstats.api.client.registry.StatsTab;
import io.github.thecsdev.tcdcommons.api.client.gui.other.TLabelElement;
import io.github.thecsdev.tcdcommons.api.client.gui.widget.TButtonWidget;
import net.minecraft.text.Text;

public class MitzFoodStatsTab extends StatsTab
{
    // ==================================================
    public @Override Text getName() { return Text.literal("Mitz Food Stats"); }
    // ==================================================
    public @Override void initStats(StatsInitContext initContext)
    {
        //obtain the GUI stats panel, and the user's current stats data
        final var panel = initContext.getStatsPanel();
        final var stats = initContext.getStatsProvider();
        
        //make some GUI here
        final var label = new TLabelElement(5, 5, 100, 20, Text.literal("Hello world!"));
        label.setTextColor(0xffff00); //hexadecimal for yellow
        panel.addChild(label);
        
        final var button = new TButtonWidget(5, 30, 100, 20, Text.literal("Click me!"));
        button.setOnClick(btn -> btn.setText(Text.literal("Nice! You clicked on me!")));
        panel.addChild(button);
    }
    // --------------------------------------------------
    public @Override void initFilters(FiltersInitContext initContext)
    {
        //adds default filters to the filters tab:
        StatsTabUtils.initDefaultFilters(initContext);
        
        //add custom filters here:
        //TODO
    }
    // ==================================================
}