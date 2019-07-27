package net.itscrafted.microblocks.command;

import net.itscrafted.microblocks.*;
import net.itscrafted.microblocks.type.MicroBlock;
import net.itscrafted.microblocks.type.Types;
import net.itscrafted.microblocks.util.Util;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class MicroBlocksCommand extends PlayerCommand {
    private String[] blocks;
    private String[] secondPage;
    private int totalLength;

    public MicroBlocksCommand() {
        super("microblocks");
        setAliases(Arrays.asList("mb", "miniblocks", "micro"));
        setDescription("Spawn microblocks.");
        setPermission("mb.use");
        setUsage("Usage: /mb <block>");

        this.blocks = MicroBlock.getBY_NAME().keySet().toArray(new String[0]);
        this.totalLength = blocks.length;
        this.secondPage = Arrays.copyOfRange(this.blocks, this.totalLength / 2, this.totalLength);
        this.blocks = Arrays.copyOfRange(this.blocks, 0, this.totalLength / 2);
    }

    private static String arrayToString(String[] array) {
        if (array.length == 0) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            for (final String s : array) {
                sb.append(ChatColor.RED).append(", ").append(ChatColor.GOLD).append(s);
            }
            return sb.substring(4);
        }
    }

    private void helpCommand() {
        tell("&6Microblocks &7v" + MicroBlocks.getInstance().getDescription().getVersion() + " &6by&7 " + MicroBlocks.getInstance().getDescription().getAuthors().toString() + "&6.",
                "&c/mb &efor a list of blocks.",
                "&c/mb <block> &eto spawn a microblock.",
                "&c/mb reload &eto reload the configuration.",
                "&c/skull <player/self> &eto spawn a skull",
                "&c/givemb <player> <microblock> &eto give Microblocks to others.");
    }

    private void reloadCommand() {
        MicroBlocks.getInstance().reloadConfig();
        tell("&7Microblocks &6configuration reloaded.");
    }

    private void firstPage() {
        tell("&cMicroblocks (" + this.totalLength + "): " + arrayToString(this.blocks));
        tell("&cType /mb 2 for the next page.", "&cUsage: /mb <block>");
    }

    private void secondPage() {
        tell("",
                "&cMicroblock (Page Two): " + arrayToString(this.secondPage),
                "&cType /mb for the first page.",
                "&cUsage: /mb <block>");
    }

    private void subCommandSwitch(Player player, String[] args) {
        switch (args[0]) {
            case "about":
            case "help":
                helpCommand();
                break;
            case "reload":
                reloadCommand();
                break;
            case "2":
                secondPage();
                break;
            default:
                if (MicroBlock.getBY_NAME().containsKey(args[0])) {
                    MicroBlock microBlock = MicroBlock.getMicroBlock(args[0]);
                    Util.addMicroBlock(player,microBlock);
                    /*MicroBlocksType mbt = Types.BLOCK_MAP.get(args[0].toLowerCase());
                    if (mbt.getPlayerName() == null) {
                        Util.addMB(player,mbt.getUuid(),mbt.getBlockName(),mbt.getTexture());
                        break;
                    }
                    Util.addBlockByName(mbt, player); */
                } else {
                    tell("&cUnknown microblock!", "&cUse /mb for a list of microblocks.");
                }
        }
    }

    @Override
    protected void run(final Player player, final String[] args) {
        switch (args.length) {
            case 0:
                firstPage();
                break;
            case 1:
                subCommandSwitch(player, args);
                break;
            default:
                tell("&cToo many arguments!", "Use /mb for a list of microblocks");
        }
    }

    @Override
    @NotNull
    public List<String> tabComplete(@NotNull final CommandSender sender, @NotNull final String alias, @NotNull final String[] args) throws IllegalArgumentException {
        List<String> completions = new ArrayList<>();
        if ("2".startsWith(args[0])) {
            completions.add("2");
        }

        if ("reload".startsWith(args[0])) {
            completions.add("reload");
        }

        for (final String key : Types.BLOCK_MAP.keySet()) {
            if (key.startsWith(args[0])) {
                completions.add(key);
            }
        }

        completions.sort(String.CASE_INSENSITIVE_ORDER);
        return completions;
    }
}
