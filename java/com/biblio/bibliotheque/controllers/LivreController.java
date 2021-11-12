package com.biblio.bibliotheque.controllers;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.biblio.bibliotheque.Service.LivreService;
import com.biblio.bibliotheque.Service.UtilisateurService;
import com.biblio.bibliotheque.entities.livre;
import com.biblio.bibliotheque.entities.utilisateur;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import ch.qos.logback.core.boolex.Matcher;

@Controller
public class LivreController {
	String gen;
	Long k;
	utilisateur user;
	Long Ex=(long) 31;

	
	  @Autowired
	  LivreService livreService;
	  @Autowired
	  UtilisateurService utilisateurservice;
	//  utilisateur utilisa = new utilisateur( Ex, "exemple", "exemple", "exemple", "exemple", "exemple.exemple@exemple.com");
	 // utilisateur util1 = utilisateurservice.saveutilisateur(utilisa);
	  
	
	/*  @RequestMapping("/hello")
      public String showCreate()
      {
		  return "/affichage";
      }
    */

		
	  @RequestMapping("/saveLivre")
	  public String saveLivre(@ModelAttribute("livre") livre livre, Model model	,@RequestParam Map<String,String> queryparam) throws ParseException {
		  model.addAttribute("ID",k);

		  String nomlivre = queryparam.get("nomLivre");
		  String genre = queryparam.get("genre");
		  String auteur = queryparam.get("auteur");
		  String contenu = queryparam.get("contenu");
		  String photos = queryparam.get("photos");
		  
		  String s="";
		  if(nomlivre != null && nomlivre.equals("")) 
		  {
			  s+="nom du livre ";
		  }
		  if(genre != null && genre.equals("")) 
		  {
			  s+="le genre du livre "; 
		  }
		  if(auteur != null && auteur.equals("")  ) 
		  {
			  s+="auteur du livre ";  
		  }
		  if(contenu != null && contenu.equals("")) 
		  {
			  s+="le contenu ";  
		  }
		  if(photos != null && photos.equals("")) 
		  {
			  s+="photos ";  
		  }
		  
		  if( nomlivre != null && !nomlivre.equals("") && genre != null && !genre.equals("") && auteur != null && !auteur.equals("") &&  contenu != null && !contenu.equals("") && photos != null && !photos.equals("") )
		  {
			
             livre.setFlag(k);
			 livre saveLivre = livreService.saveLivre(livre);
			 return "genre";
		  }
		  else
		  {
			  if( nomlivre != null || genre != null || auteur != null || contenu != null || photos != null  )
			  {
			   String j = "veuillez saisir "+s;
			   model.addAttribute("hello",j);
			  }
			  return "save_page"; 
		  }
		   
	  }
	  
	  
	  @RequestMapping("saveL")
	  public String saveL(@ModelAttribute("livre") livre livre, Model model	,@RequestParam Map<String,String> queryparam) throws ParseException {
		//  model.addAttribute("ID",k);

		  
		  String nomlivre = queryparam.get("nomLivre");
		  String genre = queryparam.get("genre");
		  String auteur = queryparam.get("auteur");
		  String contenu = queryparam.get("contenu");
		  String photos = queryparam.get("photos");
		 /* 
		  String s="";
		  if(nomlivre != null && nomlivre.equals("")) 
		  {
			  s+="nom du livre ";
		  }
		  if(genre != null && genre.equals("")) 
		  {
			  s+="le genre du livre "; 
		  }
		  if(auteur != null && auteur.equals("")  ) 
		  {
			  s+="auteur du livre ";  
		  }
		  if(contenu != null && contenu.equals("")) 
		  {
			  s+="le contenu ";  
		  }
		  if(photos != null && photos.equals("")) 
		  {
			  s+="photos ";  
		  }
		  
		  if( nomlivre != null && !nomlivre.equals("") && genre != null && !genre.equals("") && auteur != null && !auteur.equals("") &&  contenu != null && !contenu.equals("") && photos != null && !photos.equals("") )
		  {
			*/
			// livre.setIdLivre(id);
            // livre.setFlag(k);
		     String idli =queryparam.get("idLivre");
		     Long id= Long.parseLong(idli);
		     livre.setIdLivre(id);
			 livre saveLivre = livreService.updateLivre(livre);
			 
			 return "welcome";
		/*  }
		  else
		  {
			  if( nomlivre != null || genre != null || auteur != null || contenu != null || photos != null  )
			  {
			   String j = "veuillez saisir "+s;
			   model.addAttribute("hello",j);
			  }
			  return "save_page"; 
		  }
		  */
		   
	  }
	  
	  
	  
	
	  
	  
	  
	  
	  @RequestMapping("/inscription")
	  public String saveUser(@ModelAttribute("utilisateur") utilisateur utilisateur, Model model,@RequestParam Map<String,String> queryparam	) throws ParseException {
		  String nom = queryparam.get("nom");
		  String prenom = queryparam.get("prenom");
		  String email = queryparam.get("email");
		  String login = queryparam.get("login");
		  String password = queryparam.get("password");
		  
		  String s="";
		  if(nom != null && nom.equals("")) 
		  {
			  s+="nom ";
			  
		  }
		  if(prenom != null && prenom.equals("")) 
		  {
			  s+="prenom ";
			  
		  }
		  if(email != null && email.equals("")  ) 
		  {
			  s+="email ";
			  
		  }
		  if(login != null && login.equals("")) 
		  {
			  s+="login ";
			  
		  }
		  if(password != null && password.equals("")) 
		  {
			  s+="password ";  
		  }
		  if( nom != null && !nom.equals("") && prenom != null && !prenom.equals("") && email != null && !email.equals("") && email.matches(".+@.+\\.[a-z]+") &&    login != null && !login.equals("") && password != null && !password.equals("") )
		  {
			 utilisateur  saveuser = utilisateurservice.saveutilisateur(utilisateur); 
			 
			 return "welcome";
			 
		  }
		  else
		  {
			  if( nom != null || prenom != null || email != null || login != null || password != null  )
			  {
			   String j = "veuillez saisir "+s;
			  model.addAttribute("hello",j);
			  
			  }
			  return "inscription"; 
		  }
		 
	  }
	  
	  
	@RequestMapping("/auth")
	  public String authentification(@RequestParam Map<String,String> queryparam , Model model	) throws ParseException {
		 String login = queryparam.get("login");
		 String password = queryparam.get("psw");
		 model.addAttribute("login",login);
		 model.addAttribute("password",password);
		 utilisateur  finduser = utilisateurservice.getuser(login, password);
		 if(finduser!=null) {
			 //pour recuperer l ID de l utilisateur
			  k = utilisateurservice.getuserID(finduser); 
			  user = utilisateurservice.getuser(login,password);
			 return "welcome";
		 }else
		 {	
			 if(login != null || password !=null)
		 {
				 String s="utilisateur ou mot de passe inconnue";
			     model.addAttribute("hello",s); 
		 }
			 
			 return "login";
		 }
 
	  }
	
