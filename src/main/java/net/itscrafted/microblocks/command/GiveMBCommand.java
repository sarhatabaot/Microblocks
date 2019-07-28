package net.itscrafted.microblocks.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.itscrafted.microblocks.type.MicroBlock;
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

    private void addMB(Player player, MicroBlock microBlock, int amount) {
        ItemStack block = Util.mblock(microBlock);
        block.setAmount(amount);
        player.getInventory().addItem(block);
        tell("&6You have been given the &7" + Util.format(microBlock.getName()) + " &6microblock.");
    }

    @Override
    public boolean execute(@NotNull final CommandSender sender, @NotNull final String commandLabel, @NotNull final String[] args) {
        this.sender = sender;
        if (args.length < 2 || args.length > 3)
            return false;

        Player receiver = Bukkit.getPlayerExact(args[0]);
        if (receiver == null || args[0].length() > 20) {
            tell("&c'" + args[0] + "' is not online or is an invalid player name");
            return true;
        }

        if (!MicroBlock.getBY_NAME().containsKey(args[1].toLowerCase())) {
            tell("&cUnknown microblock");
            tell("&cUse /mb for a list of microblocks");
            return true;
        }

        MicroBlock microBlock = MicroBlock.getMicroBlock(args[1].toLowerCase());

        try {
            addMB(receiver, microBlock, Integer.parseInt(args[2]));
            tell("&6You have given &7" + args[0] + "&6 " + args[2] + " &6of the &7" + args[1] + " &6microblock.");
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException exception) {
            addMB(receiver, microBlock, 1);
            tell("&6You have given &7" + args[0] + "&6 1 &6of the &7" + args[1] + " &6microblock.");
        }

        return true;

    }

    @Override
    public @NotNull List<String> tabComplete(@NotNull final CommandSender sender, @NotNull final String alias, @NotNull final String[] args) throws IllegalArgumentException {
        List<String> completions = new ArrayList<>();
        for (final Player player : Bukkit.getOnlinePlayers()) {
            if (player.getName().startsWith(args[0]))
                completions.add(player.getName());
        }
        if (args.length > 1) {
            for (final String key : MicroBlock.getBY_NAME().keySet()) {
                if (key.startsWith(args[1])) {
                    completions.add(key);
                }
            }
        }

        completions.sort(String.CASE_INSENSITIVE_ORDER);
        return completions;
    }

}