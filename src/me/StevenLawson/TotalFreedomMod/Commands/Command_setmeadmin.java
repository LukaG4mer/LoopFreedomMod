package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.GameMode;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Emergency Command for SuperAdmins that sets you admin.", usage = "/<command> [-f]", aliases = "adminme")
public class Command_setmeadmin extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        TFM_Util.adminAction(sender.getName(), "Adding " + sender.getName() + " to the superadmin list", true);
        TFM_Util.bcastMsg(ChatColor.RED + sender.getName() + " is a Dumb Fuck and will never get admin");
        sender.sendMessage(ChatColor.GOLD + "Just Kidding apply for adminship using /ai");
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
