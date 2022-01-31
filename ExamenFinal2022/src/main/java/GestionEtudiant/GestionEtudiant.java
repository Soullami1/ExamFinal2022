package GestionEtudiant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Etudiants.Cours;
import com.Etudiants.Etudiant;
import com.Etudiants.Examen;

public class GestionEtudiant {

	// Ajouter
	public void Ajouter(Etudiant e) {
		try {

			Connection con = db_Connection.getConnection();
			PreparedStatement stm = con.prepareStatement("insert into etudiant values (?,?,?,?,?)");
			stm.setString(1, e.getCIN());
			stm.setString(2, e.getMatricule());
			stm.setInt(3, e.getEntree());
			stm.setString(4, e.getFiliere());
			stm.setString(5, e.getNiveau());

			stm.executeUpdate();
			stm.close();
			con.close();
			System.out.println(" Etudiant Ajouté avec succés");
			
		} catch (SQLException e1) {
			System.err.println(e1.getMessage());
		}
	}

	// Supprimer
	public void Supprimer(String Matricule) {
		try {

			Connection con = db_Connection.getConnection();
			PreparedStatement stm = con.prepareStatement("delete etudiant from etudiant where matricule = ?");
			stm.setString(1, Matricule);

			stm.executeUpdate();
			stm.close();
			con.close();
			System.out.println(" Etudiant Supprimé avec succés");

		} catch (SQLException e1) {
			System.err.println(e1.getMessage());
		}
	}

	// Modifier
	public void Modifier(Etudiant e) {
		try {

			Connection con = db_Connection.getConnection();
			PreparedStatement stm = con.prepareStatement(
					"update etudiant set cin = ?,entree = ?,filiere = ?,niveau = ? where matricule = ?");
			stm.setString(1, e.getCIN());
			stm.setInt(2, e.getEntree());
			stm.setString(3, e.getFiliere());
			stm.setString(4, e.getNiveau());
			stm.setString(5, e.getMatricule());

			stm.executeUpdate();
			stm.close();
			con.close();
			System.out.println(" Etudiant Modifié avec succés");

		} catch (SQLException e1) {
			System.err.println(e1.getMessage());
		}
	}

	// Afficher
	public void Afficher() {
		try {

			Connection con = db_Connection.getConnection();
			PreparedStatement stm = con.prepareStatement("Select * from etudiant");
			ResultSet rs = stm.executeQuery();

			Etudiant e;
			System.out.format("|%-10s| %-12s| %-12s| %-20s| %-8s|\n", "Matricule", "Nom", "Prenom", "Date de naissance",
					"Niveau");
			System.out.println("........................................................................");
			while (rs.next()) {

				e = new Etudiant(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5));
				e.Afficher();
				System.out.println();
			}
			rs.close();
			stm.close();
			con.close();

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// Afficher les etudiant par niveau
	public void GetEtudiantParNiveau(String niveau) {
		try {

			Connection con = db_Connection.getConnection();
			PreparedStatement stm = con.prepareStatement("Select * from etudiant where niveau = ?");
			stm.setString(1, niveau);
			ResultSet rs = stm.executeQuery();

			Etudiant e;
			System.out.format("|%-10s| %-12s| %-12s| %-20s| %-8s|\n", "Matricule", "Nom", "Prenom", "Date de naissance",
					"Niveau");
			System.out.println("........................................................................");
			while (rs.next()) {

				e = new Etudiant(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5));
				e.Afficher();
				System.out.println();
			}
			rs.close();
			stm.close();
			con.close();

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	

}
