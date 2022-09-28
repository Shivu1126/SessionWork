package libraryManagement;

import java.util.ArrayList;
import java.util.Scanner;

class AddBooksAndDeleteBooks {
	static Scanner s=new Scanner(System.in);
	
	protected void addBook(ArrayList<Books> booksDetail)
	{
		System.out.println("Enter new Book name..");
		String newBookName = s.next();
		
		for(int i=0;i<booksDetail.size();i++)
		{
			if(newBookName.equals(booksDetail.get(i).bookName))	//increment the stock when already present book.
			{
				booksDetail.get(i).stock++;
				System.out.println("Book Added");
				return;
			}
		}
		System.out.println("Enter author name");
		String newAuthorName = s.next();
		int newBookId = booksDetail.size()+1;
		System.out.println("Enter how many books");
		int newBookStock = 0;
		while(true)
		{
			newBookStock = s.nextInt();
			if(newBookStock<1)				//Stock must be greater then 0
			{
				System.err.println("Enter proper input");
				System.out.println("please enter how many books");
			}
			else
				break;
		}
		
		booksDetail.add(new Books(newBookName, newBookId, newAuthorName, newBookStock));
		System.out.println("New book added in library");
	}
	
	protected void deleteBook(ArrayList<Books> booksDetail)
	{
		System.out.println("Enter deleted book id");
		int deletedBookId;
		Books deletedBookDetail = null;
		while(true)
		{
			deletedBookId = s.nextInt();
			int j=0;
			for(int i=0;i<booksDetail.size();i++)
			{
				if(booksDetail.get(i).bookId==deletedBookId && booksDetail.get(i).stock!=0)
				{
					deletedBookDetail = booksDetail.get(i);
					j=1;
					break;
				}					
			}
			if(j==1)
				break;
			else
				System.err.println("Book not present..");
			System.out.println("If you want continue...press 1...else press anyother number");
			int stopThis = s.nextInt();
			if(stopThis!=1)
				return;
		}
		deletedBookDetail.stock = 0;
		System.out.println("Book is deleted from library...");
	}
}
