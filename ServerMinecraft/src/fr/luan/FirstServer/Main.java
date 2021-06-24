package fr.luan.FirstServer;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

import fr.luan.FirstServer.commands.CommandSpawn;
import fr.luan.FirstServer.events.ConnectionEvent;

public class Main extends JavaPlugin {
	
	public static Location spawn = new Location(Bukkit.getWorld("Wolrd") , 0, 65, 0);

	@Override
	public void onEnable() {
		getCommand("spawn").setExecutor(new CommandSpawn());
		getServer().getPluginManager().registerEvents(new ConnectionEvent(), this);
		System.out.println("The plugins start successfully !");
	}

	@Override
	public void onDisable() {
		System.out.println("Stop plugins");
	}
}
