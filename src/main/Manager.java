package main;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;;

public class Manager {

	public static void getItems(Player p) {
		
		ItemStack c = new ItemStack(Material.COMPASS);
		ItemMeta cm = c.getItemMeta();
		cm.setDisplayName("§5Kompass");
		c.setItemMeta(cm);
		
		ItemStack g = new ItemStack(Material.ENDER_CHEST);
		ItemMeta gm = g.getItemMeta();
		gm.setDisplayName("§bGadgets");
		g.setItemMeta(gm);
		
		ItemStack h = new ItemStack(Material.BLAZE_ROD);
		ItemMeta hm = h.getItemMeta();
		hm.setDisplayName("§6Player-Hider");
		h.setItemMeta(hm);
		
		p.getInventory().setItem(4, c);
		p.getInventory().setItem(2, h);
		p.getInventory().setItem(6, g);
		
	}
	
}
