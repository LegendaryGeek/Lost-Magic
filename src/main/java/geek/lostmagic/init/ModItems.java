package geek.lostmagic.init;

import geek.lostmagic.LostMagic;
import geek.lostmagic.item.*;;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 *
 */
@GameRegistry.ObjectHolder(LostMagic.MODID)
public final class ModItems {

	/**
	 *
 	 */
	private ModItems() {
		//
	}

	/**
	 *
 	 */
	public static final Item TauryxGem = new Item();
	public static final Item WoodenVerdantStaff = new Item();
	public static final Item ResearchBook = new ResearchBook();
}
