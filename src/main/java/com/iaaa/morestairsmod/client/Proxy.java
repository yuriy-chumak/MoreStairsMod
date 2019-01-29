package com.iaaa.morestairsmod.client;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;

import com.iaaa.morestairsmod.BlockStairs;
import com.iaaa.morestairsmod.MoreStairsMod;

public class Proxy extends com.iaaa.morestairsmod.server.Proxy {
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}
	
	@Override
	public void setStairsCustomModelResourceLocation(BlockStairs stairs)
	{
		ModelLoader.setCustomModelResourceLocation(
				Item.getItemFromBlock(stairs), 0,
				new ModelResourceLocation(MoreStairsMod.MODID + ":" + stairs.getName(), "inventory"));
	}
}