package com.javaclass.GestionReunion;

public class ParticipantExterne {
	private long idParticipantExterne;
	private long idReunion;
	private String entreprise;
	private String nom;
	private String prenom;
	
	public ParticipantExterne(long idParticipantExterne,long idReunion,String entreprise,String nom,String prenom) {
		this.idParticipantExterne=idParticipantExterne;
		this.idReunion=idReunion;
		this.entreprise=entreprise;
		this.nom=nom;
		this.prenom=prenom;
		
	}
}
