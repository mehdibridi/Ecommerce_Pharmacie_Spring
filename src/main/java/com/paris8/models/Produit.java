
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

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Produit implements Serializable{
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int idProduit;
	private String nomProduit;
    private float prix;
    private int quantite;
    private String photo;
	private String 	categorie;
	private String 	description;
	@JsonIgnore
	@ManyToMany(mappedBy = "produits", cascade= {CascadeType.PERSIST, CascadeType.REMOVE}, fetch=FetchType.EAGER)
    private List<Panier> paniers;
	
	public Produit() {
		
	}
	

	public Produit(int idProduit, String nomProduit, float prix, int quantite, String photo, String categorie,
			String description, List<Panier> paniers) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.quantite = quantite;
		this.photo = photo;
		this.categorie = categorie;
		this.description = description;
		this.paniers = paniers;
	}

	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public List<Panier> getPaniers() {
		return paniers;
	}
	public void setPaniers(List<Panier> paniers) {
		this.paniers = paniers;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prix=" + prix + ", quantite="
				+ quantite + ", photo=" + photo + ", categorie=" + categorie + ", description=" + description
				+ ", paniers=" + paniers + "]";
	}
	
	

}
