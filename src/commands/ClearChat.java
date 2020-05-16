package commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import main.Main;

public class ClearChat implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String b, String[] args) {
		Player p = (Player) sender;
		if(p.hasPermission("lobby.cc")) {
			for(Player all : Bukkit.getOnlinePlayers()) {
				if(!all.hasPermission("lobby.team")) {
					
					for(int i = 0; i < 105; i++) {
						p.sendMessage(" ");
					}
					
				}
				p.sendMessage(Main.pr + "Der Chat wurde von §6" + p.getName() + " §7geleert!");
			}
		} else {
			p.sendMessage(Main.no);
		}
		return false;
	}

}
