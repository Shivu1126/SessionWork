package rajeesantask;

public class DifferentBetweenTwoDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaysCount start = new DaysCount();
		start.init();
	}
}
class DaysCount
{
	private int monthDays[] = {31,28,31,30,31,30,31,30,31,30,31,30};
	protected void init() 
	{
		int date1[]= {1,2,2000};
		int date2[]= {1,3,2000};
		
		int d1 = getDiff(date1);
		int d2 = getDiff(date2);
		
		System.out.println("Days : "+(d2-d1));
	}
	private int getDiff(int[] date) {

		int days = date[2] * 365 + date[0];
		for(int i=0;i<date[1]-1;i++)
		{
			days+=monthDays[i];
		}
		days += countLeap(date);
		return days;
	}
	private int countLeap(int[] date) {
		int year = date[2];
		if(date[1]<=2)
		{
			year--;
		}
		return year/4 - year/100 + year/400;
	}
}
//Input:	dt1 = {1, 2, 2000};
//			dt2 = {1, 2, 2004};
//Output: 	1461
//			Number of days is 365*4 + 1