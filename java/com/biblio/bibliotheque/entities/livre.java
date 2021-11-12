package com.biblio.bibliotheque.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class livre {
	
	     @Id
	     @GeneratedValue (strategy = GenerationType.IDENTITY )
         private Long idLivre;
         private String nomLivre;
         private String genre;
         private String Auteur;
         private String contenu;
         private String photos;
         private Long flag;
         
         @ManyToOne 
         @JoinColumn(name="utilis_idutilisateur")
         private utilisateur utilis;
         


		public livre() {
 			super();
 			// TODO Auto-generated constructor stub
 		}
         


	
		public livre(Long idLivre, String nomLivre, String genre, String auteur, String contenu, String photos,
				Long flag, utilisateur utilis) {
			super();
			this.idLivre = idLivre;
			this.nomLivre = nomLivre;
			this.genre = genre;
			Auteur = auteur;
			this.contenu = contenu;
			this.photos = photos;
			this.setFlag(flag);
			this.utilis = utilis;
		}




		public String getAuteur() {
			return Auteur;
		}
		public void setAuteur(String auteur) {
			Auteur = auteur;
		}
		public String getContenu() {
			return contenu;
		}
		public void setContenu(String contenu) {
			this.contenu = contenu;
		}
		public String getPhotos() {
			return photos;
		}
		public void setPhotos(String photos) {
			this.photos = photos;
		}
		
		public Long getIdLivre() {
			return idLivre;
		}
		public void setIdLivre(Long idLivre) {
			this.idLivre = idLivre;
		}
		public String getNomLivre() {
			return nomLivre;
		}
		public void setNomLivre(String nomLivre) {
			this.nomLivre = nomLivre;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public void setUtilis(utilisateur id) {
			this.utilis = id; }
		

		
		@Override
		public String toString() {
			return "livre [idLivre=" + idLivre + ", nomLivre=" + nomLivre + ", genre=" + genre + "]";
		}




		public Long getFlag() {
			return flag;
		}




		



		public void setFlag(Long k) {
			// TODO Auto-generated method stub
			this.flag = k;
		}





			
		
         
         
}
