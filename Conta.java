package contaa;

public  class Conta {
	protected double saldo;
	
	
	
	
	
	public void setDeposita(double valor) {
		this.saldo += valor;
		
	}
	
	void setSaca(double valor) {
		this.saldo -= valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	void setatualiza(double taxa) {
		this.saldo = this.saldo *taxa;
	}
	
	
	
public static class ContaCorrente extends Conta{//classes filhas da conta
		 
		public void setatualiza(double taxa) {
			this.saldo = this.saldo *taxa*2;
		}
		
		
	public void  setDeposita(double valor) {
				this.saldo += valor-0.10;
			}
		}
	
	
	
public static class ContaPoupanca extends Conta{//classesfilhas da conta
	//podem acessar os getters e setters das conta e atributos
	
		public void setatualiza(double taxa) {
			this.saldo = this.saldo *taxa*3;
		}
			
	}
	
	
	
	

public static void main(String[] args) {
		
		
	}

}
