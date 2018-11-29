package com.techelevator;

public class Elevator {

	
    private int currentLevel = 1;
    private int numberOfLevels = 10;
    private boolean doorOpen;
  

    /** 
     * Creates a new elevator 
     * @param shaftNumber Shaft for the elevator
     * @param totalNumberOfFloors Number of floors in the elevator
     */
    public Elevator(int currentLevel, int totalNumberOfFloors) {
        this.numberOfLevels = totalNumberOfFloors;
        this.currentLevel = 1;
    }


    /**
     * Current elevator level 
     * @return currentLevel
     */
    public int getCurrentLevel() {
        return currentLevel;
    }

    /**
     * Number of levels available for elevator. 
     * @return numberOfLevels
     */
    public int getNumberOfLevels() {
        return numberOfLevels;
    }

    /**
     * Is Elevator Door Open? 
     * @return doorOpen
     */


    /**
     * Opens the elevator door, as long as it is not moving 
     */
    public boolean OpenDoor()
    {
        doorOpen = true;
        return doorOpen;
        
    }

    /**
     * Closes the elevator door, as long as it is not moving. 
     * @return 
     */
    public boolean CloseDoor()
    {
        
            doorOpen = false;
            return doorOpen;
        
    }

    /**
     * Moves the elevator up, as long as the door is closed and the desired floor is not past the last floor 
     * @param desiredFloor Desired floor to go to
     * @return 
     * @return If the elevator was able to move up
     */
    public int GoUp(int desiredFloor)
    {

        if (desiredFloor > currentLevel && desiredFloor <= numberOfLevels && !doorOpen)
        {
        	currentLevel = desiredFloor;
        	return currentLevel;
        }
        else
        {
            return currentLevel;
        }
    }

    /**
     * Moves the elevator down, as long as the door is closed and desired floor is lower than current but not past 1 
     * @param desiredFloor Floor to go to
     * @return True if possible to move
     */
    public int GoDown(int desiredFloor)
    {
        if (!doorOpen && desiredFloor < currentLevel && desiredFloor > 0)
        {
            currentLevel -= desiredFloor;
            return currentLevel;
        }

        return currentLevel;
    }

}
