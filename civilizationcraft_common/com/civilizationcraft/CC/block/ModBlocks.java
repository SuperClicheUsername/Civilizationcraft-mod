/**
 *Apr 26, 2013
 *12:16:17 PM
 *2013
 */
package com.civilizationcraft.CC.block;

import com.civilizationcraft.CC.lib.BlockIds;
import com.civilizationcraft.CC.lib.CivBlocks;
import com.civilizationcraft.CC.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Civilizationcraft
 * 
 * ModBlocks.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ModBlocks
    {

        public static void init()
            {
                initClassDeclare();
                initGameRegistry();
                initLanguageRegistry();
            }

        private static void initClassDeclare()
            {
                CivBlocks.oreAluminum = new BlockOreAluminum(BlockIds.ORE_ALUMINUM);
                CivBlocks.oreChromium = new BlockOreChromium(BlockIds.ORE_CHROMIUM);
                CivBlocks.oreCinnabar = new BlockOreCinnabar(BlockIds.ORE_CINNABAR);
                CivBlocks.oreCobalt = new BlockOreCobalt(BlockIds.ORE_COBALT);
                CivBlocks.oreCopper = new BlockOreCopper(BlockIds.ORE_COPPER);
                CivBlocks.oreLead = new BlockOreLead(BlockIds.ORE_LEAD);
                CivBlocks.oreLithium = new BlockOreLithium(BlockIds.ORE_LITHIUM);
                CivBlocks.oreMagnesium = new BlockOreMagnesium(BlockIds.ORE_MAGNESIUM);
                CivBlocks.oreMithril = new BlockOreMithril(BlockIds.ORE_MITHRIL);
                CivBlocks.oreNickel = new BlockOreNickel(BlockIds.ORE_NICKEL);
                CivBlocks.oreSilver = new BlockOreSilver(BlockIds.ORE_SILVER);
                CivBlocks.oreThorium = new BlockOreThorium(BlockIds.ORE_THORIUM);
                CivBlocks.oreTin = new BlockOreTin(BlockIds.ORE_TIN);
                CivBlocks.oreTitanium = new BlockOreTitanium(BlockIds.ORE_TITANIUM);
                CivBlocks.oreTungsten = new BlockOreTungsten(BlockIds.ORE_TUNGSTEN);
                CivBlocks.oreUranium = new BlockOreUranium(BlockIds.ORE_URANIUM);
                CivBlocks.oreZinc = new BlockOreZinc(BlockIds.ORE_ZINC);
            }

        private static void initGameRegistry()
            {
                GameRegistry.registerBlock(CivBlocks.oreAluminum, Strings.ORE_ALUMINUM_NAME);
                GameRegistry.registerBlock(CivBlocks.oreChromium, Strings.ORE_CHROMIUM_NAME);
                GameRegistry.registerBlock(CivBlocks.oreCinnabar, Strings.ORE_CINNABAR_NAME);
                GameRegistry.registerBlock(CivBlocks.oreCobalt, Strings.ORE_COBALT_NAME);
                GameRegistry.registerBlock(CivBlocks.oreCopper, Strings.ORE_COPPER_NAME);
                GameRegistry.registerBlock(CivBlocks.oreLead, Strings.ORE_LEAD_NAME);
                GameRegistry.registerBlock(CivBlocks.oreLithium, Strings.ORE_LITHIUM_NAME);
                GameRegistry.registerBlock(CivBlocks.oreMagnesium, Strings.ORE_MAGNESIUM_NAME);
                GameRegistry.registerBlock(CivBlocks.oreMithril, Strings.ORE_MITHRIL_NAME);
                GameRegistry.registerBlock(CivBlocks.oreNickel, Strings.ORE_NICKEL_NAME);
                GameRegistry.registerBlock(CivBlocks.oreSilver, Strings.ORE_SILVER_NAME);
                GameRegistry.registerBlock(CivBlocks.oreThorium, Strings.ORE_THORIUM_NAME);
                GameRegistry.registerBlock(CivBlocks.oreTin, Strings.ORE_TIN_NAME);
                GameRegistry.registerBlock(CivBlocks.oreTitanium, Strings.ORE_TITANIUM_NAME);
                GameRegistry.registerBlock(CivBlocks.oreTungsten, Strings.ORE_TUNGSTEN_NAME);
                GameRegistry.registerBlock(CivBlocks.oreUranium, Strings.ORE_URANIUM_NAME);
                GameRegistry.registerBlock(CivBlocks.oreZinc, Strings.ORE_ZINC_NAME);
            }

        private static void initLanguageRegistry()
            {
                LanguageRegistry.addName(CivBlocks.oreAluminum, Strings.IG_NAME_ALUMINUM_ORE);
                LanguageRegistry.addName(CivBlocks.oreChromium, Strings.IG_NAME_CHROMIUM_ORE);
                LanguageRegistry.addName(CivBlocks.oreCinnabar, Strings.IG_NAME_CINNABAR_ORE);
                LanguageRegistry.addName(CivBlocks.oreCobalt, Strings.IG_NAME_COBALT_ORE);
                LanguageRegistry.addName(CivBlocks.oreCopper, Strings.IG_NAME_COPPER_ORE);
                LanguageRegistry.addName(CivBlocks.oreLead, Strings.IG_NAME_LEAD_ORE);
                LanguageRegistry.addName(CivBlocks.oreLithium, Strings.IG_NAME_LITHIUM_ORE);
                LanguageRegistry.addName(CivBlocks.oreMagnesium, Strings.IG_NAME_MAGNESIUM_ORE);
                LanguageRegistry.addName(CivBlocks.oreMithril, Strings.IG_NAME_MITHRIL_ORE);
                LanguageRegistry.addName(CivBlocks.oreNickel, Strings.IG_NAME_NICKEL_ORE);
                LanguageRegistry.addName(CivBlocks.oreSilver, Strings.IG_NAME_SILVER_ORE);
                LanguageRegistry.addName(CivBlocks.oreThorium, Strings.IG_NAME_THORIUM_ORE);
                LanguageRegistry.addName(CivBlocks.oreTin, Strings.IG_NAME_TIN_ORE);
                LanguageRegistry.addName(CivBlocks.oreTitanium, Strings.IG_NAME_TITANIUM_ORE);
                LanguageRegistry.addName(CivBlocks.oreTungsten, Strings.IG_NAME_TUNGSTEN_ORE);
                LanguageRegistry.addName(CivBlocks.oreUranium, Strings.IG_NAME_URANIUM_ORE);
                LanguageRegistry.addName(CivBlocks.oreZinc, Strings.IG_NAME_ZINC_ORE);
                
                
                //MetaData Stuff
                
                /*LanguageRegistry.addName(new ItemStack(CivBlocks.oreBlock, 1, 0), Strings.IG_NAME_ALUMINUM_ORE);
                LanguageRegistry.addName(new ItemStack(CivBlocks.oreBlock, 1, 1), Strings.IG_NAME_CHROMIUM_ORE);
                LanguageRegistry.addName(new ItemStack(CivBlocks.oreBlock, 1, 2), Strings.IG_NAME_CINNABAR_ORE);
                LanguageRegistry.addName(new ItemStack(CivBlocks.oreBlock, 1, 3), Strings.IG_NAME_COBALT_ORE);
                LanguageRegistry.addName(new ItemStack(CivBlocks.oreBlock, 1, 4), Strings.IG_NAME_COPPER_ORE);
                LanguageRegistry.addName(new ItemStack(CivBlocks.oreBlock, 1, 5), Strings.IG_NAME_LEAD_ORE);
                LanguageRegistry.addName(new ItemStack(CivBlocks.oreBlock, 1, 6), Strings.IG_NAME_LITHIUM_ORE);
                LanguageRegistry.addName(new ItemStack(CivBlocks.oreBlock, 1, 7), Strings.IG_NAME_MAGNESIUM_ORE);
                LanguageRegistry.addName(new ItemStack(CivBlocks.oreBlock, 1, 8), Strings.IG_NAME_MITHRIL_ORE);
                LanguageRegistry.addName(new ItemStack(CivBlocks.oreBlock, 1, 9), Strings.IG_NAME_NICKEL_ORE);
                LanguageRegistry.addName(new ItemStack(CivBlocks.oreBlock, 1, 10), Strings.IG_NAME_SILVER_ORE);
                LanguageRegistry.addName(new ItemStack(CivBlocks.oreBlock, 1, 11), Strings.IG_NAME_THORIUM_ORE);
                LanguageRegistry.addName(new ItemStack(CivBlocks.oreBlock, 1, 12), Strings.IG_NAME_TIN_ORE);
                LanguageRegistry.addName(new ItemStack(CivBlocks.oreBlock, 1, 13), Strings.IG_NAME_TITANIUM_ORE);
                LanguageRegistry.addName(new ItemStack(CivBlocks.oreBlock, 1, 14), Strings.IG_NAME_TUNGSTEN_ORE);
                LanguageRegistry.addName(new ItemStack(CivBlocks.oreBlock, 1, 15), Strings.IG_NAME_URANIUM_ORE);
                LanguageRegistry.addName(new ItemStack(CivBlocks.oreBlock, 1, 16), Strings.IG_NAME_ZINC_ORE); */
            }
    }
