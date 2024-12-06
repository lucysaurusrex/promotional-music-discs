package io.github.lucysaurusrex.promotional_music_discs;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.JukeboxSong;

public class PMDJukeboxSongs {
    public static final ResourceKey<JukeboxSong> MINECRAFT_LIVE_2022 = createSong("minecraft_live_2022");
    public static final ResourceKey<JukeboxSong> INFINITE_SPOOKY_AMETHYST = createSong("infinite_spooky_amethyst");
    public static final ResourceKey<JukeboxSong> CREAKSTEP = createSong("creakstep");

    private static ResourceKey<JukeboxSong> createSong(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(PMDMod.MOD_ID, name));
    }
}
