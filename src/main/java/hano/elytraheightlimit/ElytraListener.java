package hano.elytraheightlimit;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public record ElytraListener(ElytraHeightLimit plugin) implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();

        if (player.hasPermission("elytraheightlimit.bypass")) {
            return;
        }

        if (!player.isGliding()) {
            return;
        }

        int heightLimit = plugin.getConfig().getInt("height-limit", 100);

        if (player.getLocation().getY() > heightLimit) {
            player.setGliding(false);

            String message = plugin.getConfig().getString("limit-message", "&cĐã đạt giới hạn độ cao!");

            Component actionBarMessage = LegacyComponentSerializer.legacyAmpersand().deserialize(message);

            player.sendActionBar(actionBarMessage);
        }
    }
}