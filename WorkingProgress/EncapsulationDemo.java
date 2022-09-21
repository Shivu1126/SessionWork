package JavaWorking;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	EncapsulationDemo init = new EncapsulationDemo();
			EncapsulationDemo.Details();
	}
	public static void Details()
	{
		cricketer det = new cricketer();
		System.out.println("Name : "+det.getPlayerName());	//get name
		System.out.println("Runs : "+det.getRuns());		//get runs
		
		det.setPlayerName("Shiv"); //replace name
		det.setRuns(63);	//replace runs
		
		System.out.println("Name : "+det.getPlayerName());	//get name
		System.out.println("Runs : "+det.getRuns());		//get runs
		
		
	}
	
}
class cricketer
{
	private String playerName="Virat";
	private int runs = 124;
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
}