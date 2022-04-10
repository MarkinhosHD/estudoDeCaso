package estudoDeCaso;

public class BancoCc {
	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setAgencia(001);
		contaCorrente.setConta(002);
		contaCorrente.setNomeCliente("Marcos");
		contaCorrente.setSaldo(500.0);
		
		//contaCorrente.setDataCadastro();
		
		contaCorrente.depositar(250.75);
		
		int saqueRealizado = contaCorrente.sacar(600);
		
		if(saqueRealizado == 1){
			System.out.println("Saque realizado com sucesso!");
		}else{
			System.out.println("Saque não realizado, valor requerido insuficiente!");
		}
		
		
		System.out.println("Os dados da sua conta é: ");
		contaCorrente.imprimir();
		
		
		
	}


}
