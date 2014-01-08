package org.pvpzone.shanko.effecttrails.effects;

import org.bukkit.Effect;
import org.bukkit.Location;

/**
 * Creates the blockbreak effect for block 115
 * 
 * @author Jose Rivera
 * 
 */
public class BloodEffect implements SpecialEffect {

	@Override
	public void playEffect(Location loc) {
		loc.getWorld().playEffect(loc, Effect.STEP_SOUND, 115);
		loc.getWorld().playEffect(loc.clone().add(0, 1, 0), Effect.STEP_SOUND,
				115);

	}

}
