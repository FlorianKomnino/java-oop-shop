package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {
		Prodotto patatineLays = new Prodotto("Patatine Lays", 2.50f, 22);
		
		
		patatineLays.setNome("Lays Potatoes");
		
		patatineLays.setDescrizione("Le patatine buonissime che sanno di olio e sale");
		System.out.println(patatineLays.getDescrizione());
		
		System.out.println("Il prezzo base e': " + patatineLays.getPrezzoBase() + " euro");
		System.out.println("Il prezzo ivato e': " + patatineLays.getPrezzoIvato() + " euro");
		System.out.println(patatineLays.getNomeEsteso());
	}
}
