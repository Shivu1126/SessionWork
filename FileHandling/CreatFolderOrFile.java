package FileHandling;

import java.io.File;

public class CreatFolderOrFile {

	public static void main(String[] args) {
		LikeAsMain fileHandling = new LikeAsMain();
		fileHandling.createFolder();
		fileHandling.createFile();
		fileHandling.deleteFile();
		fileHandling.deleteFolder();
	}

}
class LikeAsMain
{
	protected void createFolder()
	{
		File folder = new File("C:\\JavaTextFile\\FILE HANDLING");
		boolean present = folder.exists();
		System.out.println("Folder present : " + present);
		
		if(!present)
		{
			folder.mkdir();
			System.out.println("Folder created...");
		}
		present = folder.exists();
		System.out.println("Folder present : " + present);		
		
	}
	
	protected void createFile()
	{
		File file = new File("C:\\JavaTextFile\\FILE HANDLING\\createFile.txt");
		boolean present = file.exists();
		System.out.println("File present : " + present);
		
		if(!present)
		{
			try {
				boolean created = file.createNewFile();
				if(created)
					System.out.println("File created...");
				else
					System.out.println("File Not created...");
			}
			catch (Exception e) {
				System.out.println("Error...");
			}			
		}
		
		present = file.exists();
		System.out.println("File present : " + present);		
		
	}
	
	protected void deleteFile() 
	{
		File file = new File("C:\\JavaTextFile\\FILE HANDLING\\createFile.txt");
		file.delete();
		boolean present = file.exists();
		System.out.println("File present : " + present);		
	}
	
	protected void deleteFolder()
	{
		File folder = new File("C:\\JavaTextFile\\FILE HANDLING");
		folder.delete();
		boolean present = folder.exists();
		System.out.println("File present : " + present);
	}
	
}