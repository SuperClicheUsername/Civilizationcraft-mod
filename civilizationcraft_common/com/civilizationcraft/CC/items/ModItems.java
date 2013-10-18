/**
 *Apr 25, 2013
 *4:18:02 PM
 */
package com.civilizationcraft.CC.items;

import com.civilizationcraft.CC.lib.CivItems;
import com.civilizationcraft.CC.lib.ItemIds;
import com.civilizationcraft.CC.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Civilizationcraft
 * 
 * ModItems.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ModItems
    {

        public static void init()
            {
                initClassDeclare();
                initGameRegistry();
                initLanguageRegistry();
            }

        private static void initClassDeclare()
            {
                CivItems.ingotAluminum = new ItemIngotAluminum(ItemIds.INGOT_ALUMINUM);
            }

        private static void initGameRegistry()
            {
                GameRegistry.registerItem(CivItems.ingotAluminum, Strings.INGOT_ALUMINUM_NAME);
            }

        private static void initLanguageRegistry()
            {
                LanguageRegistry.addName(CivItems.ingotAluminum, Strings.IG_NAME_ALUMINUM_INGOT);
            }
    }
