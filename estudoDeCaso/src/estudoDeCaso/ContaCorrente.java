package estudoDeCaso;

public class ContaCorrente {
	
	private int conta;
	private int agencia;
	private double saldo;
	private String nomeCliente;
	
	
		public int sacar(double valorSaque){
			
			if (this.saldo >= valorSaque){
				this.saldo = this.saldo - valorSaque;
				return 1;			
			}else{
				return 0;
			}
		}
	
		public void depositar(double valorDeposito){
			
			this.saldo += valorDeposito;
			
		}
	
		public void imprimir(){
		System.out.println("Conta: " + this.conta + ", Agência: " 
					+ this.agencia + ", Saldo: " + this.saldo + ", Cliente: " 
					+ this.nomeCliente);
		
	}
		
		public int getConta() {
			return conta;
		}

		public void setConta(int conta) {
			this.conta = conta;
		}

		public int getAgencia() {
			return agencia;
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public String getNomeCliente() {
			return nomeCliente;
		}

		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}

}
