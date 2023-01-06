package entities;

public class Conta {
	
	private String nome;
	private double saldo;
	private int numeroConta;
	
	public Conta(int numeroConta, String nome, double depositoInicial) {

		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(depositoInicial);
	}
	
	
	public Conta(String nome, int numeroConta) {

		this.numeroConta = numeroConta;
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double deposito(double deposito) {
		return saldo += deposito;
	}
	
	public double saque(double saque) {
		return saldo = saldo - saque - 5;
	}
	
	public String toString() {
		return "Account: "+ getNumeroConta()+ ", Holder: "+ getNome() + ", Balance: $ "+ String.format("%.2f", getSaldo());
	}
	
	
	
	
	
}
