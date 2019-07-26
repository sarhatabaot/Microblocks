package net.itscrafted.microblocks.command;

import java.util.Arrays;
import java.util.Collections;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class SkullCommand extends PlayerCommand {
    public SkullCommand() {
        super("skull");
        setPermission("mb.skull");
        setDescription("Spawn a player skull");
        setUsage("Usage: /skull <player/self>");
        setAliases(Arrays.asList("head","playerhead"));
    }

    private ItemStack mblock(String player) {
        ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta meta = (SkullMeta)playerHead.getItemMeta();

        if (!player.endsWith("s") && !player.endsWith("S")) {
            meta.setDisplayName(ChatColor.GOLD + player + ChatColor.WHITE + "'s Head");
        } else {
            meta.setDisplayName(ChatColor.GOLD + player + ChatColor.WHITE + "' Head");
        }

        meta.setOwningPlayer(Bukkit.getOfflinePlayer(player));
        meta.setLore(Collections.singletonList(ChatColor.GRAY + "Place it, break it, wear it as a hat!"));
        playerHead.setItemMeta(meta);
        return playerHead;
    }

    @Override
    protected void run(final Player player, final String[] args) {
        if (args.length != 1) {
            tell("&c"+getUsage());
        } else {
            if (args[0].equalsIgnoreCase("self")) {
                tell("&6You were given your own head.");
                player.getInventory().addItem(mblock(player.getName()));
            } else if (args[0].length() <= 20) {
                player.getInventory().addItem(mblock(args[0]));
                tell("&6You were given the head of &7"+args[0]+"&6.");
            } else {
                tell("&cName too long.");
                tell("&c"+getUsage());
            }
        }
    }

}
