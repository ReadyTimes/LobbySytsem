package listeners;

import java.util.ArrayList;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Interact implements Listener {

	ArrayList<Player> hides = new ArrayList<>();
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK ) {
			
			if(p.getItemInHand().getItemMeta().getDisplayName().equals("§5Kompass")) {
				
				Inventory inv = Bukkit.createInventory(null, 27, "§5Kompass");
				
				ItemStack a = new ItemStack(Material.BED);
				ItemMeta am = a.getItemMeta();
				am.setDisplayName("§cBedWars");
				a.setItemMeta(am);
				
				ItemStack b = new ItemStack(Material.BEACON);
				ItemMeta bm = b.getItemMeta();
				bm.setDisplayName("§bSpawn");
				b.setItemMeta(bm);
				
				ItemStack c = new ItemStack(Material.IRON_AXE);
				ItemMeta cm = c.getItemMeta();
				cm.setDisplayName("§bCityBuild");
				c.setItemMeta(cm);
				
				inv.setItem(11, a);
				inv.setItem(13, b);
				inv.setItem(15, c);
				
				p.openInventory(inv);
				
			}
			
			
		}
		
	}
	
}
