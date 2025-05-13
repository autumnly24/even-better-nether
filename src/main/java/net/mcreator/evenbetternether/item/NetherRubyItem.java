
package net.mcreator.evenbetternether.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NetherRubyItem extends Item {
	public NetherRubyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
