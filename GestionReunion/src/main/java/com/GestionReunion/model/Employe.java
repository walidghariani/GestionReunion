package com.GestionReunion.model;

public class Employe {
	private long idEmploye;
	private long idPoste;
	private String nom;
	private String prenom;
	private String email;
	private boolean active;
	private String mdp;

	public Employe(long idEmploye, long idPoste, String nom, String prenom, String email, boolean active, String mdp) {
		super();
		this.idEmploye = idEmploye;
		this.idPoste = idPoste;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.active = active;
		this.mdp = mdp;
	}

	public String getEmail() {
		return email;
	}

	public long getIdEmploye() {
		return idEmploye;
	}

	public long getIdPoste() {
		return idPoste;
	}

	public String getMdp() {
		return mdp;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIdEmploye(long idEmploye) {
		this.idEmploye = idEmploye;
	}

	public void setIdPoste(long idPoste) {
		this.idPoste = idPoste;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
