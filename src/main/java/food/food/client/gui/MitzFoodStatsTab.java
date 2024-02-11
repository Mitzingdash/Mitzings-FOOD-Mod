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
        final var header = new TLabelElement(5, 5, 100, 20, Text.literal("Currently Under Development!"));
        header.setTextScale(1.5f);
        header.setTextColor(0xffff00); //hexadecimal for yellow
        panel.addChild(header);
        
        final var extra = new TLabelElement(5, 30, 100, 20, Text.literal("Here.. Have a button"));
        extra.setTextColor(0xffffff); //hexadecimal for yellow
        panel.addChild(extra);
        
        final var button = new TButtonWidget(5, 50, 100, 20, Text.literal("Click me!"));
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