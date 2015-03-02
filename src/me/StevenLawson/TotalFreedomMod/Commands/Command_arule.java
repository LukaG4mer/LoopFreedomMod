package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "Rules for ALL ADMINS!", usage = "/<command>")
public class Command_arule extends TFM_Command
{

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        playerMsg(ChatColor.GOLD + "[1] Respect other admins and OPS.");
        playerMsg(ChatColor.GOLD + "[2] Don't smite admin period...");
        playerMsg(ChatColor.RED + "[3] Admins will and can tp to any Admins or OP!");
        playerMsg(ChatColor.GOLD + "[4] Be kind to other admins!");
        playerMsg(ChatColor.GOLD + "[5] Don't say any thing bad about an admin! or OP");
        playerMsg(ChatColor.RED + "[6] DONT try to boss anyone around!");
        playerMsg(ChatColor.GOLD + "[7] Don't Gtfo, kick, ect with that admins permissions!");
        playerMsg(ChatColor.DARK_RED + "[8] Do NOT spam or abuse!");
        playerMsg(ChatColor.GOLD + "[9]Only Telnet or higher can Super Players");
        playerMsg(ChatColor.DARK_RED + "[10] Don't abuse");
        playerMsg(ChatColor.DARK_RED + "§1[11]§c DONT TELL WHAT THE DEVELOPERS WHAT TO DO!");
        playerMsg(ChatColor.DARK_RED + "Failier to follow these rules will result in Loopdoom!!");
            
            return true;
    }
}
