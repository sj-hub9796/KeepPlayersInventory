package net.sjhub.kpi;

import net.sjhub.kpi.command.SimpleCommand;
import net.sjhub.kpi.command.SimpleTabComplete;
import net.sjhub.kpi.listener.onPlayerDeath;
import org.bukkit.Bukkit;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class KPIMain extends JavaPlugin {

    private static KPIMain plugin;

    @Override
    public void onEnable() {
        plugin = this;
        this.saveDefaultConfig();
        PluginCommand command = this.getCommand("kpi");
        command.setExecutor(new SimpleCommand());
        command.setTabCompleter(new SimpleTabComplete());
        Bukkit.getPluginManager().registerEvents(new onPlayerDeath(), this);
    }

    @Override
    public void onDisable() {
        plugin = null;
    }

    public static KPIMain getInstance() {
        return plugin;
    }
}
