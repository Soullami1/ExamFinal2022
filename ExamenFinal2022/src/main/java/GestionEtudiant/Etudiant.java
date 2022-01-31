package GestionEtudiant;

public class Etudiant extends personne{
	
	private String Matricule;
	private int entree;
	private String Filiere;
	private String Niveau;

	// Getters & Setters
	public String getMatricule() {
		return Matricule;
	}
	public void setMatricule(String matricule) {
		Matricule = matricule;
	}
	
	public String getNiveau() {
		return Niveau;
	}
	public void setNiveau(String niveau) {
		Niveau = niveau;
	}
	
	
	
	public int getEntree() {
		return entree;
	}
	public void setEntree(int entree) {
		this.entree = entree;
	}
	public String getFiliere() {
		return Filiere;
	}
	public void setFiliere(String filiere) {
		Filiere = filiere;
	}
	// Constructeur Par defaut
	public Etudiant() {
		
	}
	
	// Constructeur Parametre
	/**
	 * @param matricule
	 * @param entree
	 * @param filiere
	 * @param niveau
	 */
	public Etudiant(String matricule, int entree, String filiere, String niveau) {
		super();
		Matricule = matricule;
		this.entree = entree;
		Filiere = filiere;
		Niveau = niveau;
	}
	
	// Affichage
	public void Afficher()
	{
		System.out.format("|%-10s| %-12s| %-12s| %-20s| %-8s|",this.Matricule,this.entree,this.Filiere,this.Niveau);		
	}
	
	
}
