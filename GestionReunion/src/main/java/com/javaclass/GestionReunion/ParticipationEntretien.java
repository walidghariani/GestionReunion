package com.javaclass.GestionReunion;

public class ParticipationEntretien {
	private long idParticipationE;
	private long idEntretien;
	private long idEmploye;
	private boolean adminE;
	private boolean supprimerParticipantE;
	private boolean ajouterParticipantE;
	private boolean modifierParticipantE;
	
	public ParticipationEntretien(long idParticipationE,long idEntretien,long idEmploye,boolean adminE,boolean supprimerParticipantE,boolean ajouterParticipantE,boolean modifierParticipantE) {
		this.idParticipationE=idParticipationE;
		this.idEntretien=idEntretien;
		this.idEmploye=idEmploye;
		this.adminE=adminE;
		this.supprimerParticipantE=supprimerParticipantE;
		this.ajouterParticipantE=ajouterParticipantE;
		this.modifierParticipantE=modifierParticipantE;
	}
	
}
