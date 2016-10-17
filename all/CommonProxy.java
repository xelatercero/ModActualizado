package com.xelatercero.xelamod;

import com.xelatercero.xelamod.itemhoja.StartupCommon;

public abstract class CommonProxy {

	public void preInit() {
		StartupCommon.preInitCommon();
		
	}
	
	public void Init() {
		
		
	}

	public void postInit() {
	
	
}

	 public abstract boolean isDedicatedServer();

}
