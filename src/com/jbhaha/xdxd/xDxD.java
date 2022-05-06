package com.jbhaha.xdxd;

import com.jbhaha.xdxd.commands.PluginCommands;
import com.jbhaha.xdxd.events.xDxDEvents;
import com.jbhaha.xdxd.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class xDxD extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new xDxDEvents(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[xDxD]: Plugin is enabled!");
        ItemManager.init();
        getCommand("giveNetheriteDrill").setExecutor(new PluginCommands());
        getCommand("givearrow").setExecutor(new PluginCommands());
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[xDxD]: Plugin is disabled!");
    }

}
