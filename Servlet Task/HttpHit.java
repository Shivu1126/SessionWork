package httpHitProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class HttpHit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpReq start = new HttpReq();
			start.getData();
	
	}
}
class HttpReq
{

	public void getData(){
		URL url;
		try {
			url = new URL("https://reqres.in/api/unknown/2");
			URLConnection connection = url.openConnection();
			BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
			System.out.println(reader.readLine());

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
}