package strings_and_dialogs;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {

	public static void main(String[] args) {

		String like = JOptionPane.showInputDialog("What do you like?");
		JOptionPane.showMessageDialog(null, like + " is awesome!");

	}

}
