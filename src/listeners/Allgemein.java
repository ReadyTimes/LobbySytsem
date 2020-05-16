package listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

public class Allgemein implements Listener {

	@EventHandler
	public void onDamage(EntityDamageEvent e) {
		
		e.setCancelled(true);
		
	}
	
	@EventHandler
	public void onSpawn(EntitySpawnEvent e) {
		e.setCancelled(true);
	}
	
	@EventHandler
	public void onLeave(LeavesDecayEvent e) {
		
		e.setCancelled(true);
		
	}
	
	@EventHandler
	public void onFood(FoodLevelChangeEvent e) {
		
		e.setCancelled(true);
		
	}
	
	@EventHandler
	public void onInventory(InventoryClickEvent e) {
		
		e.setCancelled(true);
		
	}
	
	@EventHandler
	public void onDrop(PlayerDropItemEvent e) {
		
		e.setCancelled(true);
		
	}
	
}
