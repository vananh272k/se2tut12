package tuts.tut10.to_dos.bridge;

import tuts.tut10.to_dos.bridge.devices.Device;
import tuts.tut10.to_dos.bridge.devices.Radio;
import tuts.tut10.to_dos.bridge.devices.Tv;
import tuts.tut10.to_dos.bridge.remotes.AdvancedRemote;
import tuts.tut10.to_dos.bridge.remotes.BasicRemote;

public class Demo {
	public static void main(String[] args) {
		testDevice(new Tv());
		testDevice(new Radio());
	}

	//TO-DO: Implement the method testDevice()
	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		//Create the new BasicRemote instance
        BasicRemote basicRemote = new BasicRemote(device);

		//Power on the device
        basicRemote.power();
		 
		//Display the status of device
        device.printStatus();
		 

		System.out.println("Tests with advanced remote.");
		//Create the new AdvancedRemote instance
        AdvancedRemote advancedRemote = new AdvancedRemote(device);

		//Power on the device
        advancedRemote.power();
		
		//Mute the device
        advancedRemote.mute();
		 
		//Display the status of device
        device.printStatus();
				 
	}
}
