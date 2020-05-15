package listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import main.Main;

public class Quit implements Listener {

	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		if (p.hasPermission("lobby.team")) {

			e.setQuitMessage(Main.pr + "§6" + p.getName() + " §7hat den Server verlassen!");

		} else {

			e.setQuitMessage(null);
		}
	}

}
