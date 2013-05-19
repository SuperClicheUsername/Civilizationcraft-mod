/**
 *Apr 25, 2013
 *3:50:34 PM
 *2013
 */
package com.civilizationcraft.CC.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import com.civilizationcraft.CC.lib.CivBlocks;
import com.civilizationcraft.CC.lib.CivItems;
import com.civilizationcraft.CC.lib.SmeltXP;

/**
 * Civilizationcraft
 * 
 * CivFurnaceRecipes.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class CivFurnaceRecipes
    {
        public void init()
            {
                FurnaceRecipes.smelting().addSmelting(CivBlocks.oreAluminum.blockID, 0, new ItemStack(CivItems.ingotAluminum), SmeltXP.AluminumOreXP);
                FurnaceRecipes.smelting().addSmelting(CivBlocks.oreChromium.blockID, 0, new ItemStack(CivItems.ingotChromium), SmeltXP.ChromiumOreXP);
                FurnaceRecipes.smelting().addSmelting(CivBlocks.oreCinnabar.blockID, 0, new ItemStack(CivItems.ingotCinnabar), SmeltXP.CinnabarOreXP);
                FurnaceRecipes.smelting().addSmelting(CivBlocks.oreCobalt.blockID, 0, new ItemStack(CivItems.ingotCobalt), SmeltXP.CobaltOreXP);
                FurnaceRecipes.smelting().addSmelting(CivBlocks.oreCopper.blockID, 0, new ItemStack(CivItems.ingotCopper), SmeltXP.CopperOreXP);
                FurnaceRecipes.smelting().addSmelting(CivBlocks.oreLead.blockID, 0, new ItemStack(CivItems.ingotLead), SmeltXP.LeadOreXP);
                FurnaceRecipes.smelting().addSmelting(CivBlocks.oreLithium.blockID, 0, new ItemStack(CivItems.ingotLithium), SmeltXP.LithiumOreXP);
                FurnaceRecipes.smelting().addSmelting(CivBlocks.oreMagnesium.blockID, 0, new ItemStack(CivItems.ingotMagnesium), SmeltXP.MagnesiumOreXP);
                FurnaceRecipes.smelting().addSmelting(CivBlocks.oreMithril.blockID, 0, new ItemStack(CivItems.ingotMithril), SmeltXP.MithrilOreXP);
                FurnaceRecipes.smelting().addSmelting(CivBlocks.oreNickel.blockID, 0, new ItemStack(CivItems.ingotNickel), SmeltXP.NickelOreXP);
                FurnaceRecipes.smelting().addSmelting(CivBlocks.oreSilver.blockID, 0, new ItemStack(CivItems.ingotSilver), SmeltXP.SilverOreXP);
                FurnaceRecipes.smelting().addSmelting(CivBlocks.oreThorium.blockID, 0, new ItemStack(CivItems.ingotThorium), SmeltXP.ThoriumOreXP);
                FurnaceRecipes.smelting().addSmelting(CivBlocks.oreTin.blockID, 0, new ItemStack(CivItems.ingotTin), SmeltXP.TinOreXP);
                FurnaceRecipes.smelting().addSmelting(CivBlocks.oreTitanium.blockID, 0, new ItemStack(CivItems.ingotTitanium), SmeltXP.TitaniumOreXP);
                FurnaceRecipes.smelting().addSmelting(CivBlocks.oreTungsten.blockID, 0, new ItemStack(CivItems.ingotTungsten), SmeltXP.TungstenOreXP);
                FurnaceRecipes.smelting().addSmelting(CivBlocks.oreUranium.blockID, 0, new ItemStack(CivItems.ingotUranium), SmeltXP.UraniumOreXP);
                FurnaceRecipes.smelting().addSmelting(CivBlocks.oreZinc.blockID, 0, new ItemStack(CivItems.ingotZinc), SmeltXP.ZincOreXP);
            }
    }
