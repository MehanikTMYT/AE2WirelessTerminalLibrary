# AE2WTLib — fleet build (AE Compendium jar module)

Upstream Mari023/AE2WirelessTerminalLibrary tag `26.1.1-beta` (16c325df, MIT; `main` is 26.3 now).
Fleet changes (originals in `.fleet-orig/`): gradle.properties → NeoForge 26.1.2.114, AE2 26.1.11-SNAPSHOT (our fork),
EMI 1.1.24-semi151a6c88 (SEMI), runtime item list EMI; `recipeviewer/JEIPlugin.java` removed (our AE2 has no JEI
integration). Build: `PRE="export TAG=26.1.1-beta.fleet" remote-build.sh run ae-stack/addons/AE2WTLib ... --m2-back --
build publishToMavenLocal` → `de.mari_023:ae2wtlib(_api):26.1.1-beta.fleet`.
