package net.itscrafted.microblocks;

import lombok.Getter;
import lombok.Setter;
import net.itscrafted.microblocks.command.GiveMBCommand;
import net.itscrafted.microblocks.command.MicroBlocksCommand;
import net.itscrafted.microblocks.command.SkullCommand;
import net.itscrafted.microblocks.util.Common;
import org.bukkit.plugin.java.JavaPlugin;

public class MicroBlocks extends JavaPlugin {
    @Setter
    @Getter
    private static MicroBlocks instance;

    @Override
    public void onEnable() {
        setInstance(this);
        saveDefaultConfig();

        Common.registerCommand(new MicroBlocksCommand());
        Common.registerCommand(new SkullCommand());
        Common.registerCommand(new GiveMBCommand());

        this.getLogger().info("The current plugin version is " + this.getDescription().getVersion() + ". Please use this" + " when sending reports of mismatched heads and such.");
    }

    @Override
    public void onDisable() {
        setInstance(null);
    }
}