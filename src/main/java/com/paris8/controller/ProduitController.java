package com.paris8.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.paris8.repository.ProduitRepository;
import com.paris8.service.ProduitService;
import com.paris8.models.Produit;

@RestController
@CrossOrigin("*")
@RequestMapping("/produit")
public class ProduitController {

	
	@Autowired
	private ProduitRepository produitRepository;
	@Autowired
	private ProduitService produitService;
	private String fileBasePath = "D:/5eme/Théories et conception des Hypermédias:pharmacie/src/image/";

	

	@PostMapping("/add")
	public Produit add(@RequestBody Produit produit) {
		
		return produitRepository.save(produit);
	}
	@PutMapping("/update")
	public Produit update(@RequestBody Produit produit) {
		return produitRepository.save(produit);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		produitRepository.deleteById(id);
	}
	@GetMapping("/getAll")
	public List<Produit> getAll() {
		return produitRepository.findAll();
	}
	@GetMapping("/getById/{id}")
	public Optional<Produit> getById(@PathVariable("id") int id) {
		return produitRepository.findById(id);
	}
	@GetMapping("/getByCategorie/{categorie}")
	public List<Produit> getByCategorie(@PathVariable("categorie") String categorie) {
		return produitRepository.findByCategorie(categorie);
	}
	@PostMapping("/upload")
	public ResponseEntity<String> upload(@RequestParam("file") MultipartFile file) throws IOException {
		produitService.uploadFile(file, ProduitService.DOCUMENT_DIRECTORY);
		return new ResponseEntity<>("File has been uploaded && stored!", HttpStatus.OK);
	}
}
