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
import java.lang.NumberFormatException;
import javax.swing.JOptionPane;

public class Calculadora2 implements ActionListener{

	private static JFrame jan1 = new JFrame("Calculadora");
	private static JLabel rot1 = new JLabel("Valor1 ");
	private static JLabel rot2 = new JLabel("Valor2 ");
	private static JLabel rot3 = new JLabel("Resultado ");
	private static JTextField entrada1 = new JTextField(20);
	private static JTextField entrada2 = new JTextField(20);
	private static JTextField entrada3 = new JTextField(15);
	private static JButton bt1 = new JButton("+");
	private static JButton bt4 = new JButton("-");
	private static JButton bt5 = new JButton("*");
	private static JButton bt6 = new JButton("/");
	private static JButton bt2 = new JButton("Clear");
	private static JButton bt3 = new JButton("Exit");

	private static JMenuBar barra = new JMenuBar();
	private static JMenu princ = new JMenu("Operacoes");
	private static JMenuItem it1 = new JMenuItem("+");
	private static JMenuItem it4 = new JMenuItem("-");
	private static JMenuItem it5 = new JMenuItem("*");
	private static JMenuItem it6 = new JMenuItem("/");
	private static JMenuItem it2 = new JMenuItem("Clear");
	private static JMenuItem it3 = new JMenuItem("Exit");

	private static Calculadora2 jn = new Calculadora2();

	public static void main(String args[]){

		int larg = 300, alt =250;
		jan1.setSize(larg,alt);

		jan1.setJMenuBar(barra);

		barra.add(princ);

		princ.add(it1);
		princ.add(it4);
		princ.add(it5);
		princ.add(it6);
		princ.add(it2);
		princ.add(it3);

		jan1.setDefaultCloseOperation(jan1.EXIT_ON_CLOSE);

		jan1.add(rot1);
		jan1.add(entrada1);
		jan1.add(rot2);
		jan1.add(entrada2);	
		jan1.add(rot3);
		jan1.add(entrada3);	

		jan1.add(bt1);
		jan1.add(bt4);		
		jan1.add(bt5);		
		jan1.add(bt6);		
		jan1.add(bt2);
		jan1.add(bt3);		
		bt1.addActionListener(jn);
		bt2.addActionListener(jn);
		bt3.addActionListener(jn);
		bt4.addActionListener(jn);
		bt5.addActionListener(jn);
		bt6.addActionListener(jn);

		it1.addActionListener(jn);
		it2.addActionListener(jn);
		it3.addActionListener(jn);
		it4.addActionListener(jn);
		it5.addActionListener(jn);
		it6.addActionListener(jn);

		jan1.setLayout(new FlowLayout());
		jan1.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt){
		
		if(evt.getSource().equals(bt1)||evt.getSource().equals(it1)){
			try{
				Float x = Float.parseFloat(entrada1.getText());
				Float y = Float.parseFloat(entrada2.getText());
				Float s = (x+y);
				String res = Float.toString(s);
				entrada3.setText(res);	
			}
			catch (NumberFormatException e){
       			JOptionPane.showMessageDialog(null, "Digite somente numeros", "Não numero", JOptionPane.ERROR_MESSAGE);
       			entrada1.setText("");
				entrada2.setText("");		
				entrada1.requestFocus();
   			} 	
		}
		if(evt.getSource().equals(bt4)||evt.getSource().equals(it4)){
			try{
				Float x = Float.parseFloat(entrada1.getText());
				Float y = Float.parseFloat(entrada2.getText());
				Float s = (x-y);
				String res = Float.toString(s);
				entrada3.setText(res);	
			}
			catch (NumberFormatException e){
       			JOptionPane.showMessageDialog(null, "Digite somente numeros", "Não numero", JOptionPane.ERROR_MESSAGE);
       			entrada1.setText("");
				entrada2.setText("");		
				entrada1.requestFocus();
   			} 			
		}
		if(evt.getSource().equals(bt5)||evt.getSource().equals(it5)){
			try{
				Float x = Float.parseFloat(entrada1.getText());
				Float y = Float.parseFloat(entrada2.getText());
				Float s = (x*y);
				String res = Float.toString(s);
				entrada3.setText(res);	
			}
			catch (NumberFormatException e){
       			JOptionPane.showMessageDialog(null, "Digite somente numeros", "Não numero", JOptionPane.ERROR_MESSAGE);
       			entrada1.setText("");
				entrada2.setText("");		
				entrada1.requestFocus();
   			} 			
		}
		if(evt.getSource().equals(bt6)||evt.getSource().equals(it6)){
			try{
				Float x = Float.parseFloat(entrada1.getText());
				Float y = Float.parseFloat(entrada2.getText());
				Float s = (x/y);
				String res = Float.toString(s);
				entrada3.setText(res);	
			}
			catch (NumberFormatException e){
       			JOptionPane.showMessageDialog(null, "Digite somente numeros", "Não numero", JOptionPane.ERROR_MESSAGE);
       			entrada1.setText("");
				entrada2.setText("");		
				entrada1.requestFocus();
   			} 			
		}
		if(evt.getSource().equals(bt2)||evt.getSource().equals(it2)){
			entrada1.setText("");
			entrada2.setText("");		
			entrada1.requestFocus();	
		}
		if(evt.getSource().equals(bt3)||evt.getSource().equals(it3)){
			System.exit(0);
		}

	}

	//Não consegui fazer o NegaException funcionar corretamente
	public void re(float res) throws NegaException{
		entrada3.setText(Float.toString(res));
		if(res < 0){
			throw new NegaException();
		}

	}

	public void divisao() throws ArithmeticException{
		Float x = Float.parseFloat(entrada1.getText());
		Float y = Float.parseFloat(entrada2.getText());
		if(y!=0){
			Float s = (x/y);
			String res = Float.toString(s);
			entrada3.setText(res);
		}
		else{
			throw new ArithmeticException();
		}
	}
}

