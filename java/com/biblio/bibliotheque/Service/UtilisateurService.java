package com.biblio.bibliotheque.Service;

import java.util.List;


import com.biblio.bibliotheque.entities.utilisateur;

public interface UtilisateurService {

	public List<utilisateur> getAllusers();
	public utilisateur getuser( String login,String password);
	public Long getuserID(utilisateur utilisateur);
	public utilisateur saveutilisateur(utilisateur utilisateur);
}
