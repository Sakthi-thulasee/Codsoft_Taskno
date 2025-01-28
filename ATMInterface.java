import java.util.Scanner;
class Useraccount
{
	private double bal,minbalance=500.0;//Declaration and initialization of the varaibale
	//Constructor to initialize the balance
	public Useraccount(double initialbalance)
	{
		this.bal=initialbalance;
	}
	//Method to Deposit the amount
	public void deposit(double amt)
	{
		if(amt>0)
		{
		bal+=amt;
		System.out.println("Deposited Successfully:");
		System.out.println("Your current balance is:"+bal);
		}
		else
		{
			System.out.println("Invalid Amount!Check the deposited amount:");
		}
	}
	//Method to Withdraw the amount
	public void withdraw(double amt)
	{
		if(amt>0)
		{
			bal-=amt;
			if(bal>minbalance)
			{
			System.out.println("Withdraw Successfull:");
			System.out.println("Your current balance is:"+bal);
			}
			else
			{
				System.out.println("Insufficient balance.Please maintain Minimum Balance to avoid penalty!");
			}
		}
		else
		{
			System.out.println("Withdrawal Failed:");
		}
	}
	//Method to check balance
	public double checkbalance()
	{
		return bal;
	}
}
public class ATMInterface
{
	public static void main(String args[])	
	{
		Scanner sc=new Scanner(System.in);
		Useraccount u=new Useraccount(20000.0);
		while(true)
		{
			System.out.println("\n ATM interface menus:");
			System.out.println("1.Check Balance:");
			System.out.println("2.Deposit Money:");
			System.out.println("3.Withdraw Money:");
			System.out.println("4.Exit");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:System.out.println("your cuurent balance is:"+u.checkbalance());
			       break;
			case 2:System.out.println("Enter the amount to be deposited:");
			      double damt=sc.nextDouble();
			       u.deposit(damt);
			       break;
			case 3:System.out.println("Enter the withdrawl amount:");
		              double wamt=sc.nextDouble();
			      u.withdraw(wamt);
			      break;
			case 4:System.out.println("Thank u for visiting");
			       sc.close();
			       System.exit(0);//Termination of the program
			default:System.out.println("invalid option");
		
		}
}
     }
}
	
	
	
	
	
	
	
	
	
