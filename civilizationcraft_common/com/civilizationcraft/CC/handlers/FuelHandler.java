/**
 *Apr 24, 2013
 *4:02:28 PM
 */
package com.civilizationcraft.CC.handlers;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

/**
 * Civilizationcraft
 * 
 * FuelHandler.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class FuelHandler implements IFuelHandler
    {

        @Override
        public int getBurnTime(ItemStack fuel)
            {
                /*
                 * if(fuel.itemID == Civilizationcraft.CoalCoke.itemID) { return 1500; }else { return 0; }
                 */
                return 0;
            }

    }
