package main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;


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
	
	public static void updateScore(Player p) {
		
		Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
		Objective obj = board.registerNewObjective("a", "dd");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		obj.setDisplayName("§cLobby-Pluing");
		
		obj.getScore("§2§lHerzlich Willkommen").setScore(20);
		obj.getScore(" → §7" + p.getName()).setScore(19);
		
		p.setScoreboard(board);
		
	}
	
}
