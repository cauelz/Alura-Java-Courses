import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumeroPositivos() {
		Calculadora calc = new Calculadora();
		
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(10, soma);
	}

}
