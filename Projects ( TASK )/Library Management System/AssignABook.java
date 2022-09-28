package libraryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class AssignABook 
{
	static Scanner s = new Scanner(System.in);
	protected void assignTheBookToUser(ArrayList<Books> booksInStock, ArrayList<UserInfo> userInfo)
	{
		System.out.println("Enter the book name..");
		String assignBook;
		assignBook = s.next();
		int indexBooks = checkBookInOrNot(booksInStock,assignBook);
		if( indexBooks!=-1 && booksInStock.get(indexBooks).stock > 0 )
		{
			Books givenBook = booksInStock.get(indexBooks);
			addBookTOUser( userInfo, givenBook);
		}
		else
		{
			System.out.println("Sorry.This book is not present in this library..");
		}
			
	}
	
	private int checkBookInOrNot(ArrayList<Books> booksInStock, String assignBook) 
	{
		for(int i=0;i<booksInStock.size();i++)
		{
			if(booksInStock.get(i).bookName.equals(assignBook))
			{
				return i;
			}
		}
		
		return -1;
	}
	
	private void addBookTOUser( ArrayList<UserInfo> userInfo, Books givenBook)
	{
		System.out.println("Enter user id");
		int newUserId = s.nextInt();
		String assignDate;
		for(int i=0;i<userInfo.size();i++)
		{
			if(userInfo.get(i).userId == newUserId)
			{
				
				if(bookAlreadyTaken(userInfo.get(i), givenBook))
				{
					System.out.println("You already take this book and please return the book.");
					return;
				}
				
				System.out.println("Enter book assigned date(dd-mm-yyyy)");
				assignDate = s.next();
				userInfo.get(i).givingBooks.add(new GivenBookDetails(newUserId, givenBook.bookName, assignDate, "", ""));
				givenBook.stock--;
				System.out.println("Book assigned to "+userInfo.get(i).userName);
				return;
			}
		}
		System.out.println("Your id is not present...");
		System.out.println("If you want add your details to library..press 1..else press anyother number");
		int createUser = s.nextInt();
		if(createUser==1)
		{
			System.out.println("Enter user name");
			String newUserName = s.next();
			int userId = userInfo.size()+1;
			System.out.println("Your user id : "+userId);
			GivenBookDetails newGivenBook = new GivenBookDetails(0, "", "", "", "");
			ArrayList<GivenBookDetails> tempList = new ArrayList<>();
			
			tempList.add(newGivenBook);
			
			userInfo.add(new UserInfo(newUserName, userId, tempList));
			System.out.println("New User added...");
			
			System.out.println("Enter book assigned date(dd-mm-yyyy)");
			assignDate = s.next();
			
			userInfo.get(userId-1).givingBooks.set(0,new GivenBookDetails(userId, givenBook.bookName, assignDate, "", ""));
			givenBook.stock--;
			System.out.println("Book assigned to "+userInfo.get(userId-1).userName);
		
		}
		
	}

	private boolean bookAlreadyTaken(UserInfo userBookDetail, Books givenBook) {
		
		for(int i = 0;i<userBookDetail.givingBooks.size();i++)
		{
			if(userBookDetail.givingBooks.get(i).bookName.equals(givenBook.bookName) && userBookDetail.givingBooks.get(i).returnDate.equals(""))
			{
				return true;
			}
		}
		return false;		
	}
	
	
}
