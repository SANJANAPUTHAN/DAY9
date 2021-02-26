package lab6;

public class Program45 {
public static void main(String[] args) {
	Bank bank=new Bank("Sanjana",23456778,"SAvings",5000);
	bank.deposit(3000);
	bank.display();
}
}
class Bank
{
	private String name;
	private long accountnumber;
	private String type;
	private int balance;
	public Bank(String name,long accountnumber,String type,int balance)
	{
		this.name=name;
		this.accountnumber=accountnumber;
		this.type=type;
		this.balance=balance;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final long getAccountnumber() {
		return accountnumber;
	}
	public final void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public final String getType() {
		return type;
	}
	public final void setType(String type) {
		this.type = type;
	}
	public final int getBalance() {
		return balance;
	}
	public final void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposit(int amount)
	{
		System.out.println(getBalance());
		this.balance+=amount;
		System.out.println(getBalance());
	}
	public void display()
	{
		System.out.println("NAME---->"+getName()+" BALANCE"+getBalance());
	}
}