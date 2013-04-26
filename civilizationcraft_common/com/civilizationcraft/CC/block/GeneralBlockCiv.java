/**
 *Apr 26, 2013
 *12:16:17 PM
 *2013
 */
package com.civilizationcraft.CC.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import com.civilizationcraft.CC.Civilizationcraft;
import com.civilizationcraft.CC.lib.Reference;

/**
 * Civilizationcraft
 * 
 * GeneralBlockCiv.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class GeneralBlockCiv extends Block
    {
        public GeneralBlockCiv(int id, Material par2Material)
            {
                super(id, par2Material);
                setCreativeTab(Civilizationcraft.tabsCiv);
            }

        @Override
        public void registerIcons(IconRegister par1IconRegister)
            {
                blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
            }
    }