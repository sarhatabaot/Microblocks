package net.itscrafted.microblocks;

import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter
@ToString
public class MicroBlocksType {
    private String blockName;
    private String playerName;
    private boolean safe;

    private String texture;
    private UUID uuid;

    public MicroBlocksType(String blockName, String playerName, boolean safe) {
        this.blockName = blockName;
        this.playerName = playerName;
        this.safe = safe;
    }

    public MicroBlocksType(String blockName, UUID uuid, String texture) {
        this.blockName = blockName;
        this.uuid = uuid;
        this.texture = texture;
    }


}