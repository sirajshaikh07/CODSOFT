package CodeSoft_4.Bank;

public class ATM_impl implements ATM_Dao{

	Bank_Account ac;
	public Bank_Account getAc() {
		return ac;
	}

	public void setAc(Bank_Account ac) {
		this.ac = ac;
	}

	@Override
	public int withdraw(int withdraw) {
		if(withdraw>this.ac.getAmount())
		{
			System.out.println("Insufficient Balance");
		}

		else
		{
			int amount=this.ac.getAmount();
			int withdraws=amount-withdraw;
			this.ac.setAmount(withdraws);
			System.out.println(+withdraw+" amount successfully withdraw");
			System.out.println("Your remaining balace is "+ this.ac.getAmount());
		}
		return 0;
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("Your account balance is "+ this.ac.getAmount());
	}

	@Override
	public void deposit(int dp_amount) {
		int sum=ac.getAmount();
		sum+=dp_amount;
		ac.setAmount(sum);
		System.out.println("The Amount"+dp_amount+ "has been successfully deposited");


	}

}
