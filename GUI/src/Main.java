

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Enter Your Name");
		
		JOptionPane.showMessageDialog(null,"Hello "+ name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter you age"));
		
		JOptionPane.showMessageDialog(null,"you are "+age+" year old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you height"));
		
		JOptionPane.showMessageDialog(null,"you are "+height+" cm tall");
	}

}
