package com.paris8.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Panier implements Serializable{
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int idPanier;
	private int quantite;
	@ManyToMany
	private List<Produit> produits;
	@ManyToMany
	private List<User> user;
	private String acheter;
	
	public Panier() {
		
	}
	
	public Panier(int idPanier, int quantite, List<Produit> produits, List<User> user, String acheter) {
		super();
		this.idPanier = idPanier;
		this.quantite = quantite;
		this.produits = produits;
		this.user = user;
		this.acheter = acheter;
	}

	public int getIdPanier() {
		return idPanier;
	}
	public void setIdPanier(int idPanier) {
		this.idPanier = idPanier;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public String getAcheter() {
		return acheter;
	}

	public void setAcheter(String acheter) {
		this.acheter = acheter;
	}

	@Override
	public String toString() {
		return "Panier [idPanier=" + idPanier + ", quantite=" + quantite + ", produits=" + produits + ", user=" + user
				+ ", acheter=" + acheter + "]";
	}
	

}
