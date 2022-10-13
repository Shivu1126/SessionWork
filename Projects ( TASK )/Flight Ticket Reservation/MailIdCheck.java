package flightTicketReservation;

public class MailIdCheck 
{
	protected boolean checkValidEmail(String mailId)
	{
		if(mailId.length()<11)
			return false;
		
		String valid = "@gmail.com";
		int count=0;
		for(int i=valid.length()-1;i>=0;i--)
		{
			if(valid.charAt(i)==mailId.charAt(i))
				count++;
		}
		if(count==valid.length())
			return true;
		else
			return false;
	}
}
