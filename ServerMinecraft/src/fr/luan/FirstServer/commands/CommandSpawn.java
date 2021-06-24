package fr.luan.FirstServer.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.luan.FirstServer.Main;

public class CommandSpawn implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player p;
		if (sender instanceof Player) {
			p = (Player)sender;
		} else
			return false;
		if (args.length == 0) {
			p.teleport(Main.spawn);
			return true;
		}
		p.sendMessage("No arguments needed.");
		return false;
	}

}
