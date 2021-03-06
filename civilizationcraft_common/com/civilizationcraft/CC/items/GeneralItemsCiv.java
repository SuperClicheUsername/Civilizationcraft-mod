/**
 *Apr 25, 2013
 *12:25:53 PMs
 */
package com.civilizationcraft.CC.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.civilizationcraft.CC.Civilizationcraft;
//import com.civilizationcraft.CC.lib.Reference;

/**
 * Civilizationcraft
 * 
 * GeneralItemsCiv.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class GeneralItemsCiv extends Item
    {
        public GeneralItemsCiv(int id)
            {
                super(id);
                setCreativeTab(Civilizationcraft.tabsCiv);
            }

        public void registerIcons(IconRegister par1IconRegister)
            {
                //iconIndex = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName()));
            }
        @Override
        public EnumRarity getRarity(ItemStack is)
            {
                // Rare = Blue Epic = Purple Uncommon = Yellow Common = White
                return EnumRarity.rare;
            }
    }

