package com.ionaru.currency.init;

import com.ionaru.currency.Currency;
import com.ionaru.currency.ModConfig;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.ShapelessOreRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Все 69 бесформенных (shapeless) рецептов обмена номиналов —
 * точно восстановлены из байткода метода Currency.load() оригинального
 * мода 1.7.10 (дизассемблировано и провалидировано символьным
 * интерпретатором стека JVM, не набрано вручную и не придумано).
 * Регистрируются только если ModConfig.enableAllRecipes == true —
 * так же, как в оригинале (там был флаг ConfigurationLoader.enableAllRecipes).
 */
@Mod.EventBusSubscriber(modid = Currency.MODID)
public class ModRecipes {

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        if (!ModConfig.enableAllRecipes) {
            return;
        }
        int i = 0;
        for (IRecipe recipe : buildRecipes()) {
            recipe.setRegistryName(new ResourceLocation(Currency.MODID, "exchange_" + (i++)));
            event.getRegistry().register(recipe);
        }
    }

    private static java.util.List<IRecipe> buildRecipes() {
        java.util.List<IRecipe> list = new java.util.ArrayList<IRecipe>();
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.PENNY, 2), ModItems.DOUBLE_PENNY));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.PENNY, 5), ModItems.NICKEL));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.DOUBLE_PENNY), ModItems.PENNY, ModItems.PENNY));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.NICKEL), ModItems.PENNY, ModItems.PENNY, ModItems.PENNY, ModItems.PENNY, ModItems.PENNY));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.NICKEL), ModItems.DOUBLE_PENNY, ModItems.DOUBLE_PENNY, ModItems.PENNY));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.NICKEL, 5), ModItems.QUARTER));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.NICKEL, 2), ModItems.DIME));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.DIME), ModItems.DOUBLE_PENNY, ModItems.DOUBLE_PENNY, ModItems.DOUBLE_PENNY, ModItems.DOUBLE_PENNY, ModItems.DOUBLE_PENNY));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.DIME), ModItems.NICKEL, ModItems.NICKEL));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.QUARTER), ModItems.DIME, ModItems.DIME, ModItems.NICKEL));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.QUARTER), ModItems.NICKEL, ModItems.NICKEL, ModItems.NICKEL, ModItems.NICKEL, ModItems.NICKEL));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.QUARTER, 2), ModItems.HALF_CREDIT));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.HALF_CREDIT), ModItems.DIME, ModItems.DIME, ModItems.DIME, ModItems.DIME, ModItems.DIME));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.HALF_CREDIT), ModItems.QUARTER, ModItems.QUARTER));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.HALF_CREDIT, 2), ModItems.CREDIT));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT), ModItems.QUARTER, ModItems.QUARTER, ModItems.QUARTER, ModItems.QUARTER));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT), ModItems.HALF_CREDIT, ModItems.HALF_CREDIT));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT, 2), ModItems.DOUBLE_CREDIT));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT, 5), ModItems.CREDIT_BILL_5));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.DOUBLE_CREDIT), ModItems.HALF_CREDIT, ModItems.HALF_CREDIT, ModItems.HALF_CREDIT, ModItems.HALF_CREDIT));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.DOUBLE_CREDIT), ModItems.CREDIT, ModItems.CREDIT));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_5), ModItems.CREDIT, ModItems.CREDIT, ModItems.CREDIT, ModItems.CREDIT, ModItems.CREDIT));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_5), ModItems.DOUBLE_CREDIT, ModItems.DOUBLE_CREDIT, ModItems.CREDIT));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_5, 5), ModItems.CREDIT_BILL_25));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_5, 2), ModItems.CREDIT_BILL_10));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_10), ModItems.DOUBLE_CREDIT, ModItems.DOUBLE_CREDIT, ModItems.DOUBLE_CREDIT, ModItems.DOUBLE_CREDIT, ModItems.DOUBLE_CREDIT));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_10), ModItems.CREDIT_BILL_5, ModItems.CREDIT_BILL_5));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_25), ModItems.CREDIT_BILL_5, ModItems.CREDIT_BILL_5, ModItems.CREDIT_BILL_5, ModItems.CREDIT_BILL_5, ModItems.CREDIT_BILL_5));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_25), ModItems.CREDIT_BILL_10, ModItems.CREDIT_BILL_10, ModItems.CREDIT_BILL_5));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_25, 2), ModItems.CREDIT_BILL_50));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_50), ModItems.CREDIT_BILL_25, ModItems.CREDIT_BILL_25));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_50), ModItems.CREDIT_BILL_10, ModItems.CREDIT_BILL_10, ModItems.CREDIT_BILL_10, ModItems.CREDIT_BILL_10, ModItems.CREDIT_BILL_10));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_50, 2), ModItems.CREDIT_BILL_100));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_100), ModItems.CREDIT_BILL_50, ModItems.CREDIT_BILL_50));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_100), ModItems.CREDIT_BILL_25, ModItems.CREDIT_BILL_25, ModItems.CREDIT_BILL_25, ModItems.CREDIT_BILL_25));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_100, 5), ModItems.CREDIT_BILL_500));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_100, 2), ModItems.CREDIT_BILL_200));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_200), ModItems.CREDIT_BILL_50, ModItems.CREDIT_BILL_50, ModItems.CREDIT_BILL_50, ModItems.CREDIT_BILL_50));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_200), ModItems.CREDIT_BILL_25, ModItems.CREDIT_BILL_25, ModItems.CREDIT_BILL_25, ModItems.CREDIT_BILL_25, ModItems.CREDIT_BILL_25, ModItems.CREDIT_BILL_25, ModItems.CREDIT_BILL_25, ModItems.CREDIT_BILL_25));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_200), ModItems.CREDIT_BILL_100, ModItems.CREDIT_BILL_100));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_500), ModItems.CREDIT_BILL_200, ModItems.CREDIT_BILL_200, ModItems.CREDIT_BILL_100));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_500), ModItems.CREDIT_BILL_100, ModItems.CREDIT_BILL_100, ModItems.CREDIT_BILL_100, ModItems.CREDIT_BILL_100, ModItems.CREDIT_BILL_100));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.CREDIT_BILL_500, 2), ModItems.IRON_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.IRON_CARD), ModItems.CREDIT_BILL_200, ModItems.CREDIT_BILL_200, ModItems.CREDIT_BILL_200, ModItems.CREDIT_BILL_200, ModItems.CREDIT_BILL_200));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.IRON_CARD), ModItems.CREDIT_BILL_500, ModItems.CREDIT_BILL_500));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.IRON_CARD, 5), ModItems.STEEL_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.STEEL_CARD), ModItems.IRON_CARD, ModItems.IRON_CARD, ModItems.IRON_CARD, ModItems.IRON_CARD, ModItems.IRON_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.STEEL_CARD, 2), ModItems.BRONZE_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.BRONZE_CARD), ModItems.STEEL_CARD, ModItems.STEEL_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.BRONZE_CARD, 5), ModItems.SILVER_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.SILVER_CARD), ModItems.BRONZE_CARD, ModItems.BRONZE_CARD, ModItems.BRONZE_CARD, ModItems.BRONZE_CARD, ModItems.BRONZE_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.SILVER_CARD, 2), ModItems.GOLD_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.GOLD_CARD), ModItems.SILVER_CARD, ModItems.SILVER_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.GOLD_CARD, 5), ModItems.PLATINUM_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.PLATINUM_CARD), ModItems.GOLD_CARD, ModItems.GOLD_CARD, ModItems.GOLD_CARD, ModItems.GOLD_CARD, ModItems.GOLD_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.PLATINUM_CARD, 2), ModItems.DIAMOND_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.DIAMOND_CARD), ModItems.PLATINUM_CARD, ModItems.PLATINUM_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.DIAMOND_CARD, 5), ModItems.OSMIUM_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.OSMIUM_CARD), ModItems.DIAMOND_CARD, ModItems.DIAMOND_CARD, ModItems.DIAMOND_CARD, ModItems.DIAMOND_CARD, ModItems.DIAMOND_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.OSMIUM_CARD, 2), ModItems.TUNGSTEN_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.TUNGSTEN_CARD), ModItems.OSMIUM_CARD, ModItems.OSMIUM_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.TUNGSTEN_CARD, 5), ModItems.MITHRIL_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.MITHRIL_CARD), ModItems.TUNGSTEN_CARD, ModItems.TUNGSTEN_CARD, ModItems.TUNGSTEN_CARD, ModItems.TUNGSTEN_CARD, ModItems.TUNGSTEN_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.MITHRIL_CARD, 2), ModItems.ADAMANTIUM_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.ADAMANTIUM_CARD), ModItems.MITHRIL_CARD, ModItems.MITHRIL_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.ADAMANTIUM_CARD, 5), ModItems.TARTARITE_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.TARTARITE_CARD), ModItems.ADAMANTIUM_CARD, ModItems.ADAMANTIUM_CARD, ModItems.ADAMANTIUM_CARD, ModItems.ADAMANTIUM_CARD, ModItems.ADAMANTIUM_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.TARTARITE_CARD, 2), ModItems.IRIDIUM_CARD));
        list.add(new ShapelessOreRecipe(null, new ItemStack(ModItems.IRIDIUM_CARD), ModItems.TARTARITE_CARD, ModItems.TARTARITE_CARD));
        return list;
    }
}