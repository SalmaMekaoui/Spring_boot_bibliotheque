package com.biblio.bibliotheque.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblio.bibliotheque.entities.livre;
import com.biblio.bibliotheque.repos.livreRepository;

@Service
public class LivreServiceImpl implements LivreService{

	@Autowired
	livreRepository LivreRepository;
	
	@Override
	public livre saveLivre(livre liv) {
		return LivreRepository.save(liv);
	}

	@Override
	public livre updateLivre(livre liv) {
		return LivreRepository.save(liv);
	}

	@Override
	public void deleteLivre(livre liv) {
	  LivreRepository.delete(liv);
		
	}

	@Override
	public void deleteLivreById(Long id) {
		LivreRepository.deleteById(id);
		
	}

	@Override
	public livre getLivre(Long id) {
		return LivreRepository.findById(id).get();
	}


	@Override
	public List<livre> getAllLivres() {
		return LivreRepository.findAll();
	}
	

	@Override
	public List<livre> getMyLivres(Long flag) {
		return LivreRepository.findByFlag(flag);
	}
	
	

	@Override
	public List<livre> getLivres(String rech) {
		List<livre> k = getAllLivres();
		List<livre> R = new ArrayList<>();
		for(livre l:k)
		{	
			if(l.getAuteur().equals(rech) || l.getNomLivre().equals(rech))
			{
				R.add(l);
			}
		}
		
		return R;
	}
	
	@Override
	public List<livre> getmesLivres(String rech, Long flag) {
		List<livre> k = getMyLivres(flag);
		List<livre> R = new ArrayList<>();
		for(livre l:k)
		{	
			if(l.getAuteur().equals(rech) || l.getNomLivre().equals(rech))
			{
				R.add(l);
			}
		}
		
		return R;
	}

	


}
