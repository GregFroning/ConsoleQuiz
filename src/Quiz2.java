/*
 * Name:		Greg Froning
 * Date:		6/14/2014
 * Description: This program quizzes the user in two different fashions. One until answers all correctly.
 */
import java.util.Scanner;


public class Quiz2 {

	public static void main(String[] args) {
		//Define required variables
		QuizClass Quiz = new QuizClass();
		Scanner input = new Scanner( System.in );
		String ans;
		int questNum = 1;
		int correct = 0;
		double percentage;
		boolean check;
		
		//Loop through questions/receive input
		while (questNum < 6){

			System.out.println(Quiz.GetQuestion(questNum));
			ans = input.next();
			check = Quiz.CheckAnswer(questNum, ans);
			
			//Loop question until it is answered correctly
			while ( check == false )
			{
				System.out.println(Quiz.GetQuestion(questNum));
				ans = input.next();
				check = Quiz.CheckAnswer(questNum, ans);
				System.out.println("Incorrect");
			}
			System.out.println("Correct");
			correct = correct + 1;
			questNum = questNum + 1;
			}
		
		//Display results
		System.out.println("Results: " + correct + "/5");
	}

}
