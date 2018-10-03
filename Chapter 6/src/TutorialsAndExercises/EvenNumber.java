package TutorialsAndExercises;

import java.util.Scanner;

public class EvenNumber 
{

	public static void main(String[] args) 
	{
		
		int userChoice;
		Scanner input = new Scanner(System.in);
		
		
		do 
		{
			System.out.println("Please pick a number>> ");
			userChoice = input.nextInt();
			if(userChoice % 2 == 0) 
			{
				System.out.println("Good job");
			}
			else
			{
				System.out.println("ERROR");
			}
		
		

	}

}
