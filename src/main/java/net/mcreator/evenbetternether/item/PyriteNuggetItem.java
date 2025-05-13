
package net.mcreator.evenbetternether.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PyriteNuggetItem extends Item {
	public PyriteNuggetItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
