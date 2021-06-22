package com.paris8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paris8.models.Recommandation;
import com.paris8.repository.RecommandationRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/recommandation")

public class RecommandationController {

	@Autowired
	private RecommandationRepository recommandationRepository;
	@PostMapping("/add")
	public Recommandation add(@RequestBody Recommandation recommandation ) {
		//System.out.println(recommandation);
		//return null;
		return recommandationRepository.save(recommandation);
	}
	@PutMapping("/update")
	public Recommandation update(@RequestBody Recommandation recommandation) {
		return recommandationRepository.save(recommandation);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		recommandationRepository.deleteById(id);
	}
	@GetMapping("/getAll")
	public List<Recommandation> getAll() {
		return recommandationRepository.findAll();
	}
	@GetMapping("/getByNom/{nom}")
	public Recommandation getByNom(@PathVariable("nom") String nom) {
		return recommandationRepository.findByNomProduit(nom);
	}
	@GetMapping("/getTopRecommandation")
	public List<Recommandation> getTopRecommandation() {
		return recommandationRepository.findTop3ByOrderByNbrSaleDesc();
	}
	@GetMapping("/getByCategorie/{categorie}")
	public List<Recommandation> getTopCategorie(@PathVariable("categorie") String categorie) {
		return recommandationRepository.findTop3ByCategorieOrderByNbrSaleDesc(categorie);
	}
}
