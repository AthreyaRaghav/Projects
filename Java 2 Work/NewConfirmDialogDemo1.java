import javax.swing.JOptionPane;

public class NewConfirmDialogDemo1 {

	public static void main(String[] args) {
		int response = 
				JOptionPane.showConfirmDialog(null, "Are you sure?");
		String message;
		if (response == JOptionPane.CANCEL_OPTION)
			message = "Operation aborted";
		else if (response == JOptionPane.NO_OPTION)
			message = "Operator Chickened out";
		else if (response == JOptionPane.YES_OPTION)
			message = "All data will be deleted and the univverse will be destroyed";
		else
			message = "eh?";
		JOptionPane.showMessageDialog(null,  message);

			

	}

}
