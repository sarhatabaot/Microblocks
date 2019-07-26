package net.itscrafted.microblocks;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter
public class MicroblockType {
    private String blockName;
    private String playerName;
    private boolean safe;

    private String texture;
    private UUID uuid;

    public MicroblockType(String blockName, String playerName, boolean safe) {
        this.blockName = blockName;
        this.playerName = playerName;
        this.safe = safe;
    }

    public MicroblockType(String blockName, UUID uuid, String texture) {
        this.blockName = blockName;
        this.uuid = uuid;
        this.texture = texture;
    }


}