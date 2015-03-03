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
        playerMsg(ChatColor.AQUA + "[1] Respect other admins and OPS.");
        playerMsg(ChatColor.AQUA + "[3] Greif and trolling is not allowed");
        playerMsg(ChatColor.AQUA + "[4] You cannot tp to admins, due to privacy");
        playerMsg(ChatColor.AQUA + "[5] Don't brag. Don't disrespect things about what they have.");
        playerMsg(ChatColor.AQUA + "[6] Be nice and report greifers");
        playerMsg(ChatColor.AQUA + "[7] Don't say any thing negitive about an admin! or OP");
        playerMsg(ChatColor.AQUA + "[8] Don't try to boss the founder or developers around! DONT try to boss anyone around!");
        playerMsg(ChatColor.AQUA + "[9] Don't ask for ranks period");
        playerMsg(ChatColor.AQUA + "[10] Do not nickname other players");
        playerMsg(ChatColor.AQUA + "[11] You can only advertise once");
        playerMsg(ChatColor.DARK_RED + "[12] Threating to DDOS will result in Hardcore PERM BAN");
        playerMsg(ChatColor.DARK_RED + "Do NOT spam or abuse!");
        playerMsg(ChatColor.DARK_RED + "Failier to follow these rules will result in suspension and bans");
            
            return true;
    }
}
