
public class TestaEscopo {

	public static void main(String[] args) {
		
		// quando temos um bloco de codigo local
		// temos que tomar cuidado com a declaracao de uma variavel X inicializacao variavel
		
		int quantidade = 2;
		
		boolean acompanhado; // variavel declarada
			
		if(quantidade > 2) {
			acompanhado = true; // variavel inicializada
		} else {
			acompanhado = false; // variavel inicializada
		}
		
		System.out.println(acompanhado);

	}

}
