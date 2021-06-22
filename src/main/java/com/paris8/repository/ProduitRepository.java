package com.paris8.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paris8.models.Produit;
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer>  {
	public  List<Produit> findByCategorie(String categorie);
}
