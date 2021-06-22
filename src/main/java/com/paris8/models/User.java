package com.paris8.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int idUser;
	private String email;
	private String password;
    private String tel;
    private String userName;
    
    @JsonIgnore
    @ManyToMany(mappedBy = "user", cascade= {CascadeType.PERSIST, CascadeType.REMOVE}, fetch=FetchType.EAGER)
    private List<Panier> panier;
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int idUser, String email, String password, String tel, String userName) {
		super();
		this.idUser = idUser;
		this.email = email;
		this.password = password;
		this.tel = tel;
		this.userName = userName;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", email=" + email + ", password=" + password + ", tel=" + tel + ", userName="
				+ userName + ", panier=" + panier + "]";
	}

	


	
}
