package geek.runicArcanum.events;

import geek.runicArcanum.RunicArcanium;
import geek.runicArcanum.fluid.FluidStateMapper;
import geek.runicArcanum.init.ModBlocks;
import geek.runicArcanum.init.ModFluids;
import geek.runicArcanum.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 *
 */
@Mod.EventBusSubscriber(value = Side.CLIENT, modid = RunicArcanium.MODID)
public final class ClientEventHandler {

	/**
	 *
	 */
	private ClientEventHandler() {
		//
	}

	/**
	 *
	 * @param event The Event.
	 */
	@SubscribeEvent
	public static void registerModels(final ModelRegistryEvent event) {
		registerModel(Item.getItemFromBlock(ModBlocks.TauryxOre));
		registerFluidRender(ModBlocks.CloudResidue, ModFluids.CloudResidue);
		registerModel(ModItems.EXAMPLE_ITEM);
	}

	/**
	 *
	 * @param item The Item.
	 */
	private static void registerModel(final Item item) {
		ModelLoader.setCustomModelResourceLocation(item,
				0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

	/**
	 *
	 * @param block The Block.
	 * @param fluid The Fluid.
	 */
	@SideOnly(Side.CLIENT)
	private static void registerFluidRender(final Block block, final Fluid fluid) {
		// final Block block = fluid.getBlock(); // Unfortunately this breaks when
		// another mod registered it's fluid before us.
		final Item item = Item.getItemFromBlock(block);
		final ResourceLocation resourceLocation = new ResourceLocation(RunicArcanium.MODID, fluid.getName());
		final FluidStateMapper mapper = new FluidStateMapper(
				resourceLocation.getNamespace() + ":" + fluid.getName());

		if (item != null) {
			ModelBakery.registerItemVariants(item);
			ModelLoader.setCustomMeshDefinition(item, mapper);
		}
		ModelLoader.setCustomStateMapper(block, mapper);
	}
}
