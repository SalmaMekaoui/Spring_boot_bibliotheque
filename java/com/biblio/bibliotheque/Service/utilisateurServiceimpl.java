package com.biblio.bibliotheque.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblio.bibliotheque.entities.livre;
import com.biblio.bibliotheque.entities.utilisateur;
import com.biblio.bibliotheque.repos.utilisateurRepository;

@Service
public class utilisateurServiceimpl implements UtilisateurService {

	@Autowired
	private utilisateurRepository utilisateurRepository;
	
	
	@Override
	public List<utilisateur> getAllusers() {
		return utilisateurRepository.findAll();
	}
	
	@Override
	public utilisateur saveutilisateur(utilisateur util) {
		return utilisateurRepository.save(util);
	}
	

	@Override
	public utilisateur getuser(String login, String password) {
		List<utilisateur> k = getAllusers();
		utilisateur R = new utilisateur();
		for(utilisateur l:k)
		{
			
			if(l.getLogin().equals(login) && l.getPassword().equals(password))
			{
				R = l;break;
			}
			else
			{
				R=null;
			}
		}
		return R;
	}

	@Override
	public Long getuserID(utilisateur utilisateur) {
		utilisateur u = getuser(utilisateur.getLogin(), utilisateur.getPassword());
		return u.getIdutilisateur();
	}
}
