package com.techelevator;

public class Elevator {
	
    private int currentFloor;
    private int numberOfFloors;
    private boolean doorOpen;
   

    
    public Elevator( int totalNumberOffloors) {
       
    	this.numberOfFloors = totalNumberOffloors;
        this.currentFloor = 1;
        doorOpen = false;
    }
    
    
    public int getCurrentFloor() {
        return currentFloor;
    }

    
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    
    public boolean isDoorOpen() {
        return doorOpen;
    }


    
    public void openDoor()
    {
        if (doorOpen == false) {
            doorOpen = true;
        }
    }

    
    public void closeDoor()
    {
        if (doorOpen == true) {
            doorOpen = false;
        }
    }

    
    public void goUp(int desiredFloor)
    {
        if (doorOpen) {
        	desiredFloor = currentFloor;
        	doorOpen = false;
        }

        if (desiredFloor > currentFloor && desiredFloor <= numberOfFloors) {
         currentFloor = desiredFloor;
           
        }
        
    }

    
    public void goDown(int desiredFloor)
    {
        if (doorOpen) {
        	desiredFloor = currentFloor;
        	doorOpen = false;
        }
    	
    	if (desiredFloor < currentFloor && desiredFloor >= 1) {
            currentFloor = desiredFloor;
            
        }

        return;
    }
}



//### Constructor
//
//The `Elevator` class has a single constructor that takes one argument. New elevators start on floor 1.
//
//    Elevator(int totalNumberOffloors)
//
//- `totalNumberOfFloors` indicates how many floors are available to the elevator
//
//### Methods
//    
//    void openDoor()
//    void closeDoor()
//    void goUp(int desiredFloor)
//    void goDown(int desiredFloor)        
//    
//**Notes**
//- `openDoor()` opens the elevator door.
//- `closeDoor()` closes the elevator door.
//- `goUp(int desiredFloor)` sends the elevator upward to the desired floor as long as the door is not open. Cannot go past last floor.
//- `goDown(int desiredFloor)` sends the elevator downward to the desired floor as long as the door is not open. Cannot go past floor 1.

