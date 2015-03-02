package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.GameMode;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Power Tool For admins", usage = "/<command> [-f]", aliases = "pt")
public class Command_powertool extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender.sendMessage(ChatColor.GOLD + "Enabling Powertool");
        sender.sendMessage(ChatColor.GOLD + "Powertools suck so stop using them!");
        sender_p.setGameMode(GameMode.SURVIVAL);
        sender_p.getWorld().createExplosion(sender_p.getLocation().getBlockX(), sender_p.getLocation().getBlockY(), sender_p.getLocation().getBlockZ(), 0, false, false);
        if(args.length == 1)
        {
            Bukkit.dispatchCommand(sender_p, "fireball");
        }
        sender_p.setHealth(0);
        return true;
    }
}
