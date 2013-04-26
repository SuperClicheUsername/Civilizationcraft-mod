/**
 *Apr 26, 2013
 *12:24:56 PM
 *2013
 */
package com.civilizationcraft.CC.block;

import net.minecraft.block.material.Material;

import com.civilizationcraft.CC.lib.Strings;

/**
 * Civilizationcraft
 * 
 * BlockOreUranium.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class BlockOreUranium extends GeneralBlockCiv
    {

        public BlockOreUranium(int id)
            {
                super(id, Material.rock);
                setUnlocalizedName(Strings.ORE_URANIUM_NAME);
                setHardness(5F);
                setResistance(5F);
            }
    }
