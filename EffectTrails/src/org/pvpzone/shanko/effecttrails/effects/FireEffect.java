package org.pvpzone.shanko.effecttrails.effects;

import org.bukkit.Effect;
import org.bukkit.Location;

/**
 * Surround player with flames
 * 
 * @author Jose Rivera
 * 
 */
public class FireEffect implements SpecialEffect {

	@Override
	public void playEffect(Location loc) {
		loc.getWorld().playEffect(loc, Effect.MOBSPAWNER_FLAMES, 0);
	}

}
