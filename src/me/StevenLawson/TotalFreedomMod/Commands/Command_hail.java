package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "All Hail looperXD", usage = "/<command>")
public class Command_hail extends TFM_Command
{

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender_p.chat("All Hail looperXD");
        playerMsg("looperXD is the GOD", ChatColor.GRAY);
        playerMsg("Also he is the creator of CreativeFreedomMod + the Founder ;D", ChatColor.GOLD);
        return true;  
    }
}
