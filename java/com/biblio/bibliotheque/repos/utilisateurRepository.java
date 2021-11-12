package com.biblio.bibliotheque.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblio.bibliotheque.entities.utilisateur;

public interface utilisateurRepository extends JpaRepository<utilisateur, Long> {

}
