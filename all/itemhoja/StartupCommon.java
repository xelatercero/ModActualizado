package com.xelatercero.xelamod.itemhoja;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {
	
	public static ItemHoja itemHoja;
	
	public static void preInitCommon() {
		
		itemHoja = (ItemHoja)(new ItemHoja().setUnlocalizedName("Hoja"));
		itemHoja.setRegistryName("ItemHoja");
		GameRegistry.register(itemHoja);
	}
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
	
}

}
