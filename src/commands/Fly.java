package commands;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import main.Main;

public class Fly implements CommandExecutor {

	ArrayList<Player> fly = new ArrayList<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String b, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(p.hasPermission("lobby.fly")) {
				
				if(!fly.contains(p)) {
					p.setAllowFlight(true);
					p.setFlying(true);
					fly.add(p);
					p.sendMessage(Main.pr + "Du kannst nun fliegen!");
				} else {
					p.setAllowFlight(false);
					p.setFlying(false);
					fly.remove(p);
					p.sendMessage(Main.pr + "Du kannst nun nicht mehr fliegen!");
				}
				
			} else {
				p.sendMessage(Main.no);
			}
		}
		return false;
	}

}
