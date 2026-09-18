package com.ionaru.currency;

import com.ionaru.currency.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Порт мода Currency (Ionaru) с Forge 1.7.10 на 1.12.2.
 * Оригинал: https://github.com/Ionaru/Currency
 */
@Mod(modid = Currency.MODID, name = Currency.NAME, version = Currency.VERSION,
     acceptedMinecraftVersions = "[1.12.2]")
public class Currency {

    public static final String MODID = "currency";
    public static final String NAME = "Currency";
    public static final String VERSION = "1.7.10 - 1.2 (ported to 1.12.2)";

    @SidedProxy(clientSide = "com.ionaru.currency.proxy.ClientProxy",
                serverSide = "com.ionaru.currency.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
}
