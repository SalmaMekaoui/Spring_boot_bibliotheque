package com.biblio.bibliotheque.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class utilisateur {

	 @Id
     @GeneratedValue (strategy = GenerationType.IDENTITY )
     private Long idutilisateur;
	 private String nom;
	 private String prenom;
	 private String login;
	 private String password;
	 private String email;
	 
	 @OneToMany (mappedBy = "utilis")
     private List<livre> livres;
	 
	 
	@Override
	public String toString() {
		return "utilisateur []";
	}

	public utilisateur(Long idutilisateur, String nom, String prenom, String login, String password, String email) {
		super();
		this.idutilisateur = idutilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public utilisateur() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdutilisateur() {
		return idutilisateur;
	}

	public void setIdutilisateur(Long idutilisateur) {
		this.idutilisateur = idutilisateur;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	 
	 
}
