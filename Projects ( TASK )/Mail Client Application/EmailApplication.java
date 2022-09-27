package emailConsoleApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailApplication {

	static ArrayList<UserDetail> userDetail = new ArrayList<UserDetail>();

	static Scanner s=new Scanner(System.in);

	static ArrayList<MessageDetail> sendMailList = new ArrayList<>();
	static ArrayList<MessageDetail> receivedMailList = new ArrayList<>();
	
	static int sendID = 1;
	static int receivedID = 1; 

	public static void main(String[] args)
	{
		ArrayList<MessageDetail> detailMailNew = new ArrayList<>();

		userDetail.add(new UserDetail("Sita", "lieutenantRam11", "princess11@zmail.com", detailMailNew, 0));
		userDetail.add(new UserDetail("Ram", "princessNoor11", "lieutenant11@zmail.com", detailMailNew, 0 ));

		System.out.println("Thank you for visited...");
		int option=0;
		while(option!=3)
		{
			System.out.println("1. Login");
			System.out.println("2. Create new account");
			System.out.println("3. Exit");
			System.out.println("Enter your option...");
			option = s.nextInt();

			switch(option)
			{
			case 1:
				login(userDetail);
				break;
			case 2:
				createNewID();
				break;
			case 3:
				System.out.println("Thank you for using ");
				return;
			default:
				System.out.println("Enter proper input");
				break;
			}
		}
	}

	private static void createNewID() 
	{
		System.out.println("Enter Your name..");
		String userName = s.next();

		System.out.println("Enter password..");
		System.out.println("( Must be above six charchters.\nMust atleast one characters are UpperCase,LowerCase and Numeric )");
		String password;		
		while(true)
		{
			password = s.next();
			boolean validPass = validPassword(password);
			if(validPass)
			{
				System.out.println("Paasword Accepted");
				break;
			}
			else 
				System.err.println("Password is weak.Re-enter a password...");
		}

		System.out.println("Enter email name..( we will add @zmail.com )");
		String emailIdName;
		while(true)
		{
			emailIdName = s.next();
			boolean checkEmail = checkEmailID(emailIdName);
			if(checkEmail)
			{
				emailIdName+="@zmail.com"; 
				break;
			}
			else
				System.err.println("This mail id already in.\nplease change email name.Enter correct email name.");
		}

		ArrayList<MessageDetail> receivedMailCreate = new ArrayList<>();
		boolean addOrNot = userDetail.add(new UserDetail(userName, password, emailIdName, receivedMailCreate, 0));
		if(addOrNot)
			System.out.println("Account created...");
		else
			System.out.println("Account not created....");
	}

	private static boolean checkEmailID(String emailIdName) {

		String mailId = emailIdName+"@zmail.com";
		for(int i=0;i<userDetail.size();i++)
		{
			if(mailId.equals(userDetail.get(i).emailID))
			{
				return false;
			}
		}		
		return true;
	}

	private static boolean validPassword(String password) 
	{
		if(password.length()<=6)
			return false;
		char arr[]=password.toCharArray();
		int cap=0,small=0,num=0;
		for(int i=0;i<password.length();i++)
		{
			if(arr[i]>='A' && arr[i]<='Z')
				cap++;
			if(arr[i]>='a' && arr[i]<='z')
				small++;
			if(arr[i]>='0' && arr[i]<='9')
				num++;
		}
		if(cap>0 && small>0 && num>0)
		{
			return true;
		}
		return false;
	}

	protected static void login(ArrayList<UserDetail> mailDetails)
	{
		UserDetail activeMail;

		System.out.println("Enter mail id");
		String mailName;

		while(true)
		{
			mailName = s.next();
			int presentMail = presentOrNotMail(mailName,mailDetails);
			if(presentMail!=-1)
			{
				activeMail = mailDetails.get(presentMail);
				break;
			}
			else
				System.err.println("Please enter proper mail id..");

			System.out.println("If you want create account.\nplease press 1..it will going to home page...");
			int i=s.nextInt();
			if(i==1)
			{
				return;
			}
		}

		System.out.println("Enter password..");
		String passwordLogin;
		while(true)
		{
			passwordLogin = s.next();
			boolean checkPass = checkPassword(passwordLogin,mailDetails,mailName);
			if(checkPass)
				break;
			else
				System.out.println("Password incorrect..");

			System.out.println("If you want go to home page.\n please press 1..");
			int i=s.nextInt();
			if(i==1)
			{
				return;
			}
		}

		System.out.println("Login successfull.");
		accountPage(activeMail, mailDetails);

	}

	private static boolean checkPassword(String passwordLogin,ArrayList<UserDetail> mailAccounts,String mailName)
	{
		for(int i=0;i<mailAccounts.size();i++)
		{
			if(mailName.equals(mailAccounts.get(i).emailID) && passwordLogin.equals(mailAccounts.get(i).password))
			{
				return true;
			}
		}
		return false;
	}

	protected static int presentOrNotMail(String mailName,ArrayList<UserDetail> mailAccounts) 
	{

		for(int i=0;i<mailAccounts.size();i++)
		{
			if(mailName.equals(mailAccounts.get(i).emailID))
			{
				return i;
			}
		}
		return -1;		
	}

	protected static void accountPage(UserDetail activeAccount,ArrayList<UserDetail> mailDetails)
	{
		System.out.println("Welcome "+activeAccount.name);
		System.out.println("Your Options..");
		while(true)
		{
			System.out.println("1. Compose mail");
			System.out.println("2. Recieved mails");
			System.out.println("3. Send mails");
			System.out.println("4. Delete recieved mails");
			System.out.println("5. Delete send mails");
			System.out.println("6. Logout");
			System.out.println("Enter options..");
			int pageOption = s.nextInt();

			switch(pageOption)
			{
			case 1:
				composeMail(activeAccount,mailDetails);
				break;
			case 2:
				receivedMailDisplayAndDelete(receivedMailList, activeAccount.emailID, 1);
				break;
			case 3:
				sentedMailDispalyAndDelete(sendMailList, activeAccount.emailID,1);
				break;
			case 4:
				receivedMailDisplayAndDelete(receivedMailList, activeAccount.emailID, 2);
				break;
			case 5:
				sentedMailDispalyAndDelete(sendMailList, activeAccount.emailID,2);
				break;
			case 6:
				System.out.println("Thank you "+activeAccount.name);
				return;
			default:
				System.out.println("Enter proper input..");
				break;
			}
		}

	}

	private static void composeMail(UserDetail activeAccount, ArrayList<UserDetail> mailInform)
	{
		System.out.println("To : ");
		String toMailId;
		int presentOrNot;
		while(true)
		{
			toMailId = s.next();
			presentOrNot = presentOrNotMail(toMailId,mailInform);
			if(presentOrNot!=-1)
			{
				break;
			}
			else
			{
				System.err.println("Invalid Email address..");
				System.out.println("Enter proper email address..");
			}
		}
		System.out.println("Enter your message..");
		s.nextLine();
		String message = s.nextLine();
		
		sendMailList.add(new MessageDetail(activeAccount.emailID, toMailId, message, sendID, "in"));
		receivedMailList.add(new MessageDetail(activeAccount.emailID, toMailId, message, receivedID, "in"));
		sendID++;
		receivedID++;
//		System.out.println(sendID);
//		System.out.println(receivedID);
//		System.out.println(activeAccount.name);
//		System.out.println(toMailId);
		System.out.println("Message Sented..");
	}

	private static void receivedMailDisplayAndDelete(ArrayList<MessageDetail> receivedMails,String userId,int deleteOrNot) 
	{
		int presentIds[]=new int[receivedMails.size()];
		int count=0;
		for(MessageDetail m: receivedMails)
		{
			if(m.to.equals(userId))
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Empty list");
			return;
		}
		int i=0;
		System.out.println("-------------------------------------------------");
		System.out.println(userId+": your received mails ");			
		System.out.println("-------------------------------------------------");
		System.out.println("messageId\tmessageFrom \t Message");
		System.out.println("-------------------------------------------------");
		for(MessageDetail m: receivedMails)
		{
			if(m.to.equals(userId) && m.status.equals("in"))
			{
				presentIds[i++]=m.messageId;
				System.out.println(m.messageId+"\tFrom:"+m.from+"\t-> "+m.message);
			}
		}
		System.out.println("-------------------------------------------------");
		
		if(deleteOrNot==2)
		{
			System.out.println("Enter message id for delete that message..");
			int deleteId = s.nextInt();
			for(int j=0;j<i;j++)
			{
				if(presentIds[j]==deleteId)
				{
					for(MessageDetail m: receivedMails)
					{
						if(m.messageId==presentIds[j])
						{
							m.status="removed";
							System.out.println("Message is removed..");
							break;
						}
					}
					return;
				}
			}
			System.err.println("Id not present..Message not removed");
		}
		
	}	
	
	private static void sentedMailDispalyAndDelete(ArrayList<MessageDetail> sendMails,String userId, int deleteOrNot)
	{
		int presentIds[]=new int[sendMails.size()];
		int count=0;
		//System.out.println(userId);
		for(MessageDetail m: sendMails)
		{
			if(m.from.equals(userId))
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Empty list");
			return;
		}
		int i=0;

		System.out.println("-------------------------------------------------");
		System.out.println(userId+": your send mails ");			
		System.out.println("-------------------------------------------------");
		System.out.println("messageId\tmessageTo \t Message");
		System.out.println("-------------------------------------------------");
		for(MessageDetail m: sendMails)
		{
			if(m.from.equals(userId) && m.status.equals("in"))
			{
				presentIds[i++]=m.messageId;
				System.out.println(m.messageId+"\tTo:"+m.to+"\t-> "+m.message);
			}
		}
		System.out.println("-------------------------------------------------");
		
		if(deleteOrNot==2)
		{
			System.out.println("Enter message id for delete that message..");
			int deleteId = s.nextInt();
			for(int j=0;j<i;j++)
			{
				if(presentIds[j]==deleteId)
				{
					for(MessageDetail m: sendMails)
					{
						if(m.messageId==presentIds[j])
						{
							m.status="removed";
							System.out.println("Message is removed..");
							break;
						}
					}
					return;
				}
			}
			System.err.println("Id not present..Message not removed");
		}
	}
	
}

class UserDetail
{
	String name;
	String password;
	String emailID;
	ArrayList<MessageDetail> mailDetails;
	int msgId;
	UserDetail(String name, String password, String emailID,ArrayList<MessageDetail> mailDetails,int msgId)
	{
		this.name = name;
		this.password = password;
		this.emailID = emailID;
		this.mailDetails = mailDetails;
		this.msgId = msgId;
	}
}

class MessageDetail
{
	String from;
	String to;
	String message;
	int messageId;
	String status;
	MessageDetail(String from, String to, String message,int messageId,String status)
	{
		this.from = from;
		this.to = to;
		this.message = message;
		this.messageId = messageId;
		this.status = status;
	}
}