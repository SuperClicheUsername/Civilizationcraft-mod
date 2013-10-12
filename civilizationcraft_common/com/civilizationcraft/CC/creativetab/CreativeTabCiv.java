/**
 *Apr 23, 2013
 *4:31:23 PM
 */
package com.civilizationcraft.CC.creativetab;

import net.minecraft.creativetab.CreativeTabs;

import com.civilizationcraft.CC.lib.BlockIds;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Civilizationcraft
 * 
 * CreativeTabCiv
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class CreativeTabCiv extends CreativeTabs
    {

        public CreativeTabCiv(int par1, String par2Str)
            {

                super(par1, par2Str);
            }

        @Override
        @SideOnly(Side.CLIENT)
        public int getTabIconItemIndex()
            {
                return BlockIds.ORE_ALUMINUM;
            }

    }
