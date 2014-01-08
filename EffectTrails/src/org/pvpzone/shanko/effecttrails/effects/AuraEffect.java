package org.pvpzone.shanko.effecttrails.effects;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ExperienceOrb;

/**
 * Aura spark, surrounds the player in experienced orbs that are on fire
 * 
 * @author Jose Rivera
 * 
 */
public class AuraEffect implements SpecialEffect {

	@Override
	public void playEffect(Location loc) {
		ExperienceOrb a = (ExperienceOrb) loc.getWorld().spawnEntity(
				loc.clone().add(0, 0, 1), EntityType.EXPERIENCE_ORB);
		ExperienceOrb b = (ExperienceOrb) loc.getWorld().spawnEntity(
				loc.clone().add(1, 0, 0), EntityType.EXPERIENCE_ORB);
		ExperienceOrb c = (ExperienceOrb) loc.getWorld().spawnEntity(
				loc.clone().add(0, -0, -1), EntityType.EXPERIENCE_ORB);
		ExperienceOrb d = (ExperienceOrb) loc.getWorld().spawnEntity(
				loc.clone().add(-1, 0, 0), EntityType.EXPERIENCE_ORB);
		a.setFireTicks(15);
		a.setTicksLived(15);
		b.setFireTicks(15);
		b.setTicksLived(15);
		c.setFireTicks(15);
		c.setTicksLived(15);
		d.setFireTicks(15);
		d.setTicksLived(15);

	}

}
