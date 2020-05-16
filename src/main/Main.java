package main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import commands.ClearChat;
import commands.Fly;
import commands.Gamemode;
import listeners.Allgemein;
import listeners.Join;
import listeners.Quit;

public class Main extends JavaPlugin {

	public static String pr = "�8[�6LOBBY�8] �7";
	public static String no = "�8[�6LOBBY�8] �cDazu hast du keine Rechte!";
	
	public void onEnable() {
		
		Bukkit.broadcastMessage("Das Plugin ist geladen!");
		
		getServer().getPluginCommand("gm").setExecutor(new Gamemode());
		getServer().getPluginCommand("fly").setExecutor(new Fly());
		getServer().getPluginCommand("cc").setExecutor(new ClearChat());
		
		getServer().getPluginManager().registerEvents(new Join(), this);
		getServer().getPluginManager().registerEvents(new Quit(), this);
		getServer().getPluginManager().registerEvents(new Allgemein(), this);
		
	}
	
}
