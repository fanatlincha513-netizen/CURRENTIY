package com.ionaru.currency.init;

import com.ionaru.currency.Currency;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/** Вкладка креатива "CurrencyTab", иконка — Penny (как в оригинале). */
public class ModCreativeTab extends CreativeTabs {

    public static final CreativeTabs TAB_CURRENCY = new ModCreativeTab();

    private ModCreativeTab() {
        super(Currency.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.PENNY);
    }
}
