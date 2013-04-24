package com.civilizationcraft.CC.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.civilizationcraft.CC.lib.Reference;

public class GeneralItemsCiv extends Item
    {
        public GeneralItemsCiv(int id)
            {
                super(id);
                this.setCreativeTab(CreativeTabs.tabMaterials);
            }

        public void registerIcons(IconRegister par1IconRegister)
            {
                iconIndex = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName());
            }
    }