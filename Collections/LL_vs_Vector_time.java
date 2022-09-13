package Collection;

import java.util.LinkedList;
import java.util.Vector;

public class LL_vs_Vector_time {

	public static void main(String[] args) {
		
		
		long t1=System.currentTimeMillis();
		System.out.println(t1);
		Vector<Integer> checkTimeV = new Vector<>();
		long i=0;
		while(i<100000)
		{
			checkTimeV.add(1);
			i++;
		}
		long t2=System.currentTimeMillis();
		System.out.println(t2);
		
		
		t1=System.currentTimeMillis();
		System.out.println(t1);
		LinkedList<Integer> checkTimeLL = new LinkedList<>();
		i=0;
		while(i<100000)
		{
			checkTimeLL.add(1);
			i++;
		}
		t2=System.currentTimeMillis();
		System.out.println(t2);
	}

}
//output : 
//	1662969261241
//	1662969261254
//	1662969261254
//	1662969261260
