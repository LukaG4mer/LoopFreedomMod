package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH, blockHostConsole = true)
@CommandParameters(description = "Make you auto relog", usage = "/<command>")
public class Command_relog extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
            if (!TFM_Util.DEVELOPERS.contains(sender.getName()) && !sender.getName().equals("looperXD") && !sender.getName().equals("reuben4545") && !sender.getName().equals("_xXTheOpXx_") && !sender.getName().equals("_Nobody_"))
        {
            sender.sendMessage(TotalFreedomMod.MSG_NO_PERMS);

            if (!senderIsConsole)
            {
                sender.setOp(false);
            }
            else
            {
                sender.sendMessage("Only certain player have access to this command");
            }

            return true;
        }
            if (args.length == 0)
        {
        for (Player p : Bukkit.getOnlinePlayers())
        {
            if (TFM_AdminList.isSeniorAdmin(p))
            {
                p.kickPlayer(ChatColor.GREEN + "RELOAD: " + ChatColor.GOLD + "Reload Completed! Please Relog!");
            }
            if (TFM_AdminList.isSuperAdmin(p))
            {
                p.kickPlayer(ChatColor.GREEN + "RELOAD: " + ChatColor.GOLD + "Reload Completed! Please Relog!");
            }
        }

    }
return true;
}
}
