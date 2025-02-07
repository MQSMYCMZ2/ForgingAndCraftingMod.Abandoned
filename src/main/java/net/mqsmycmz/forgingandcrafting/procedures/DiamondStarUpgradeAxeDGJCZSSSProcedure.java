package net.mqsmycmz.forgingandcrafting.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModItems;

public class DiamondStarUpgradeAxeDGJCZSSSProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ForgingAndCraftingModItems.DIAMOND_STAR_UPGRADE_AXE.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1000, 3));
		}
	}
}
