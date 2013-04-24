package com.civilizationcraft.CC;

import net.minecraft.creativetab.CreativeTabs;

import com.civilizationcraft.CC.block.ModBlocks;
import com.civilizationcraft.CC.core.handlers.CraftingHandler;
import com.civilizationcraft.CC.core.handlers.FuelHandler;
import com.civilizationcraft.CC.creativetab.CreativeTabCiv;
import com.civilizationcraft.CC.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Civilizationcraft
 * 
 * Civilizationcraft
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Civilizationcraft
    {

        public static CreativeTabs tabsCiv = new CreativeTabCiv(CreativeTabs.getNextID(), Reference.MOD_ID);

        @PreInit
        public void PreInit(FMLPreInitializationEvent event)
            {
                ModBlocks.init();

            }

        @Init
        public void load(FMLInitializationEvent event)
            {
                LanguageRegistry.instance().addStringLocalization("itemGroup.SuperClicheUsername_Civilizationcraft", "en_US", "Civilizationcraft");
                
                GameRegistry.registerCraftingHandler(new CraftingHandler());
                GameRegistry.registerFuelHandler(new FuelHandler());
            }

        @PostInit
        public void PostInit(FMLPostInitializationEvent event)
            {

            }
    }