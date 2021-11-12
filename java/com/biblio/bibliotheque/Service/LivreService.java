package com.biblio.bibliotheque.Service;

import java.util.List;


import com.biblio.bibliotheque.entities.livre;

public interface LivreService {
	livre saveLivre(livre liv);
	livre updateLivre(livre liv);
	void deleteLivre(livre liv);
	void deleteLivreById(Long id);
	livre getLivre(Long id);
	List<livre> getAllLivres();
	public List<livre> getLivres( String rech);
	List<livre> getMyLivres(Long flag);
	List<livre> getmesLivres(String rech, Long flag);


}
