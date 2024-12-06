package io.github.lucysaurusrex.promotional_music_discs;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class PMDSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, PMDMod.MOD_ID);
    public static final Supplier<SoundEvent> MUSIC_DISC_MINECRAFT_LIVE_2022 = registerSoundEvent("music_disc.minecraft_live_2022");
    public static final Supplier<SoundEvent> MUSIC_DISC_INFINITE_SPOOKY_AMETHYST = registerSoundEvent("music_disc.infinite_spooky_amethyst");
    public static final Supplier<SoundEvent> MUSIC_DISC_CREAKSTEP = registerSoundEvent("music_disc.creakstep");

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(PMDMod.MOD_ID, name);
        return PMDSoundEvents.SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(location));
    }
}
