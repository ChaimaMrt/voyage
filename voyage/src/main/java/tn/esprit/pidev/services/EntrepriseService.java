package tn.esprit.pidev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.pidev.entities.Entreprise;
import tn.esprit.pidev.repositories.EntrepriseRepository;

@Service
public class EntrepriseService implements IEntrepriseService {

	@Autowired
	EntrepriseRepository entrepriseRespository;
	
	@Override
	public Long ModifierEntreprise(Entreprise entreprise) {
		entrepriseRespository.save(entreprise);
		return entreprise.getIdEntreprise();
	}

	@Override
	public Long AjouterEntreprise(Entreprise entreprise) {
		entrepriseRespository.save(entreprise);
		return entreprise.getIdEntreprise();
	}

	@Override
	public void SupprimerEntreprise(Long idEntreprise) {
		entrepriseRespository.deleteById(idEntreprise);
		
	}

	@Override
	public Entreprise getEntrepriseById(Long idEntreprise) {
		return entrepriseRespository.findById(idEntreprise).orElse(null);
	}
	

}
