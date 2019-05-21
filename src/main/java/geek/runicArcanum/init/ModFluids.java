package geek.runicArcanum.init;

import geek.runicArcanum.RunicArcanium;
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
	public static final Fluid CloudResidue = new Fluid("example_fluid",
			new ResourceLocation(RunicArcanium.MODID, "blocks/example_fluid_still"),
			new ResourceLocation(RunicArcanium.MODID, "blocks/example_fluid_flow"));

	/**
	 *
	 */
	public static void init() {
		CloudResidue.setDensity(1);
		CloudResidue.setViscosity(1);
		CloudResidue.setTemperature(1);
		CloudResidue.setLuminosity(1);
		CloudResidue.setUnlocalizedName(RunicArcanium.MODID + "." + "example_fluid");
		FluidRegistry.registerFluid(CloudResidue);
		FluidRegistry.addBucketForFluid(CloudResidue);
	}
}
