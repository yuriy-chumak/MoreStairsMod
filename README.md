# MoreStairsMod
Simple Minecraft (1.11.2) mod with stairs

BUILD
-----

* Download [MinecraftForge](https://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.11.2.html) Mdk 13.20.1.2386
([direct url](https://adfoc.us/serve/sitelinks/?id=271228&url=https://files.minecraftforge.net/maven/net/minecraftforge/forge/1.11.2-13.20.1.2386/forge-1.11.2-13.20.1.2386-mdk.zip))

* Unpack it to repository root (except folder "src" with example mod)

1. Run
  * for Linux `./gradlew setupDecompWorkspace`
  * for Windows `gradlew.bat setupDecompWorkspace`

2. Run
  * for Linux `./gradlew build`
  * for Windows `gradlew.bat build`

3. Run
  * for Linux `./gradlew reobf`
  * for Windows `gradlew.bat reobf`

Repeat step 2 every time source code changed. Run step 3 before mod publishing.

TESTING
-------

* Run
  * for Linux `./gradlew runClient` (or `runServer`)
  * for Windows `gradlew.bat runClient` (or `RunServer`)

Thats all.