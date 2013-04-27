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
                initBlockRecipes();
            }

        private static void initClassDeclare()
            {
                CivBlocks.OreAluminum = new BlockOreAluminum(BlockIds.ORE_ALUMINUM);
                CivBlocks.OreChromium = new BlockOreChromium(BlockIds.ORE_CHROMIUM);
                CivBlocks.OreCinnabar = new BlockOreCinnabar(BlockIds.ORE_CINNABAR);
                CivBlocks.OreCobalt = new BlockOreCobalt(BlockIds.ORE_COBALT);
                CivBlocks.OreCopper = new BlockOreCopper(BlockIds.ORE_COPPER);
                CivBlocks.OreLead = new BlockOreLead(BlockIds.ORE_LEAD);
                CivBlocks.OreLithium = new BlockOreLithium(BlockIds.ORE_LITHIUM);
                CivBlocks.OreMagnesium = new BlockOreMagnesium(BlockIds.ORE_MAGNESIUM);
                CivBlocks.OreMithril = new BlockOreMithril(BlockIds.ORE_MITHRIL);
                CivBlocks.OreNickel = new BlockOreNickel(BlockIds.ORE_NICKEL);
                CivBlocks.OreSilver = new BlockOreSilver(BlockIds.ORE_SILVER);
                CivBlocks.OreThorium = new BlockOreThorium(BlockIds.ORE_THORIUM);
                CivBlocks.OreTin = new BlockOreTin(BlockIds.ORE_TIN);
                CivBlocks.OreTitanium = new BlockOreTitanium(BlockIds.ORE_TITANIUM);
                CivBlocks.OreTungsten = new BlockOreTungsten(BlockIds.ORE_TUNGSTEN);
                CivBlocks.OreUranium = new BlockOreUranium(BlockIds.ORE_URANIUM);
                CivBlocks.OreZinc = new BlockOreZinc(BlockIds.ORE_ZINC);
            }

        private static void initGameRegistry()
            {
                GameRegistry.registerBlock(CivBlocks.OreAluminum, Strings.ORE_ALUMINUM_NAME);
                GameRegistry.registerBlock(CivBlocks.OreChromium, Strings.ORE_CHROMIUM_NAME);
                GameRegistry.registerBlock(CivBlocks.OreCinnabar, Strings.ORE_CINNABAR_NAME);
                GameRegistry.registerBlock(CivBlocks.OreCobalt, Strings.ORE_COBALT_NAME);
                GameRegistry.registerBlock(CivBlocks.OreCopper, Strings.ORE_COPPER_NAME);
                GameRegistry.registerBlock(CivBlocks.OreLead, Strings.ORE_LEAD_NAME);
                GameRegistry.registerBlock(CivBlocks.OreLithium, Strings.ORE_LITHIUM_NAME);
                GameRegistry.registerBlock(CivBlocks.OreMagnesium, Strings.ORE_MAGNESIUM_NAME);
                GameRegistry.registerBlock(CivBlocks.OreMithril, Strings.ORE_MITHRIL_NAME);
                GameRegistry.registerBlock(CivBlocks.OreNickel, Strings.ORE_NICKEL_NAME);
                GameRegistry.registerBlock(CivBlocks.OreSilver, Strings.ORE_SILVER_NAME);
                GameRegistry.registerBlock(CivBlocks.OreThorium, Strings.ORE_THORIUM_NAME);
                GameRegistry.registerBlock(CivBlocks.OreTin, Strings.ORE_TIN_NAME);
                GameRegistry.registerBlock(CivBlocks.OreTitanium, Strings.ORE_TITANIUM_NAME);
                GameRegistry.registerBlock(CivBlocks.OreTungsten, Strings.ORE_TUNGSTEN_NAME);
                GameRegistry.registerBlock(CivBlocks.OreUranium, Strings.ORE_URANIUM_NAME);
                GameRegistry.registerBlock(CivBlocks.OreZinc, Strings.ORE_ZINC_NAME);
            }

        private static void initLanguageRegistry()
            {
                LanguageRegistry.addName(CivBlocks.OreAluminum, Strings.IG_NAME_ALUMINUM_ORE);
                LanguageRegistry.addName(CivBlocks.OreChromium, Strings.IG_NAME_CHROMIUM_ORE);
                LanguageRegistry.addName(CivBlocks.OreCinnabar, Strings.IG_NAME_CINNABAR_ORE);
                LanguageRegistry.addName(CivBlocks.OreCobalt, Strings.IG_NAME_COBALT_ORE);
                LanguageRegistry.addName(CivBlocks.OreCopper, Strings.IG_NAME_COPPER_ORE);
                LanguageRegistry.addName(CivBlocks.OreLead, Strings.IG_NAME_LEAD_ORE);
                LanguageRegistry.addName(CivBlocks.OreLithium, Strings.IG_NAME_LITHIUM_ORE);
                LanguageRegistry.addName(CivBlocks.OreMagnesium, Strings.IG_NAME_MAGNESIUM_ORE);
                LanguageRegistry.addName(CivBlocks.OreMithril, Strings.IG_NAME_MITHRIL_ORE);
                LanguageRegistry.addName(CivBlocks.OreNickel, Strings.IG_NAME_NICKEL_ORE);
                LanguageRegistry.addName(CivBlocks.OreSilver, Strings.IG_NAME_SILVER_ORE);
                LanguageRegistry.addName(CivBlocks.OreThorium, Strings.IG_NAME_THORIUM_ORE);
                LanguageRegistry.addName(CivBlocks.OreTin, Strings.IG_NAME_TIN_ORE);
                LanguageRegistry.addName(CivBlocks.OreTitanium, Strings.IG_NAME_TITANIUM_ORE);
                LanguageRegistry.addName(CivBlocks.OreTungsten, Strings.IG_NAME_TUNGSTEN_ORE);
                LanguageRegistry.addName(CivBlocks.OreUranium, Strings.IG_NAME_URANIUM_ORE);
                LanguageRegistry.addName(CivBlocks.OreZinc, Strings.IG_NAME_ZINC_ORE);
            }

        private static void initBlockRecipes()
            {

            }
    }
