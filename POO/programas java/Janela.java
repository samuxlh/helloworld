import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
public class Janela implements ActionListener{
private static JFrame jan1 = new JFrame("Janelinha do Zé");
private static JLabel rtV1 = new JLabel("Val1");
private static JLabel rtV2 = new JLabel("Val2");
private static JLabel rtRes = new JLabel("Resul");
private static JTextField cxV1 = new JTextField(10);
private static JTextField cxV2 = new JTextField(10);
private static JTextField cxRes = new JTextField(10);
private static JButton btSoma = new JButton("+");
private static JButton btLimpa = new JButton("Limpar");
private static JButton btSair = new JButton("Sair");
private static Janela jn = new Janela();
public static void main(String arg[]){
jan1.setDefaultCloseOperation(jan1.EXIT_ON_CLOSE);
jan1.setSize(300,400);
jan1.add(rtV1);
jan1.add(cxV1);
jan1.add(rtV2);
jan1.add(cxV2);
jan1.add(rtRes);
jan1.add(cxRes);
jan1.add(btSoma);
jan1.add(btLimpa);
jan1.add(btSair);
btSoma.addActionListener(jn);
btLimpa.addActionListener(jn);
btSair.addActionListener(jn);
jan1.setLayout(new FlowLayout());
jan1.setVisible(true);
} // fim o método main
public void actionPerformed(ActionEvent evt){
if(evt.getSource().equals(btSoma)){
int x = Integer.parseInt(cxV1.getText());
int y = Integer.parseInt(cxV2.getText());
int r = (x+y);
String res = Integer.toString(r);
cxRes.setText(res);
}
if(evt.getSource().equals(btLimpa)){
cxV1.setText("");
cxV2.setText("");
cxRes.setText("");
cxV1.requestFocus();
}
if(evt.getSource().equals(btSair)){
jan1.dispose();
//System.exit(0);
}
}// fim o método actionPerformed
}//// fim da classe Janela