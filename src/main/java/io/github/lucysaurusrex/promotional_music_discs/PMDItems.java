package io.github.lucysaurusrex.promotional_music_discs;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.JukeboxSongs;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class PMDItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PMDMod.MOD_ID);
    public static final DeferredItem<Item> MUSIC_DISC_CREAKSTEP = ITEMS.registerSimpleItem("music_disc_creakstep", new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(PMDJukeboxSongs.CREAKSTEP));
    public static final DeferredItem<Item> MUSIC_DISC_INFINITE_SPOOKY_AMETHYST = ITEMS.registerSimpleItem("music_disc_infinite_spooky_amethyst", new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(PMDJukeboxSongs.INFINITE_SPOOKY_AMETHYST));
    public static final DeferredItem<Item> MUSIC_DISC_MINECRAFT_LIVE_2022 = ITEMS.registerSimpleItem("music_disc_minecraft_live_2022", new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(PMDJukeboxSongs.MINECRAFT_LIVE_2022));
}
