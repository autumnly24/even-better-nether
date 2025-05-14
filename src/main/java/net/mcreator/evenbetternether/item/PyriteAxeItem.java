
package net.mcreator.evenbetternether.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.evenbetternether.init.EvenbetternetherModItems;

public class PyriteAxeItem extends AxeItem {
	public PyriteAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 512;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 7f;
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
		}, 1, -3f, new Item.Properties());
	}
}
