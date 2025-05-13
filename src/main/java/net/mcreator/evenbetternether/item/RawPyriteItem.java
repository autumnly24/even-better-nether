
package net.mcreator.evenbetternether.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawPyriteItem extends Item {
	public RawPyriteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
