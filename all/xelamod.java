package com.xelatercero.xelamod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import reference.Reference;

@Mod(modid=Reference.MOD_ID , name=Reference.MOD_NAME , version=Reference.VERSION )
public class xelamod {
	
	@SidedProxy(clientSide=Reference.CLIENT_SIDE, serverSide=Reference.SERVER_SIDE)
	 public static CommonProxy proxy;
	@Instance
	public static xelamod instance = new xelamod();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		
		proxy.preInit();
	
}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		
		proxy.Init();
}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		
		proxy.postInit();
}
}


