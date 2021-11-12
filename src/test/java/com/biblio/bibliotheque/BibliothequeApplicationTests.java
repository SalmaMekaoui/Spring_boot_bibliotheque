package com.biblio.bibliotheque;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.biblio.bibliotheque.entities.livre;
import com.biblio.bibliotheque.repos.livreRepository;

@SpringBootTest
class BibliothequeApplicationTests {
	
	/*@Autowired
	private livreRepository LivreRepository;

	@Test
	public void testCreateLivre() {
		livre liv = new livre("before","romantique");
		LivreRepository.save(liv);
	}
	@Test
	public void testFindLivre() {
		livre liv = LivreRepository.findById(1L).get();
		System.out.println(liv);
	}
	
	@Test
	public void testUpdateLivre() {
		livre liv = LivreRepository.findById(1L).get();
		liv.setGenre("romance");
		LivreRepository.save(liv);
	}
	@Test
	public void testDeleteLivre() {
		
		LivreRepository.deleteById(1L);
	}
	
	@Test
	public void testListerLivre() {
		List<livre> livres = LivreRepository.findAll();
		for (livre liv:livres)
			System.out.println(liv);
			
	}
	*/

}
