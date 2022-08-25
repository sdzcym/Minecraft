package io.github.frapples.supermagicstonemod.init;

import io.github.frapples.supermagicstonemod.SuperThings.*;
import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameData;

/**
 * Created by minecraft on 17-2-26.
 */
public class ClientProxy extends CommonProxy{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);

        registerRender(SuperStone.self(), 0);
        registerRender(SuperFireplace.self(), 0);
        registerRender(SuperAshes.self(), 0);
        registerRender(PoorStone.self(), 0);
        registerRender(ImperativeStone.self(), 0);
    }


    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }


    static public void registerRender(Item item, int metadata) {
        String name = GameData.getItemRegistry().getNameForObject(item).toString();
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(name, "inventory"));
    }

    static public void registerRender(Block block, int metadata)
    {
        Item item = Item.getItemFromBlock(block);
        String name = GameData.getBlockRegistry().getNameForObject(block).toString();
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(name, "inventory"));
    }
}
