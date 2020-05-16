package commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import main.Main;

public class Gamemode implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String b, String[] args) {
		
		if(sender instanceof Player) {
			
			Player p = (Player) sender;
			if(p.hasPermission("lobby.gamemode")) {
				
				if(args.length == 1) {
					
					if(args[0].equalsIgnoreCase("1")) {
						
						p.setGameMode(GameMode.CREATIVE);
						p.sendMessage(Main.pr + "Du bist dun im GameMode §61");
					}
					if(args[0].equalsIgnoreCase("0")) {
						
						p.setGameMode(GameMode.SURVIVAL);
						p.sendMessage(Main.pr + "Du bist dun im GameMode §60");
						
					}
					if(args[0].equalsIgnoreCase("2")) {
						
						p.setGameMode(GameMode.ADVENTURE);
						p.sendMessage(Main.pr + "Du bist dun im GameMode §62");
						
					}
					if(args[0].equalsIgnoreCase("3")) {
						
						p.setGameMode(GameMode.SPECTATOR);
						p.sendMessage(Main.pr + "Du bist dun im GameMode §63");
						
					}
					
				} else {
					p.sendMessage("§cUsage: /gm [MODE]");
				}
				
			} else {
				
				p.sendMessage(Main.no);
				
			}
			
		}
		
		return false;
	}

}
