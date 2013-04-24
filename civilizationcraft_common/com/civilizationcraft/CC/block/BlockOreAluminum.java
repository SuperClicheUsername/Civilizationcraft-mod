package com.civilizationcraft.CC.block;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import com.civilizationcraft.CC.Civilizationcraft;
import com.civilizationcraft.CC.lib.Strings;
import com.civilizationcraft.CC.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Civilizationcraft
 * 
 * BlockOreAluminum
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class BlockOreAluminum extends BlockCiv
    {

        public BlockOreAluminum(int id)
            {
                super(id, Material.rock);
                setUnlocalizedName(Strings.ORE_ALUMINUM_NAME);
                setCreativeTab(Civilizationcraft.tabsCiv);
                setHardness(5F);
                setResistance(5F);
            }
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister)
            {
                this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName2());
            }

    }
