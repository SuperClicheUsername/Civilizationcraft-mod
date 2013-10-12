/**
 *Apr 25, 2013
 *4:27:05 PM
 */
package com.civilizationcraft.CC.Items;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

import com.civilizationcraft.CC.lib.Strings;

/**
 * Civilizationcraft
 * 
 * ItemIngotAluminum.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ItemIngotAluminum extends GeneralItemsCiv
    {
        public ItemIngotAluminum(int id)
            {
                super(id);
                setUnlocalizedName(Strings.INGOT_ALUMINUM_NAME);
            }

        @Override
        public EnumRarity getRarity(ItemStack is)
            {
                // Rare = Blue Epic = Purple Uncommon = Yellow Common = White
                return EnumRarity.rare;
            }
    }