
package net.mcreator.evenbetternether.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.evenbetternether.init.EvenbetternetherModItems;

public class PyriteShovelItem extends ShovelItem {
	public PyriteShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 512;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 2.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EvenbetternetherModItems.PYRITE_INGOT.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}
}
