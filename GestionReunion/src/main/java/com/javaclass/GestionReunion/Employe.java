package com.javaclass.GestionReunion;

public class Employe {
	private long idEmploye;
	private long idPoste;
	private String nom;
	private String prenom;
	private String email;
	private boolean active;
	private String mdp;
	
	public Employe(long idEmploye,long idPoste,String nom,String prenom,String email,boolean active,String mdp) {
		this.idEmploye=idEmploye;
		this.idPoste=idPoste;
		this.nom=nom;
		this.prenom=prenom;
		this.email=email;
		this.active=active;
		this.mdp=mdp;
	}
}
