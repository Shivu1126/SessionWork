package FileHandling;

import java.io.File;
import java.io.IOException;

public class RenameTheFile {

	public static void main(String[] args) {
		CalledFromMain rename = new CalledFromMain();
		rename.renameFile();
	}

}
class CalledFromMain
{
	protected void renameFile(){
		File file = new File("C:\\JavaTextFile\\FILE HANDLING\\renameFile.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File created...");
		System.out.println("File Name : " + file.getName());
		
		File newName = new File("C:\\JavaTextFile\\FILE HANDLING\\renameSuccess.txt");
		boolean success = file.renameTo(newName);
		System.out.println("Rename Successfull..." + success);
		System.out.println("File Name : " + newName.getName());

	}
}