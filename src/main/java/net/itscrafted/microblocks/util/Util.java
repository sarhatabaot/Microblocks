package net.itscrafted.microblocks.util;

import io.github.thebusybiscuit.cscorelib2.skull.SkullItem;
import net.itscrafted.microblocks.MicroBlocks;
import net.itscrafted.microblocks.type.MicroBlock;
import net.itscrafted.microblocks.type.MicroBlocksType;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Collections;
import java.util.UUID;

/**
 * @author sarhatabaot
 */
public class Util {
    private Util() {
        throw new IllegalStateException("Util class");
    }

    public static void addMicroBlock(Player player, MicroBlock microBlock){
        player.getInventory().addItem(mblock(microBlock));
        Common.tell(player, "&6You have been given the &7" + format(microBlock.getName()) + " &6microblock.");
    }

    public static ItemStack mblock(MicroBlock microBlock) {
        ItemStack head = SkullItem.fromBase64(UUID.fromString(microBlock.getUuid()),microBlock.getTexture());
        SkullMeta meta = (SkullMeta) head.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Microblock:" + ChatColor.WHITE + format(microBlock.getName()));
        meta.setLore(Collections.singletonList(ChatColor.GRAY + "Smaller than a block."));
        head.setItemMeta(meta);
        return head;
    }

    @Deprecated
    public static void addMB(Player p, String headName, boolean safe, String microblock) {
        if (MicroBlocks.getInstance().getConfig().getBoolean("safe-mode") && !safe) {
            Common.tell(p, "&6This is an &cunsafe head &6, you cannot use it.", "&6If you wish to use it, disable &c'safe-mode' &6in the config.");
        } else {
            p.getInventory().addItem(mblock(headName, microblock));
            Common.tell(p, "&6You have been given the &7" + microblock + " &6microblock.");
        }
    }

    @Deprecated
    public static void addMB(Player p, UUID uuid, String microblock, String texture) {
        p.getInventory().addItem(mblock(uuid, microblock, texture));
        Common.tell(p, "&6You have been given the &7" + microblock + " &6microblock.");
    }

    @Deprecated
    public static ItemStack mblock(String headName, String microblock) {
        ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta meta = (SkullMeta) playerHead.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Microblock: " + ChatColor.WHITE + microblock);
        meta.setOwningPlayer(Bukkit.getOfflinePlayer(headName));
        meta.setLore(Collections.singletonList(ChatColor.GRAY + "Smaller than a block."));
        playerHead.setItemMeta(meta);
        return playerHead;
    }

    @Deprecated
    public static void addBlockByName(MicroBlocksType mbt, Player player) {
        Util.addMB(player, mbt.getPlayerName(), mbt.isSafe(), mbt.getBlockName());
        if (mbt.getBlockName().equalsIgnoreCase("parrot")) {
            Common.tell(player, "&6This microblock is &7diagonal&6.");
        }
    }


    @Deprecated
    public static ItemStack mblock(UUID uuid, String microblock, String texture) {
        ItemStack head = SkullItem.fromBase64(uuid, texture);
        SkullMeta meta = (SkullMeta) head.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Microblock:" + ChatColor.WHITE + microblock);
        meta.setLore(Collections.singletonList(ChatColor.GRAY + "Smaller than a block."));
        head.setItemMeta(meta);
        return head;
    }

    private static String format(String string){
        return StringUtils.capitalize(string.replace("_","").toLowerCase());
    }
}
