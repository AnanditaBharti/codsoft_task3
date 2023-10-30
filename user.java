package task3;
public interface user{
	public void withdraw(double amount,Bank_account bc);
	public void deposit(double amount,Bank_account bc);
	public double checkBalance(Bank_account bc);
}
