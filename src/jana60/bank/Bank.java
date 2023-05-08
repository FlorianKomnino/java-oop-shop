package jana60.bank;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Prego. Inserisca il suo nome per aprire un conto con la nostra banca:");
		
		String nomeUtente = sc.nextLine();
		Conto contoUtente = new Conto(nomeUtente);
		
		contoUtente.operationChoice();
		
		int opChoice = sc.nextInt();
		
		while (opChoice != 3) {
			if (opChoice == 1) {
				System.out.println("Inserisci la somma di denaro da versare nel conto:");
				float moneyToAdd = sc.nextFloat();
				contoUtente.addMoney(moneyToAdd);
				System.out.println("Il tuo nuovo saldo e' di " + contoUtente.getSaldo() + " euro");
				contoUtente.operationChoice();
				opChoice = sc.nextInt();
			} else if (opChoice == 2) {
				System.out.println("Inserisci la somma di denaro che vuoi prelevare dal conto:");
				int moneyToWithdraw = sc.nextInt();
				contoUtente.withdrawMoney(moneyToWithdraw);
				if (contoUtente.getSaldo() >= moneyToWithdraw) {
					System.out.println("Il nuovo saldo e': " + contoUtente.getSaldo());
					contoUtente.operationChoice();
					opChoice = sc.nextInt();
				} else {
					System.out.println("Siamo spiacenti, la somma da ritirare non puo' superare il tuo saldo. " + contoUtente.getSaldo());
					System.out.println("Se necessario, ripeti l'operazione!");
					contoUtente.operationChoice();
					opChoice = sc.nextInt();
				}
			}
		}
		sc.close();
	}
}
