package hano.elytraheightlimit;

import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class ElytraHeightLimit extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new ElytraListener(this), this);

        Objects.requireNonNull(this.getCommand("elytraheightlimit")).setExecutor(new ReloadCommand(this));

        ConsoleCommandSender console = getServer().getConsoleSender();
        String version = this.getDescription().getVersion();
        String author = this.getDescription().getAuthors().isEmpty() ? "N/A" : this.getDescription().getAuthors().get(0);
        String pluginName = this.getDescription().getName();

        console.sendMessage(ChatColor.YELLOW + "========================================");
        console.sendMessage(ChatColor.WHITE + "  Plugin: " + ChatColor.AQUA + pluginName);
        console.sendMessage(ChatColor.WHITE + "  Status: " + ChatColor.GREEN + "Enabled " + ChatColor.DARK_GREEN + "✅");
        console.sendMessage(ChatColor.WHITE + "  Author: " + ChatColor.GOLD + author);
        console.sendMessage(ChatColor.WHITE + "  Version: " + ChatColor.GOLD + version);
        console.sendMessage(ChatColor.YELLOW + "========================================");
    }

    @Override
    public void onDisable() {
        ConsoleCommandSender console = getServer().getConsoleSender();
        String pluginName = this.getDescription().getName();

        console.sendMessage(ChatColor.YELLOW + "========================================");
        console.sendMessage(ChatColor.WHITE + "  Plugin: " + ChatColor.AQUA + pluginName);
        console.sendMessage(ChatColor.WHITE + "  Status: " + ChatColor.RED + "Disabled " + ChatColor.DARK_RED + "❌");
        console.sendMessage(ChatColor.YELLOW + "========================================");
    }
}