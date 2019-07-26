package net.itscrafted.microblocks.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import net.itscrafted.microblocks.Common;
import net.itscrafted.microblocks.MicroblockType;
import net.itscrafted.microblocks.MicroBlocks;
import net.itscrafted.microblocks.Types;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.jetbrains.annotations.NotNull;

public class GiveMBCommand extends Command {
    private CommandSender sender;

    public GiveMBCommand() {
        super("givemb");
        setDescription("Give another player a Microblock.");
        setAliases(Arrays.asList("gmb", "mbgive", "givemicroblock"));
        setPermission("mb.give");
        setUsage("Usage: /givemb <player> <microblock> [amount]");
    }

    private void tell(String message) {
        Common.tell(sender, message);
    }

    public ItemStack mblock(String nick, String microblock) {
        ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta meta = (SkullMeta) playerHead.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Microblock: " + ChatColor.WHITE + microblock);
        meta.setOwner(nick);
        meta.setLore(Collections.singletonList(ChatColor.GRAY + "Smaller than a block."));
        playerHead.setItemMeta(meta);
        return playerHead;
    }

    public void addMB(Player p, String headName, boolean safe, String microblock, int amount) {
        if (MicroBlocks.getInstance().getConfig().getBoolean("safe-mode") && !safe) {
            tell("&6This is an &cunsafe head &6, you cannot use it");
            tell("&6If you wish to use it, disable &c'safe-mode' &6in the config.");
        } else {
            ItemStack block = this.mblock(headName, microblock);
            block.setAmount(amount);
            p.getInventory().addItem(block);
            tell("&6You have been given the &7" + microblock + " &6microblock.");
        }

    }

    @Override
    public boolean execute(@NotNull final CommandSender sender, @NotNull final String commandLabel, @NotNull final String[] args) {
        this.sender = sender;
        switch (args.length) {
            //TODO: 2 & 3 are super similar (only difference is the amount and some messages)
            case 2:
                Player receiver = Bukkit.getPlayerExact(args[0]);
                if (receiver != null && args[0].length() < 20) {
                    if (Types.BLOCK_MAP.containsKey(args[1].toLowerCase())) {
                        MicroblockType mbt = Types.BLOCK_MAP.get(args[1].toLowerCase());
                        this.addMB(receiver, mbt.getPlayerName(), mbt.isSafe(), mbt.getBlockName(), 1);
                        if (mbt.getBlockName().equalsIgnoreCase("parrot")) {
                            Common.tell(receiver, "&6This microblock is &7diagonal &6.");
                        }

                        tell("&6You have given &7" + args[0] + " &6the &7" + args[1] + " &6microblock.");
                    } else {
                        tell("&cUnknown microblock");
                        tell("&cUse /mb for a list of microblocks");
                    }
                } else {
                    tell("&c'" + args[0] + "' is not online or is an invalid player name");
                }
                return true;
            case 3:
                receiver = Bukkit.getPlayerExact(args[0]);
                if (receiver != null && args[0].length() < 20) {
                    if (Types.BLOCK_MAP.containsKey(args[1].toLowerCase())) {
                        MicroblockType mbt = Types.BLOCK_MAP.get(args[1].toLowerCase());
                        try {
                            this.addMB(receiver, mbt.getPlayerName(), mbt.isSafe(), mbt.getBlockName(), Integer.parseInt(args[2]));
                            if (mbt.getBlockName().equalsIgnoreCase("parrot")) {
                                Common.tell(receiver, "&6This microblock is &7diagonal &6.");
                            }
                            tell("&6You have given &7" + args[0] +"&6 "+args[2]+ " &6of the &7" + args[1] + " &6microblock.");
                        } catch (NumberFormatException exception) {
                            tell("&c'"+args[2]+"' is not a valid number.");
                        }
                    } else {
                        tell("&cUnknown microblock");
                        tell("&cUse /mb for a list of microblocks");
                    }
                } else {
                    tell("&c'" + args[0] + "' is not online or is an invalid player name");
                }
                return true;
            default:
                return false;
        }
    }

    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (command.getLabel().equalsIgnoreCase("givemb") && sender.hasPermission("mb.give") && args.length == 2) {
            List<String> completions = new ArrayList<>();

            for (final String key : Types.BLOCK_MAP.keySet()) {
                if (key.startsWith(args[1])) {
                    completions.add(key);
                }
            }

            completions.sort(String.CASE_INSENSITIVE_ORDER);
            return completions;
        } else {
            return null;
        }
    }
}