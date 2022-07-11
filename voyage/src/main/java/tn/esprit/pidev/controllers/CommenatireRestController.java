package tn.esprit.pidev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.pidev.entities.Commentaire;
import tn.esprit.pidev.services.ICommentaireService;
@RequestMapping("/commentaire")
@RestController

public class CommenatireRestController {

	
	@Autowired
	ICommentaireService commentaireService;

	@PostMapping("/addCommentaire")
	@ResponseBody
	public Commentaire addCommentaire(@RequestBody Commentaire commentaire) {
		commentaireService.AjouterCommentaire(commentaire);
		return commentaire;
	}

	@PutMapping("/modifierCommentaire")
	@ResponseBody
	public Commentaire updateCommentaire(@RequestBody Commentaire commentaire) {
		commentaireService.ModifierCommentaire(commentaire);
		return commentaire;
	}
	

	@DeleteMapping("/supprimerCommentaire/{IdCommentaire}")
	@ResponseBody
	public void deleteCommentaire(@PathVariable("idcom") Long idcom) {
		commentaireService.SupprimerCommentaire(idcom);
	}
	
	
}
