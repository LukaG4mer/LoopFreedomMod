package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.OP, source = SourceType.BOTH)
@CommandParameters(description = "Rules for players!", usage = "/<command>")
public class Command_rules extends TFM_Command
{

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        playerMsg(ChatColor.RED + "§1[1]§c Respect other admins and OPS.");
        playerMsg(ChatColor.RED + "§1[3]§c Greif and trooling is not allowed");
        playerMsg(ChatColor.RED + "§1[4]§c You cannot tp to admins, due to privacy");
        playerMsg(ChatColor.RED + "§1[5]§c Don't brag. Don't disrespect things about what they have.");
        playerMsg(ChatColor.RED + "§1[6]§c Be nice and report greifers");
        playerMsg(ChatColor.RED + "§1[7]§c Don't say any thing negitive about an admin! or OP");
        playerMsg(ChatColor.RED + "§1[8]§c Don't try to boss the founder or developers around! DONT try to boss anyone around!");
        playerMsg(ChatColor.RED + "§1[9]§c Don't ask for ranks period");
        playerMsg(ChatColor.DARK_RED + "§1[10]§c Do NOT spam or abuse!");
        playerMsg(ChatColor.DARK_RED + "Failier to follow these rules will result in suspension and bans");
            
            return true;
    }
}
