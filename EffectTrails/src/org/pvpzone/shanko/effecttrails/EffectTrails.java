package org.pvpzone.shanko.effecttrails;

import java.util.HashMap;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.pvpzone.shanko.effecttrails.effects.*;

/**
 * This is a plugin meant to provide particle trails for players to
 * activate/deactivate. It is meant for an extra cosmetic look for a player
 * 
 * @author Jose Rivera
 * 
 */
public final class EffectTrails extends JavaPlugin {
	public static EffectTrails effectTrails;
	private HashMap<Player, SpecialEffect> players = new HashMap<Player, SpecialEffect>();

	/**
	 * Setup the plugin when it's enabled
	 */
	@Override
	public void onEnable() {
		effectTrails = this;

		// register our listener
		getServer().getPluginManager().registerEvents(
				new EntityEffectPlayerListener(), this);

		// repeat this task to continue the effects for each player
		this.getServer().getScheduler()
				.scheduleSyncRepeatingTask(this, new Runnable() {
					@Override
					public void run() {
						for (Player p : players.keySet()) {
							players.get(p).playEffect(p.getLocation());
						}
					}
				}, 30L, 30L);
	}

	@Override
	public void onDisable() {
	}

	/**
	 * Handles commands sent to the plugin
	 */
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (!(sender instanceof Player)) {
			return false;
		}
		//Display the help information
		if (cmd.getName().equalsIgnoreCase("spark")) {
			sender.sendMessage("Effect Trails:\n" + "/smoke\n" + "/fire\n"
					+ "/ender\n" + "/aura\n" + "/blood\n" + "/poop\n"
					+ "/rumble\n" + "/sparkoff\n");
			return true;
		} 
		//Turn off a spark
		else if (cmd.getName().equalsIgnoreCase("sparkoff")) {
			if (players.containsKey((Player) sender)) {
				players.remove((Player) sender);
			}
			sender.sendMessage("Effect Removed");
			return true;
		} 
		//Activate fire spark
		else if (cmd.getName().equalsIgnoreCase("fire")) {
			sender.sendMessage("Fire Effect Activated!");
			if (players.containsKey(sender)) {
				players.remove(sender);
			}
			players.put((Player) sender, new FireEffect());
			return true;
		} 
		//Activate ender spark
		else if (cmd.getName().equalsIgnoreCase("ender")) {
			sender.sendMessage("Ender Effect Activated!");
			if (players.containsKey(sender)) {
				players.remove(sender);
			}
			players.put((Player) sender, new EnderEffect());
			return true;
		} 
		//Activate smoke spark
		else if (cmd.getName().equalsIgnoreCase("smoke")) {
			sender.sendMessage("Smoke Effect Activated!");
			if (players.containsKey(sender)) {
				players.remove(sender);
			}
			players.put((Player) sender, new SmokeEffect());
			return true;
		} 
		//Activate blood spark
		else if (cmd.getName().equalsIgnoreCase("blood")) {
			sender.sendMessage("Blood Effect Activated!");
			if (players.containsKey(sender)) {
				players.remove(sender);
			}
			players.put((Player) sender, new BloodEffect());
			return true;
		} 
		//Activate aura spark
		else if (cmd.getName().equalsIgnoreCase("aura")) {
			sender.sendMessage("Aura Effect Activated!");
			if (players.containsKey(sender)) {
				players.remove(sender);
			}
			players.put((Player) sender, new AuraEffect());
			return true;
		} 
		//Activate poop spark
		else if (cmd.getName().equalsIgnoreCase("poop")) {
			sender.sendMessage("Poop Effect Activated!");
			if (players.containsKey(sender)) {
				players.remove(sender);
			}
			players.put((Player) sender, new PoopEffect());
			return true;
		} 
		//Activate rumble spark
		else if (cmd.getName().equalsIgnoreCase("rumble")) {
			sender.sendMessage("Rumble Effect Activated!");
			if (players.containsKey(sender)) {
				players.remove(sender);
			}
			players.put((Player) sender, new RumbleEffect());
			return true;
		}
		return false;
	}

	/**
	 * Returns the hashmap containing the player and their spark
	 * @return
	 */
	public HashMap<Player, SpecialEffect> getPlayerMap() {
		return players;
	}

}