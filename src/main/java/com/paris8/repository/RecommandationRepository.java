package com.paris8.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paris8.models.Recommandation;
@Repository
public interface RecommandationRepository extends JpaRepository<Recommandation, Integer>{
	public Recommandation findByNomProduit(String nom);
	public List<Recommandation> findTop3ByOrderByNbrSaleDesc();
	public List<Recommandation> findTop3ByCategorieOrderByNbrSaleDesc(String categorie);


}
