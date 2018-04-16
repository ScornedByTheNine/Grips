import java.util.ArrayList;
import java.util.Scanner;
public class QuizMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Score = 0 ;
		int total = 0 ;
		String Answer ;
		
		//scanner boot
		Scanner input = new Scanner(System.in);
		
		
		ArrayList<Question> MyQuestions = new ArrayList<Question>();
		
		
	//set questions
		
		Question QuestionOne = new Question("*hitmarker*", "oof");
		Question QuestionTwo = new Question("Type back 'RvYnT'", "RvYnT");
		Question QuestionThree = new Question("type RvYnT again dont worry bout caps brah", "RvYnT");
		Question QuestionFour = new Question("Q", "A");
		Question QuestionFive = new Question("q", "a");
		Question QuestionSix = new Question("Que?", "Que?");
		
		// make an array to store the questions

		
		MyQuestions.add (QuestionOne);
		MyQuestions.add (QuestionTwo);
		MyQuestions.add (QuestionThree);
		MyQuestions.add (QuestionFour);
		MyQuestions.add (QuestionFive);
		MyQuestions.add (QuestionSix);
		
		for (Question q : MyQuestions) {
			System.out.println(q.getQuestion());
			Answer = input.nextLine();
			if(q.getAnswer().equals(Answer)) {
				Score = Score+1;
				System.out.println("Correct");
				
			}
			else System.out.println("Incorrect");

		}
	System.out.println("Total;" + Score ) ;
	}

}
