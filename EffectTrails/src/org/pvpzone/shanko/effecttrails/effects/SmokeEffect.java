package org.pvpzone.shanko.effecttrails.effects;

import org.bukkit.Effect;
import org.bukkit.Location;

/**
 * Surrounds player with smoke
 * 
 * @author Jose Rivera
 * 
 */
public class SmokeEffect implements SpecialEffect {

	@Override
	public void playEffect(Location loc) {
		loc.getWorld().playEffect(loc.clone().add(-1, 0, 0), Effect.SMOKE, 5);
		loc.getWorld().playEffect(loc.clone().add(1, 0, 0), Effect.SMOKE, 3);
		loc.getWorld().playEffect(loc.clone().add(0, 0, 1), Effect.SMOKE, 1);
		loc.getWorld().playEffect(loc.clone().add(0, 0, -1), Effect.SMOKE, 7);

	}

}
