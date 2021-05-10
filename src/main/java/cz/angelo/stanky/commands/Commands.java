package cz.angelo.stanky.commands;

import cz.angelo.stanky.Utils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.UUID;

public class Commands extends Utils implements CommandExecutor {


	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage(ChatColor.RED + "Nejsi hrac.");
			return false;
		}
		Player player = (Player) sender;
		UUID uuid = player.getUniqueId();
		if (command.getName().equalsIgnoreCase("stanky")){
			if (args.length == 0){
				return false;
			}
			if (args.length == 1){
				//Check perms
				if (!hasPermission(player)){
					player.sendMessage(color(noPerms));
					return false;
				}
				if (args[0].equalsIgnoreCase("tool")){
					//Check full inventory
					if (player.getInventory().getSize() == -1){
						player.sendMessage(color(fullInventory));
						return false;
					}
					//Create tool item
					ItemStack item = new ItemStack(Material.GOLDEN_AXE);
					ItemMeta meta = item.getItemMeta();
					meta.setDisplayName(color(toolName));
					item.setItemMeta(meta);
					player.getInventory().addItem(item);
					player.sendMessage(color(giveTool));
					return false;
				}
				return false;
			}
		}
		return false;
	}

}
