package libraryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnTheBook 
{
	static Scanner s = new Scanner(System.in);
	protected void returnBook( ArrayList<Books> booksDetails, ArrayList<UserInfo> userDetails )
	{
		System.out.println("Enter userId");
		int userId = s.nextInt();
		int userInOrNot = 0;
		for(int i=0;i<userDetails.size();i++)
		{
			if(userId == userDetails.get(i).userId)
			{
				userInOrNot = 1;
				break;
			}
		}
		if(userInOrNot == 0)
		{
			System.out.println("User Id Not present.");
			return;
		}
		System.out.println("Enter book name..");
		String returnBookName = s.next();
		int stopLoop = 0;

		for(int i=0;i<userDetails.size();i++)
		{
			stopLoop = 0;
			for(int j=0;j<userDetails.get(i).givingBooks.size();j++)
			{
				if(userDetails.get(i).givingBooks.get(j).userId == userId && userDetails.get(i).givingBooks.get(j).bookName.equals(returnBookName) )
				{
					if(userDetails.get(i).givingBooks.get(j).returnDate.equals(""))
					{
						System.out.println("Enter the return date");
						String bookReturnDate = s.next();
						userDetails.get(i).givingBooks.get(j).returnDate = bookReturnDate;
						stopLoop = 1;
						break;
					}
				}
			}
			if(stopLoop == 1)
				break;
		}
		
		if(stopLoop == 0)
		{
			System.out.println("You not take this book");
			return;
		}
		
		else
		{
			for(int i=0;i<booksDetails.size();i++)
			{
				if(booksDetails.get(i).bookName.equals(returnBookName))
				{
					
					System.out.println("Book condition : ");
					System.out.println("1. Proper Return");
					System.out.println("2. Book damged");
					System.out.println("Press 1 or 2 ");
					int bookCondition = s.nextInt();				
					ReturnTheBook returnTheBook = new ReturnTheBook();
					returnTheBook.updateBookCondition(bookCondition,userDetails,userId,returnBookName);
					
					booksDetails.get(i).stock++;
					System.out.println("Book returned successfully");
					break;
				}
			}
		}
	}
	
	private void updateBookCondition(int bookCondition, ArrayList<UserInfo> userDetails, int userId, String returnBookName)
	{

		if(bookCondition==1)
		{
			System.out.println("No fine");
			for(int i=0;i<userDetails.size();i++)
			{
				for(int j=0;j<userDetails.get(i).givingBooks.size();j++)
				{
					if(userDetails.get(i).givingBooks.get(j).userId == userId && userDetails.get(i).givingBooks.get(j).bookName.equals(returnBookName) )
					{
						userDetails.get(i).givingBooks.get(j).bookCondition = "Good";
						return;
					}
				}
			}		
		}
		
		else
		{
			System.out.println("Book damaged.Pay ₹75 fine. ");
			for(int i=0;i<userDetails.size();i++)
			{
				for(int j=0;j<userDetails.get(i).givingBooks.size();j++)
				{
					if(userDetails.get(i).givingBooks.get(j).userId == userId && userDetails.get(i).givingBooks.get(j).bookName.equals(returnBookName) )
					{
						userDetails.get(i).givingBooks.get(j).bookCondition = "Damaged. Fine ₹75";
						return;
					}
				}
			}
		}
		
	}
}
