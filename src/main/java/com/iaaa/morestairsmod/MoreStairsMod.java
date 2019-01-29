package com.iaaa.morestairsmod;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
//import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod(
	modid = MoreStairsMod.MODID,
	name = MoreStairsMod.NAME,
	version = MoreStairsMod.VERSION)
public class MoreStairsMod
{
    public static final String MODID = "morestairsmod";
    public static final String VERSION = "1.0.0";
    public static final String NAME = "More Stairs Mod";
    public static final String RESOURCE_INVENTORY  = "inventory";
    
    @Mod.Instance(MODID)
	public static MoreStairsMod instance;

	@SidedProxy(serverSide = "com.iaaa.morestairsmod.server.Proxy",
                clientSide = "com.iaaa.morestairsmod.client.Proxy")
    public static com.iaaa.morestairsmod.server.Proxy proxy;

    @SidedProxy(serverSide = "com.iaaa.morestairsmod.server.ModelLoader",
                clientSide = "com.iaaa.morestairsmod.client.ModelLoader")
    public static com.iaaa.morestairsmod.server.ModelLoader ModelLoader;
    
    // blocks
    public static BlockStairs blockRedNetherBrickStairs; 
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        GameRegistry.addShapedRecipe(new ItemStack(blockRedNetherBrickStairs, 4),
                "#  ", "## ", "###", '#', Blocks.RED_NETHER_BRICK);
    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		proxy.preInit(event);
		
    	// red nether brick stairs
    	blockRedNetherBrickStairs = new BlockStairs(Blocks.NETHER_BRICK, "red_nether_brick_stairs", "stairsRedNetherBrick");
    	proxy.registerStairs(blockRedNetherBrickStairs);
    	proxy.setStairsCustomModelResourceLocation(blockRedNetherBrickStairs);
    }
}
