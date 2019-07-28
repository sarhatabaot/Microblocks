package net.itscrafted.microblocks.util;

import io.github.thebusybiscuit.cscorelib2.skull.SkullItem;
import net.itscrafted.microblocks.type.MicroBlock;
import org.apache.commons.lang.StringUtils;
import org.bukkit.ChatColor;
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
        meta.setDisplayName(ChatColor.GOLD + "Microblock: " + ChatColor.WHITE + format(microBlock.getName()));
        meta.setLore(Collections.singletonList(ChatColor.GRAY + "Smaller than a block."));
        head.setItemMeta(meta);
        return head;
    }

    public static String format(String string){
        return StringUtils.capitalize(string.replace("_"," ").toLowerCase());
    }
}
