package com.malekire.thaumcraft2port.blocks;

import com.malekire.thaumcraft2port.Main;
import com.malekire.thaumcraft2port.init.ModBlocks;
import com.malekire.thaumcraft2port.init.ModItems;
import com.malekire.thaumcraft2port.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
		
	}
}
