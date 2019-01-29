package com.iaaa.morestairsmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairsPublic;

public class BlockStairs extends BlockStairsPublic {
	private String Name;
	
	public BlockStairs(Block block, String NAME, String UNLOCALIZED_NAME) {
		super(block.getDefaultState());

		this.setName(NAME);
		this.setRegistryName(NAME);
		this.setUnlocalizedName(UNLOCALIZED_NAME);

		this.setLightOpacity(0);
	}
	
	public String getName() {
		return Name;
	}
	private void setName(String name) {
		this.Name = name;
	}
}
