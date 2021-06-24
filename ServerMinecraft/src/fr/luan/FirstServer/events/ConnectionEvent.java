package fr.luan.FirstServer.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ConnectionEvent implements Listener {
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		e.setJoinMessage("Welcome, " + e.getPlayer().getName());
	}
	
	@EventHandler
	public void onDisconnection(PlayerQuitEvent e) {
		e.setQuitMessage("Goodbye, " + e.getPlayer().getName());
	}
}
