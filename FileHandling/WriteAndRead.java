package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAndRead {

	public static void main(String[] args) throws Exception {
		WriteAndRead init = new WriteAndRead();
	//	init.writeFile();
	//	init.readFile();
		init.characterCount();
	}
	
	@SuppressWarnings("unused")
	private void writeFile() throws IOException
	{
		File file = new File("C:\\JavaTextFile\\FILE HANDLING\\createFile.txt");
		boolean present = file.exists();
		System.out.println("File present : " + present);
		
		FileWriter writer = new FileWriter(file);
		writer.write("write Something");
		writer.append("heyy...\n how r u...\n");
		writer.flush();
	}
	
	@SuppressWarnings("unused")
	private void readFile() throws IOException
	{
		File file = new File("C:\\JavaTextFile\\FILE HANDLING\\createFile.txt");
		FileReader reader = new FileReader(file);
		
		int output = reader.read();
		
		while(output!=-1)
		{
			System.out.print((char)output);
			output = reader.read();
		}		
		reader.close();
	}
	
	private void characterCount()  throws Exception
	{
		
		File file = new File("C:\\JavaTextFile\\FILE HANDLING\\createFile.txt");
		FileReader reader = new FileReader(file);
		
		char[] characters = new char[(int)file.length()];
		System.out.println("TOtal characters : "+characters.length);
		
		System.out.println("Print file data...");
		reader.read(characters);
		for(char ch : characters)
			System.out.print(ch);
		
		reader.close();
	}
}
