package com.civilizationcraft.CC.block;

import com.civilizationcraft.CC.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class GeneralBlockCiv extends Block
{
       public GeneralBlockCiv(int id, Material par2Material)
       {
             super(id, par2Material);
             this.setCreativeTab(CreativeTabs.tabBlock);
       }
      
       public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }
}