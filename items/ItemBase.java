package com.malekire.thaumcraft2port.items;

import com.malekire.thaumcraft2port.Main;
import com.malekire.thaumcraft2port.init.ModItems;
import com.malekire.thaumcraft2port.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels() 
	{
		// TODO Auto-generated method stub
		Main.proxy.registerItemRender(this, 0, "inventory");
	}

}
