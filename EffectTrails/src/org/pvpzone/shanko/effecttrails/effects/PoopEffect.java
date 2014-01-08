package org.pvpzone.shanko.effecttrails.effects;

import org.bukkit.Effect;
import org.bukkit.Location;

/**
 * Plays blockbreak for dirt block
 * 
 * @author Jose Rivera
 * 
 */
public class PoopEffect implements SpecialEffect {

	@Override
	public void playEffect(Location loc) {
		loc.getWorld().playEffect(loc, Effect.STEP_SOUND, 3);

	}

}
