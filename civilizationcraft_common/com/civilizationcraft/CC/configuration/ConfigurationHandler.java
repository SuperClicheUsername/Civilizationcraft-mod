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



import cpw.mods.fml.common.FMLLog;

/**
 * Civilizationcraft
 * 
 * ConfigurationHandler
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
                        BlockIds.ORE_ALUMINUM = config.get(BlockIdSection, "Aluminum Ore Id", BlockIds.ORE_ALUMINUM_DEFUALT).getInt();
                        

                        ItemIds.INGOT_ALUMINUM = config.get(ItemIdSection, "Aluminum Ingot Id", ItemIds.INGOT_ALUMINUM_DEFAULT).getInt();
                        // AluminumOreId = config.get("Block IDs", "Aluminum Ore Id", 160).getInt();

                    } catch (Exception e)
                    {
                        FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " has had a problem loading its configuration");
                    } finally
                    {
                        config.save();
                    }
            }
    }