package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();

		palavras.add("alura online");
		palavras.add("casa do codigo");
		palavras.add("caelum");

//		ComparadorPorTamanho comparador = new ComparadorPorTamanho();

//		Collections.sort(palavras, comparador);
//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		palavras.sort(Comparator.comparing(String::length));
		
		Function<String, Integer> funcao = new Function<String, Integer>() {
			@Override
			public Integer apply(String s) {
				return s.length();
			}
		};
		
		Comparator<String> comparador = Comparator.comparing(funcao);
		
		System.out.println(palavras);
		palavras.forEach(System.out::println);

		// Exemplo legal mostrando como implementar a interface Consumer de forma
		// integral
		// De forma como uma classe anonima
		// e com Lambdas

//		ImprimeNaLInha consumidor = new ImprimeNaLInha();

//		Consumer<String> consumidor = new Consumer<String> {
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		};

//		palavras.forEach(new Consumer<String> () {
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		});

		palavras.forEach(s -> System.out.println(s));

	}

}
