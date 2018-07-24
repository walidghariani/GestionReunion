package com.GestionReunion.model;

public class ParticipationReunion {
	private long idParticipationR;
	private long idReunion;
	private long idEmploye;
	private boolean adminR;
	private boolean supprimerParticipantR;
	private boolean ajouterParticipantR;
	private boolean modifierParticipantR;

	public ParticipationReunion(long idParticipationR, long idReunion, long idEmploye, boolean adminR,
			boolean supprimerParticipantR, boolean ajouterParticipantR, boolean modifierParticipantR) {
		super();
		this.idParticipationR = idParticipationR;
		this.idReunion = idReunion;
		this.idEmploye = idEmploye;
		this.adminR = adminR;
		this.supprimerParticipantR = supprimerParticipantR;
		this.ajouterParticipantR = ajouterParticipantR;
		this.modifierParticipantR = modifierParticipantR;
	}

	public long getIdEmploye() {
		return idEmploye;
	}

	public long getIdParticipationR() {
		return idParticipationR;
	}

	public long getIdReunion() {
		return idReunion;
	}

	public boolean isAdminR() {
		return adminR;
	}

	public boolean isAjouterParticipantR() {
		return ajouterParticipantR;
	}

	public boolean isModifierParticipantR() {
		return modifierParticipantR;
	}

	public boolean isSupprimerParticipantR() {
		return supprimerParticipantR;
	}

	public void setAdminR(boolean adminR) {
		this.adminR = adminR;
	}

	public void setAjouterParticipantR(boolean ajouterParticipantR) {
		this.ajouterParticipantR = ajouterParticipantR;
	}

	public void setIdEmploye(long idEmploye) {
		this.idEmploye = idEmploye;
	}

	public void setIdParticipationR(long idParticipationR) {
		this.idParticipationR = idParticipationR;
	}

	public void setIdReunion(long idReunion) {
		this.idReunion = idReunion;
	}

	public void setModifierParticipantR(boolean modifierParticipantR) {
		this.modifierParticipantR = modifierParticipantR;
	}

	public void setSupprimerParticipantR(boolean supprimerParticipantR) {
		this.supprimerParticipantR = supprimerParticipantR;
	}

}
