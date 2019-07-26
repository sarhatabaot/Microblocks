package net.itscrafted.microblocks.type;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author sarhatabaot
 */
public class Types {
    public static final Map<String, MicroBlocksType> BLOCK_MAP = new HashMap<>();
    public static final Map<String, MicroBlocksType> PLAYER_MAP = new HashMap<>();

    private static void add(String blockName, String playerName) {
        blockName = blockName.toLowerCase();
        MicroBlocksType mb = new MicroBlocksType(blockName, playerName, true);
        BLOCK_MAP.put(blockName, mb);
        PLAYER_MAP.put(playerName, mb);
    }

    private static void addTexture(String blockName, String texture){
        blockName = blockName.toLowerCase();
        //TODO: probs should load this from a file and not generate a randomUUID every time
        MicroBlocksType mb = new MicroBlocksType(blockName, UUID.randomUUID(), texture);
        BLOCK_MAP.put(blockName,mb);
    }

    static {
        add("apple", "MHF_Apple");
        add("arrowdown", "MHF_ArrowDown");
        add("arrowleft", "MHF_ArrowLeft");
        add("arrowright", "MHF_ArrowRight");
        add("arrowup", "MHF_ArrowUp");
        add("melon", "MHF_Melon");
        add("blaze", "MHF_Blaze");
        add("cactus", "MHF_Cactus");
        add("cake", "MHF_Cake");
        add("cavespider", "MHF_Cavespider");
        add("chest", "MHF_Chest");
        add("chicken", "MHF_Chicken");
        add("cow", "MHF_Cow");
        add("enderman", "MHF_Enderman");
        add("exclamation", "MHF_Exclamation");
        add("golem", "MHF_Golem");
        add("herobrine", "MHF_Herobrine");
        add("lavaslime", "MHF_LavaSlime");
        add("pigzombie", "MHF_PigZombie");
        add("pig", "MHF_Pig");
        add("mushroomcow", "MHF_MushroomCow");
        add("pumpkin", "MHF_Pumpkin");
        add("question", "MHF_Question");
        add("villager", "MHF_Villager");
        add("ghast", "MHF_Ghast");
        add("sheep", "MHF_Sheep");
        add("slime", "MHF_Slime");
        add("oaklog", "MHF_OakLog");
        add("ocelot", "MHF_Ocelot");
        add("tnt2", "MHF_TNT2");
        add("tnt", "MHF_TNT");
        add("spider", "MHF_Spider");
        add("squid", "MHF_Squid");
        addTexture("enderchest","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzc0ZWUxNTQyYzQ1NjNmZDZlN2Q3MmRlMjZlNzM3Y2YxOGZiZDA0Y2NhYjFiOGIyODM1M2RhODczNDhlY2ZiIn19fQ==");
        addTexture("monitor", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzMzZGNmYjRkYTEwMTc3MjY0OTY4YjQ0OWU3MjRhZGViZWUzYmMzM2I3MmJhZTg1ODQyYjRhYWI5YmQ5YzRkYiJ9fX0=");
        addTexture("bookshelf", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTMxODRkNmFkNGEwZTE1YjNhNzFkYWRmNDVmNmM3Y2U5ZWM5NjE3MmJjOWZmMjVmZDNhZjc4N2EzNzliZDEifX19");
        addTexture("ice", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTI2NDQwNzFiNmM3YmJhZTdiNWU0NWQ5ZjgyZjk2ZmZiNWVlOGUxNzdhMjNiODI1YTQ0NjU2MDdmMWM5YyJ9fX0=");
        addTexture("furnace", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTk3MTNlMWNkYzIzZmRhZjM4NDA5NWMzYTNhZDY0YzY3MGQyOGFlOWVlZjkyZDEwZjFlYTA1NWE4NWQ5MGQ0OSJ9fX0=");
        addTexture("camera", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTQ0MjJhODJjODk5YTljMTQ1NDM4NGQzMmNjNTRjNGFlN2ExYzRkNzI0MzBlNmU0NDZkNTNiOGIzODVlMzMwIn19fQ==");
        addTexture("camera2", "goeyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzgyMDk1ODQ0OTgyOGZjODMxZDM2YzI2MzcyNDAxNTg4ZGE2MTk2ZjgzMTY0M2MzYTFkYTE3N2QxODZmMzJjIn19fQ==");
        addTexture("horse", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2JiNGIyODg5OTFlZmI4Y2EwNzQzYmVjY2VmMzEyNThiMzFkMzlmMjQ5NTFlZmIxYzljMThhNDE3YmE0OGY5In19fQ==");
        addTexture("cherry", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDUyNTcwNzY5NmJjZDE1YTE3MzA1NmZhMzkyOTZlODBmZjQxMTY4YmIwYWRkNTUyZjQ1MjNlMjU1OGEzMTE5In19fQ==");
        addTexture("clock", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODQ3N2RhZmM4YzllYTA3OTk2MzMzODE3OTM4NjZkMTQ2YzlhMzlmYWQ0YzY2ODRlNzExN2Q5N2U5YjZjMyJ9fX0=");
        addTexture("coconut", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjkxMzlhNWIxZjkxNjkzODM1ZTM0OTAzY2UzNGJlODZjOTI2ZTlhMWRmZmNiMzc3Y2M1ZWQ4ZjMzZDk5ODIxIn19fQ==");
        addTexture("companioncube", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTE3NWJkZjQ3YWVhMWE0YmYxZDM0OWJlNmI3ZmE0YWIzN2Y0Nzk2NzJmNGM0M2FjYTU3NTExYjQyN2FiNCJ9fX0=");
        addTexture("diamondblock", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTYzMTU5N2RjZTRlNDA1MWU4ZDVhNTQzNjQxOTY2YWI1NGZiZjI1YTBlZDYwNDdmMTFlNjE0MGQ4OGJmNDhmIn19fQ==");
        addTexture("diamondore", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTFlZDlhYmY1MWZlNGVhODRjZmNiMjcyOTdmMWJjNTRjZDM4MmVkZjg1ZTdiZDZlNzVlY2NhMmI4MDY2MTEifX19");
        addTexture("glowstone", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWVlZjEwNTZkMTE0OWY0OTNiMzFkYWM0NDFkYzNlOTY0YzdkYzU1ZDdjMzIzZmVjZDc4NWVlMjYyMGFiZWZlIn19fQ==");
        addTexture("beachball", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWE1YWIwNWVhMjU0YzMyZTNjNDhmM2ZkY2Y5ZmQ5ZDc3ZDNjYmEwNGU2YjVlYzJlNjhiM2NiZGNmYWMzZmQifX19");
        addTexture("dicewhite", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzk3OTU1NDYyZTRlNTc2NjY0NDk5YWM0YTFjNTcyZjYxNDNmMTlhZDJkNjE5NDc3NjE5OGY4ZDEzNmZkYjIifX19");
        addTexture("dicered", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTEzMWRlOGU5NTFmZGQ3YjlhM2QyMzlkN2NjM2FhM2U4NjU1YTMzNmI5OTliOWVkYmI0ZmIzMjljYmQ4NyJ9fX0=");
        addTexture("diceblack", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTE1ZjdjMzEzYmNhOWMyZjk1OGU2OGFiMTRhYjM5Mzg2N2Q2NzUwM2FmZmZmOGYyMGNiMTNmYmU5MTdmZDMxIn19fQ==");
        addTexture("dirt", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWFiNDNiOGMzZDM0ZjEyNWU1YTNmOGI5MmNkNDNkZmQxNGM2MjQwMmMzMzI5ODQ2MWQ0ZDRkN2NlMmQzYWVhIn19fQ==");
        addTexture("dispenser", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2MxMWEwZDkwYzM3ZWI2OTVjOGE1MjNkODYwMWFhMWM4NWZhZDA5YTRkMjIzMmQwNGVkMjNhYzkwZTQzMjVjMiJ9fX0=");
        addTexture("emeraldore", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGRhMjI0NmZjMTc2NTlkOTBlMmU4MjkxMGZjZjU3MGYyN2NjNDUyYjZjZjE5YzljZWFiNmJkZTE4MzQxM2Y4YyJ9fX0=");
        addTexture("enderdragon", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzRlY2MwNDA3ODVlNTQ2NjNlODU1ZWYwNDg2ZGE3MjE1NGQ2OWJiNGI3NDI0YjczODFjY2Y5NWIwOTVhIn19fQ==");
        addTexture("enderdragonstory","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzI3OWRjOTEzNzNiNDI3NzY5MDQzZmFlODg5Y2UyYWRkM2FlMzIxNjY0OTY1MzRhNGQ2YThhOGFhYTJkIn19fQ==");
        addTexture("grass", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODQ0OWI5MzE4ZTMzMTU4ZTY0YTQ2YWIwZGUxMjFjM2Q0MDAwMGUzMzMyYzE1NzQ5MzJiM2M4NDlkOGZhMGRjMiJ9fX0=");
        addTexture("haybale", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzY4ZmZkNGMzZDczZjMyZDM5ZWFkZTMxMDU1NjE1MGJhNDkwZTBkOTM0ZWM0YTY5MjNjOWViYmFiYmI5YzI0NiJ9fX0=");
        addTexture("haybaleside","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTgxYWE3MTI2NzY1NGM0YzE3ZjIzZGQ1NmY5ZjU1NDE3YzZlNjA1YjYwOTUxNTc4ODdmZGVmY2Q1OGJiZTMxNyJ9fX0=");
        addTexture("ironblock", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTI2Yjc3MjMyOWNmMzJmODY0M2M0OTI4NjI2YjZhMzI1MjMzZmY2MWFhOWM3NzI1ODczYTRiZDY2ZGIzZDY5MiJ9fX0=");
        addTexture("witch", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjBlMTNkMTg0NzRmYzk0ZWQ1NWFlYjcwNjk1NjZlNDY4N2Q3NzNkYWMxNmY0YzNmODcyMmZjOTViZjlmMmRmYSJ9fX0=");
        addTexture("jukebox", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTYyMGI4MmNmMTFlM2MxMzcxY2M1MWViOWUzMTJkZTcyYTZhNjI2NjQ0OTRlZDJjYjcxODFiMWJkZmJjOTI3OCJ9fX0=");
        addTexture("lampon", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2ViNGIzNDUxOWZlMTU4NDdkYmVhNzIyOTE3OWZlZWI2ZWE1NzcxMmQxNjVkY2M4ZmY2Yjc4NWJiNTg5MTFiMCJ9fX0=");
        addTexture("leaves", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTU1M2FkZTE4ZTViMWI5YTJlZDc5YTFkYmJkZDg2YTIzODViNDFmYWM4ZTZkYTkzYmIyNDMxNjk0MzI0OSJ9fX0=");
        addTexture("lemon", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDM3OGI1ODJkMTljY2M1NWIwMjNlYjgyZWRhMjcxYmFjNDc0NGZhMjAwNmNmNWUxOTAyNDZlMmI0ZDVkIn19fQ==");
        addTexture("lime", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2YyNGI3MTM1Nzg5ZmU3OTlkZjM0NTk0ZDY4MDVmNTExMmJlZTYyMzI2MDViYTZkZTIxNTE4NmFkOTQifX19");
        addTexture("machine", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWE3YjNiMTZlNWQwYzRjZmQyMWM0ZWI5MTMzZTk2OWFhZDdjYzczMDNjY2RmMzE3NTEyZTI2YTQ4NzliNTEifX19");
        addTexture("mossycobblestone", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGQ5MjM4ZWZjOTM0OTNiMTRhNTgyNjM5ZWIwYWE4ODM0ZWFhNDhlMTBiZDRjMjM0ZWIxYTRjMzYzYjQzZDViIn19fQ==");
        addTexture("muffin", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjIwYWI4ZGVmZjlkYzhkODQ1NzhmOWI0ZDY5YTYzZDVmMzg5NDlhMGUzZTlmMWU3Yzk0NzYxMDRkNmQ3MzZiNSJ9fX0=");
        addTexture("netherrack", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTU2Y2E1YzY3OTMzNmRkNGYzMjYyZjRmYmMyM2MxYTJlZTBkODJhN2ZkODFlNmU2MjMzN2U1ZmQ1YzcifX19");
        addTexture("missingtexture", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWM5MGNhNTA3M2M0OWI4OThhNmY4Y2RiYzcyZTZhY2EwYTQyNWVjODNiYzQzNTVlM2I4MzRmZDg1OTI4MmJkZCJ9fX0=");
        addTexture("oaklog2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTRhYWRhNGQ5ZmNlZGE5MDE4NjkxOGQ2Y2EzNWI5YTBlYWQ4ZTRiMTRjOWQ5NDI3MTU3ZWU5YjkzMzlkN2IxIn19fQ==");
        addTexture("obsidian", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzg0MGI4N2Q1MjI3MWQyYTc1NWRlZGM4Mjg3N2UwZWQzZGY2N2RjYzQyZWE0NzllYzE0NjE3NmIwMjc3OWE1In19fQ==");
        addTexture("orange", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWZkMGUzMzBhNjg4ZDhiYjk1MTliZWZlMWJmYzM0MzM3YjM3MWFjNzUxNTAyMTZmZGQwMzk1OWViN2I0NCJ9fX0=");
        addTexture("eyeofender", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGFhOGZjOGRlNjQxN2I0OGQ0OGM4MGI0NDNjZjUzMjZlM2Q5ZGE0ZGJlOWIyNWZjZDQ5NTQ5ZDk2MTY4ZmMwIn19fQ==");
        addTexture("piston", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTI3NDNhOGJlYTc1MmQ2ZGFmNjcyZGVhMzY3ZTFhNWQzOThhZWNiZTBjM2M4NDgzYTkwZWM5YWM0NDEyYTQxIn19fQ==");
        addTexture("podzol", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjcwN2JjODcyZTEzMmQ3NjRiYmVlMDhjYzA4NDAxNTUyOWNhZTU1ZmI5NzQ3NDcxYjllNTkzOTAzZmY5YWVlIn19fQ==");
        addTexture("popcorn", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWViZjRiZDhkMjE2OWYxMDI3MzhiZmUyYmY3Y2ZlZDY5NTc3YjdjZjY3MjFhZmI3YTYyNGE4NTcwM2JiZDRiIn19fQ==");
        addTexture("present", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmNlZjlhYTE0ZTg4NDc3M2VhYzEzNGE0ZWU4OTcyMDYzZjQ2NmRlNjc4MzYzY2Y3YjFhMjFhODViNyJ9fX0=");
        addTexture("pumpkinface", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjM2NGUwMjUyOWYzOGZiN2FmZTZkMDlkYTY0NmFjZWJiMGNiMDM4MzEzNThhOWQ4NjMwOWMzYTNmMWIyNzQ2YiJ9fX0=");
        addTexture("jackolantern","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2NlZDRiY2ZkMjExNjQ2NGRlZGYxNTdiZmM2MmRiMjZjOTU3YTlhNmFjOGJiYzUyNTYzNDY3MDg1YmUyMyJ9fX0=");
        addTexture("quartzblock", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTVlMmIyZWQyOThiNTNjYzg0NzgzY2Q3ODVlYzU3ZGE0OWNlYWFiZGNmZjMxYjI1ZmU1MjU2YjM0MjliNDEyIn19fQ==");
        addTexture("radio", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGMzYzg1MTc1MTZmOGQ4ZTgwNjc3ODFlN2M2MmVlYTI3ZGU0NzhiMTRjNGE2OGM4ZThjMWFkOGFmMWJhZTIxIn19fQ==");
        addTexture("redsand", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTNjYjU0NjRhYjliODUxYjlkNGFjOGI4Y2RiYjg2NWU3NGM1ODliMzQ4NWFiZWNlNTg5ZDQyOWQ4OTlhZWQifX19");
        addTexture("redstoneore", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTRkOTQzYTZlOWM3NTU2ODViOThiNGYxMmEyMjg3NjdlMGM2Zjk4MGRmYzFlYTI2NTBhOGEwNjcyNmM3ZDIyZiJ9fX0=");
        addTexture("rubikscube", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWFhZTdlODIyMmRkYmVlMTlkMTg0Yjk3ZTc5MDY3ODE0YjZiYTMxNDJhM2JkY2NlOGI5MzA5OWEzMTIifX19");
        addTexture("sand", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTMzOThhYjNjYjY5NmIzNDQzMGJlOTQ0YjE0YWZiZDIyN2ZkODdlOTkwMjZiY2ZjOGI3Mzg3YTg2MWJkZSJ9fX0=");
        addTexture("speaker", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWQzOTFiNWZkMzU5YmU1YjNhOTYwYmU1NTIzN2Y2NjM1ZWE1YmQzZDc3ODNiZjYwZGQ2NTVmMjExMGJiOTMifX19");
        addTexture("sponge", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjA3YThlZDJiZDIzMGZkNzliZjA3Y2VhMmMzOTIzNDAxNjZlNjA2YTg4NzE5MGQ1OThkNmU1YmM5YTYyYzZhNCJ9fX0=");
        addTexture("stickypiston", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2NhNGQyMThkZjlkMzJjZDQ3ZDljMWQyOTQ4NzcxMjJiZTU5MTliNDE4YTZjYzNkMDg5MTYyYjEzM2YyZGIifX19");
        addTexture("stone", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTU0ODE4MjMzYzgxMTg3M2U4NWY1YTRlYTQ0MjliNzVmMjNiNmFlMGVhNmY1ZmMwZjdiYjQyMGQ3YzQ3MSJ9fX0=");
        addTexture("taco", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWFkN2MwYTA0ZjE0ODVjN2EzZWYyNjFhNDhlZTgzYjJmMWFhNzAxYWIxMWYzZmM5MTFlMDM2NmE5Yjk3ZSJ9fX0=");
        addTexture("tv", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQxZTk5NzkyODlmMDMwOTlhN2M1ODdkNTJkNDg4ZTI2ZTdiYjE3YWI1OTRiNjlmOTI0MzhkNzdlYWJjIn19fQ==");
        addTexture("tv2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2Y0YjhjOWYzMzc4NjkxNTllZDMxYTcxYmQ1MDNiNzI1YjJlZTI2NGE2ZWIxMWU1OGU2NTdlMWE4YTk5YyJ9fX0=");
        addTexture("oakplanks", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTBmOTZkOWI3MjMwM2YzNzI3OWZhOWMyY2MyM2VlNmY4ZGI2ODIzNjg1YjYyNmI1NmVkNTNiNjc0YjZiMCJ9fX0=");
        addTexture("gamecube", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTI1NmY3ZmY1MmU3YmZkODE4N2I4M2RkMzRkZjM0NTAyOTUyYjhkYjlmYWZiNzI4OGViZWJiNmU3OGVmMTVmIn19fQ==");
        addTexture("redstoneblock", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmI3OGZhNWRlZmU3MmRlYmNkOWM3NmFiOWY0ZTExNDI1MDQ3OWJiOWI0NGY0Mjg4N2JiZjZmNzM4NjEyYiJ9fX0=");
        addTexture("troll", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGY3ZjQwYTg2YmVlOGUyMWE1NTM0MDg1NmE4NjIxYWNhNDk1NjczYWExN2JmZGUxOGQzYjdhYTYxYjQyYyJ9fX0=");
        addTexture("eye", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDU1NTYwODNjOWNkZTE5ZjU0YmY3OGE0MjFjYjk3MzFmNjBmMWQzZGUzY2Y1ODRmNTRiMmQ0MzY3N2RmMmE3In19fQ==");
        addTexture("parrot", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjBiZmE4NTBmNWRlNGIyOTgxY2NlNzhmNTJmYzJjYzdjZDdiNWM2MmNhZWZlZGRlYjljZjMxMWU4M2Q5MDk3In19fQ==");
        addTexture("pokeball", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWZlNDc2NDA4NDM3NDRjZDU3OTY5NzlkMTE5NmZiOTM4MzE3ZWM0MmIwOWZjY2IyYzU0NWVlNGM5MjVhYzJiZCJ9fX0=");
        addTexture("cookie", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjQxMTQ4NTcwYWQ5ZTEyMDQ0MjA1ZDYzMmE0MzcxNjNlZDFjZDhkMjljN2RjNWIyOTJiNmY1NDc4MjZhZjE2In19fQ==");
        addTexture("orangewool", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2JmNzc5N2EyNGE2YWY4NzVmNWM4MjcxYzViOGM0MjVlMTlmMzcyYTQxNWUwNTUyZmMyNDc3NjNmMjg1OWQxIn19fQ==");
        addTexture("stonebrick", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODhiNzY3YzhhMWVhOGU0MDRiM2NjYTg1MzQ5ZjY1M2I1N2IwYzNmNDY0MjdmYmVjZWFjY2YzNjAyYmMyOWUifX19");
        addTexture("chimney","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzA1OGVjNGQzOTIwYWRiZmE4NjU1MGY1ODUyNDIyZTFhZjU1MDU0YTE1YWZjOWMyYzkyMmQ1ODc2NWZhYTViIn19fQ==");
        addTexture("goldblock", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTRiZjg5M2ZjNmRlZmFkMjE4Zjc4MzZlZmVmYmU2MzZmMWMyY2MxYmI2NTBjODJmY2NkOTlmMmMxZWU2In19fQ==");
        addTexture("fox", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjRhMDM0NzQzNjQzNGViMTNkNTM3YjllYjZiNDViNmVmNGM1YTc4Zjg2ZTkxODYzZWY2MWQyYjhhNTNiODIifX19");
        addTexture("potato", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGJmYjZkNGE1NGMxN2UyNzQ4NDM3YWNjNzA5OGZiYjFhM2ExMmE0MDdmNTFiM2U0OTU0MjMzMjcxNDg0NmZkOCJ9fX0=");
        addTexture("leavesbarrel", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGUxN2Q5MzRiNDY1ZjUyNmE4Mzc2NmZhZmMwNGIyNzRkMmYxMTFhNDE2MThlMzY3OTcwNmJhODUxY2E4ZiJ9fX0=");
        addTexture("cobblestone", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGMxNzU0ODUxZTM2N2U4YmViYTJhNmQ4ZjdjMmZlZGU4N2FlNzkzYWM1NDZiMGYyOTlkNjczMjE1YjI5MyJ9fX0=");
        addTexture("water", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzRmY2JjMjU2ZDBiZTdlNjgzYWY4NGUzOGM0YmNkYjcxYWZiOTM5ODUzOGEyOWFhOTZjYmZhMzE4YjJlYSJ9fX0=");
        addTexture("noteblock", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGNlZWI3N2Q0ZDI1NzI0YTljYWYyYzdjZGYyZDg4Mzk5YjE0MTdjNmI5ZmY1MjEzNjU5YjY1M2JlNDM3NmUzIn19fQ==");
        addTexture("brick", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2UyNWJjNDJkNDExNDkxOThjOGM1MjNjMjM5MjA3MzdiOWNlZGRhOWE5OWVkYTUzZjMyMzJmNDg5NjQifX19");
        addTexture("penguin", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODkzZGNjMjNjZTNjYmE1MTU0ZjY3ZDNlMzc1OTllMWQ0YzRmOWI3M2M4Y2MwMGJmNmE1M2JiZjYyZGI4OWI0YiJ9fX0=");
        addTexture("spacehelm", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2U4YWFkNjczMTU3YzkyMzE3YTg4YjFmODZmNTI3MWYxY2Q3Mzk3ZDdmYzhlYzMyODFmNzMzZjc1MTYzNCJ9fX0=");
        addTexture("terminal", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWRjMWQzMGM2YTY1MTcxMjhkN2JiN2EyOWU3YWM3YWM1NmQxZmJlMjA3NmYzMDhkZmQ5Y2E1M2NmMmJmODdjNiJ9fX0=");
        addTexture("redexclamation", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTdmOWM2ZmVmMmFkOTZiM2E1NDY1NjQyYmE5NTQ2NzFiZTFjNDU0M2UyZTI1ZTU2YWVmMGE0N2Q1ZjFmIn19fQ==");
        addTexture("oslime", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzRhMzM0NjkwOTk0OGY0ZmM3MmI2N2Y1YTIzOWFjYTMyMTU1MDBkMDdjY2Q0Nzg4YTc3ZTg3NWEyMTM1NjViNiJ9fX0=");
        addTexture("gslime", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODk1YWVlYzZiODQyYWRhODY2OWY4NDZkNjViYzQ5NzYyNTk3ODI0YWI5NDRmMjJmNDViZjNiYmI5NDFhYmU2YyJ9fX0=");
        addTexture("bslime", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzI4NWNhYTJjM2NiOGExZWE4ZjJmN2UyZWNhZWU0NGFmYjIxYzYyMjExZGVhNmZkM2MxMzdiMjJiYjg2NzM0ZiJ9fX0=");
        addTexture("commandblock", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWY0YzIxZDE3YWQ2MzYzODdlYTNjNzM2YmZmNmFkZTg5NzMxN2UxMzc0Y2Q1ZDliMWMxNWU2ZTg5NTM0MzIifX19");
        addTexture("ironore", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTAxODQzZWM0M2YwODhjOTYzZmZjM2UyZjcxYzY2ZTMxNTU5NDNiMTc3YTFhMzU5ODJiMTIwZjZmNjQ4MjJiYyJ9fX0=");
        addTexture("redstonetorch", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzJiMGEyNzA5YWQyN2M1NzgzYmE3YWNiZGFlODc4N2QxNzY3M2YwODg4ZjFiNmQ0ZTI0ZWUxMzI5OGQ0In19fQ==");
        addTexture("portal", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBiZmMyNTc3ZjZlMjZjNmM2ZjczNjVjMmM0MDc2YmNjZWU2NTMxMjQ5ODkzODJjZTkzYmNhNGZjOWUzOWIifX19");
        addTexture("package", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDc3OWIyMWU1YmQ0OWExNzMwZWQ3NWI2YTBhZTljNGExYmFkYjQ4MjQ0ZGI3MjZjMzMzNjAyODE5NDU0NDI4ZSJ9fX0=");
        addTexture("bedrock", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzZkMWZhYmRmM2UzNDI2NzFiZDlmOTVmNjg3ZmUyNjNmNDM5ZGRjMmYxYzllYThmZjE1YjEzZjFlN2U0OGI5In19fQ==");
    }

}
