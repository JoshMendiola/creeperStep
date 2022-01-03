package me.PhilosophyWithJosh.creeperStep.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.block.*;
import org.bukkit.entity.EntityType;
import org.bukkit.Location;
import org.bukkit.Material;

import me.PhilosophyWithJosh.creeperStep.Main;

public class dirtListeners implements Listener
{
	private static Main plugin;
	public dirtListeners(Main plugin) 
	{
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	@EventHandler
	public void onMove(PlayerMoveEvent d)
	{
	Location location = d.getPlayer().getLocation().clone().subtract(0, 1, 0);
	Block b = location.getBlock();
		if(b.getType() == Material.DIRT || b.getType() == Material.GRASS)
		{
			location.getWorld().spawnEntity(location, EntityType.CREEPER);
		}
	}
}