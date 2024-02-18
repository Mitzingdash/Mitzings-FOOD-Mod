package food.food.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class FightPlan extends Item {
	
	public FightPlan() {
		super(new FabricItemSettings().food(new FoodComponent.Builder()
		.statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 15), 1)
		.statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 40), 1)
		.statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 60, 255), 0.25f)
		.statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 2), 1)
		.hunger(20)
		.saturationModifier(20)
		.alwaysEdible()
		.build()));
	}

}
