/**
 *Apr 26, 2013
 *12:24:13 PM
 *2013
 */
package com.civilizationcraft.CC.block;

import net.minecraft.block.material.Material;

import com.civilizationcraft.CC.lib.Strings;

/**
 * Civilizationcraft
 * 
 * BlockOreTitanium.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class BlockOreTitanium extends GeneralBlockCiv
    {

        public BlockOreTitanium(int id)
            {
                super(id, Material.rock);
                setUnlocalizedName(Strings.ORE_TITANIUM_NAME);
                setHardness(5F);
                setResistance(5F);
            }
    }
