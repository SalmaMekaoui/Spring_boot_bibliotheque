package com.biblio.bibliotheque.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblio.bibliotheque.entities.livre;

public interface livreRepository extends JpaRepository<livre, Long> {

	

	List<livre> findByFlag(Long flag);


}
