package net.itscrafted.microblocks.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;

import java.lang.reflect.Field;

/**
 * @author sarhatabaot
 */
public class Common {
    public static String colorize(String message){
        return ChatColor.translateAlternateColorCodes('&',message);
    }

    public static void tell(CommandSender toWhom, String message){
        toWhom.sendMessage(colorize(message));
    }

    public static void tell(CommandSender toWhom, String... messages){
        for (String message: messages)
            tell(toWhom,message);
    }

    public static void registerCommand(Command command) {
        try {
            final Field commandMapField = Bukkit.getServer().getClass().getDeclaredField("commandMap");
            commandMapField.setAccessible(true);

            final CommandMap commandMap = (CommandMap) commandMapField.get(Bukkit.getServer());
            commandMap.register(command.getLabel(), command);

        } catch(final Exception e) {
            e.printStackTrace();
        }
    }
}
