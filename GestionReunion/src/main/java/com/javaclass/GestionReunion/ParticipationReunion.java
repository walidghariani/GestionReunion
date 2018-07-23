package com.javaclass.GestionReunion;

public class ParticipationReunion {	
		private long idParticipationR;
		private long idReunion;
		private long idEmploye;
		private boolean adminR;
		private boolean supprimerParticipantR;
		private boolean ajouterParticipantR;
		private boolean modifierParticipantR;
		
		public ParticipationReunion(long idParticipationR,long idReunion,long idEmploye,boolean adminR,boolean supprimerParticipantR,boolean ajouterParticipantR,boolean modifierParticipantR) {
			this.idParticipationR=idParticipationR;
			this.idReunion=idReunion;
			this.idEmploye=idEmploye;
			this.adminR=adminR;
			this.supprimerParticipantR=supprimerParticipantR;
			this.ajouterParticipantR=ajouterParticipantR;
			this.modifierParticipantR=modifierParticipantR;
		}
}
