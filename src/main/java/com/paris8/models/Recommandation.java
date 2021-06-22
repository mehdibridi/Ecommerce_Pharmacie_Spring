package com.paris8.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Recommandation implements Serializable{
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int idRecommandation;
	private int nbrSale;
	private String  nomProduit;
	private String categorie;
	@ManyToOne
	private Produit products;
	public Recommandation() {
		
	}
	public Recommandation(int idRecommandation, int nbrSale, String nomProduit, String categorie, Produit products) {
		super();
		this.idRecommandation = idRecommandation;
		this.nbrSale = nbrSale;
		this.nomProduit = nomProduit;
		this.categorie = categorie;
		this.products = products;
	}
	public int getIdRecommandation() {
		return idRecommandation;
	}
	public void setIdRecommandation(int idRecommandation) {
		this.idRecommandation = idRecommandation;
	}
	public int getNbrSale() {
		return nbrSale;
	}
	public void setNbrSale(int nbrSale) {
		this.nbrSale = nbrSale;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public Produit getProducts() {
		return products;
	}
	public void setProducts(Produit products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Recommandation [idRecommandation=" + idRecommandation + ", nbrSale=" + nbrSale + ", nomProduit="
				+ nomProduit + ", categorie=" + categorie + ", products=" + products + "]";
	}
	

}
