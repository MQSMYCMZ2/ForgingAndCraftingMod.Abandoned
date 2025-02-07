
package net.mqsmycmz.forgingandcrafting.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mqsmycmz.forgingandcrafting.procedures.IronStarUpgradeSwordDangGongJuChuXianZaiShouZhongShiProcedure;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModTabs;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModItems;

public class IronStarUpgradeSwordItem extends SwordItem {
	public IronStarUpgradeSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3080;
			}

			public float getSpeed() {
				return 25f;
			}

			public float getAttackDamageBonus() {
				return 13f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ForgingAndCraftingModItems.IRON_STAR.get()));
			}
		}, 3, 1f, new Item.Properties().tab(ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			IronStarUpgradeSwordDangGongJuChuXianZaiShouZhongShiProcedure.execute(entity);
	}
}
