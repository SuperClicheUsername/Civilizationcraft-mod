package com.civilizationcraft.CC.items;

import net.minecraft.item.Item;

import com.civilizationcraft.CC.lib.CivItems;
import com.civilizationcraft.CC.lib.ItemIds;
import com.civilizationcraft.CC.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Civilizationcraft
 * 
 * ModItems
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ModItems
    {
        public static Item ingotAluminum;

        public static void init()
            {
                initClassDeclare();
                initGameRegistry();
                initLanguageRegistry();
            }

        private static void initClassDeclare()
            {
                CivItems.IngotAluminum = new ItemIngotAluminum(ItemIds.INGOT_ALUMINUM);
            }

        private static void initGameRegistry()
            {
                GameRegistry.registerItem(CivItems.IngotAluminum, Strings.INGOT_ALUMINUM_NAME);
            }

        private static void initLanguageRegistry()
            {
                LanguageRegistry.addName(CivItems.IngotAluminum, Strings.IG_NAME_ALUMINUM_INGOT);
            }
    }
