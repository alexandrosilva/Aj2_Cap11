
public class TesteCastDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// o objeto "c" foi declarado e instanciado como Cliente
		Cliente c = new Cliente();
		c.setCpf("1234656789");
		System.out.println(c.getCpf());
		System.out.println("Teste");
		System.out.println(c.getCpf());
		
		// Cast UP de Cliente para Pessoa
		Pessoa p = c;
		
		// Cast Down de Pessoa para Cliente
		Cliente c2 = (Cliente) p;
	}

}
