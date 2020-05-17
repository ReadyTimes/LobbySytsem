package listeners;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryInteract implements Listener {

	File file = new File("plugins//LobbySystem//spawn.yml");
	YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	
	@EventHandler
	public void onInventory(InventoryClickEvent e) {
		
		Player p = (Player) e.getWhoClicked();
		e.setCancelled(true);
		
		if(e.getInventory().getName().equals("§5Kompass")) {
			
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§cBedWars")) {
				
				double x = cfg.getDouble("lobby.bedwars.X");
				double y = cfg.getDouble("lobby.bedwars.Y");
				double z = cfg.getDouble("lobby.bedwars.Z");
				float yaw = (float) cfg.getDouble("lobby.bedwars.Yaw");
				float pitch = (float) cfg.getDouble("lobby.bedwars.Pitch");
				String world = cfg.getString("lobby.bedwars.World");
				
				World w = Bukkit.getWorld(world);
				
				Location loc = new Location(w, x, y, z, yaw, pitch);
				p.teleport(loc);
				
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§bSpawn")) {
				
				double x = cfg.getDouble("lobby.spawn.X");
				double y = cfg.getDouble("lobby.spawn.Y");
				double z = cfg.getDouble("lobby.spawn.Z");
				float yaw = (float) cfg.getDouble("lobby.spawn.Yaw");
				float pitch = (float) cfg.getDouble("lobby.spawn.Pitch");
				String world = cfg.getString("lobby.spawn.World");
				
				World w = Bukkit.getWorld(world);
				
				Location loc = new Location(w, x, y, z, yaw, pitch);
				p.teleport(loc);
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§bCityBuild")) {
	
				double x = cfg.getDouble("lobby.city.X");
				double y = cfg.getDouble("lobby.city.Y");
				double z = cfg.getDouble("lobby.city.Z");
				float yaw = (float) cfg.getDouble("lobby.city.Yaw");
				float pitch = (float) cfg.getDouble("lobby.city.Pitch");
				String world = cfg.getString("lobby.city.World");
	
				World w = Bukkit.getWorld(world);
	
				Location loc = new Location(w, x, y, z, yaw, pitch);
				p.teleport(loc);
}	
			
		}
		
	}
	
}
