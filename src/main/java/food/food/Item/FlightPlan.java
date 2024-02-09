package food.food.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class FlightPlan extends Item {

    public FlightPlan() {
        super(new FabricItemSettings().food(new FoodComponent.Builder()
                .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20, 20), 1)
                .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 200), 1)
                .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 60, 255), 0.25f)
                .hunger(20)
                .saturationModifier(20)
                .alwaysEdible()
                .build()));
    }
}
