package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class HomeworkAssignmentTest {

	HomeworkAssignment assignment;
	
	@Before
	public void setUp() {
		
		assignment = new HomeworkAssignment(100);
		Assert.assertNotNull(assignment);
		Assert.assertEquals("Expected Possible Marks = " , 100 , assignment.getPossibleMarks());
		
		
	}
		
	////////////////////////////////////////////////////////////
	
	@Test
	public void testCorrectGradeReturned() {
		
		assignment.setTotalMarks(91);
		Assert.assertEquals("Letter grade should be: ", "A", assignment.getLetterGrade());
		assignment.setTotalMarks(81);
		Assert.assertEquals("Letter grade should be: ", "B", assignment.getLetterGrade());
		assignment.setTotalMarks(71);
		Assert.assertEquals("Letter grade should be: ", "C", assignment.getLetterGrade());
		assignment.setTotalMarks(61);
		Assert.assertEquals("Letter grade should be: ", "D", assignment.getLetterGrade());
		assignment.setTotalMarks(51);
		Assert.assertEquals("Letter grade should be: ", "F", assignment.getLetterGrade());
	}
	
	@Test
	public void testInorrectGradeInputted() {
		
		assignment.setTotalMarks(-50);
		Assert.assertEquals("Expected grade input to be in range.", "N/A", assignment.getLetterGrade());
		assignment.setTotalMarks(150);
		Assert.assertEquals("Expected grade input to be in range.", "N/A", assignment.getLetterGrade());
	}
	

}

//Things to look/test for
//
//* does the correct letter grade get returned?
//* what happens when an incorrect value is given for total marks?