	  @RequestMapping("/genre")
	  public String affichergenre() throws ParseException {
		  return "genre";
	  }
	  
	  @RequestMapping("/affichage_romantiquelivre")
	  public String listeLivres(@RequestParam Map<String,String> queryparam ,Model modelMap) {
		  String rech = queryparam.get("rech");
		  if(rech !=null)
		  {
			  List<livre> livres = livreService.getLivres(rech);
			  modelMap.addAttribute("livres", livres);
		  }
		  else
		  {
			  List<livre> livres = livreService.getAllLivres();
			  modelMap.addAttribute("livres", livres);  
		  }
		  
		  return "romantiquelivre" ;
	  }
	  @RequestMapping("/affichage_action")
	  public String listeLivresaction(@RequestParam Map<String,String> queryparam ,Model modelMap) {
		  String rech = queryparam.get("rech");
		  if(rech !=null)
		  {
			  List<livre> livres = livreService.getLivres(rech);
			  modelMap.addAttribute("livres", livres);
		  }
		  else
		  {
			  List<livre> livres = livreService.getAllLivres();
			  modelMap.addAttribute("livres", livres);  
		  }
		  
		  return "action" ;
		  
	  }
	  @RequestMapping("/affichage_autobiographie")
	  public String listeLivresautobiographie(@RequestParam Map<String,String> queryparam ,Model modelMap) {
		  String rech = queryparam.get("rech");
		  if(rech !=null)
		  {
			  List<livre> livres = livreService.getLivres(rech);
			  modelMap.addAttribute("livres", livres);
		  }
		  else
		  {
			  List<livre> livres = livreService.getAllLivres();
			  modelMap.addAttribute("livres", livres);  
		  }
		  
		  return "autobiographie" ;
		  
		 
	  }
	  @RequestMapping("/affichage_biographie")
	  public String listeLivresbiographie(@RequestParam Map<String,String> queryparam ,Model modelMap) {
		 
		  String rech = queryparam.get("rech");
		  if(rech !=null)
		  {
			  List<livre> livres = livreService.getLivres(rech);
			  modelMap.addAttribute("livres", livres);
		  }
		  else
		  {
			  List<livre> livres = livreService.getAllLivres();
			  modelMap.addAttribute("livres", livres);  
		  }
		  
		  return "biographie" ;
		
	  }
	  @RequestMapping("/affichage_comedie")
	  public String listeLivrescomedie(@RequestParam Map<String,String> queryparam ,Model modelMap) {
		  String rech = queryparam.get("rech");
		  if(rech !=null)
		  {
			  List<livre> livres = livreService.getLivres(rech);
			  modelMap.addAttribute("livres", livres);
		  }
		  else
		  {
			  List<livre> livres = livreService.getAllLivres();
			  modelMap.addAttribute("livres", livres);  
		  }
		  
		  return "comedie" ;
	  }
	  @RequestMapping("/affichage_conte")
	  public String listeLivresconte(@RequestParam Map<String,String> queryparam ,Model modelMap) {
		  String rech = queryparam.get("rech");
		  if(rech !=null)
		  {
			  List<livre> livres = livreService.getLivres(rech);
			  modelMap.addAttribute("livres", livres);
		  }
		  else
		  {
			  List<livre> livres = livreService.getAllLivres();
			  modelMap.addAttribute("livres", livres);  
		  }
		  
		 
		  return "conte" ;
	  }
	  @RequestMapping("/affichage_mythe")
	  public String listeLivresmythe(@RequestParam Map<String,String> queryparam ,Model modelMap) {
		  String rech = queryparam.get("rech");
		  if(rech !=null)
		  {
			  List<livre> livres = livreService.getLivres(rech);
			  modelMap.addAttribute("livres", livres);
		  }
		  else
		  {
			  List<livre> livres = livreService.getAllLivres();
			  modelMap.addAttribute("livres", livres);  
		  }
		  
		  
		  return "mythe" ;
	  }
	  @RequestMapping("/affichage_nouvelle")
	  public String listeLivresnouvelle(@RequestParam Map<String,String> queryparam ,Model modelMap) {
		  String rech = queryparam.get("rech");
		  if(rech !=null)
		  {
			  List<livre> livres = livreService.getLivres(rech);
			  modelMap.addAttribute("livres", livres);
		  }
		  else
		  {
			  List<livre> livres = livreService.getAllLivres();
			  modelMap.addAttribute("livres", livres);  
		  }
		  
		  
		  return "nouvelle" ;
	  }
	  @RequestMapping("/affichage_poesie")
	  public String listeLivrespoesie(@RequestParam Map<String,String> queryparam ,Model modelMap) {
		  String rech = queryparam.get("rech");
		  if(rech !=null)
		  {
			  List<livre> livres = livreService.getLivres(rech);
			  modelMap.addAttribute("livres", livres);
		  }
		  else
		  {
			  List<livre> livres = livreService.getAllLivres();
			  modelMap.addAttribute("livres", livres);  
		  }
		  
		  
		  return "poesie" ;
	  }
	  
