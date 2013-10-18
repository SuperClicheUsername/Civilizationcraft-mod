/**
 *Apr 23, 2013
 *4:01:27 PM
 */
package com.civilizationcraft.CC;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;

import com.civilizationcraft.CC.block.ModBlocks;
import com.civilizationcraft.CC.block.OreDictionaryRegistration;
import com.civilizationcraft.CC.configuration.ConfigurationHandler;
import com.civilizationcraft.CC.creativetab.CreativeTabCiv;
import com.civilizationcraft.CC.handlers.FuelHandler;
import com.civilizationcraft.CC.handlers.WorldGenHandler;
import com.civilizationcraft.CC.items.ModItems;
import com.civilizationcraft.CC.lib.Reference;
import com.civilizationcraft.CC.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
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
public class Civilizationcraft
    {
        @Instance(Reference.MOD_ID)
        public static Civilizationcraft instance;
        
        @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
        public static CommonProxy proxy;

        public static CreativeTabs tabsCiv = new CreativeTabCiv(CreativeTabs.getNextID(), Reference.MOD_ID);

        @EventHandler
        public void PreInit(FMLPreInitializationEvent event)
            {
                ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));

                ModBlocks.init();
                ModItems.init();
                OreDictionaryRegistration.init();
            }

        @EventHandler
        public void load(FMLInitializationEvent event)
            {
                LanguageRegistry.instance().addStringLocalization("itemGroup.SuperClicheUsername_Civilizationcraft", "en_US", "Civilizationcraft");

                GameRegistry.registerFuelHandler(new FuelHandler());
                GameRegistry.registerWorldGenerator(new WorldGenHandler());
            }

        @EventHandler
        public void PostInit(FMLPostInitializationEvent event)
            {

            }
    }