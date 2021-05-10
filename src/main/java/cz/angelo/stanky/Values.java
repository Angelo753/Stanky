package cz.angelo.stanky;

import cz.angelo.stanky.configurations.Config;

public interface Values {

	String wrongUsage = Config.get().getString("messages.wrongUsage");
	String noPerms = Config.get().getString("messages.noPerms");
	String toolName = Config.get().getString("messages.toolName");
	String fullInventory = Config.get().getString("messages.fullInventory");
	String giveTool = Config.get().getString("messages.giveTool");

}
