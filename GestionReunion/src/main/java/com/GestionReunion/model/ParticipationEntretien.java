package com.GestionReunion.model;

public class ParticipationEntretien {
	private long idParticipationE;
	private long idEntretien;
	private long idEmploye;
	private boolean adminE;
	private boolean supprimerParticipantE;
	private boolean ajouterParticipantE;
	private boolean modifierParticipantE;

	public ParticipationEntretien(long idParticipationE, long idEntretien, long idEmploye, boolean adminE,
			boolean supprimerParticipantE, boolean ajouterParticipantE, boolean modifierParticipantE) {
		super();
		this.idParticipationE = idParticipationE;
		this.idEntretien = idEntretien;
		this.idEmploye = idEmploye;
		this.adminE = adminE;
		this.supprimerParticipantE = supprimerParticipantE;
		this.ajouterParticipantE = ajouterParticipantE;
		this.modifierParticipantE = modifierParticipantE;
	}

	public long getIdEmploye() {
		return idEmploye;
	}

	public long getIdEntretien() {
		return idEntretien;
	}

	public long getIdParticipationE() {
		return idParticipationE;
	}

	public boolean isAdminE() {
		return adminE;
	}

	public boolean isAjouterParticipantE() {
		return ajouterParticipantE;
	}

	public boolean isModifierParticipantE() {
		return modifierParticipantE;
	}

	public boolean isSupprimerParticipantE() {
		return supprimerParticipantE;
	}

	public void setAdminE(boolean adminE) {
		this.adminE = adminE;
	}

	public void setAjouterParticipantE(boolean ajouterParticipantE) {
		this.ajouterParticipantE = ajouterParticipantE;
	}

	public void setIdEmploye(long idEmploye) {
		this.idEmploye = idEmploye;
	}

	public void setIdEntretien(long idEntretien) {
		this.idEntretien = idEntretien;
	}

	public void setIdParticipationE(long idParticipationE) {
		this.idParticipationE = idParticipationE;
	}

	public void setModifierParticipantE(boolean modifierParticipantE) {
		this.modifierParticipantE = modifierParticipantE;
	}

	public void setSupprimerParticipantE(boolean supprimerParticipantE) {
		this.supprimerParticipantE = supprimerParticipantE;
	}

}
