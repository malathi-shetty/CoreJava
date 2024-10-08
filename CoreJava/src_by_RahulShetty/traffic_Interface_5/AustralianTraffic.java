package traffic_Interface_5;

import interface_4.CentralTraffic;
import interface_4.ContinentTraffic;
import interface_4.Continental_Traffic;

public class AustralianTraffic implements CentralTraffic, Continental_Traffic, ContinentTraffic { // Multiple Inheritance

	public static void main(String[] args) {
		
		CentralTraffic ct = new AustralianTraffic(); // class object referring method of CentralTraffic Interface to use methods of interface
		ct.greenGo();
		ct.redStop();
		ct.FlashYellow();
		
		AustralianTraffic at = new AustralianTraffic(); // class object referring method of AustralianTraffic
		at.walkonsymbol();
		
		Continental_Traffic cc = new AustralianTraffic();
		cc.Trainsymbol();
		
		ContinentTraffic tc= new AustralianTraffic();
		tc.Airsymbol();

	}

	@Override
	public void greenGo() {
		System.out.println("Green Light --> Go");
		
	}

	@Override
	public void redStop() {
		
		System.out.println("Red Light --> Stop");
	}

	@Override
	public void FlashYellow() {
		
		System.out.println("Flash Yellow --> Wait");
	}
	
	public void walkonsymbol()
	{
		System.out.println("I am walking");
	}

	@Override
	public void Trainsymbol() {
		System.out.println("I am in Train");
		
	}

	@Override
	public void Airsymbol() {
		System.out.println("I am in AeroPlane");
		
	}

}
