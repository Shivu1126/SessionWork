package Exception;

public class customException {

	public static void main(String[] args) {
		int accountBalance=1000;
		int withdraw=1300;
		try
		{
			if(accountBalance<withdraw)
				throw new InsufficientMoney();
			else
				throw new YourBalance(accountBalance-withdraw);
		}
		catch(InsufficientMoney e)
		{
			System.out.println("Not enough money...");
			try {
			throw new message(accountBalance);
			}
			catch(message c)
			{
				System.out.println("....");
			}
		}
		catch(YourBalance e)
		{
			System.out.println("Thank you...");
		}
		
		
	}

}
class message extends Exception
{
	int amount;
	public message(int amt) {
		amount = amt;
		System.out.println("Your balance is .."+amount);
	}
}


class InsufficientMoney extends Exception
{
	InsufficientMoney()
	{
		System.out.println(",,,,");
	}
}
class YourBalance extends Exception
{
	int balance;
	public YourBalance(int bal) 
	{
		balance = bal;
		System.out.println("Your balance... "+balance);
	}
}