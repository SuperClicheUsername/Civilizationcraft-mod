/**
 *Apr 26, 2013
 *9:01:23 PM
 *2013
 */
package com.civilizationcraft.CC.block;

import net.minecraftforge.oredict.OreDictionary;

import com.civilizationcraft.CC.lib.BlockIds;
import com.civilizationcraft.CC.lib.CivBlocks;

/**
 * Civilizationcraft
 * 
 * OreDictionaryRegistration.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class OreDictionaryRegistration
    {
        public static void init()
            {
                OreDictionary.registerOre(BlockIds.ORE_ALUMINUM, CivBlocks.oreAluminum);
                OreDictionary.registerOre(BlockIds.ORE_CHROMIUM, CivBlocks.oreChromium);
                OreDictionary.registerOre(BlockIds.ORE_CINNABAR, CivBlocks.oreCinnabar);
                OreDictionary.registerOre(BlockIds.ORE_COBALT, CivBlocks.oreCobalt);
                OreDictionary.registerOre(BlockIds.ORE_COPPER, CivBlocks.oreCopper);
                OreDictionary.registerOre(BlockIds.ORE_LEAD, CivBlocks.oreLead);
                OreDictionary.registerOre(BlockIds.ORE_LITHIUM, CivBlocks.oreLithium);
                OreDictionary.registerOre(BlockIds.ORE_MAGNESIUM, CivBlocks.oreMagnesium);
                OreDictionary.registerOre(BlockIds.ORE_MITHRIL, CivBlocks.oreMithril);
                OreDictionary.registerOre(BlockIds.ORE_NICKEL, CivBlocks.oreNickel);
                OreDictionary.registerOre(BlockIds.ORE_SILVER, CivBlocks.oreSilver);
                OreDictionary.registerOre(BlockIds.ORE_THORIUM, CivBlocks.oreThorium);
                OreDictionary.registerOre(BlockIds.ORE_TIN, CivBlocks.oreTin);
                OreDictionary.registerOre(BlockIds.ORE_TITANIUM, CivBlocks.oreTitanium);
                OreDictionary.registerOre(BlockIds.ORE_TUNGSTEN, CivBlocks.oreTungsten);
                OreDictionary.registerOre(BlockIds.ORE_URANIUM, CivBlocks.oreUranium);
                OreDictionary.registerOre(BlockIds.ORE_ZINC, CivBlocks.oreZinc);

            }
    }
