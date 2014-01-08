package org.pvpzone.shanko.effecttrails.effects;

import org.bukkit.Effect;
import org.bukkit.Location;

/**
 * Causes block breaks of sand under the player's feet
 * 
 * @author Jose Rivera
 * 
 */
public class RumbleEffect implements SpecialEffect {

	@Override
	public void playEffect(Location loc) {
		loc.getWorld().playEffect(loc.clone().add(1, -1, 0), Effect.STEP_SOUND,
				12);
		loc.getWorld().playEffect(loc.clone().add(-1, -1, 0),
				Effect.STEP_SOUND, 12);
		loc.getWorld().playEffect(loc.clone().add(0, -1, 1), Effect.STEP_SOUND,
				12);
		loc.getWorld().playEffect(loc.clone().add(0, -1, -1),
				Effect.STEP_SOUND, 12);

	}

}
