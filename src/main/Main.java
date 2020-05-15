package main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import listeners.Join;
import listeners.Quit;

public class Main extends JavaPlugin {

	public static String pr = "§8[§6LOBBY§8] §7";
	
	public void onEnable() {
		
		Bukkit.broadcastMessage("Das Plugin ist geladen!");
		
		getServer().getPluginManager().registerEvents(new Join(), this);
		getServer().getPluginManager().registerEvents(new Quit(), this);
		
	}
	
}
