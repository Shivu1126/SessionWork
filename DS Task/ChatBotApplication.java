package chatBot;

import java.util.Scanner;
import java.util.Stack;

public class ChatBotApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatBot start = new ChatBot();
		start.mobiles();
	}

}
class ChatBot
{
	private Stack<String> backStack = new Stack<>();
	private Scanner scanner = new Scanner(System.in);
	protected void mobiles() {
		while(true)
		{
			System.out.println("1.Mobile");		
			System.out.println("2.Stop");
			String option = scanner.next();
			if(option.equals("1"))
			{
				backStack.add("mobileDet");
				mobileDet();
			}
			else
			{
				System.out.println("Thanks");
				System.exit(0);
			}
		}
	}
	private void mobileDet()
	{
		System.out.println("1.Samsung");
		System.out.println("2.Apple");
		System.out.println("3.OnePlus");
		System.out.println("4.Vivo");
		System.out.println("5.Back");
		String option = scanner.next();
		int repeat=0;
		switch(option)
		{
		case "1":
			backStack.add("Samsung");
			mobileModels("Samsung","Galaxy A04s","Flip4","M13");
			break;
		case "2":
			backStack.add("Apple");
			mobileModels("Apple","iPhone 14 pro","iPhone 13","iPhone SE");
			break;
		case "3":
			backStack.add("OnePlus");
			mobileModels("OnePlus","Nord 2T","CE 2","1+ 6");
			break;
		case "4":
			backStack.add("Vivo");
			mobileModels("Vivo","25 pro","9T","Neo 6");
			break;
		case "5":
			backStack.pop();
			backTo();
			break;
		default:
			System.out.println("Enter valid input");
			break;
		}
	}
	private void mobileModels(String mobileName,String model1,String model2,String model3)
	{
		System.out.println("1. "+model1);
		System.out.println("2. "+model2);
		System.out.println("3. "+model3);
		System.out.println("4. Back");
		String opt = scanner.next();
		if(opt.equals("4"))
		{
			//backStack.pop();
			backTo();
		}
		if(mobileName.equals("Samsung"))
		{
			switch(opt)
			{
				case "1":
					backStack.add(model1);
					modelDetails(30000,2021,"256GB","Gold",model1);
					break;
				case "2":
					backStack.add(model2);
					modelDetails(32200,2022,"128GB","Neon",model2);
					break;
				case "3":
					backStack.add(model3);
					modelDetails(18000,2021,"64GB","Gold",model3);
					break;
				default:
					System.out.println("Enter proper input");
					mobileModels(mobileName,model1,model2,model3);
			}
		}
		else if(mobileName.equals("Apple"))
		{
			switch(opt)
			{
				case "1":
					backStack.add(model1);
					modelDetails(67000,2022,"256GB","LightBlue",model1);
					break;
				case "2":
					backStack.add(model2);
					modelDetails(54500,2021,"128GB","Black",model2);
					break;
				case "3":
					backStack.add(model3);
					modelDetails(41000,2020,"128GB","Gold",model3);
					break;
				default:
					System.out.println("Enter proper input");
					mobileModels(mobileName,model1,model2,model3);
			}
		}
		else if(mobileName.equals("Vivo"))
		{
			switch(opt)
			{
				case "1":
					backStack.add(model1);
					modelDetails(32000,2022,"518GB","LightBlue",model1);
					break;
				case "2":
					backStack.add(model2);
					modelDetails(24500,2021,"128GB","White",model2);
					break;
				case "3":
					backStack.add(model3);
					modelDetails(21000,2022,"128GB","Gold",model3);
					break;
				default:
					System.out.println("Enter proper input");
					mobileModels(mobileName,model1,model2,model3);
			}
		}
		else if(mobileName.equals("OnePlus"))
		{
			switch(opt)
			{
				case "1":
					backStack.add(model1);
					modelDetails(69900,2022,"512GB","Gray",model1);
					break;
				case "2":
					backStack.add(model2);
					modelDetails(52500,2022,"254GB","SkyBlue",model2);
					break;
				case "3":
					backStack.add(model3);
					modelDetails(36000,2019,"128GB","LightPink",model3);
					break;
				default:
					System.out.println("Enter proper input");
					mobileModels(mobileName,model1,model2,model3);
			}
		}
		
	}
	public void modelDetails(int price, int year, String rom, String colour, String model)
	{
		System.out.println("Price - "+price);
		System.out.println("Updated year - "+year);
		System.out.println("ROM - "+rom);
		System.out.println("Coloue - "+colour);
		System.out.println("Back(press 'b')");
		String opt = scanner.next();
		if(opt.equals("b"))
		{
			backTo();
		}
	}
	private void backTo() {
		if(backStack.isEmpty())
		{
			System.out.println("Empty");
			mobiles();
		}
		System.out.println(backStack);
		if(!backStack.isEmpty())
			backStack.pop();
		if(backStack.isEmpty())
		{
			return;
		}
		String back=backStack.peek();
		switch (back) 
		{
		case "mobileDet":
			mobileDet();
			break;
		case "Samsung":
			mobileModels("Samsung","Galaxy A04s","Flip4","M13");
			break;
		case "Apple":
			mobileModels("Apple","iPhone 14 pro","iPhone 13","iPhone SE");
			break;
		case "OnePlus":
			mobileModels("OnePlus","Nord 2T","CE 2","1+ 6");
			break;
		case "Vivo":
			mobileModels("Vivo","25 pro","9T","Neo 6");
			break;
		default:
			break;
		}
	}
}