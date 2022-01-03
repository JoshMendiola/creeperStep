package me.PhilosophyWithJosh.creeperStep;

import org.bukkit.plugin.java.JavaPlugin;

import me.PhilosophyWithJosh.creeperStep.listeners.dirtListeners;

public class Main extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		new dirtListeners(this);
	}
}
