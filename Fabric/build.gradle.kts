plugins {
    id("fuzs.multiloader.multiloader-convention-plugins-fabric")
}

dependencies {
    modLocalRuntime(sharedLibs.fabricapi.fabric)
}
