/**
 *Apr 25, 2013
 *4:15:34 PM
 *2013
 */
package com.civilizationcraft.CC.configuration;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

//import com.civilizationcraft.CC.Civilizationcraft;
import com.civilizationcraft.CC.lib.BlockIds;
import com.civilizationcraft.CC.lib.ItemIds;
//import com.civilizationcraft.CC.lib.ItemIds;
import com.civilizationcraft.CC.lib.Reference;
//import com.civilizationcraft.CC.lib.Strings;
import com.civilizationcraft.CC.lib.Strings;

import cpw.mods.fml.common.FMLLog;

/**
 * Civilizationcraft
 * 
 * ConfigurationHandler.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ConfigurationHandler
    {

        public static Configuration config;

        public static String BlockIdSection = "Block ID's";
        public static String ItemIdSection = "Item Id's";

        public static void init(File configFile)
            {

                config = new Configuration(configFile);

                try
                    {
                        config.load();
                        BlockIds.ORE_ALUMINUM = config.get(BlockIdSection, Strings.IG_NAME_ALUMINUM_ORE + "Id", BlockIds.ORE_ALUMINUM_DEFUALT).getInt();
                        BlockIds.ORE_CHROMIUM = config.get(BlockIdSection, Strings.IG_NAME_CHROMIUM_ORE + "Id", BlockIds.ORE_CHROMIUM_DEFUALT).getInt();
                        BlockIds.ORE_CINNABAR = config.get(BlockIdSection, Strings.IG_NAME_CINNABAR_ORE + "Id", BlockIds.ORE_CINNABAR_DEFUALT).getInt();
                        BlockIds.ORE_COBALT = config.get(BlockIdSection, Strings.IG_NAME_COBALT_ORE + "Id", BlockIds.ORE_COBALT_DEFUALT).getInt();
                        BlockIds.ORE_COPPER = config.get(BlockIdSection, Strings.IG_NAME_COPPER_ORE + "Id", BlockIds.ORE_COPPER_DEFUALT).getInt();
                        BlockIds.ORE_LEAD = config.get(BlockIdSection, Strings.IG_NAME_LEAD_ORE + "Id", BlockIds.ORE_LEAD_DEFUALT).getInt();
                        BlockIds.ORE_LITHIUM = config.get(BlockIdSection, Strings.IG_NAME_LITHIUM_ORE + "Id", BlockIds.ORE_LITHIUM_DEFUALT).getInt();
                        BlockIds.ORE_MAGNESIUM = config.get(BlockIdSection, Strings.IG_NAME_MAGNESIUM_ORE + "Id", BlockIds.ORE_MAGNESIUM_DEFUALT).getInt();
                        BlockIds.ORE_NICKEL = config.get(BlockIdSection, Strings.IG_NAME_NICKEL_ORE + "Id", BlockIds.ORE_NICKEL_DEFUALT).getInt();
                        BlockIds.ORE_SILVER = config.get(BlockIdSection, Strings.IG_NAME_SILVER_ORE + "Id", BlockIds.ORE_SILVER_DEFUALT).getInt();
                        BlockIds.ORE_THORIUM = config.get(BlockIdSection, Strings.IG_NAME_THORIUM_ORE + "Id", BlockIds.ORE_THORIUM_DEFUALT).getInt();
                        BlockIds.ORE_TIN = config.get(BlockIdSection, Strings.IG_NAME_TIN_ORE + "Id", BlockIds.ORE_TIN_DEFUALT).getInt();
                        BlockIds.ORE_TITANIUM = config.get(BlockIdSection, Strings.IG_NAME_TITANIUM_ORE + "Id", BlockIds.ORE_TITANIUM_DEFUALT).getInt();
                        BlockIds.ORE_TUNGSTEN = config.get(BlockIdSection, Strings.IG_NAME_TUNGSTEN_ORE + "Id", BlockIds.ORE_TUNGSTEN_DEFUALT).getInt();
                        BlockIds.ORE_URANIUM = config.get(BlockIdSection, Strings.IG_NAME_URANIUM_ORE + "Id", BlockIds.ORE_URANIUM_DEFUALT).getInt();
                        BlockIds.ORE_ZINC = config.get(BlockIdSection, Strings.IG_NAME_ZINC_ORE + "Id", BlockIds.ORE_ZINC_DEFUALT).getInt();

                        ItemIds.INGOT_ALUMINUM = config.get(ItemIdSection, "Aluminum Ingot Id", ItemIds.INGOT_ALUMINUM_DEFAULT).getInt();
                        // AluminumOreId = config.get("Block IDs", "Aluminum Ore Id", 160).getInt();

                    }
                catch (Exception e)
                    {
                        FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " has had a problem loading its configuration");
                    }
                finally
                    {
                        config.save();
                    }
            }
    }