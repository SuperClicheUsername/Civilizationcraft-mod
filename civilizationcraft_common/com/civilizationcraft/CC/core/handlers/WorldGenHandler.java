/**
 *Apr 24, 2013
 *3:45:48 PM
 *2013
 */
package com.civilizationcraft.CC.core.handlers;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.civilizationcraft.CC.lib.CivBlocks;
import com.civilizationcraft.CC.lib.WorldGenVars;

import cpw.mods.fml.common.IWorldGenerator;

/**
 * Civilizationcraft
 * 
 * WorldGenHandler.java
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class WorldGenHandler implements IWorldGenerator
    {

        @Override
        public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
            {
                switch (world.provider.dimensionId)
                    {
                        case 1:
                            generateNether(world, random, chunkX * 16, chunkZ * 16);
                            break;
                        case 0:
                            generateSurface(world, random, chunkX * 16, chunkZ * 16);
                            break;
                        case -1:
                            generateEnd(world, random, chunkX * 16, chunkZ * 16);
                    }
            }

        private void generateEnd(World world, Random random, int chunkX, int chunkZ)
            {

            }

        private void generateSurface(World world, Random random, int chunkX, int chunkZ)
            {

                // Aluminum
                for (int i = 0; i < WorldGenVars.SpawnRateAluminum; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(WorldGenVars.SpawnHeightAluminum);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(CivBlocks.oreAluminum.blockID, WorldGenVars.VeinSizeAluminum).generate(world, random, xCoord, yCoord, zCoord);
                    }

                // Chromium
                for (int i = 0; i < WorldGenVars.SpawnRateChromium; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(WorldGenVars.SpawnHeightChromium);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(CivBlocks.oreChromium.blockID, WorldGenVars.VeinSizeChromium).generate(world, random, xCoord, yCoord, zCoord);
                    }
                
                // Cinnabar
                for (int i = 0; i < WorldGenVars.SpawnRateCinnabar; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(WorldGenVars.SpawnHeightCinnabar);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(CivBlocks.oreCinnabar.blockID, WorldGenVars.VeinSizeCinnabar).generate(world, random, xCoord, yCoord, zCoord);
                    }
                
                // Cobalt
                for (int i = 0; i < WorldGenVars.SpawnRateCobalt; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(WorldGenVars.SpawnHeightCobalt);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(CivBlocks.oreCobalt.blockID, WorldGenVars.VeinSizeCobalt).generate(world, random, xCoord, yCoord, zCoord);
                    }
                
                // Copper
                for (int i = 0; i < WorldGenVars.SpawnRateCopper; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(WorldGenVars.SpawnHeightCopper);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(CivBlocks.oreCopper.blockID, WorldGenVars.VeinSizeCopper).generate(world, random, xCoord, yCoord, zCoord);
                    }
                
             // Lead
                for (int i = 0; i < WorldGenVars.SpawnRateLead; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(WorldGenVars.SpawnHeightLead);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(CivBlocks.oreLead.blockID, WorldGenVars.VeinSizeLead).generate(world, random, xCoord, yCoord, zCoord);
                    }
                
             // Lithium
                for (int i = 0; i < WorldGenVars.SpawnRateLithium; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(WorldGenVars.SpawnHeightLithium);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(CivBlocks.oreLithium.blockID, WorldGenVars.VeinSizeLithium).generate(world, random, xCoord, yCoord, zCoord);
                    }
                
             // Magnesium
                for (int i = 0; i < WorldGenVars.SpawnRateMagnesium; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(WorldGenVars.SpawnHeightMagnesium);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(CivBlocks.oreMagnesium.blockID, WorldGenVars.VeinSizeMagnesium).generate(world, random, xCoord, yCoord, zCoord);
                    }
                
             // Mithril
                for (int i = 0; i < WorldGenVars.SpawnRateMithril; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(WorldGenVars.SpawnHeightMithril);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(CivBlocks.oreMithril.blockID, WorldGenVars.VeinSizeMithril).generate(world, random, xCoord, yCoord, zCoord);
                    }
                
             // Nickel
                for (int i = 0; i < WorldGenVars.SpawnRateNickel; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(WorldGenVars.SpawnHeightNickel);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(CivBlocks.oreNickel.blockID, WorldGenVars.VeinSizeNickel).generate(world, random, xCoord, yCoord, zCoord);
                    }
                
             // Silver
                for (int i = 0; i < WorldGenVars.SpawnRateSilver; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(WorldGenVars.SpawnHeightSilver);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(CivBlocks.oreSilver.blockID, WorldGenVars.VeinSizeSilver).generate(world, random, xCoord, yCoord, zCoord);
                    }
                
             // Thorium
                for (int i = 0; i < WorldGenVars.SpawnRateThorium; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(WorldGenVars.SpawnHeightThorium);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(CivBlocks.oreThorium.blockID, WorldGenVars.VeinSizeThorium).generate(world, random, xCoord, yCoord, zCoord);
                    }
                
             // Tin
                for (int i = 0; i < WorldGenVars.SpawnRateTin; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(WorldGenVars.SpawnHeightTin);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(CivBlocks.oreTin.blockID, WorldGenVars.VeinSizeTin).generate(world, random, xCoord, yCoord, zCoord);
                    }
                
             // Titanium
                for (int i = 0; i < WorldGenVars.SpawnRateTitanium; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(WorldGenVars.SpawnHeightTitanium);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(CivBlocks.oreTitanium.blockID, WorldGenVars.VeinSizeTitanium).generate(world, random, xCoord, yCoord, zCoord);
                    }
                
             // Tungsten
                for (int i = 0; i < WorldGenVars.SpawnRateTungsten; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(WorldGenVars.SpawnHeightTungsten);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(CivBlocks.oreTungsten.blockID, WorldGenVars.VeinSizeTungsten).generate(world, random, xCoord, yCoord, zCoord);
                    }
                
             // Uranium
                for (int i = 0; i < WorldGenVars.SpawnRateUranium; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(WorldGenVars.SpawnHeightUranium);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(CivBlocks.oreUranium.blockID, WorldGenVars.VeinSizeUranium).generate(world, random, xCoord, yCoord, zCoord);
                    }
                
             // Zinc
                for (int i = 0; i < WorldGenVars.SpawnRateZinc; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(WorldGenVars.SpawnHeightZinc);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(CivBlocks.oreZinc.blockID, WorldGenVars.VeinSizeZinc).generate(world, random, xCoord, yCoord, zCoord);
                    }

            }

        private void generateNether(World world, Random random, int chunkX, int chunkZ)
            {

            }

    }
