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

import com.paris8.models.Panier;
import com.paris8.repository.PanierRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/panier")

public class PanierController {
	@Autowired
	private PanierRepository panierRepository;

	@PostMapping("/add")
	public Panier add(@RequestBody Panier panier) {
		//System.out.println(panier);
		//return null;
		return panierRepository.save(panier);
	}
	@PutMapping("/update")
	public Panier update(@RequestBody Panier panier) {
		return panierRepository.save(panier);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		panierRepository.deleteById(id);
	}
	@GetMapping("/getAll")
	public List<Panier> getAll() {
		return panierRepository.findAll();
	}
	@GetMapping("/getByUser/{id}")
	public List<Panier> getByUser(@PathVariable("id") int id) {
		return panierRepository.findByUserIdUser(id);
	}
	@GetMapping("/getAcheter/{id}/{sale}")
	public List<Panier> panierAcheter(@PathVariable String sale, @PathVariable int id) {
		return panierRepository.findByAcheterAndUserIdUser(sale, id);
	}
	
	@GetMapping("/getByProduitId/{id}")
	public List<Panier> getProduitId(@PathVariable("id") int id) {
		return panierRepository.findByProduitsIdProduit(id);
	}
}
