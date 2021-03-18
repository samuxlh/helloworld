import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.lang.ArithmeticException;

public class Calculadora implements ActionListener{

	private static JFrame jan = new JFrame("Calculadora");
	private static JLabel en1 = new JLabel("Numero 1: ");
	private static JLabel en2 = new JLabel("Numero 2: ");
	private static JLabel en3 = new JLabel("Resultado: ");
	private static JTextField num1 = new JTextField(5);
	private static JTextField num2 = new JTextField(5);
	private static JTextField num3 = new JTextField(5);
	private static JButton bt1 = new JButton("Calcular");
	private static JButton bt2 = new JButton("Limpar");
	private static JButton bt3 = new JButton("Sair");

	private static JMenuBar mb = new JMenuBar();
	private static JMenu menu = new JMenu("Histórico");
	private static JMenuItem item = new JMenuItem("Item1");

	private static Calculadora calc = new Calculadora();

	public static void main(String args[]){

		int larg = 500, alt = 300;
		jan.setSize(larg,alt);

		menu.add(item);
		mb.add(menu);
		jan.setJMenuBar(mb);

		jan.setDefaultCloseOperation(jan.EXIT_ON_CLOSE); // fecha o aplicativo clicando no "x"

		jan.add(en1);
		jan.add(num1);
		jan.add(en2);
		jan.add(num2);
		jan.add(en3);

		jan.add(bt1);
		jan.add(bt2);
		jan.add(bt3);

		bt1.addActionListener(calc);
		bt2.addActionListener(calc);
		bt3.addActionListener(calc);
		item.addActionListener(calc);

		jan.setLayout(new FlowLayout());
		jan.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource().equals(bt1)){
			try{
				soma();
			}
			catch(ValException ve){
				ve.impMsg();
			}
		}
	}

	public void soma() throws ValException{
		int x = Integer.parseInt(en1.getText());
		int y = Integer.parseInt(en2.getText());
		int s = x + y;
		String res = Integer.toString(s);
		num3.setText(res);

		if(s>100000){
			throw new ValException();
		}
	}
}