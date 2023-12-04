package org.java.spring.pojo;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class Pizza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 50)
	@Length(min = 1, max = 50, message = "Questo campo deve contenere minimo 1 e massimo 50 caratteri")
	@NotBlank(message = "Il nome della pizza non può essere vuoto")
	private String nome;
	
	@Column(columnDefinition = "TEXT")
	@Length(min = 10, message = "Questo campo deve contenere minimo 10 caratteri")
	@NotBlank(message = "La descrizione della pizza non può essere vuota")
	private String descrizione;
	
	@URL(protocol = "https")
	@NotBlank(message = "URL della pizza non può essere vuoto")
	private String url_foto;
    
	@Positive(message="Il prezzo deve essere maggiore di zero e non può essere negativo")
    private double prezzo;
    
    public Pizza() { }
    
    public Pizza(String nome, String descrizione, String url_foto, double prezzo) {
    	
    	setNome(nome);
    	setDescrizione(descrizione);
    	setUrl_foto(url_foto);
    	setPrezzo(prezzo);
    	
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getUrl_foto() {
		return url_foto;
	}

	public void setUrl_foto(String url_foto) {
		this.url_foto = url_foto;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
	@Override
	public String toString() {
		
		return "[" + getId() + "] " + getNome() + " - " 
				+ getDescrizione() + " - " + getUrl_foto() + " - " + getPrezzo() +  "\n";
	}
}
