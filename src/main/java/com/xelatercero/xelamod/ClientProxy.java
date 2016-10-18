package com.xelatercero.xelamod;

import com.xelatercero.xelamod.itemhoja.StartupClientOnly;

public class ClientProxy extends CommonProxy{
	
		public void preInit() {
			super.preInit();
			StartupClientOnly.preInit();
		}
		
		public void Init() {
			super.Init();
			
			
		}

		public void postInit() {
			super.postInit();
		}
		
		
		@Override
		  public boolean isDedicatedServer() {return false;}
}
