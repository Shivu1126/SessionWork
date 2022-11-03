package fileCopy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilesTransfer start = new FilesTransfer();
		start.init();
	}

}
class FilesTransfer
{
	protected void init() {
		File folder = new File("C:\\Users\\saran\\OneDrive\\Desktop\\SourceFile");
		File[] files = folder.listFiles();
		if(files==null)
		{
			System.out.println("Folder is empty");
			return;
		}
		filesDetails(files);
	}

	private void filesDetails(File[] files) 
	{
		ArrayList<File> fileDet = new ArrayList<>();
		PriorityQueue<Long> filesSize = new PriorityQueue<>();
		for(File file: files)
		{
			long size = file.length();
			fileDet.add(file);
			filesSize.add(size);
		}
		while(!filesSize.isEmpty())
		{
			long minSizeFile = filesSize.poll();
			checkSameSize(minSizeFile,fileDet);
		}
		
	}

	private void checkSameSize(long minSizeFile, ArrayList<File> fileDet) 
	{
		for(File files:fileDet)
		{
			if(minSizeFile==files.length())
			{
				System.out.println(files.getName()+" file is copy to new folder..(Size ="+files.length()+")");
				copyTheFile(files);
				fileDet.remove(files);
				break;
			}
		}
	}

	private void copyTheFile(File files) {
		File targetFolder = new File("C:\\Users\\saran\\OneDrive\\Desktop\\TargetFolder");
		if(!targetFolder.exists())
		{
			targetFolder.mkdir();
			System.out.println("TargetFolder created");
		}
		File targetFile = new File("C:\\Users\\saran\\OneDrive\\Desktop\\TargetFolder\\"+files.getName());
		if(!targetFile.exists())
		{
			try {
				targetFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileReader reader = new FileReader(files);
			FileWriter writer = new FileWriter(targetFile);
			BufferedReader readFile = new BufferedReader(reader);
			BufferedWriter writeFile = new BufferedWriter(writer);
			
			String line = readFile.readLine();
			while(line!=null)
			{
				writeFile.write(line);
				writeFile.write("\n");
				line = readFile.readLine();
			}
			writeFile.flush();
			readFile.close();
			writeFile.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//@HEVC_Moviesz Virumandi (2004) Tamil 720p AMZN WEB-DL 10bit.mkv 322121494528
