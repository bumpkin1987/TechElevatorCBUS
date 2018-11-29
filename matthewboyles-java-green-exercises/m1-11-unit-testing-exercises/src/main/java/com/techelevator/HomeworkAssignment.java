package com.techelevator;

public class HomeworkAssignment {
	
    private int totalMarks;
    private int possibleMarks;


    /**
     * Homework assignment requires possible marks 
     * @param possibleMarks
     */
    
    public HomeworkAssignment(int possibleMarks) {
        this.possibleMarks = possibleMarks;
    }

    /**
     * Total number of marks received 
     * @return
     */
    public int getTotalMarks() {
        return totalMarks;    
    }

    /**
     * Total number of marks received
     * @param totalMarks
     */
    public void setTotalMarks(int totalMarks) {
    	this.totalMarks = totalMarks;
    }

    /**
     * Possible number of marks to get right on the homework assignment. 
     * @return
     */
    public int getPossibleMarks() {
        return possibleMarks;            
    }

    private String submitterName;

    /**
     * Name of the person who submitted the homework assignment 
     * @return
     */
    public String getSubmitterName() {
        return submitterName;
    }
    
    /**
     * Name of the person who submitted the homework assignment 
     * @param submitterName
     */
    public void setSubmitterName(String submitterName) {
    	this.submitterName = submitterName;
    }

    /**
     * Letter grade for the assignment. (90-100 A, 80-89 B, 70-79 C, 60-69 D, otherwise F) 
     * @return
     */
    public String getLetterGrade() {
        double percentage = (double)totalMarks / possibleMarks;

        if (totalMarks > 100 || totalMarks < 0) {
        	return "N/A";
        }
        
        if (percentage >= 0.6 && percentage <= 0.69) {
            return "D";
        }
        if (percentage >= 0.7 && percentage <= 0.79) {
            return "C";
        }
        if (percentage >= 0.8 && percentage <= 0.89) {
            return "B";
        }
        if (percentage >= 0.9 && percentage <= 1) {
            return "A";
        }                                                
        else {
            return "F";
        }
        
    }

}
