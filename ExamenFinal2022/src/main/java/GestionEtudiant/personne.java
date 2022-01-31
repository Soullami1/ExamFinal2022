package GestionEtudiant;

import java.sql.Date;

public class personne {
	/** Cette classe represente une personne avec ses attributs, 
	 * son constructeur, ses setters/getters et son affichage 
	 */
	
	
	private String CIN;
	private String nom;
	private String prenom;
	private Date DateNaissance;
	private String adresse;
	private String email;
	private String tel;
	
	
	
	public personne() {}
	
	/**
	 * @param cIN
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param adresse
	 * @param email
	 * @param tel
	 */
	public personne(String cIN, String nom, String prenom, Date dateNaissance, String adresse, String email,
			String tel) {
		super();
		CIN = cIN;
		this.nom = nom;
		this.prenom = prenom;
		DateNaissance = dateNaissance;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}

	public Date getDateNaissance() {
		return DateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		DateNaissance = dateNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "personne [CIN=" + CIN + ", nom=" + nom + ", prenom=" + prenom + ", DateNaissance=" + DateNaissance
				+ ", adresse=" + adresse + ", email=" + email + ", tel=" + tel + "]";
	}



}
