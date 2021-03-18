import javax.swing.JOptionPane;

public class NegaException extends Exception{

	public NegaException(){}

	public void negativo(){

		JOptionPane.showMessageDialog(null, "O resultado foi negativo", "Negativo", JOptionPane.WARNING_MESSAGE);
		
	}

}