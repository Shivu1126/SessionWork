package jsonToPojo;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class AddToJList 
{
	private JFrame f = new JFrame("USERS Data");
	private JList<Object> list;
	private JPanel p = new JPanel();
	protected void addToJList(Object[] dataArr) {
		list = new JList<Object>(dataArr);
		p.add(list);
		f.add(p);
	}
	protected void displayJList() {
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000, 1000);
		f.show();
	}
}
