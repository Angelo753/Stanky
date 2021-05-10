package cz.angelo.stanky.configurations;

import cz.angelo.stanky.Main;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Data {

	private static File file;
	private static FileConfiguration config;

	public static void load() {
		file = new File(Main.instance.getDataFolder(), "data.yml");
		if (!file.exists()){
			Main.instance.saveResource("data.yml", false);
		}
		config = new YamlConfiguration();
		try {
			config.load(file);
		} catch (IOException | InvalidConfigurationException e) {
			e.printStackTrace();
		}
	}

	public static FileConfiguration get() {
		return config;
	}

	public static void save() {
		try {
			config.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
