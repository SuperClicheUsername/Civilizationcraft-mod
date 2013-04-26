/**
 *Apr 26, 2013
 *12:21:17 PM
 *2013
 */
package com.civilizationcraft.CC.block;

import net.minecraft.block.material.Material;

import com.civilizationcraft.CC.lib.Strings;

/**
 * Civilizationcraft
 * 
 * BlockOreNickel.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class BlockOreNickel extends GeneralBlockCiv
    {

        public BlockOreNickel(int id)
            {
                super(id, Material.rock);
                setUnlocalizedName(Strings.ORE_NICKEL_NAME);
                setHardness(5F);
                setResistance(5F);
            }
    }
