
public class TestaCaracteres {

	public static void main(String[] args) {
		
		// guarda um unico caractere. E na verdade ele é um número
		char letraA = 'A';
		System.out.println(letraA);
		
		char valor = 66;
		System.out.println(valor);
		
		// não está funcionando pois quando o Java faz uma operacao com tipos diferentes
		// ele retorno o maior dos tipos.
		// neste caso estamos somando um char com um inteiro
		// assim o java vai retornar um inteiro
		//  valor = valor + 1;
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		// Strings
		
		String palavra = "Cauê está aprendendo Java!";
		System.out.println(palavra);

		// podemos concaterna strings.
		// o java inclusive força a conversao para string
		
		System.out.println(palavra + " em " + 2022 );
	}

}
