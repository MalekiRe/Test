package com.malekire.thaumcraft2port.init;

import java.util.ArrayList;
import java.util.List;

import com.malekire.thaumcraft2port.blocks.BlockBase;
import com.malekire.thaumcraft2port.blocks.BlockNormalVisCrystalBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block THAUMIC_INFUSER = new BlockBase("thaumic_infuser", Material.IRON);
	public static final Block NORMAL_VIS_CRYSTAL_BLOCK = new BlockNormalVisCrystalBase("viscrystalblock1", Material.IRON);
}
