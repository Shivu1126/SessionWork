package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandlingTask {

	public static void main(String[] args) throws Exception {
		StartMain init = new StartMain();
		init.countLine();
		init.countCharacters();
		init.copiedFile();
		init.filePath();
	}
}
class StartMain 
{
	File file = new File("C:\\Users\\saran\\eclipse-workspace\\JavaSessionWork\\src\\FileHandling\\FileHandlingTask.java");
	
	protected void countLine() throws IOException
	{
		int countLine = 0;

		try {
			FileReader fReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fReader);
			String line = bReader.readLine();
			while(line!=null)
			{
				countLine++;
			//	System.out.println(line);
				line = bReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		}
		System.out.println("Number of line in file : "+countLine);
	}
	
	protected void countCharacters() throws Exception
	{
		int countChar = 0;

		try {
			FileReader fReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fReader);
			String line = bReader.readLine();
			//int l = 1;
			
			while(line!=null)
			{
				int i=0;
				while(i!=line.length())
				{
					if(line.charAt(i)!=' ' && line.charAt(i)!='\t')
					{
						countChar++;
					}
					i++;
				}
				//System.out.println(l+".line : "+countChar);
				//l++;
				line = bReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		}
		System.out.println("Number of characters in file : "+countChar);
	}
	
	protected void copiedFile() throws Exception
	{
		InputStream inputFile = new FileInputStream(file);
		File newFile = new File("C:\\Users\\saran\\eclipse-workspace\\JavaSessionWork\\src\\FileHandling\\CopiedOfFileHandlingTask.java");

		boolean present = newFile.exists();
		System.out.println("File present : " + present);
		
		if(!present)
		{
			try {
				boolean created = newFile.createNewFile();
				if(created)
					System.out.println("File created...");
				else
					System.out.println("File Not created...");
			}
			catch (Exception e) {
				System.out.println("Error...");
			}			
		}
		
		OutputStream outputFile = new FileOutputStream(newFile);
		int content = inputFile.read();
		while(content!=-1)
		{
			outputFile.write((char)content);
			content = inputFile.read();
		}
		outputFile.flush();
		printCopiedFile(newFile);
		
		
	}
	
	private void printCopiedFile(File printFile) throws Exception
	{
		FileReader reader = new FileReader(printFile);
		
		int output = reader.read();
		
		while(output!=-1)
		{
			System.out.print((char)output);
			output = reader.read();
		}		
		reader.close();		
	}
	
	protected void filePath() {
		Path path = Paths.get("CopiedOfFileHandlingTask.java");		
		System.out.println(path.toAbsolutePath());
	}
	
}