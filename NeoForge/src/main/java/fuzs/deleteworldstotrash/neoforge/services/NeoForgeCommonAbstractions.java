package fuzs.deleteworldstotrash.neoforge.services;

import fuzs.deleteworldstotrash.common.services.CommonAbstractions;

public final class NeoForgeCommonAbstractions implements CommonAbstractions {

    @Override
    public ModLoader getModLoader() {
        return ModLoader.NEOFORGE;
    }
}
