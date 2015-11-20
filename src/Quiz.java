/*
 * Name:		Greg Froning
 * Date:		6/14/2014
 * Description: This program quizzes the user in two different fashions. One until answers all correctly.
 */
import java.util.Scanner;


public class Quiz {

	public static void main(String[] args) {
		//Define required variables
		QuizClass Quiz = new QuizClass();
		Scanner input = new Scanner( System.in );
		String ans;
		int questNum = 1;
		int correct = 0;
		double percentage;
		boolean check;
		
		//Loop through and ask questions/receive input
		while (questNum < 6){

			System.out.println(Quiz.GetQuestion(questNum));
			ans = input.next();
			check = Quiz.CheckAnswer(questNum, ans);
			
			if ( check == false )
			{
				System.out.println("Incorrect");
			}
			else if (check == true )
			{
				System.out.println("Correct");
				correct = correct + 1;
			}

			questNum = questNum + 1;
			}
		
		//Calculate and print results
		percentage = (correct/5.0) * 100;
		System.out.println("Results: " + correct + "/5" + " Percent Correct :" + percentage + "%");
	}

}
