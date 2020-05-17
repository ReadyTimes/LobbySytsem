package commands;

import java.io.File;
import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import main.Main;

public class Set implements CommandExecutor {

	File file = new File("plugins//LobbySystem//spawn.yml");
	YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String b, String[] args) {
		
		if(sender instanceof Player) {
			Player p = (Player)sender;
			if(p.hasPermission("lobby.set")) {
				
				cfg.set("lobby."+args[0]+".X", p.getLocation().getX());
				cfg.set("lobby."+args[0]+".Y", p.getLocation().getY());
				cfg.set("lobby."+args[0]+".Z", p.getLocation().getZ());
				cfg.set("lobby."+args[0]+".Yaw", p.getLocation().getYaw());
				cfg.set("lobby."+args[0]+".Pitch", p.getLocation().getPitch());
				cfg.set("lobby."+args[0]+".World", p.getLocation().getWorld().getName().toString());
				
				try {
					cfg.save(file);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				p.sendMessage(Main.pr + "Der Spawn für §6" + args[0] + " §7wurde erfolreich gesetzt!");
				
			} else {
				p.sendMessage(Main.no);
			}
			
		}
		
		return false;
	}

}
