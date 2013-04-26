/**
 *Apr 26, 2013
 *12:16:17 PM
 *2013
 */
package com.civilizationcraft.CC.block;

import net.minecraft.block.material.Material;

import com.civilizationcraft.CC.lib.Strings;

/**
 * Civilizationcraft
 * 
 * BlockOreLithium.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class BlockOreLithium extends GeneralBlockCiv
    {

        public BlockOreLithium(int id)
            {
                super(id, Material.rock);
                setUnlocalizedName(Strings.ORE_LITHIUM_NAME);
                setHardness(5F);
                setResistance(5F);
            }
    }
