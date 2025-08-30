package hano.elytraheightlimit;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.jetbrains.annotations.NotNull;

public record ReloadCommand(ElytraHeightLimit plugin) implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        FileConfiguration config = plugin.getConfig();

        if (!sender.hasPermission("elytraheightlimit.admin")) {
            String noPermMessage = config.getString("messages.no-permission", "&cYou do not have permission to use this command.");
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', noPermMessage));
            return true;
        }

        if (args.length == 0 || (args.length == 1 && args[0].equalsIgnoreCase("reload"))) {
            plugin.reloadConfig();

            String successMessage = config.getString("messages.reload-success", "&aConfiguration reloaded successfully.");
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', successMessage));

            return true;
        }

        String usageMessage = config.getString("messages.invalid-usage", "&cInvalid usage. Use: /{label} reload");
        usageMessage = usageMessage.replace("{label}", label);
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', usageMessage));

        return true;
    }
}