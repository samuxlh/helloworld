import java.util.ArrayList; // import the ArrayList class
import java.io.FileWriter;

public class MyClass {
  public static void main(String[] args) {

    ArrayList<Pessoa> cars = new ArrayList<Pessoa>();
	Pessoa p1 = new Pessoa();
	BDSist bds = new BDSist();
	Leitura l = new Leitura();

	p1.setId(Integer.parseInt(l.inData("Entre com o codigo da 1 pessoa: ")));
	p1.setNome(l.inData("Entre com o nome da 1 pessoa"));
	bds.setBDPes(p1);
	cars = bds.getBDPes();

	Path out = Paths.get("output.txt");
	List<String> arrayList = new ArrayList<> ( Arrays.asList ( "a" , "b" , "c" ) );
	Files.write(out,arrayList,Charset.defaultCharset());

    System.out.println(cars);
  }
}