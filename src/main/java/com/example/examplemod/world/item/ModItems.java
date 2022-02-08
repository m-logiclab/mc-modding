package com.example.examplemod.world.item;

import com.example.examplemod.Sample01;
import com.example.examplemod.world.level.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS , Sample01.MOD_ID);

    public static final RegistryObject<Item> PINK_DIAMOND =
            ITEMS.register( "pink_diamond" , () -> new Item( new Item.Properties().tab(CreativeModeTab.TAB_MISC) ) );
    public static final RegistryObject<Item> PINK_DIAMOND_ORE =
            ITEMS.register( "pink_diamond_ore" , ()-> new BlockItem(ModBlocks.PINK_DIAMOND_ORE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

}
