package net.itscrafted.microblocks.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.itscrafted.microblocks.*;
import net.itscrafted.microblocks.type.MicroBlocksType;
import net.itscrafted.microblocks.type.Types;
import net.itscrafted.microblocks.util.Common;
import net.itscrafted.microblocks.util.Util;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
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

    public void addMB(Player p, String headName, boolean safe, String microblock, int amount) {
        if (MicroBlocks.getInstance().getConfig().getBoolean("safe-mode") && !safe) {
            tell("&6This is an &cunsafe head &6, you cannot use it");
            tell("&6If you wish to use it, disable &c'safe-mode' &6in the config.");
        } else {
            ItemStack block = Util.mblock(headName, microblock);
            block.setAmount(amount);
            p.getInventory().addItem(block);
            tell("&6You have been given the &7" + microblock + " &6microblock.");
        }

    }

    @Override
    public boolean execute(@NotNull final CommandSender sender, @NotNull final String commandLabel, @NotNull final String[] args) {
        this.sender = sender;
        switch (args.length) {
            case 2:
            case 3:
                Player receiver = Bukkit.getPlayerExact(args[0]);
                if (receiver != null && args[0].length() < 20) {
                    if (Types.BLOCK_MAP.containsKey(args[1].toLowerCase())) {
                        MicroBlocksType mbt = Types.BLOCK_MAP.get(args[1].toLowerCase());
                        try {
                            this.addMB(receiver, mbt.getPlayerName(), mbt.isSafe(), mbt.getBlockName(), Integer.parseInt(args[2]));
                            if (mbt.getBlockName().equalsIgnoreCase("parrot")) {
                                Common.tell(receiver, "&6This microblock is &7diagonal &6.");
                            }
                            tell("&6You have given &7" + args[0] +"&6 "+args[2]+ " &6of the &7" + args[1] + " &6microblock.");
                        } catch (NumberFormatException|ArrayIndexOutOfBoundsException exception) {
                            this.addMB(receiver, mbt.getPlayerName(), mbt.isSafe(), mbt.getBlockName(), 1);
                            if (mbt.getBlockName().equalsIgnoreCase("parrot")) {
                                Common.tell(receiver, "&6This microblock is &7diagonal &6.");
                            }
                            tell("&6You have given &7" + args[0] +"&6 1 &6of the &7" + args[1] + " &6microblock.");
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

    @Override
    public @NotNull List<String> tabComplete(@NotNull final CommandSender sender, @NotNull final String alias, @NotNull final String[] args) throws IllegalArgumentException {
        List<String> completions = new ArrayList<>();
        for(final Player player: Bukkit.getOnlinePlayers()){
            if(player.getName().startsWith(args[0]))
                completions.add(player.getName());
        }
        if(args.length > 1) {
            for (final String key : Types.BLOCK_MAP.keySet()) {
                if (key.startsWith(args[1])) {
                    completions.add(key);
                }
            }
        }

        completions.sort(String.CASE_INSENSITIVE_ORDER);
        return completions;
    }

}