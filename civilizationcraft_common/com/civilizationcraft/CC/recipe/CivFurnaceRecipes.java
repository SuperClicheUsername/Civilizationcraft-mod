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
                FurnaceRecipes.smelting().addSmelting(CivBlocks.OreAluminum.blockID, 0, new ItemStack(CivItems.IngotAluminum), SmeltXP.AluminumOreXP);
            }
    }
