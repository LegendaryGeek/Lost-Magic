package geek.runicArcanum.util;

import geek.runicArcanum.RunicArcanium;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 *
 */
@Mod.EventBusSubscriber(modid = RunicArcanium.MODID)
@Config(modid = RunicArcanium.MODID, category = "")
public final class ExampleModConfig {

	/**
	 *
	 */
	@Config.LangKey("stat.generalButton")
	public static final General GENERAL = new General();

	/**
	 *
	 */
	public static class General {

		/**
		 *
		 */
		@Config.Comment("Example Boolean")
		public boolean exampleBoolean = false;
	}

	/**
	 *
	 * @param event The Event.
	 */
	@SubscribeEvent
	public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.getModID().equals(RunicArcanium.MODID)) {
			ConfigManager.sync(RunicArcanium.MODID, Config.Type.INSTANCE);
		}
	}
}
