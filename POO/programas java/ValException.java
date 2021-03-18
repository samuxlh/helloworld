import javax.swing.JOptionPane;

public class ValException extends Exception{

	public void impMsg(){
		JOptionPane.showMessageDialog(null, "A soma excedeu 10", "Valor Grande", JOptionPane.ERROR_MESSAGE);
	}
}