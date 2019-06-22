package geek.lostmagic.init;

import geek.lostmagic.LostMagic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 *
 */
@GameRegistry.ObjectHolder(LostMagic.MODID)
public final class ModBlocks {

	/**
	 *
	 */
	private ModBlocks() {
		//
	}

	/**
	 *
	 */
    public static final Block TauryxOre = new Block(Material.ROCK);
    public static final Block FrostCrystal = new Block(Material.ICE);
    public static final Block FrostMetal = new Block(Material.IRON);
    public static final Block VoidMetal = new Block(Material.IRON);
    
    

	/**
	 *
	 */
	public static final Block CloudResidue = null;
}
