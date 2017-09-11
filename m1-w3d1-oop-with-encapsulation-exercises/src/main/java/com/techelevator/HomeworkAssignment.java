package com.techelevator;

public class HomeworkAssignment {

	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	public String getLetterGrade() {
		int percentageGrade = (totalMarks * 100) / possibleMarks;
		if(percentageGrade >= 90) {
			return "A";
			} else if(percentageGrade >=80 && percentageGrade <=89) {
				return "B";
			} else if(percentageGrade >=70 && percentageGrade <=79) {
				return "C";
			} else if(percentageGrade >=60 && percentageGrade <=69) {
				return "D";
		} else {
			return "F";
		}
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
		public String LetterGrade() {
			return LetterGrade();
		}


}

