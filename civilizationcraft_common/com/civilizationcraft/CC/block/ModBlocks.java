package com.civilizationcraft.CC.block;

import com.civilizationcraft.CC.lib.BlockIds;
import com.civilizationcraft.CC.lib.CivBlocks;
import com.civilizationcraft.CC.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Civilizationcraft
 * 
 * ModBlocks
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
                initBlockRecipes();
            }

        private static void initGameRegistry()
            {
                GameRegistry.registerBlock(CivBlocks.OreAluminum, Strings.ORE_ALUMINUM_NAME);
            }

        private static void initClassDeclare()
            {
                CivBlocks.OreAluminum = new BlockOreAluminum(BlockIds.ORE_ALUMINUM);
            }

        private static void initBlockRecipes()
            {

            }
    }
