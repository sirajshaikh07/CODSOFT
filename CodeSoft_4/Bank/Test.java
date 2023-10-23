package CodeSoft_4.Bank;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank_Account bank=new Bank_Account();

		ATM_impl atm=new ATM_impl();
		atm.setAc(bank);
		Scanner sc=new Scanner(System.in);

		int attempts=0;
		p:while(attempts!=3)
		{
			System.out.println("Please Enter your password");
			String pass=sc.nextLine();
		if(pass.equals(bank.getPassword()))
		{

		boolean Exit=true;
		while(Exit)
		{
			System.out.println("Please Enter a choice");
			System.out.println("1: CheckBalance");
			System.out.println("2: Withdraw");
			System.out.println("3  Deposit");
			System.out.println("4  Exit");
			int choice=sc.nextInt();

			switch(choice)
			{
			case 1:
			{
				atm.check();
				break;

			}
			case 2:
			{
				System.out.println("please enter your withdrawing amount ");
				int amount=sc.nextInt();
				atm.withdraw(amount);
				break;
			}
			case 3:
			{
				System.out.println("Please enter deposting amount ");
				int amount=sc.nextInt();
				atm.deposit(amount);
				break;
			}
			case 4:
			{


				break p;
			}
			default:
			{
				System.out.println("please enter a valid choice");
			}



			}



		}



	}
		else
		{
			attempts+=1;
			System.out.println("Incorrect Password");

		}
		if(attempts==3)
		{
			System.out.println("You have Exceeded your limit");
		}


}
		System.out.println("Thanks for using our services");
}
}