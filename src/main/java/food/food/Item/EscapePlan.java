package food.food.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class EscapePlan extends Item {
    public EscapePlan() {
        super(new FabricItemSettings().food(new FoodComponent.Builder()
                .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 100), 1)
                .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 5), 1)
                .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 3), 1)
                .alwaysEdible()
                .hunger(20)
                .saturationModifier(20)
                .build()));


    }
}
