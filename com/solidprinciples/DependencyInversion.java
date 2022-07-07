package com.solidprinciples;
/**
 * Decouple it and also they should be dependent on abstraction
 * 
 * @author ravijha
 *
 */
public class DependencyInversion {

	class Mouse
	{
		
	}
	class WirelessMouse extends Mouse{
		
	}
	
	class System 
	{
		Mouse mouse = null;
		
		System()
		{
			mouse = new WirelessMouse();// tight coupling with wireless mouse
		}
		// loose couple
		System(WirelessMouse mouse)
		{
			this.mouse = mouse;
		}
		//abstraction
		System(Mouse mouse)
		{
			this.mouse = mouse;
		}
		
	}
}
