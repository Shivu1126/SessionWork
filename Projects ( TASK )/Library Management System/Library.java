package libraryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	static Scanner s = new Scanner(System.in);
	static ArrayList<Books> bookDetail = new ArrayList<>();
	static ArrayList<Librarian> librarianDetail = new ArrayList<>();
	static ArrayList<UserInfo> userInfo = new ArrayList<>();
	static ArrayList<GivenBookDetails> givenBookDetails = new ArrayList<>();
	
	protected void home()
	{
		bookDetail.add(new Books("JAVA", 1,"BalaSan",3));
		bookDetail.add(new Books("DBMS", 2,"SudhagarSan",3));
		
		librarianDetail.add(new Librarian(11, "Shiv", "Siva123"));
		
		System.out.println("__Home Page__");
		while(true)
		{
			System.out.println("1. Admin Login");
			System.out.println("2. Exit");
			System.out.println("Enter choice..");
			int choiceHome = s.nextInt();
			switch(choiceHome)
			{
				case 1:
					login(librarianDetail);	
					break;
				case 2:
					System.out.println("Thank you admin");
					return;
				default:
					System.out.println("Enter proper input..");
			}
		}
	}
	private void login(ArrayList<Librarian> librarians)
	{
		System.out.println("Enter admin id");
		int adminId;
		Librarian adminDetails = null;
		while(true)
		{
			adminId = s.nextInt();
			int check=0;
			for(int i=0;i<librarians.size();i++)
			{
				if(librarians.get(i).librarianId==adminId)
				{
					adminDetails = librarians.get(i);
					check=1;
					break;
				}
			}
			if(check==1)
				break;
			else
				System.out.println("Admin id invalid..");
			System.out.println("\nIf you want go to home page please press 1..");
			int returnToHome=s.nextInt();
			if(returnToHome==1)
			{
				return;
			}
		}
		
		System.out.println("Enter password");
		String password;
		while(true)
		{
			password = s.next();
			int check=0;
			for(int i=0;i<librarians.size();i++)
			{
				if(adminDetails.librarianId==adminId && librarians.get(i).password.equals(password))
				{
					check=1;
					break;
				}
			}
			if(check==1)
				break;
			else
				System.out.println("Password invalid..");
			System.out.println("\nIf you want go to home page please press 1..");
			int returnToHome=s.nextInt();
			if(returnToHome==1)
			{
				return;
			}
		}
		adminPage();
	}
	private void adminPage()
	{
		System.out.println("Admin options...");
		while(true)
		{
			System.out.println("1. Add Book");
			System.out.println("2. Delete Book");
			System.out.println("3. User info maintenace");
			System.out.println("4. Showing Books List");
			System.out.println("5. Assign a Book");
			System.out.println("6. Return a Book");
			System.out.println("7. Exit");
			System.out.println("Enter your option...");
			int choiceAdminPage = s.nextInt();
			switch(choiceAdminPage)
			{
				case 1:
					AddBooksAndDeleteBooks add = new AddBooksAndDeleteBooks();
					add.addBook(bookDetail);
					break;
				case 2:
					AddBooksAndDeleteBooks delete = new AddBooksAndDeleteBooks();
					delete.deleteBook(bookDetail);
					break;
				case 3:
					userInfoMaintenance();
					break;
				case 4:
					showBooksDetail(bookDetail);
					break;
				case 5:
					AssignABook assignABook = new AssignABook();
					assignABook.assignTheBookToUser(bookDetail,userInfo);
					break;
				case 6:
					ReturnTheBook returnTheBook = new ReturnTheBook();
					returnTheBook.returnBook(bookDetail, userInfo);
					break;
				case 7:
					return;
				default:
					System.out.println("Enter proper input...");
					break;
			}
		}
	}
	
	private void showBooksDetail(ArrayList<Books> showBooks)
	{
		System.out.println("__________________Books Details______________________");
		System.out.println("-----------------------------------------------------");
		System.out.println("BookId\tBookName\tAuthorName\tBookStock");
		System.out.println("-----------------------------------------------------");
		for(int i=0;i<showBooks.size();i++)
		{
			if(showBooks.get(i).stock>0)
			{
				System.out.println(showBooks.get(i).bookId+"\t"+showBooks.get(i).bookName+"\t\t"+showBooks.get(i).authorName+"\t\t"+showBooks.get(i).stock);
			}
		}
		System.out.println("-----------------------------------------------------");

	}
	
	private void userInfoMaintenance()
	{
		if(userInfo.isEmpty())
		{
			System.out.println("No Users..");
			return;
		}
			
		
		System.out.println("==============================================");
		for(int i=0;i<userInfo.size();i++)
		{
			System.out.println("User Name : "+userInfo.get(i).userName);
			System.out.println("User Id   : "+userInfo.get(i).userId);
			ArrayList<GivenBookDetails> userBook = userInfo.get(i).givingBooks;
			System.out.println("BookName\tAssignDate\tReturnDate\tBookCondition");
			System.out.println("----------------------------------------------");
			for(int j=0;j<userBook.size();j++)
			{
				System.out.println(userBook.get(j).bookName+"\t"+userBook.get(j).assignDate+"\t"+userBook.get(j).returnDate+"\t"+userBook.get(j).bookCondition);
			}
			System.out.println("----------------------------------------------");
		}
		System.out.println("==============================================");
		
	}
}
