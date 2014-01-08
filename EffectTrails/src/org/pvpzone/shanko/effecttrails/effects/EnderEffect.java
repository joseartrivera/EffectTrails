package org.pvpzone.shanko.effecttrails.effects;

import org.bukkit.Effect;
import org.bukkit.Location;

/**
 * Surrounds player with Ender Signal
 * 
 * @author Jose Rivera
 * 
 */
public class EnderEffect implements SpecialEffect {
	@Override
	public void playEffect(Location loc) {
		loc.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);
	}
}
