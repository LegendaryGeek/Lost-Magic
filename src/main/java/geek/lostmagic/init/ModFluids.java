package geek.lostmagic.init;

import geek.lostmagic.LostMagic;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 *
 */
public final class ModFluids {

	/**
	 *
	 */
	private ModFluids() {
		//
	}

	/**
	 *
	 */
	public static final Fluid CloudResidue = new Fluid("CloudResidue",
			new ResourceLocation(LostMagic.MODID, "blocks/example_fluid_still"),
			new ResourceLocation(LostMagic.MODID, "blocks/example_fluid_flow"));

	/**
	 *
	 */
	public static void init() {
		CloudResidue.setDensity(1);
		CloudResidue.setViscosity(1);
		CloudResidue.setTemperature(1);
		CloudResidue.setLuminosity(1);
		CloudResidue.setUnlocalizedName(LostMagic.MODID + "." + "example_fluid");
		FluidRegistry.registerFluid(CloudResidue);
		FluidRegistry.addBucketForFluid(CloudResidue);
	}
}
