package net.itscrafted.microblocks.command;

import io.github.thebusybiscuit.cscorelib2.skull.SkullItem;
import net.itscrafted.microblocks.MicroBlocksType;
import net.itscrafted.microblocks.MicroBlocks;
import net.itscrafted.microblocks.Types;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.*;
import java.util.logging.Logger;

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

        this.blocks = Types.BLOCK_MAP.keySet().toArray(new String[0]);
        this.totalLength = this.blocks.length;
        Arrays.sort(this.blocks);
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

    private ItemStack mblock(String headName, String microblock) {
        ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta meta = (SkullMeta) playerHead.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Microblock: " + ChatColor.WHITE + microblock);
        meta.setOwningPlayer(Bukkit.getOfflinePlayer(headName));
        meta.setLore(Collections.singletonList(ChatColor.GRAY + "Smaller than a block."));
        playerHead.setItemMeta(meta);
        return playerHead;
    }


    private ItemStack mblock(UUID uuid, String microblock, String texture) {
        ItemStack head = SkullItem.fromBase64(uuid, texture);
        SkullMeta meta = (SkullMeta) head.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Microblock:" + ChatColor.WHITE + microblock);
        meta.setLore(Collections.singletonList(ChatColor.GRAY + "Smaller than a block."));
        head.setItemMeta(meta);
        return head;
    }

    public void addMB(Player p, String headName, boolean safe, String microblock) {
        if (MicroBlocks.getInstance().getConfig().getBoolean("safe-mode") && !safe) {
            tell("&6This is an &cunsafe head &6, you cannot use it.", "&6If you wish to use it, disable &c'safe-mode' &6in the config.");
        } else {
            p.getInventory().addItem(mblock(headName, microblock));
            tell("&6You have been given the &7" + microblock + " &6microblock.");
        }
    }


    public void addMB(Player p, UUID uuid, String microblock, String texture) {
        p.getInventory().addItem(mblock(uuid, microblock, texture));
        tell("&6You have been given the &7" + microblock + " &6microblock.");
    }

    private void helpCommand() {
        tell("&6Microblocks &7v" + MicroBlocks.getInstance().getDescription().getVersion() + "&6by&7" + MicroBlocks.getInstance().getDescription().getAuthors().toString() + "&6.",
                "&c/mb &14for a list of blocks.",
                "&c/mb <block> &14to spawn a microblock.",
                "&c/mb reload &14to reload the configuration.",
                "&c/skull <player/self> &14to spawn a skull",
                "&c/givemb <player> <microblock> &14to give Microblocks to others.");
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
                return;
            case "reload":
                reloadCommand();
                return;
            case "2":
                secondPage();
                return;
            default:
                if (Types.BLOCK_MAP.containsKey(args[0].toLowerCase())) {
                    MicroBlocksType mbt = Types.BLOCK_MAP.get(args[0].toLowerCase());
                    if (mbt.getPlayerName() == null) {
                        addMB(player,mbt.getUuid(),mbt.getBlockName(),mbt.getTexture());
                        return;
                    }
                    addBlockByName(mbt, player);
                } else {
                    tell("&cUnknown microblock!", "&cUse /mb for a list of microblocks.");
                }
        }
    }


    private void addBlockByName(MicroBlocksType mbt, Player player) {
        addMB(player, mbt.getPlayerName(), mbt.isSafe(), mbt.getBlockName());
        if (mbt.getBlockName().equalsIgnoreCase("parrot")) {
            tell("&6This microblock is &7diagonal&6.");
        }
    }

    @Override
    void run(final Player player, final String[] args) {
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

    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (command.getLabel().equalsIgnoreCase("microblocks")) {
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
        } else {
            return Collections.emptyList();
        }
    }
}
