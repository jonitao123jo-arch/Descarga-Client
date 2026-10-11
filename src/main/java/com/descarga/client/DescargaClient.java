package com.descarga.client;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "descargaclient", name = "Descarga Client", version = "1.0")
public class DescargaClient {

    @Mod.Instance("descargaclient")
    public static DescargaClient instance;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Descarga Client inicializado com sucesso!");
    }
}
