package com.ionaru.currency.init;

import com.ionaru.currency.Currency;
import com.ionaru.currency.item.ItemMoney;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Регистрация всех 28 предметов-номиналов. Соответствует старому
 * ItemRegistrator.register(item, unlocalizedName, displayName) из 1.7.10:
 * там же выставлялись unlocalized name, креативная вкладка и имя из lang-файла
 * (LanguageRegistry.addName) — здесь это делает ItemMoney + lang/en_us.lang.
 */
@Mod.EventBusSubscriber(modid = Currency.MODID)
public class ModRegistry {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new ItemMoney("penny", "0.01 Credits"),
                new ItemMoney("double_penny", "0.02 Credits"),
                new ItemMoney("nickel", "0.05 Credits"),
                new ItemMoney("dime", "0.10 Credits"),
                new ItemMoney("quarter", "0.25 Credits"),
                new ItemMoney("half_credit", "0.50 Credits"),
                new ItemMoney("credit", "1 Credit"),
                new ItemMoney("double_credit", "2 Credits"),
                new ItemMoney("credit_bill_5", "5 Credits"),
                new ItemMoney("credit_bill_10", "10 Credits"),
                new ItemMoney("credit_bill_25", "25 Credits"),
                new ItemMoney("credit_bill_50", "50 Credits"),
                new ItemMoney("credit_bill_100", "100 Credits"),
                new ItemMoney("credit_bill_200", "200 Credits"),
                new ItemMoney("credit_bill_500", "500 Credits"),
                new ItemMoney("iron_card", "1.000 Credits"),
                new ItemMoney("steel_card", "5.000 Credits"),
                new ItemMoney("bronze_card", "10.000 Credits"),
                new ItemMoney("silver_card", "50.000 Credits"),
                new ItemMoney("gold_card", "100.000 Credits"),
                new ItemMoney("platinum_card", "500.000 Credits"),
                new ItemMoney("diamond_card", "1.000.000 Credits"),
                new ItemMoney("osmium_card", "5.000.000 Credits"),
                new ItemMoney("tungsten_card", "10.000.000 Credits"),
                new ItemMoney("mithril_card", "50.000.000 Credits"),
                new ItemMoney("adamantium_card", "100.000.000 Credits"),
                new ItemMoney("tartarite_card", "500.000.000 Credits"),
                new ItemMoney("iridium_card", "1.000.000.000 Credits")
        );
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event) {
        register(ModItems.PENNY);
        register(ModItems.DOUBLE_PENNY);
        register(ModItems.NICKEL);
        register(ModItems.DIME);
        register(ModItems.QUARTER);
        register(ModItems.HALF_CREDIT);
        register(ModItems.CREDIT);
        register(ModItems.DOUBLE_CREDIT);
        register(ModItems.CREDIT_BILL_5);
        register(ModItems.CREDIT_BILL_10);
        register(ModItems.CREDIT_BILL_25);
        register(ModItems.CREDIT_BILL_50);
        register(ModItems.CREDIT_BILL_100);
        register(ModItems.CREDIT_BILL_200);
        register(ModItems.CREDIT_BILL_500);
        register(ModItems.IRON_CARD);
        register(ModItems.STEEL_CARD);
        register(ModItems.BRONZE_CARD);
        register(ModItems.SILVER_CARD);
        register(ModItems.GOLD_CARD);
        register(ModItems.PLATINUM_CARD);
        register(ModItems.DIAMOND_CARD);
        register(ModItems.OSMIUM_CARD);
        register(ModItems.TUNGSTEN_CARD);
        register(ModItems.MITHRIL_CARD);
        register(ModItems.ADAMANTIUM_CARD);
        register(ModItems.TARTARITE_CARD);
        register(ModItems.IRIDIUM_CARD);
    }

    @SideOnly(Side.CLIENT)
    private static void register(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}