	  @RequestMapping("/monespace")
	  public String listemesLivres(@RequestParam Map<String,String> queryparam ,Model modelMap) {
		  String rech = queryparam.get("rech");
		  if(rech !=null)
		  {
			  List<livre> livres = livreService.getmesLivres(rech,k);
			  modelMap.addAttribute("livres", livres);
		  }
		  else
		  {
			  List<livre> livres = livreService.getMyLivres(k);
			  
			  modelMap.addAttribute("livres", livres);  }
		  

				  return "monEspace" ;

			  }
	  @RequestMapping("/update_Livre/{idLivre}")
	  public ModelAndView updateLivre(@PathVariable (value = "idLivre" ) long idLivre ) {
		  ModelAndView mav = new ModelAndView("update_livre");
		  livre livre = livreService.getLivre(idLivre);
		  mav.addObject("livre",livre);
		  return mav;
	  }
	  
	   
	/* 
	  @RequestMapping("/update_Livre/{idLivre}")
	  public String updateLivre(@PathVariable long idLivre ) {
		  ModelAndView mav = new ModelAndView("update_livre");
		  livre livre = livreService.getLivre(idLivre);
		  mav.addObject("livre",livre);
		  return "update_livre";
	  }*/
	 
	  @RequestMapping("/delete/{idLivre}")
	  public String delete(@PathVariable long idLivre) {
		  livre livre = livreService.getLivre(idLivre);
		  livreService.deleteLivre(livre);
		  return "mon espace";
	  }
	  
	  
	  @RequestMapping("/welcome")
	  public String welcome() {
		  return "welcome" ;
	  }
	  
	  @RequestMapping("/team")
	  public String team() {
		  return "team" ;
	  }
	  
	  
}
