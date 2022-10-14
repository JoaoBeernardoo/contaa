package contaa;

public class app {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setDeposita(200);
		System.out.println("Seu saldo e: "+conta.getSaldo());
		conta.setatualiza(10);
		System.out.println("Atualizado fica: "+conta.getSaldo());
		
	}

}
