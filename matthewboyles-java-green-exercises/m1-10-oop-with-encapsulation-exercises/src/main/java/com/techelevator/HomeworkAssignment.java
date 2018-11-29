package com.techelevator;

public class HomeworkAssignment {
	private int totalMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;


   
    
    public HomeworkAssignment(int possibleMarks) {
        this.possibleMarks = possibleMarks;
    }

    
    public int getTotalMarks() {
        return totalMarks;    
    }

    
    public void setTotalMarks(int totalMarks) {
    	this.totalMarks = totalMarks;
    }

    
    public int getPossibleMarks() {
        return possibleMarks;            
    }
    
    public String getSubmitterName() {
        return submitterName;
    }
  
    public void setSubmitterName(String submitterName) {
    	this.submitterName = submitterName;
    }

   
    public String getLetterGrade() {
        double percentage = ((double)totalMarks / possibleMarks);

        if (percentage >= 0.9d) {
            return "A";
        }
        else if (percentage >= 0.8d) {
            return "B";
        }
        else if (percentage >= 0.7d) {
            return "C";
        }
        else if (percentage >= 0.6d) {
            return "D";
        }                                                
        else {
            return "F";
        }
        
    }
}
