
package net.mqsmycmz.forgingandcrafting.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mqsmycmz.forgingandcrafting.procedures.CopperSwordDangGongJuChuXianZaiShouZhongShiProcedure;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModTabs;

public class CopperSwordItem extends SwordItem {
	public CopperSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.COPPER_INGOT));
			}
		}, 3, 2f, new Item.Properties().tab(ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			CopperSwordDangGongJuChuXianZaiShouZhongShiProcedure.execute(entity);
	}
}
