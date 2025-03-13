package net.sjhub.kpi.command;

import net.sjhub.kpi.KPIMain;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SimpleCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length == 0) {
            return false;
        }

        if (strings[0].equals("reload")) {
            KPIMain.getInstance().reloadConfig();
            commandSender.sendMessage("[KPI] Reload Complete!");
            return true;
        }
        return false;
    }
}
