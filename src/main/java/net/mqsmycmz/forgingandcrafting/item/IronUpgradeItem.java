
package net.mqsmycmz.forgingandcrafting.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModTabs;

public class IronUpgradeItem extends Item {
	public IronUpgradeItem() {
		super(new Item.Properties().tab(ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING).stacksTo(16).rarity(Rarity.COMMON));
	}
}
