package com.civilizationcraft.CC.core.handlers;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
//import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

/**
 * Civilizationcraft
 * 
 * WorldGenHandler
 * 
 * @author SuperClicheUsername
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class WorldGenHandler implements IWorldGenerator
    {

        @Override
        public void generate(Random random, int chunkX, int chunkZ,
                World world, IChunkProvider chunkGenerator,
                IChunkProvider chunkProvider)
            {
                switch (world.provider.dimensionId)
                    {
                        case 1:
                            generateNether(world, random, chunkX * 16,
                                    chunkZ * 16);
                            break;
                        case 0:
                            generateSurface(world, random, chunkX * 16,
                                    chunkZ * 16);
                            break;
                        case -1:
                            generateEnd(world, random, chunkX * 16, chunkZ * 16);
                    }
            }

        private void generateEnd(World world, Random random, int chunkX,
                int chunkZ)
            {

            }

        private void generateSurface(World world, Random random, int chunkX,
                int chunkZ)
            {
               /* // Aluminum
                for (int i = 0; i < AluminumSpawnRate; i++)
                    {
                        int xCoord = chunkX + random.nextInt(16);
                        int yCoord = random.nextInt(AluminumSpawnHeight);
                        int zCoord = chunkZ + random.nextInt(16);
                        new WorldGenMinable(
                                Civilizationcraft.AluminumOre.blockID, AluminumSpawnVeinSize).generate(world, random, xCoord, yCoord, zCoord);
                    } */
            }

        private void generateNether(World world, Random random, int chunkX,
                int chunkZ)
            {

            }

    }
