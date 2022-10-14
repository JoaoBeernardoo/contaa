package contaa;

import contaa.Conta.ContaCorrente;

import contaa.Conta.ContaPoupanca;

public class testescontas {

	public static void main(String[] args) {
		Conta c = new Conta();
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		
		c.setDeposita(200);
		cc.setDeposita(200);
		cp.setDeposita(200);
		
		
		c.setatualiza(0.1);
		cc.setatualiza(0.1);
		cp.setatualiza(0.1);
		
		System.out.println("saldo daconta "+c.getSaldo());
		System.out.println("Saldo da cc "+cc.getSaldo());
		System.out.println("Saldo da popa "+cp.getSaldo() );
		
	}

}
