package fuzs.deleteworldstotrash.fabric.services;

import fuzs.deleteworldstotrash.common.services.CommonAbstractions;

public final class FabricCommonAbstractions implements CommonAbstractions {

    @Override
    public ModLoader getModLoader() {
        return ModLoader.FABRIC;
    }
}
