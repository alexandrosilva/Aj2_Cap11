
public class TesteCastUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// o objeto "c" foi declarado e instanciado como Cliente
		Cliente c = new Cliente();
		c.setCpf("1234656789");
		System.out.println(c.getCpf());
		
		// Casting UP explicito do objeto da classe Cliente para classe Pessoa
		Pessoa p = (Pessoa) c;
		c.setCpf("987654321");
		p.setNome("alexandro");
		
		System.out.println(c.getCpf());
		System.out.println(p.getNome());
		System.out.println(c.getNome());
		
		// Casting UP do objeto da classe Cliente para classe Pessoa
		Pessoa p2 = c;
		p2.setNome("Carla");
		System.out.println(p2.getNome());
		System.out.println(c.getNome());
	}
}
