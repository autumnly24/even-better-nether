package net.mcreator.evenbetternether.init;

import org.checkerframework.checker.units.qual.m;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.common.loot.IGlobalLootModifier;

import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.evenbetternether.EvenbetternetherMod;

import java.util.function.Supplier;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;

import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.Codec;

import com.google.common.base.Suppliers;

@Mod.EventBusSubscriber(modid = EvenbetternetherMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EvenbetternetherModLootModifier {
	public static class EvenbetternetherModLootTableModifier extends LootModifier {
		public static final Supplier<Codec<EvenbetternetherModLootTableModifier>> CODEC = Suppliers
				.memoize(() -> RecordCodecBuilder.create(instance -> codecStart(instance).and(ResourceLocation.CODEC.fieldOf("lootTable").forGetter(m -> m.lootTable)).apply(instance, EvenbetternetherModLootTableModifier::new)));
		private final ResourceLocation lootTable;

		public EvenbetternetherModLootTableModifier(LootItemCondition[] conditions, ResourceLocation lootTable) {
			super(conditions);
			this.lootTable = lootTable;
		}

		@Override
		protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
			context.getResolver().getLootTable(lootTable).getRandomItemsRaw(context, generatedLoot::add);
			return generatedLoot;
		}

		@Override
		public Codec<? extends IGlobalLootModifier> codec() {
			return CODEC.get();
		}
	}

	public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, "evenbetternether");
	public static final RegistryObject<Codec<EvenbetternetherModLootTableModifier>> LOOT_MODIFIER = LOOT_MODIFIERS.register("evenbetternether_loot_modifier", EvenbetternetherModLootTableModifier.CODEC);

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			LOOT_MODIFIERS.register(bus);
		});
	}
}
