package task3;
import java.util.Scanner;
public class ATM implements user {
	
	public void withdraw(double amount,Bank_account bc)
	{
		if(amount>bc.balance)
		{
			System.out.println("Oops! Insufficient balance!");
			return;
		}
		else
		{
			System.out.println("Your withdrawl is successful!");
			bc.balance-=amount;
			System.out.println("Your available balance after withdrawl is "+bc.balance+" rupees.");
		}
	}
	public void deposit(double amount,Bank_account bc)
	{
		bc.balance+=amount;
		System.out.println("Your deposit is successful.");
		System.out.println("Your available balance after deposit is "+bc.balance+" rupees.");
	}
	public double checkBalance(Bank_account bc)
	{
		System.out.println("Your available balance is "+bc.balance+" rupees.");
		return bc.balance;
	}
	public static void main(String[] args) {
		ATM a1=new ATM();
		Bank_account bc =new Bank_account(1000000);
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("Press\t'0' to withdraw from ATM,\n\t'1' to deposit,\n\t'2' to check your balance:" );
			int option=sc.nextInt();
			double amount;
			switch(option)
			{
			     case 0:System.out.print("Enter withdrawl amount:");
			            amount =sc.nextDouble();
			    	    a1.withdraw(amount,bc);
			    	    break;
			     case 1:System.out.print("Enter depositing amount:");
		                amount =sc.nextDouble();
		    	        a1.deposit(amount,bc);
		    	        break;
			     case 2:a1.checkBalance(bc);
	    	            break;
			     
			}
			System.out.println("");
			System.out.print("Do you want to \t'0' continue OR\n\t\t'1' exit?:" );
			if(sc.nextInt()==1)
				break;
			System.out.println("");
			
		}
		
	}

}
