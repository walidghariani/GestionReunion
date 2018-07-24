package com.GestionReunion.model;

public class ParticipantExterne {
	private long idParticipantExterne;
	private long idReunion;
	private String entreprise;
	private String nom;
	private String prenom;

	public ParticipantExterne(long idParticipantExterne, long idReunion, String entreprise, String nom, String prenom) {
		super();
		this.idParticipantExterne = idParticipantExterne;
		this.idReunion = idReunion;
		this.entreprise = entreprise;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getEntreprise() {
		return entreprise;
	}

	public long getIdParticipantExterne() {
		return idParticipantExterne;
	}

	public long getIdReunion() {
		return idReunion;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public void setIdParticipantExterne(long idParticipantExterne) {
		this.idParticipantExterne = idParticipantExterne;
	}

	public void setIdReunion(long idReunion) {
		this.idReunion = idReunion;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
