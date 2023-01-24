package java8;

import java.util.function.Consumer;

public class ImprimeNaLInha implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
		
	}


}
