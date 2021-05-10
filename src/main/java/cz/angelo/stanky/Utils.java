package cz.angelo.stanky;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Utils implements Values {

	public static boolean hasPermission(Player player){
		return player.hasPermission("*") || player.hasPermission("stanky.admin");
	}

	public static String color(String s){
		if (s == null || s.equals("")){
			return "";
		}
		return ChatColor.translateAlternateColorCodes('&', s);
	}


}
