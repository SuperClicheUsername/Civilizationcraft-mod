package com.civilizationcraft.CC.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

import com.civilizationcraft.CC.lib.Reference;

public class GeneralBlockCiv extends Block
    {
        public GeneralBlockCiv(int id, Material par2Material)
            {
                super(id, par2Material);
                this.setCreativeTab(CreativeTabs.tabBlock);
            }

        @Override
        public void registerIcons(IconRegister par1IconRegister)
            {
                blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
            }
    }