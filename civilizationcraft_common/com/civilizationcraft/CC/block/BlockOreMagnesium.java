/**
 *Apr 26, 2013
 *12:20:42 PM
 *2013
 */
package com.civilizationcraft.CC.block;

import net.minecraft.block.material.Material;

import com.civilizationcraft.CC.lib.Strings;

/**
 * Civilizationcraft
 * 
 * BlockOreMagnesium.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class BlockOreMagnesium extends GeneralBlockCiv
    {

        public BlockOreMagnesium(int id)
            {
                super(id, Material.rock);
                setUnlocalizedName(Strings.ORE_MAGNESIUM_NAME);
                setHardness(5F);
                setResistance(5F);
            }
    }
