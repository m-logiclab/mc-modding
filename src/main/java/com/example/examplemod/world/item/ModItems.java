package com.example.examplemod.world.item;

import com.example.examplemod.Sample01;
import com.example.examplemod.world.level.block.ModBlocks;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS , Sample01.MOD_ID);

    public static final RegistryObject<Item> PINK_DIAMOND =
            ITEMS.register( "pink_diamond" , () -> new Item( new Item.Properties().tab( Sample01.TAB ) ) );

    public static final RegistryObject<Item> PINK_DIAMOND_ORE =
            ITEMS.register( "pink_diamond_ore" , ()-> new BlockItem(ModBlocks.PINK_DIAMOND_ORE.get(),
                    new Item.Properties().tab(Sample01.TAB)));

    public static final RegistryObject<Item> PINK_DIAMOND_PICKAXE =
            ITEMS.register("pink_diamond_pickaxe",
                    () -> new PickaxeItem( ModTiers.PINK_DIAMOND , 1 , -2.8F ,
                            new Item.Properties().tab(Sample01.TAB)));

    public static final RegistryObject<Item> PINK_DIAMOND_AXE =
            ITEMS.register("pink_diamond_axe",
                    () -> new AxeItem( ModTiers.PINK_DIAMOND , 5.0F, -3.0F ,
                            new Item.Properties().tab(Sample01.TAB)));

    public static final RegistryObject<Item> PINK_DIAMOND_HOE =
            ITEMS.register("pink_diamond_hoe",
                    () -> new HoeItem( ModTiers.PINK_DIAMOND , -3, 0.0F ,
                            new Item.Properties().tab(Sample01.TAB)));

    public static final RegistryObject<Item> PINK_DIAMOND_SHOVEL =
            ITEMS.register("pink_diamond_shovel",
                    () -> new ShovelItem( ModTiers.PINK_DIAMOND , 1.5F, -3.0F ,
                            new Item.Properties().tab(Sample01.TAB)));

    public static final RegistryObject<Item> PINK_DIAMOND_SWORD =
            ITEMS.register("pink_diamond_sword",
                    () -> new SwordItem( ModTiers.PINK_DIAMOND , 3, -2.4F ,
                            new Item.Properties().tab(Sample01.TAB)));

    public static final RegistryObject<Item> PINK_DIAMOND_HELMET =
            ITEMS.register( "pink_diamond_helmet",
                    () -> new ArmorItem( ModArmorMaterials.PINK_DIAMOND, EquipmentSlot.HEAD,
                            new Item.Properties().tab(Sample01.TAB)));

    public static final RegistryObject<Item> PINK_DIAMOND_CHESTPLATE =
            ITEMS.register( "pink_diamond_chestplate",
                    () -> new ArmorItem( ModArmorMaterials.PINK_DIAMOND, EquipmentSlot.CHEST,
                            new Item.Properties().tab(Sample01.TAB)));

    public static final RegistryObject<Item> PINK_DIAMOND_LEGGINGS =
            ITEMS.register( "pink_diamond_leggings",
                    () -> new ArmorItem( ModArmorMaterials.PINK_DIAMOND, EquipmentSlot.LEGS,
                            new Item.Properties().tab(Sample01.TAB)));

    public static final RegistryObject<Item> PINK_DIAMOND_BOOTS =
            ITEMS.register( "pink_diamond_boots",
                    () -> new ArmorItem( ModArmorMaterials.PINK_DIAMOND, EquipmentSlot.FEET,
                            new Item.Properties().tab(Sample01.TAB)));



}









