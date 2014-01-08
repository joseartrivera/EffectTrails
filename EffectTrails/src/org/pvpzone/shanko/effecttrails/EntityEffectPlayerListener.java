package org.pvpzone.shanko.effecttrails;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * Listens for when a player quits to remove them from the spark list
 * @author Jose Rivera
 *
 */
public class EntityEffectPlayerListener implements Listener{
	@EventHandler
	public void onPlayerQuit(final PlayerQuitEvent event) {
		if (EffectTrails.effectTrails.getPlayerMap().containsKey(event.getPlayer())){
			EffectTrails.effectTrails.getPlayerMap().remove(event.getPlayer());
		}
	}
}
