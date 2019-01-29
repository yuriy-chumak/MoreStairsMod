package com.iaaa.morestairsmod.server;

import com.iaaa.morestairsmod.BlockStairs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.World;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Proxy implements IGuiHandler {
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	public void registerStairs(BlockStairs stairs)
	{
		GameRegistry.register(stairs);
		GameRegistry.register(new ItemBlock(stairs).setRegistryName(stairs.getName()));
	}
    
	public void setStairsCustomModelResourceLocation(BlockStairs stairs)
	{
		// do nothing
	}    
}
