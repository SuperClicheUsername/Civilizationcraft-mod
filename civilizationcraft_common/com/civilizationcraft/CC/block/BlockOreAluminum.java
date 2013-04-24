package com.civilizationcraft.CC.block;

import net.minecraft.block.material.Material;

import com.civilizationcraft.CC.Civilizationcraft;
import com.civilizationcraft.CC.lib.Strings;


/**
 * Civilizationcraft
 * 
 * BlockOreAluminum
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class BlockOreAluminum extends GeneralBlockCiv
    {

        public BlockOreAluminum(int id)
            {
                super(id, Material.rock);
                setUnlocalizedName(Strings.ORE_ALUMINUM_NAME);
                setCreativeTab(Civilizationcraft.tabsCiv);
                setHardness(5F);
                setResistance(5F);
            }
    }
