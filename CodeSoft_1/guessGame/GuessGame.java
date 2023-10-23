package CodeSoft_1.guessGame;

import java.util.Scanner;

class GameStart
{
	private int chances=5;
	private int correct=0;
	private int score=0;
	private int wrongs=0;








	public void GuessGameBegin()
	{
		Scanner sc=new Scanner(System.in);



		while(chances!=0)
		{
			int rand_number=(int)Math.round(Math.random()*(5-1)+1);
//			The print statement is only for confirming which number has been generated
//			You can later remove this statement
//			System.out.println(rand_number);
		System.out.println("Please guess the number bwtween 1 to 5");
		int guess_num=sc.nextInt();
		if(guess_num==rand_number)
		{
			System.out.println("You have Guess the correct Number");
			System.out.println("CONGRULATIONS!!!");
			correct+=1;
			score+=25;
		}
		else if(guess_num>rand_number)
		{
			System.out.println("Opps!!!Wrong guess");
			System.out.println("Your guess was TOO HIGH");
			wrongs+=1;

		}
		else if(guess_num<rand_number)
		{
			System.out.println("Opps!!!Wrong guess");
			System.out.println("Your guess was TOO LOW");
			wrongs+=1;
		}



		chances-=1;
	}

		if(chances==0)
		{
			System.out.println("\u001B[32m" +"Your Score is [chances=" + chances + ", correct=" + correct + ", score=" + score + ", wrongs=" + wrongs
					+ "]");
			chances=5;
			correct=0;
			score=0;
			wrongs=0;
		}
	}





	}















public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		GameStart start=new GameStart();
		System.out.println("\u001B[33m"+"------------------------Welcome to Guess Game Play and win--------------------");
		System.out.println();


		boolean exit=true;
		p:while(exit)
		{
		System.out.println("Please Enter your choice");
		System.out.println("\u001B[31m"+ "1: Start the game"+"\u001B[0m");
		System.out.println("\u001B[31m" +"2: Exit the game"+"\u001B[0m");


		int choice=sc.nextInt();

		switch(choice)
		{
		case 1:
		{

			start.GuessGameBegin();
			System.out.println("Your Attempts are Over");
			System.out.println("Do you want to Play Again,Press 1");

			break;

		}
		case 2:
		{
			System.out.println("---------------------------------------------");
			System.out.println("\u001B[32m"+"Thanks For Playing Guess The Game and Won"+"\u001B[0m");
			break p;
		}

		default:
		{
			System.out.println("Please click the Shown Button correcctly");
		}


	}

}
}
}