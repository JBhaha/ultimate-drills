package com.jbhaha.xdxd.commands;

import com.jbhaha.xdxd.items.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PluginCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("giveNetheriteDrill")){
            player.getInventory().addItem(ItemManager.netheriteDrill);
        }

        if (cmd.getName().equalsIgnoreCase("givearrow")){
            player.getInventory().addItem(ItemManager.arrow);
        }

        return true;
    }
}
