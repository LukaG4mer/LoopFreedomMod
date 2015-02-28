package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "Donate to the server", usage = "/<command>")
public class Command_donate extends TFM_Command
{

	@Override
	public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole) {
        sender.sendMessage(ChatColor.AQUA + "WEBSITE: UNKNOWN");
        sender.sendMessage(ChatColor.RED + "We are still coding!!");
		return true;
	}

}
