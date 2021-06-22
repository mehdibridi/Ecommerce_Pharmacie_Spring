package com.paris8.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paris8.models.Panier;
@Repository
public interface PanierRepository extends JpaRepository<Panier, Integer>{
	public List<Panier> findByUserIdUser(int id);
	public List<Panier> findByAcheterAndUserIdUser(String sale, int id );
	public List<Panier> findByProduitsIdProduit(int id);
}
