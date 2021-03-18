import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Calc implements ActionListener{


	private JLabel rot1 = new JLabel();
	private JTextField entrada1 = new JTextField(20);
	private JLabel rot2 = new JLabel();
	private JTextField entrada2 = new JTextField(20);
	private JLabel rot3 = new JLabel();
	private JTextField entrada3 = new JTextField(20);

	private JFrame jan = new JFrame();

	private JButton bt1 = new JButton("ok");
	private JButton bt2 = new JButton("ok");
	private JButton bt3 = new JButton("C");

	private JButton bt4 = new JButton("+");
	private JButton bt5 = new JButton("-");
	private JButton bt6 = new JButton("x");
	private JButton bt7 = new JButton("/");
	private JButton bt8 = new JButton("=");
	private JButton bt9 = new JButton("Exit");

	float num1 = 0;
	float num2 = 0;
	float result = 0;

	public Calc(){

		jan.setTitle("\t Calculadora");
		jan.setSize(350,180);

		rot1.setText("Valor 1");
		jan.add(rot1);
		jan.add(entrada1);
		jan.add(bt1);

		rot2.setText("Valor 2");
		jan.add(rot2);
		jan.add(entrada2);
		jan.add(bt2);

		rot3.setText("Result");
		jan.add(rot3);
		jan.add(entrada3);
		jan.add(bt3);

		jan.add(bt4);
		jan.add(bt5);
		jan.add(bt6);
		jan.add(bt7);
		jan.add(bt8);
		jan.add(bt9);

		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);
		bt7.addActionListener(this);
		bt8.addActionListener(this);
		bt9.addActionListener(this);		

		jan.setLayout(new FlowLayout()); 
		jan.setVisible(true); 

	}

	public void actionPerformed(ActionEvent ae){

		if(ae.getSource().equals(bt1)){
			num1 = (Float.parseFloat(entrada1.getText()));
			entrada2.requestFocus();
		}

		if(ae.getSource().equals(bt2)){
			num2 = (Float.parseFloat(entrada2.getText()));
			entrada1.requestFocus();
		}

		if(ae.getSource().equals(bt3)){
			entrada1.setText("");
			entrada2.setText("");
			entrada3.setText("");
			entrada1.requestFocus();
		}

		if(ae.getSource().equals(bt4)){
			entrada3.setText("");
			result = num1+num2;
		}		

		if(ae.getSource().equals(bt5)){
			entrada3.setText("");
			result = num1-num2;
		}

		if(ae.getSource().equals(bt6)){
			entrada3.setText("");
			result = num1*num2;
		}	

		if(ae.getSource().equals(bt7)){
			entrada3.setText("");
			result = num1/num2;
		}

		if(ae.getSource().equals(bt8)){
			try{
				Resultado(result);
			}
			catch(NegaException ne){
				ne.negativo();
			}
		}

		if(ae.getSource().equals(bt9)){
			System.exit(0);
		}
	}

	public void Resultado(float re) throws NegaException{
		entrada3.setText(Float.toString(re));
		if(re < 0){
			throw new NegaException();
		}

	}
 
	public static void main(String args[]){
		new Calc();
	}

}

	public void nolet() throws NumberFormatException{
		
		try{
			Float x = Float.parseFloat(entrada1.getText());
			Float y = Float.parseFloat(entrada2.getText());
		}
		catch (NumberFormatException e){
       		System.out.println("use apenas letras"); 
   		} 
	}
}