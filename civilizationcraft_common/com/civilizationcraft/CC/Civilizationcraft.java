/**
 *Apr 23, 2013
 *4:01:27 PM
 *2013
 */
package com.civilizationcraft.CC;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;

import com.civilizationcraft.CC.block.ModBlocks;
import com.civilizationcraft.CC.block.OreDictionaryRegistration;
import com.civilizationcraft.CC.configuration.ConfigurationHandler;
import com.civilizationcraft.CC.core.handlers.FuelHandler;
import com.civilizationcraft.CC.core.handlers.WorldGenHandler;
import com.civilizationcraft.CC.creativetab.CreativeTabCiv;
import com.civilizationcraft.CC.items.ModItems;
import com.civilizationcraft.CC.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Civilizationcraft
 * 
 * Civilizationcraft.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Civilizationcraft
    {
        @Instance(Reference.MOD_ID)
        public static Civilizationcraft instance;
        
        public static CreativeTabs tabsCiv = new CreativeTabCiv(CreativeTabs.getNextID(), Reference.MOD_ID);

        @PreInit
        public void PreInit(FMLPreInitializationEvent event)
            {
                ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));

                ModBlocks.init();
                ModItems.init();
                OreDictionaryRegistration.init();

            }

        @Init
        public void load(FMLInitializationEvent event)
            {
                LanguageRegistry.instance().addStringLocalization("itemGroup.SuperClicheUsername_Civilizationcraft", "en_US", "Civilizationcraft");

                GameRegistry.registerFuelHandler(new FuelHandler());
                GameRegistry.registerWorldGenerator(new WorldGenHandler());
            }

        @PostInit
        public void PostInit(FMLPostInitializationEvent event)
            {

            }
    }