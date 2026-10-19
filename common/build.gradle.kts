plugins {
    id("com.possible-triangle.common")
    id("conventions")
}

dependencies {
    modCompileOnly(libs.jei.common.api)
    modCompileOnly(libs.config.api.port.common)

    modCompileOnly(libs.registrate.neoforge)
    modCompileOnly(libs.multikulti.registrate.common)
    accessTransformers(libs.multikulti.core.common)
}
