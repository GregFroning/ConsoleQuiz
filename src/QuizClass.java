/*
 * Name:		Greg Froning
 * Date:		6/14/2014
 * Description: This program quizzes the user in two different fashions. One until answers all correctly.
 */

public class QuizClass {
	//Define variables for storing information
	private String[] Questions = new String[5];
	private String[] Answers = new String[5];

	
	//Constructor for the class
	public QuizClass ()
	{
		Questions[0] = "How many fouls are allowed in a baseketball game? \nA. One \nB. Two \nC. Three \nD. Five";
		Questions[1] = "What amount is the largest point alloted for a single shot? \nA. One \nB. Two \nC. Three \nD. Four";
		Questions[2] = "How many feet away from the hoop is the free throw line? \nA. 13 \nB. 15 \nC. 18 \nD. 20";
		Questions[3] = "How many players are on the court per team? \nA. Four \nB. Two \nC. Five \nD. Six";
		Questions[4] = "How long is a basketball court? \nA. 94 \nB. 50 \nC. 100 \nD. 45";
		
		Answers[0] = "D";
		Answers[1] = "C";
		Answers[2] = "B";
		Answers[3] = "C";
		Answers[4] = "A";
	}
	
	//Method for checking answers
	public boolean CheckAnswer(int quest, String ans )
	{
		switch (quest)
		{
			case 1:				
				if ( ans.equalsIgnoreCase(Answers[0]) )
				{
					return true;
				}
				else
				{
					return false;
				}

			case 2:
				if ( ans.equalsIgnoreCase(Answers[1]) )
				{
				return true;
				}
				else
				{
					return false;
				}
			
			case 3:
				if ( ans.equalsIgnoreCase(Answers[2]) )
				{
				return true;
				}
				else
				{
					return false;
				}
				
			case 4:
				if ( ans.equalsIgnoreCase(Answers[3]) )
				{
				return true;
				}
				else
				{
					return false;
				}
				
			case 5:
				if ( ans.equalsIgnoreCase(Answers[4]) )
				{
				return true;
				}
				else
				{
					return false;
				}
		}
		return false;
	}
	
	//Method for grabbing the questions
	public String GetQuestion( int quest )
	{
				switch (quest)
				{
					case 1:				
						return Questions[0];
					case 2:
						return Questions[1];
					case 3:
						return Questions[2];
					case 4:
						return Questions[3];
					case 5:
						return Questions[4];
				}
				
				return "Question Not Found";
	}

}
