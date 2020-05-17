package main;

import java.lang.reflect.Field;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PlayerConnection;
import net.minecraft.server.v1_8_R3.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_8_R3.PacketPlayOutPlayerListHeaderFooter;


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
		Objective obj = board.registerNewObjective("a", "b");
		
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		obj.setDisplayName("§cLobby-Plugin");
		
		obj.getScore("§6§lHerzlich Willkommen").setScore(20);;
		obj.getScore(" → §7" + p.getName()).setScore(19);
		
		p.setScoreboard(board);
		
	}
	
	public static void updateTablist(Player p) {
		
		PlayerConnection con = ((CraftPlayer)p).getHandle().playerConnection;
		
		String header = "§cLobby-Plugin \n §7" + Bukkit.getOnlinePlayers().size() + "/20";
		String footer = "TeamSpeak: DeinTS.de";
		
		IChatBaseComponent th = ChatSerializer.a("{\"text\": \"" + header + "\"}");
		IChatBaseComponent tf = ChatSerializer.a("{\"text\": \"" + footer + "\"}");
		
		PacketPlayOutPlayerListHeaderFooter packet = new PacketPlayOutPlayerListHeaderFooter(th);
		
		try {
			Field f = packet.getClass().getDeclaredField("b");
			f.setAccessible(true);
			f.set(packet, tf);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		con.sendPacket(packet);
		
	}
	
	
}
