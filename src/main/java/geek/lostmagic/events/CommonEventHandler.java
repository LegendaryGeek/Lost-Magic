package geek.lostmagic.events;

import geek.lostmagic.LostMagic;
import geek.lostmagic.block.TauryxOre;
import geek.lostmagic.init.ModBlocks;
import geek.lostmagic.init.ModFluids;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 *
 */
@Mod.EventBusSubscriber(value = {Side.CLIENT, Side.SERVER}, modid = LostMagic.MODID)
public final class CommonEventHandler {

	/**
	 *
	 */
	private CommonEventHandler() {
		//
	}

	/**
	 *
	 * @param event The Event.
	 */
	@SubscribeEvent
	public void onRemapBlock(final RegistryEvent.MissingMappings<Block> event) {
		for (final RegistryEvent.MissingMappings.Mapping<Block> mapping : event.getMappings()) {
			mapping.ignore();
		}
	}

	/**
	 *
	 * @param event The Event.
	 */
	@SubscribeEvent
	public void onRemapItem(final RegistryEvent.MissingMappings<Item> event) {
		for (final RegistryEvent.MissingMappings.Mapping<Item> mapping : event.getMappings()) {
			mapping.ignore();
		}
	}

	/**
	 *
	 * @param event The Event.
	 */
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().register(setupBlock(new TauryxOre(), "geostone"));
		event.getRegistry().register(setupBlock(
				new BlockFluidClassic(ModFluids.CloudResidue, Material.LAVA), "example_fluid"));
	}

	/**
	 *
	 * @param event The Event.
	 */
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(setupItemBlock(ModBlocks.TauryxOre));
		event.getRegistry().register(setupItemBlock(ModBlocks.CloudResidue));
		event.getRegistry().register(setupItem(new Item(), "example_item"));
	}

	/**
	 *
	 * @param event The Event.
	 */
	@SubscribeEvent
	public static void registerRecipes(final RegistryEvent.Register<IRecipe> event) {
		//
	}

	/**
	 *
	 * @param block The Block.
	 * @param name The Name.
	 * @return The Block
	 */
	private static Block setupBlock(final Block block, final String name) {
		block.setRegistryName(name);
		block.setTranslationKey(LostMagic.MODID + "." + name);

		return block;
	}

	/**
	 *
	 * @param block The Block.
	 * @return The ItemBlock.
	 */
	private static ItemBlock setupItemBlock(final Block block) {
		final ItemBlock itemBlock = new ItemBlock(block);
		final ResourceLocation name = block.getRegistryName();
		itemBlock.setRegistryName(name);

		return itemBlock;
	}

	/**
	 *
	 * @param item The Item.
	 * @param name The Name.
	 * @return The Item.
	 */
	private static Item setupItem(final Item item, final String name) {
		item.setRegistryName(name);
		item.setTranslationKey(LostMagic.MODID + "." + name);

		return item;
	}
}
