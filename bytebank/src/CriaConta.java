
public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 50;
		
		System.out.println("A Segunda conta possui saldo: " + segundaConta.saldo);
		System.out.println("A Primeira conta possui saldo: " + primeiraConta.saldo);

		
		// Quando instanciamos um objeto e nao atribuimos valor aos atributos
		// o java coloca um valor default
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.titular);

	}

}
