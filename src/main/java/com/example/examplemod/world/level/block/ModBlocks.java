package com.example.examplemod.world.level.block;

import com.example.examplemod.Sample01;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create( ForgeRegistries.BLOCKS , Sample01.MOD_ID );
    public static final RegistryObject<Block> PINK_DIAMOND_ORE =
            BLOCKS.register( "pink_diamond_ore" , ()-> new OreBlock(
                    BlockBehaviour.Properties
                            .of(Material.STONE)
                            .requiresCorrectToolForDrops()
                            .strength( 3.0f,3.0f ),
                    UniformInt.of( 3,7 )
            ));

}
