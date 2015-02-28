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
        playerMsg(ChatColor.GOLD + "§1[1]§c Respect other admins and OPS.");
        playerMsg(ChatColor.GOLD + "§1[3]§c Don't smite admin period I don't give a fuck if you dont fucking like them -_-.");
        playerMsg(ChatColor.RED + "§1[4]§c Admins CAN tp to any admin + OP!");
        playerMsg(ChatColor.GOLD + "§1[5]§c Don't brag. Don't disrespect things about what they have.");
        playerMsg(ChatColor.GOLD + "§1[6]§c Be nice to other admins!");
        playerMsg(ChatColor.GOLD + "§1[7]§c Don't say any thing negitive about an admin! or OP");
        playerMsg(ChatColor.GOLD + "§1[8]§c Don't try to boss the founder or developers around! DONT try to boss anyone around!");
        playerMsg(ChatColor.GOLD + "§1[9]§c Don't Gtfo, kick, ect with that admins permissions!");
        playerMsg(ChatColor.DARK_RED + "§1[10]§c Do NOT spam or abuse!");
        playerMsg(ChatColor.GOLD + "Only Telnet or higher can Super Players");
        playerMsg(ChatColor.GOLD + "A SrA can not reject an Sys-Admin!");
        playerMsg(ChatColor.DARK_RED + "Rules 3, and 9 do not apply to founders, owner, co-owner, dev, lead sys admin");
        playerMsg(ChatColor.DARK_RED + "§1[11]§c DONT TELL THE FOUNDER OR PLUGIN DEVS WHAT TO DO!");
        playerMsg(ChatColor.DARK_RED + "Failier to follow these rules will result in suspension!");
            
            return true;
    }
}
