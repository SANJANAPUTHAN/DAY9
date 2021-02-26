package lab6;

public class Program52 {
public static void main(String[] args) {
	BankDetails bk[]=new BankDetails[5];
	for(int i=0;i<5;i++)
	{
		bk[i]=new BankDetails();
	}
	bk[0].setName("Sanjana....");
	bk[0].setAccountnumber(29984390);
	bk[1].setAccountnumber(37429234);
	bk[1].setName("Shilpha");
	for(int i=0;i<5;i++)
	{
		System.out.println(bk[i].getAccountnumber()+"             "+bk[i].getName());
	}
	
	
}
}

class BankDetails
{
	BankDetails()
	{
		this.name=null;
		this.accountnumber=0;
	}
	private String name;
	private long accountnumber;
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
	public BankDetails(String Name,long accountNumber)
	{
		this.name=Name;
		this.accountnumber=accountNumber;
	}
}
