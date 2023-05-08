package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	Random rnd = new Random();
	private int codice;
	private String nome;
	private String descrizione;
	private Float prezzo;
	private int iva;
	
	public Prodotto(String nome, float prezzo, int iva) {
		codice = rnd.nextInt(1000000);
		this.nome = nome;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	public String getCodice() {
		return String.format("%08d", codice);
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}
	public float getPrezzo() {
		return prezzo;
	}
	public void setIva(int iva) {
		this.iva= iva;
	}
	public int getIva() {
		return iva;
	}
	
	public float getPrezzoBase() {
		return getPrezzo();
	}
	public float getPrezzoIvato() {
		return getPrezzo() * (1 + (getIva() / 100f));
	}
	public String getNomeEsteso() {
		return "Il nome completo del prodotto e' :" + getCodice() + " " + nome;
	}
}
