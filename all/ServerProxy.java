package com.xelatercero.xelamod;

public class ServerProxy extends CommonProxy{

	public void preInit() {
		super.preInit();
	}
	
	public void Init() {
		super.Init();
	}

	public void postInit() {
		super.postInit();
	}
	
	
	@Override
	  public boolean isDedicatedServer() {return true;}
}
