/**
 *Apr 26, 2013
 *12:23:52 PM
 *2013
 */
package com.civilizationcraft.CC.block;

import net.minecraft.block.material.Material;

import com.civilizationcraft.CC.lib.Strings;

/**
 * Civilizationcraft
 * 
 * BlockOreTin.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class BlockOreTin extends GeneralBlockCiv
    {

        public BlockOreTin(int id)
            {
                super(id, Material.rock);
                setUnlocalizedName(Strings.ORE_TIN_NAME);
                setHardness(5F);
                setResistance(5F);
            }
    }
