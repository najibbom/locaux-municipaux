/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet;

/**
 *
 * @author najibboubrim
 */
public class Salle {
    
    private int numSalle;
    private int reservationMatin;
    private int reservationApresMidi;
    private int reservationSoiree;
    private String date;
    private String heurReservation;
    private int prix;
    private int prixMatin;
    private int prixApresMidi;
    private int prixSoiree;
    private int horraireDemandee;
    private int userIDMatin;
    private int userIDApresMidi;
    private int userIdSoiree;
    
        public Salle(int numSalle, int reservationMatin, int reservationApresMidi, int reservationSoiree) {
		this.numSalle = numSalle;
		this.reservationMatin = reservationMatin;
		this.reservationApresMidi = reservationApresMidi;
		this.reservationSoiree = reservationSoiree;
	}

	public int getNumSalle() {
		return numSalle;
	}

	public void setNumSalle(int numSalle) {
		this.numSalle = numSalle;
	}

	public int getReservationMatin() {
		return reservationMatin;
	}

	public void setReservationMatin(int reservationMatin) {
		this.reservationMatin = reservationMatin;
	}

	public int getReservationApresMidi() {
		return reservationApresMidi;
	}

	public void setReservationApresMidi(int reservationApresMidi) {
		this.reservationApresMidi = reservationApresMidi;
	}

	public int getReservationSoiree() {
		return reservationSoiree;
	}

	public void setReservationSoiree(int reservationSoiree) {
		this.reservationSoiree = reservationSoiree;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHeurReservation() {
		return heurReservation;
	}

	public void setHeurReservation(String heurReservation) {
		this.heurReservation = heurReservation;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getPrixMatin() {
		return prixMatin;
	}

	public void setPrixMatin(int prixMatin) {
		this.prixMatin = prixMatin;
	}

	public int getPrixApresMidi() {
		return prixApresMidi;
	}

	public void setPrixApresMidi(int prixApresMidi) {
		this.prixApresMidi = prixApresMidi;
	}

	public int getPrixSoiree() {
		return prixSoiree;
	}

	public void setPrixSoiree(int prixSoiree) {
		this.prixSoiree = prixSoiree;
	}

	public int getHorraireDemandee() {
		return horraireDemandee;
	}

	public void setHorraireDemandee(int horraireDemandee) {
		this.horraireDemandee = horraireDemandee;
	}

	public int getUserIDMatin() {
		return userIDMatin;
	}

	public void setUserIDMatin(int userIDMatin) {
		this.userIDMatin = userIDMatin;
	}

	public int getUserIDApresMidi() {
		return userIDApresMidi;
	}

	public void setUserIDApresMidi(int userIDApresMidi) {
		this.userIDApresMidi = userIDApresMidi;
	}

	public int getUserIdSoiree() {
		return userIdSoiree;
	}

	public void setUserIdSoiree(int userIdSoiree) {
		this.userIdSoiree = userIdSoiree;
	}

    
    
    
}
