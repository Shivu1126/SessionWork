package jsonToPojo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import org.json.JSONArray;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class MainClass {
	public static void main(String[] args) {
		HttpRequest start = new HttpRequest();
		start.getJson();
	}
}

class HttpRequest
{

	protected void getJson(){
		URL url;
		BufferedReader reader = null;
		try {
			url = new URL("https://reqres.in/api/users?page=2");
			URLConnection connection = url.openConnection();
			reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
			int val = reader.read();
			char ch;
			String jsonData="";
			boolean end = true;
			boolean start = false;
			while(val!=-1 && end)
			{
				ch = (char) val;
				if(ch=='[')
					start = true;
				if(ch==']')
					end = false;
				if(start)
					jsonData +=ch;
				val = reader.read();
			}
			System.out.println(jsonData);
			mapToPojo(jsonData);

		} catch (MalformedURLException e) {
			System.out.println("Not reached");
		}
		catch (UnknownHostException e) {
			System.out.println("Can't reach network");
		}
		catch (IOException e) {
			System.out.println("IO Exception");
		}
	}
	
	private void mapToPojo(String jsonText)
	{
		JSONArray jsonArr; 
		MyObject convert = null;
		try {
			String grpData = "";
			jsonArr = new JSONArray(jsonText);
			AddToJList add = new AddToJList();
			for(Object jsonObj: jsonArr)
			{
				grpData = jsonObj.toString();
				ObjectMapper mapper = new ObjectMapper();
				convert = mapper.readValue(grpData,MyObject.class);

				Object dataArr[] = {convert.getId(),convert.getEmail(),convert.getFirst_name(),
									convert.getLast_name(),convert.getAvatar()};
				add.addToJList(dataArr);
				System.out.println(convert.display());
			}
			add.displayJList();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}