package geek.lostmagic.caps;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.INBTSerializable;

/**
 * Example capability which applies the potion effect.
 * */
public interface IExampleCapability extends INBTSerializable<NBTTagCompound> {
	/** Tries to apply the potion */
	public void applyPotion(Potion potion, int duration, int amplifier);

	/** Gets current potion effect. */
	public PotionEffect getEffect();
}
