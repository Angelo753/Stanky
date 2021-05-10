package cz.angelo.stanky;

import cz.angelo.stanky.configurations.Config;
import cz.angelo.stanky.configurations.Data;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public final class Main extends JavaPlugin {

	public static Main instance;
	public static HashMap<UUID, HashMap<Location, Location>> selection = new HashMap<>();

	@Override
	public void onEnable() {
		instance = this;
		Config.load();
		Data.load();

	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
	}



}
