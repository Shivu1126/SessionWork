package interviewPanel;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InterviewPanelApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterviewPanel start = new InterviewPanel();
		start.init();
	}

}
class InterviewPanel
{
	private Queue<String> receptionList = new LinkedList<>();
	private Queue<String> waitingList = new LinkedList<>();
	private Scanner scanner = new Scanner(System.in);
	protected void init() {
		System.out.println("Enter reception capacity");
		int receptionCapacity = scanner.nextInt();

		while(true)
		{
			System.out.println("1. New Candidate");
			System.out.println("2. Move To Next");
			System.out.println("3. Show Reception List");
			System.out.println("4. Show Waiting List");
			System.out.println("5. End Process");
			String option = scanner.next();
			switch(option)
			{
			case "1":
				addNewCandidate(receptionCapacity);
				break;
			case "2":
				moveToNext();
				break;
			case "3":
				showRecpList();
				break;
			case "4":
				showWaitingList();
				break;
			case "5":
				System.out.println("Thank You");
				return;
			default:
				System.out.println("Enter valid input");
				break;
			}
		}
	}
	private void showWaitingList() {
		System.out.println(waitingList);
	}
	private void showRecpList() {
		System.out.println(receptionList);		
	}
	private void addNewCandidate(int receptionCapacity) {
		System.out.println("Enter candidate Name...");
		String name = scanner.next();
		if(receptionList.size()<receptionCapacity)
		{
			System.out.println("Please wait at reception");
			receptionList.add(name);
		}
		else
		{
			System.out.println("Please wait at entrance");
			waitingList.add(name);
		}
	}
	private void moveToNext() 
	{
		if(receptionList.size()==0)
		{
			System.out.println("No one is here");
			return;
		}	
		String name = receptionList.poll();
		System.out.println(name+" attending interview");
		if(waitingList.size()==0)
		{
			System.out.println("No one is here in waiting list");
			return;
		}
		String waiterName = waitingList.poll();
		receptionList.add(waiterName);
		System.out.println("("+waiterName+") Waiting candidate into the reception");
	}
}