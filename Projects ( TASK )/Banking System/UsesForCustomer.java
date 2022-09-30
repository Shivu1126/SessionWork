package bankingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class UsesForCustomer
{
	Scanner scanner = new Scanner(System.in);
	protected void usesForCustomer(CustomerDetail customerInfo, ArrayList<TransectionDetail> transectionInfo, ArrayList<CustomerDetail> customerList)
	{
		System.out.println("Enter yout option : ");
		System.out.println("1.View Transection");
		System.out.println("2.Withdraw");
		System.out.println("3.Deposite");
		int customerOption=scanner.nextInt();
		switch(customerOption)
		{
		case 1:
			viewTransection(customerInfo,transectionInfo);
			break;
		case 2:
			withdrawAmount(customerInfo,transectionInfo);
			break;
		case 3:
			depositeAmount(customerInfo,transectionInfo,customerList);
			break;
		default:
			break;
		}
	}
	
	protected void viewTransection(CustomerDetail customerInfo, ArrayList<TransectionDetail> transectionList)
	{
		int accountNumber=customerInfo.accountNumber;
		System.out.println("-----------------------------------------------------------");
		System.out.println("Name : " +customerInfo.customerName+ "\tAccount.No :"+customerInfo.accountNumber);
		System.out.println("Via\t\tMethod\t\tAmount\t\tBalance");
		System.out.println("-----------------------------------------------------------");

		for(TransectionDetail transection:transectionList)
		{
			if(accountNumber==transection.accountNumber)
				System.out.println(transection.transectionThrough+"\t\t"+transection.method+"\t\t"+transection.amount+"\t\t"+transection.accountBalance);
		}
		System.out.println("-----------------------------------------------------------");

	}
	
	private void withdrawAmount(CustomerDetail customerInfo, ArrayList<TransectionDetail> transectionList) {

		System.out.println("Enter which type of withdraw");
		System.out.println("1.ATM");
		System.out.println("2.Gpay");
		System.out.println("3.Bank");
		int typeOfTransection=scanner.nextInt();
		String theWay="";
		if(typeOfTransection==1)
			theWay="ATM";
		if(typeOfTransection==2)
			theWay="Gpay";
		if(typeOfTransection==3)
		{
			theWay="Bank";
		}
		boolean forLoop=true;
		while(forLoop)
		{
			System.out.println("Enter amount : ");
			int amount=scanner.nextInt();
			if(amount<=customerInfo.accountBalance) 
			{
				customerInfo.accountBalance-=amount;
				System.out.println("Money depited");
				transectionList.add(new TransectionDetail(customerInfo.accountNumber,theWay,"withdraw",amount,customerInfo.accountBalance));
				System.out.println("Your Account Balance : "+customerInfo.accountBalance);

				forLoop=false; 
			}
			else
				System.out.println("insufficent money...");

		}
		//lines.add(new line_det(123,"atm","withdraw",200,300));
	}
	
	private void depositeAmount(CustomerDetail customerInfo, ArrayList<TransectionDetail> transectionList, ArrayList<CustomerDetail> customerDetail)
	{
		System.out.println("Enter which type of deposite");
		System.out.println("1.ATM");
		System.out.println("2.Gpay");
		System.out.println("3.Account Transfer");
		boolean k=true;
		String theWay="";
		int type=0;
		while(k)
		{	
			type=scanner.nextInt();			
			if(type==1)
			{theWay="ATM";k=false;}
			else if(type==2)
			{theWay="Gpay";k=false;}
			else if(type==3)
			{
				theWay="AccountTranfer";
				k=false;

			}
			else
				System.out.println("Enter 1 to 3....");			
		}
		if(type==3)
		{
			int transferAccountNumberInOrNot=1;
			
			System.out.println("Enter Transfer Account Num : ");
			int transferAccount=scanner.nextInt();
			for(CustomerDetail tranferAccount:customerDetail)
			{
				if(tranferAccount.accountNumber==transferAccount)
				{
					transferAccountNumberInOrNot=0;
					int tranferAmount=0;
					boolean forLoop=true;
					while(forLoop)
					{
						System.out.println("Enter transfer amount : ");
						tranferAmount=scanner.nextInt();
						if(customerInfo.accountBalance>=tranferAmount)
						{
							tranferAccount.accountBalance+=tranferAmount;		
							transectionList.add(new TransectionDetail(tranferAccount.accountNumber,theWay,"Deposite",tranferAmount,tranferAccount.accountBalance));
							System.out.println("Money credited to '"+tranferAccount.customerName+"'");

							customerInfo.accountBalance-=tranferAmount;
							transectionList.add(new TransectionDetail(customerInfo.accountNumber,theWay,"Tranfer",tranferAmount,customerInfo.accountBalance));
							System.out.println("Your Account Balance : "+customerInfo.accountBalance);
							forLoop=false;
						}
						else
						{
							System.out.println("Insufficient Money...");
						}
					}
				}
			}
			if(transferAccountNumberInOrNot==1)
			{
				System.out.println("Account Number doesn't exist....");
			}
		}
		else
		{
			System.out.println("Enter amount : ");
			int amount=scanner.nextInt();

			customerInfo.accountBalance+=amount;		
			transectionList.add(new TransectionDetail(customerInfo.accountNumber,theWay,"Deposite",amount,customerInfo.accountBalance));
			System.out.println("Money credited...");
		}

	}

}
