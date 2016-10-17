package com.xelatercero.xelamod.itemhoja;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemHoja extends Item{
	
	public ItemHoja() {
		final int NUMERO_HOJAS_MAXIMO = 1;
	    this.setMaxStackSize(NUMERO_HOJAS_MAXIMO);
	    this.setCreativeTab(CreativeTabs.MISC);   // the item will appear on the Miscellaneous tab in creative
	}
}
