package strings_and_dialogs;

import javax.swing.JOptionPane;

public class IKnowWhatYouDidLastSummer {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "I know that you breathed last summer, " + name + ". Muahahaha!");

	}

}
