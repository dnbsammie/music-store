package com.dnbsammie.models;

public enum Category {
    ACOUSTIC_GUITAR,
    ELECTRIC_GUITAR,
    CLASSICAL_GUITAR,
    BASS_GUITAR,
    DIGITAL_PIANO,
    KEYBOARD,
    SYNTHESIZER,
    DRUM_KIT,
    ELECTRONIC_DRUMS,
    PERCUSSION,
    WIND_INSTRUMENT,
    BRASS_INSTRUMENT,
    STRING_INSTRUMENT,
    AMPLIFIER,
    EFFECT_PEDAL,
    MICROPHONE,
    MIXER,
    SPEAKER,
    ACCESSORY,
    PARTS,
    STORE;

    @Override
    public String toString() {
        return name().toLowerCase().replace("_", " ");
    }
}
