/**
*Apr 26, 2013
*8:29:17 PM
*2013
*/
package com.civilizationcraft.CC.block;

import com.civilizationcraft.CC.lib.Strings;

import net.minecraft.block.material.Material;

/**
 * Civilizationcraft
 * 
 * BlockOreMithril.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class BlockOreMithril extends GeneralBlockCiv
{

    public BlockOreMithril(int id)
        {
            super(id, Material.rock);
            setUnlocalizedName(Strings.ORE_MITHRIL_NAME);
            setHardness(5F);
            setResistance(5F);
        }
}
