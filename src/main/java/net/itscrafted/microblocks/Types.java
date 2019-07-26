package net.itscrafted.microblocks;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author sarhatabaot
 */
public class Types {
    public static final Map<String, MicroblockType> BLOCK_MAP = new HashMap<>();
    public static final Map<String, MicroblockType> PLAYER_MAP = new HashMap<>();

    private static void add(String blockName, String playerName, boolean safe) {
        blockName = blockName.toLowerCase();
        MicroblockType mb = new MicroblockType(blockName, playerName, safe);
        BLOCK_MAP.put(blockName, mb);
        PLAYER_MAP.put(playerName, mb);
    }

    private static void add(String blockName, String texture){
        blockName = blockName.toLowerCase();
        //probs should load this from a file and not generate a randomUUID every time
        MicroblockType mb = new MicroblockType(blockName, UUID.randomUUID(), texture);
        BLOCK_MAP.put(blockName,mb);
    }

    static {
        add("apple", "MHF_Apple", true);
        add("arrowdown", "MHF_ArrowDown", true);
        add("arrowleft", "MHF_ArrowLeft", true);
        add("arrowright", "MHF_ArrowRight", true);
        add("arrowup", "MHF_ArrowUp", true);
        add("melon", "MHF_Melon", true);
        add("blaze", "MHF_Blaze", true);
        add("cactus", "MHF_Cactus", true);
        add("cake", "MHF_Cake", true);
        add("cavespider", "MHF_Cavespider", true);
        add("chest", "MHF_Chest", true);
        add("chicken", "MHF_Chicken", true);
        add("cow", "MHF_Cow", true);
        add("enderman", "MHF_Enderman", true);
        add("exclamation", "MHF_Exclamation", true);
        add("golem", "MHF_Golem", true);
        add("herobrine", "MHF_Herobrine", true);
        add("lavaslime", "MHF_LavaSlime", true);
        add("pigzombie", "MHF_PigZombie", true);
        add("pig", "MHF_Pig", true);
        add("mushroomcow", "MHF_MushroomCow", true);
        add("pumpkin", "MHF_Pumpkin", true);
        add("question", "MHF_Question", true);
        add("villager", "MHF_Villager", true);
        add("ghast", "MHF_Ghast", true);
        add("sheep", "MHF_Sheep", true);
        add("slime", "MHF_Slime", true);
        add("oaklog", "MHF_OakLog", true);
        add("ocelot", "MHF_Ocelot", true);
        add("tnt2", "MHF_TNT2", true);
        add("tnt", "MHF_TNT", true);
        add("enderchest","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzc0ZWUxNTQyYzQ1NjNmZDZlN2Q3MmRlMjZlNzM3Y2YxOGZiZDA0Y2NhYjFiOGIyODM1M2RhODczNDhlY2ZiIn19fQ==");
        add("monitor", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzMzZGNmYjRkYTEwMTc3MjY0OTY4YjQ0OWU3MjRhZGViZWUzYmMzM2I3MmJhZTg1ODQyYjRhYWI5YmQ5YzRkYiJ9fX0=");
        add("bookshelf", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTMxODRkNmFkNGEwZTE1YjNhNzFkYWRmNDVmNmM3Y2U5ZWM5NjE3MmJjOWZmMjVmZDNhZjc4N2EzNzliZDEifX19");
        add("ice", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTI2NDQwNzFiNmM3YmJhZTdiNWU0NWQ5ZjgyZjk2ZmZiNWVlOGUxNzdhMjNiODI1YTQ0NjU2MDdmMWM5YyJ9fX0=");
        add("furnace", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTk3MTNlMWNkYzIzZmRhZjM4NDA5NWMzYTNhZDY0YzY3MGQyOGFlOWVlZjkyZDEwZjFlYTA1NWE4NWQ5MGQ0OSJ9fX0=");
        add("camera", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTQ0MjJhODJjODk5YTljMTQ1NDM4NGQzMmNjNTRjNGFlN2ExYzRkNzI0MzBlNmU0NDZkNTNiOGIzODVlMzMwIn19fQ==");
        add("camera2", "goeyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzgyMDk1ODQ0OTgyOGZjODMxZDM2YzI2MzcyNDAxNTg4ZGE2MTk2ZjgzMTY0M2MzYTFkYTE3N2QxODZmMzJjIn19fQ==");
        add("horse", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2JiNGIyODg5OTFlZmI4Y2EwNzQzYmVjY2VmMzEyNThiMzFkMzlmMjQ5NTFlZmIxYzljMThhNDE3YmE0OGY5In19fQ==");
        add("cherry", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDUyNTcwNzY5NmJjZDE1YTE3MzA1NmZhMzkyOTZlODBmZjQxMTY4YmIwYWRkNTUyZjQ1MjNlMjU1OGEzMTE5In19fQ==");
        add("clock", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODQ3N2RhZmM4YzllYTA3OTk2MzMzODE3OTM4NjZkMTQ2YzlhMzlmYWQ0YzY2ODRlNzExN2Q5N2U5YjZjMyJ9fX0=");
        add("coconut", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjkxMzlhNWIxZjkxNjkzODM1ZTM0OTAzY2UzNGJlODZjOTI2ZTlhMWRmZmNiMzc3Y2M1ZWQ4ZjMzZDk5ODIxIn19fQ==");
        add("companioncube", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTE3NWJkZjQ3YWVhMWE0YmYxZDM0OWJlNmI3ZmE0YWIzN2Y0Nzk2NzJmNGM0M2FjYTU3NTExYjQyN2FiNCJ9fX0=");
        add("diamondblock", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTYzMTU5N2RjZTRlNDA1MWU4ZDVhNTQzNjQxOTY2YWI1NGZiZjI1YTBlZDYwNDdmMTFlNjE0MGQ4OGJmNDhmIn19fQ==");
        add("diamondore", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTFlZDlhYmY1MWZlNGVhODRjZmNiMjcyOTdmMWJjNTRjZDM4MmVkZjg1ZTdiZDZlNzVlY2NhMmI4MDY2MTEifX19");
        add("glowstone", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWVlZjEwNTZkMTE0OWY0OTNiMzFkYWM0NDFkYzNlOTY0YzdkYzU1ZDdjMzIzZmVjZDc4NWVlMjYyMGFiZWZlIn19fQ==");
        add("beachball", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWE1YWIwNWVhMjU0YzMyZTNjNDhmM2ZkY2Y5ZmQ5ZDc3ZDNjYmEwNGU2YjVlYzJlNjhiM2NiZGNmYWMzZmQifX19");
        add("dicewhite", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzk3OTU1NDYyZTRlNTc2NjY0NDk5YWM0YTFjNTcyZjYxNDNmMTlhZDJkNjE5NDc3NjE5OGY4ZDEzNmZkYjIifX19");
        add("dicered", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTEzMWRlOGU5NTFmZGQ3YjlhM2QyMzlkN2NjM2FhM2U4NjU1YTMzNmI5OTliOWVkYmI0ZmIzMjljYmQ4NyJ9fX0=");
        add("diceblack", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTE1ZjdjMzEzYmNhOWMyZjk1OGU2OGFiMTRhYjM5Mzg2N2Q2NzUwM2FmZmZmOGYyMGNiMTNmYmU5MTdmZDMxIn19fQ==");
        add("dirt", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWFiNDNiOGMzZDM0ZjEyNWU1YTNmOGI5MmNkNDNkZmQxNGM2MjQwMmMzMzI5ODQ2MWQ0ZDRkN2NlMmQzYWVhIn19fQ==");
        add("dispenser", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2MxMWEwZDkwYzM3ZWI2OTVjOGE1MjNkODYwMWFhMWM4NWZhZDA5YTRkMjIzMmQwNGVkMjNhYzkwZTQzMjVjMiJ9fX0=");
        add("emeraldore", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGRhMjI0NmZjMTc2NTlkOTBlMmU4MjkxMGZjZjU3MGYyN2NjNDUyYjZjZjE5YzljZWFiNmJkZTE4MzQxM2Y4YyJ9fX0=");
        add("enderdragon", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzRlY2MwNDA3ODVlNTQ2NjNlODU1ZWYwNDg2ZGE3MjE1NGQ2OWJiNGI3NDI0YjczODFjY2Y5NWIwOTVhIn19fQ==", true);
        add("enderdragonstory","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzI3OWRjOTEzNzNiNDI3NzY5MDQzZmFlODg5Y2UyYWRkM2FlMzIxNjY0OTY1MzRhNGQ2YThhOGFhYTJkIn19fQ==");
        add("grass", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODQ0OWI5MzE4ZTMzMTU4ZTY0YTQ2YWIwZGUxMjFjM2Q0MDAwMGUzMzMyYzE1NzQ5MzJiM2M4NDlkOGZhMGRjMiJ9fX0=");
        add("haybale", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzY4ZmZkNGMzZDczZjMyZDM5ZWFkZTMxMDU1NjE1MGJhNDkwZTBkOTM0ZWM0YTY5MjNjOWViYmFiYmI5YzI0NiJ9fX0=");
        add("haybaleside","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTgxYWE3MTI2NzY1NGM0YzE3ZjIzZGQ1NmY5ZjU1NDE3YzZlNjA1YjYwOTUxNTc4ODdmZGVmY2Q1OGJiZTMxNyJ9fX0=");
        add("ironblock", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTI2Yjc3MjMyOWNmMzJmODY0M2M0OTI4NjI2YjZhMzI1MjMzZmY2MWFhOWM3NzI1ODczYTRiZDY2ZGIzZDY5MiJ9fX0=");
        add("witch", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjBlMTNkMTg0NzRmYzk0ZWQ1NWFlYjcwNjk1NjZlNDY4N2Q3NzNkYWMxNmY0YzNmODcyMmZjOTViZjlmMmRmYSJ9fX0=");
        add("jukebox", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTYyMGI4MmNmMTFlM2MxMzcxY2M1MWViOWUzMTJkZTcyYTZhNjI2NjQ0OTRlZDJjYjcxODFiMWJkZmJjOTI3OCJ9fX0=");
        add("lampon", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2ViNGIzNDUxOWZlMTU4NDdkYmVhNzIyOTE3OWZlZWI2ZWE1NzcxMmQxNjVkY2M4ZmY2Yjc4NWJiNTg5MTFiMCJ9fX0=");
        add("leaves", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTU1M2FkZTE4ZTViMWI5YTJlZDc5YTFkYmJkZDg2YTIzODViNDFmYWM4ZTZkYTkzYmIyNDMxNjk0MzI0OSJ9fX0=");
        add("lemon", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDM3OGI1ODJkMTljY2M1NWIwMjNlYjgyZWRhMjcxYmFjNDc0NGZhMjAwNmNmNWUxOTAyNDZlMmI0ZDVkIn19fQ==");
        add("lime", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2YyNGI3MTM1Nzg5ZmU3OTlkZjM0NTk0ZDY4MDVmNTExMmJlZTYyMzI2MDViYTZkZTIxNTE4NmFkOTQifX19");
        add("machine", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWE3YjNiMTZlNWQwYzRjZmQyMWM0ZWI5MTMzZTk2OWFhZDdjYzczMDNjY2RmMzE3NTEyZTI2YTQ4NzliNTEifX19");
        add("mossycobblestone", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGQ5MjM4ZWZjOTM0OTNiMTRhNTgyNjM5ZWIwYWE4ODM0ZWFhNDhlMTBiZDRjMjM0ZWIxYTRjMzYzYjQzZDViIn19fQ==");
        add("muffin", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjIwYWI4ZGVmZjlkYzhkODQ1NzhmOWI0ZDY5YTYzZDVmMzg5NDlhMGUzZTlmMWU3Yzk0NzYxMDRkNmQ3MzZiNSJ9fX0=");
        add("netherrack", "Numba_one_Stunna", false);
        add("notexture", "ddrl46", false);
        add("oaklog2", "MightyMega", false);
        add("obsidian", "loiwiol", false);
        add("orange", "hi1232", false);
        add("eyeofender", "Edna_I", true);
        add("piston", "JL2579", false);
        add("podzol", "PhasePvP", true);
        add("popcorn", "ZachWarnerHD", false);
        add("present", "I_Xenon_I", false);
        add("pumpkinface", "Koebasti", false);
        add("quartzblock", "bubbadawg01", true);
        add("radio", "uioz", true);
        add("redsand", "OmniSulfur", true);
        add("redstoneore", "annayirb", false);
        add("rubixcube", "iTactical17", false);
        add("sand", "rugofluk", false);
        add("speaker", "b1418", false);
        add("spider", "MHF_Spider", true);
        add("sponge", "pomi44", false);
        add("squid", "MHF_Squid", true);
        add("stickypiston", "Panda4994", false);
        add("stone", "Robbydeezle", false);
        add("taco", "Crunchy_Taco34", false);
        add("tv", "Metroidling", false);
        add("oakplanks", "terryxu", false);
        add("gamecube", "ReflectedNicK", false);
        add("redstoneblock", "AlexDr0ps", false);
        add("tv2", "nonesuchplace", false);
        add("troll", "Trollface20", false);
        add("eye", "Taizun", false);
        add("parrot", "Luk3011", false);
        add("pokeball", "Chuzard", false);
        add("cookie", "QuadratCookie", false);
        add("orangewool", "titou36", false);
        add("stonebrick", "Cakers", false);
        add("swskeleton", "lesto123", false);
        add("goldblock", "StackedGold", false);
        add("fox", "hugge75", false);
        add("potato", "CraftPotato13", false);
        add("leaves2", "half_bit", false);
        add("cobblestone", "_Rience", true);
        add("water", "emack0714", false);
        add("noteblock", "PixelJuke", false);
        add("brick", "BrickInTheHead", false);
        add("penguin", "Patty14", false);
        add("spacehelm", "Dctr_", false);
        add("terminal", "Hack", false);
        add("redexclamation", "jona612", false);
        add("oslime", "md_5", false);
        add("gslime", "nilaro", false);
        add("bslime", "Deathbeam", false);
        add("commandblock", "monkey354", true);
        add("ironore", "IronBrin", false);
        add("socialicons", "titigogo70", false);
        add("redstonetorch", "RedstoneMakerMe", false);
        add("portal", "TorchPvP", false);
        add("package", "ku228", false);
        add("bedrock", "BedrockSolid", true);
    }

}
