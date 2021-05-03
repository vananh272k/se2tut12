package tuts.tut10.to_dos.bridge.devices;

public class Tv implements Device {
	private boolean on = false;
	private int volume = 30;
	private int channel = 1;

	@Override
	public boolean isEnabled() {
		return on;
	}

	@Override
	public void enable() {
		on = true;
	}

	@Override
	public void disable() {
		on = false;
	}

	//TO-DO: Implement getVolume() method
	@Override
	public int getVolume() {
		return 0;
	}

	//TO-DO: Implement setVolume() method
	/**
	 * @effects <pre>
	 * 	if volume is valid
	 * 		this.volume = volume
	 * </pre>
	 */
	@Override
	public void setVolume(int volume) {
		//use 'if-elseif-else' structure to limit the volume from 0 to 100
		//outside the range is invalid
		if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
	 
	}

	//TO-DO: Implement getChannel() method
	/**
	 * @effects return channel
	 */
	@Override
	public int getChannel() {
		return channel;
	}

	//TO-DO: Implement setChannel() method
	/**
	 * @effects <pre>
	 * 	if channel is valid
	 * 		this.volume = volume
	 * </pre>
	 */
	@Override
	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public void printStatus() {
		
        System.out.println("------------------------------------");
        
		//Show the current device is TV
        System.out.println("| I'm TV set.");
        
		//Show the current status: enabled or disabled
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
		
		//Show the current volume
        System.out.println("| Current volume is " + volume + "%");
        
		//Show the current channel
        System.out.println("| Current channel is " + channel);
        
        System.out.println("------------------------------------\n");
	}
}
