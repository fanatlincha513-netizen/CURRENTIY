package com.ionaru.currency;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Соответствует ConfigurationLoader из 1.7.10: те же два переключателя
 * (enableAllRecipes, enableAllTooltips), категория "general", оба по умолчанию true.
 */
@Config(modid = Currency.MODID, name = "Currency", category = "general")
public class ModConfig {

    @Config.Comment("Whether recipes are enabled, default: true")
    public static boolean enableAllRecipes = true;

    @Config.Comment("Whether tooltips are enabled, default: true")
    public static boolean enableAllTooltips = true;

    @Mod.EventBusSubscriber(modid = Currency.MODID)
    public static class ConfigSync {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (Currency.MODID.equals(event.getModID())) {
                ConfigManager.sync(Currency.MODID, Config.Type.INSTANCE);
            }
        }
    }
}
