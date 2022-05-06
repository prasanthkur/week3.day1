package week3.day1;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		System.out.println("This is axis bank fixed depost");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank bank =new AxisBank();
		bank.fixed();
		bank.saving();
		bank.deposit();

	}

}
