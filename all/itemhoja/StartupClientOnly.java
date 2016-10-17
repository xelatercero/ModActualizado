package com.xelatercero.xelamod.itemhoja;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly {
	
	public static void preInit() {																	
		ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("xelamod:itemhoja", "inventory"); //Indico el mod y el paquete en el que esta
		final int TIPO_POR_DEFECTO = 0;
		ModelLoader.setCustomModelResourceLocation(StartupCommon.itemHoja, TIPO_POR_DEFECTO, itemModelResourceLocation);
	}
	
	public static void Init() {
		
	}
	
	public static void postInit() {
		
	}

}
