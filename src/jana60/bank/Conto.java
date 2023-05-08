package jana60.bank;

import java.util.Random;

public class Conto {
	private int numeroDiConto;
	private String nomeDelProprietario;
	int saldo;
	
	Random rnd = new Random();
	
	public Conto(String name) {
		numeroDiConto = rnd.nextInt(1001);
		nomeDelProprietario = name;
		saldo = 0;
	};
	
	public int getNumeroDiConto() {
		return numeroDiConto;
	}
	public int getSaldo() {
		return saldo;
	}
	public String getNomeDelProprietario() {
		return nomeDelProprietario;
	}
	public void setNomeDelProprietario(String nomeDelProprietario) {
		this.nomeDelProprietario = nomeDelProprietario;
	}
	
	public void addMoney(float val) {
		saldo += val;
	}
	public boolean withdrawMoney(float val) {
		if (saldo - val > 0) {
			saldo -= val;
			return true;
		} else {
			return false;
		}
	}
	public void operationChoice() {
		System.out.println("Prego, digita 1, 2 o 3 per:");
		System.out.println("1 - Effettuare un versamento");
		System.out.println("2 - Effettuare un prelievo");
		System.out.println("3 - Uscire");
	}
}
