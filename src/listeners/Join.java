package listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import main.Main;
import main.Manager;

public class Join implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		
		if(p.hasPermission("lobby.team")) {
			
			e.setJoinMessage(Main.pr + "§6" + p.getName() + " §7hat den Server betreten!");
			
		} else {
		
		e.setJoinMessage(null);
		
		}
		
		p.getInventory().clear();
		
		Manager.getItems(p);
		
		
	}
	
}
