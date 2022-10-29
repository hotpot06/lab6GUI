package weightedGradesWithGUI;

public class weightedGrades {
	private int pointTotal;
	private int earnedPoints;
	private int assignmentPercentage;
	private double totalWeightedGrade;
	
	public weightedGrades(int total, int earned, int percentage) {
		pointTotal = total;
		earnedPoints = earned;
		assignmentPercentage = percentage;
		System.out.println(assignmentPercentage);
	}
	
	public double gettotalWeightedGrades() {
		totalWeightedGrade = 0.01 * 100 * earnedPoints / pointTotal * assignmentPercentage;
		//String num1 = String.format("%.3f",totalWeightedGrade);
		return totalWeightedGrade;
	}
}
