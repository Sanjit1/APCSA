import java.util.*;

public class StudentAnswerSheet {
	public ArrayList<String> answers;

	// a)
	public double getScore(ArrayList<String> key) {
		double score = 0;
		for (int i = 0; i < answers.size(); i++) { 
			if (key.get(i).equalsIgnoreCase(answers.get(i))) {
				score+=1;
			} else if(!(key.get(i).equals("?"))) {
				score+= -.25;
			}
		}
		return score;
	}
}