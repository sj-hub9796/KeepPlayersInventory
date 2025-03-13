package net.sjhub.kpi.listener;

import net.sjhub.kpi.KPIMain;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.List;

public class onPlayerDeath implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void handle(PlayerDeathEvent event) {
        String playerName = event.getEntity().getName();
        List<String> players = KPIMain.getInstance().getConfig().getStringList("players");
        if (players.contains(playerName)) {
            event.setKeepInventory(true);
            event.setKeepLevel(true);
        }
    }
}
