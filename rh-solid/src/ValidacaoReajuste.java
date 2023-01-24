import java.math.BigDecimal;

public interface ValidacaoReajuste {
	
	
	// Quando temos várias classes que possuem a mesma assinatura de um método,
	// Podemos extrair uma Interface para padronizar a implementação
	
	// Não precisar ter o modificador "public", toda interface já possui métodos publicos

	void validar(Funcionario funcionario, BigDecimal aumento);
}
