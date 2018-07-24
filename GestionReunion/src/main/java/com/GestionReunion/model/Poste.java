package com.GestionReunion.model;

public class Poste {
	private long idPoste;
	private String nom;

	public Poste(long idPoste, String nom) {
		super();
		this.idPoste = idPoste;
		this.nom = nom;
	}

	public long getIdPoste() {
		return idPoste;
	}

	public String getNom() {
		return nom;
	}

	public void setIdPoste(long idPoste) {
		this.idPoste = idPoste;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
