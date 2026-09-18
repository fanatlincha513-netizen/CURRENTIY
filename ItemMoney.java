package com.ionaru.currency.item;

import com.ionaru.currency.Currency;
import com.ionaru.currency.ModConfig;
import com.ionaru.currency.init.ModCreativeTab;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;

import java.util.List;

/**
 * Общий класс для всех 28 номиналов "валюты". В оригинале (1.7.10) это был
 * один класс Money, где подсказка (тултип) сравнивала this.getUnlocalizedName()
 * со статическими полями Currency.* и печатала соответствующую строку.
 * В 1.12.2 то же самое проще сделать через registry name предмета.
 */
public class ItemMoney extends Item {

    /** Текст подсказки ("0.01 Credits", "1 Credit" и т.д.), задаётся при создании. */
    private final String tooltipValue;

    public ItemMoney(String registryName, String tooltipValue) {
        this.tooltipValue = tooltipValue;
        setRegistryName(Currency.MODID, registryName);
        setUnlocalizedName(Currency.MODID + "." + registryName);
        setCreativeTab(ModCreativeTab.TAB_CURRENCY);
        setMaxStackSize(64);
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag) {
        if (ModConfig.enableAllTooltips) {
            tooltip.add(tooltipValue);
        }
    }
}
