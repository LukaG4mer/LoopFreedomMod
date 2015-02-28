package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "Admin Tools for admin", usage = "/<command>")
public class Command_admintools extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        PlayerInventory inv = sender_p.getInventory();
        ItemStack stick = new ItemStack(Material.STICK, 1);
        ItemStack wool = new ItemStack(Material.WOOL, 1);
        ItemStack axe = new ItemStack(Material.WOOD_AXE, 1);
        ItemStack potion = new ItemStack (Material.POTION, 1, (short) 8270);
        ItemStack bucket = new ItemStack(Material.MILK_BUCKET, 1);
        ItemStack compass = new ItemStack(Material.COMPASS, 1);
                inv.addItem(stick);
                inv.addItem(wool);
                inv.addItem(axe);
                inv.addItem(bucket);
                inv.addItem(potion);
                inv.addItem(compass);
                sender_p.sendMessage(ChatColor.RED + "Admin tools have been placed in your inventory.");
                return true;
            }
 }