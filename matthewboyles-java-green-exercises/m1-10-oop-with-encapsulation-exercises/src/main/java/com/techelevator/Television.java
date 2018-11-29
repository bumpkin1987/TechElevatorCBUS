package com.techelevator;

public class Television {
	private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;

// `turnOn()` besides turning the tv on, also resets the channel to 3 and the volume level to 2
// `changeChannel(int newChannel)` changes the current channel (only if it is on) to the value of `newChannel` as long as it is between 3 and 18
// `channelUp()` increases the current channel by 1 (only if it is on). If the value goes past 18, then the current channel should be set to 3.
//`channelDown()` decreases the current channel by 1 (only if it is on). If the value goes below 3, then the current channel should be set to 18.
// `raiseVolume()` increases the volume by 1 (only if it is on). The limit is 10
// `lowerVolume()` decreases the volume by 1 (only if it is on). The limit is 0
    public void changeChannel(int newChannel) {
    	if (isOn && newChannel > 3 && newChannel < 18) {
    		this.currentChannel = newChannel;
        }
    }
    
    public boolean isOn() {
        return isOn;        
    }

    public void turnOn()
    {
        isOn = true;
    }

    public void turnOff()
    {
        isOn = false;
    }
    
    public void channelUp() {
    	if (isOn) {
    		currentChannel++;
    		if (currentChannel > 18) {
    			currentChannel = 3;
    		}
    	}
    }
   
    public void channelDown() {
    	if (isOn) {
    		currentChannel--;
    		if (currentChannel < 3) {
    			currentChannel = 18;
    		}
    	}
    		
    }
   
    public int getCurrentChannel() {
    	return currentChannel;
    }
  
    public int getCurrentVolume() {
        return currentVolume;            
    }

    public void raiseVolume() {
        if (isOn) {
        	currentVolume++;
        }
    }

    public void lowerVolume() {
        if (isOn && currentVolume > 0) {
        	currentVolume--;
        	if (currentVolume == 0) {
        		
        	}
        	
        }
    }
    
    

}
