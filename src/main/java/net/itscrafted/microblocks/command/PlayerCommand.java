package net.itscrafted.microblocks.command;

import net.itscrafted.microblocks.Common;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static net.itscrafted.microblocks.Common.colorize;

public abstract class PlayerCommand extends Command {
    private Player player;

    public PlayerCommand(@NotNull final String name) {
        super(name);
        setPermission("You do not have permission.");
    }

    @Override
    public boolean execute(@NotNull final CommandSender sender, @NotNull final String commandLabel, @NotNull final String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage(colorize("&cYou must be in-game to use this command."));
            return false;
        }
        this.player = (Player) sender;
        run(player,args);
        return true;
    }

    abstract void run(Player player, String[] args);

    protected void tell(String message){
        Common.tell(player,message);
    }

    protected void tell(String... messages) {Common.tell(player,messages);}
}
