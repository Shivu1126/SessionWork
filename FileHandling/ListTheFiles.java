package FileHandling;

import java.io.File;

public class ListTheFiles {

	public static void main(String[] args) {
		ListTheFiles init = new ListTheFiles();
		init.listFiles();
	}
	private void listFiles()
	{
		File file = new File("C:\\JavaTextFile");
		String listOfFile[]=file.list();		//its return a String
		for(int i=0;i<listOfFile.length;i++)
			System.out.println(listOfFile[i]);	//All files and folders name
		
		System.out.println();
		
		File fileFolderArray[] = file.listFiles(); //it return a File object
		for(File f:fileFolderArray)
			if(f.isFile())
				System.out.println(f);	// files Only
	
		System.out.println();
		for(File f:fileFolderArray)
			if(f.isDirectory())
				System.out.println(f);	// folders Only
		
		System.out.println();
		
		//File extension(type of file)
		for(File f:fileFolderArray)
		{
			if(f.isFile())
			{
				String fileName = f.getName();
				int lastIndexOfDot = fileName.lastIndexOf(".");
				String extension = fileName.substring(lastIndexOfDot+1);
				if(extension.equals("java"))
				{
					System.out.println(fileName);
				}
			}
		}
		
		
	}
}
