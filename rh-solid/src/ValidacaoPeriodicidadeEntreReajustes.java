import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {

	public void validar(Funcionario funcionario, BigDecimal aumento) {
		
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		
		LocalDate dataAtual = LocalDate.now();
		
		long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		
		if(mesesDesdeUltimoReajuste < 6) {
			throw new ValidacaoException("Entervalo entre reajustes deve ser maior que 6 meses.");
		}
	}
}
