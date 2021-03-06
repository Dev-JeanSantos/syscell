package com.fourtk.systemcell.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_church")
public class Church implements Serializable{
	
	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String cnpj;
	private String address;
	private Integer number;
	private String complement;
	private String city;
	private String state;
	private String telFixo;
	private String telCelular;
	private Instant dateRegister;
	private Instant dateFundation;
	private String imgUrl;
	
	@OneToMany(mappedBy = "church")
	private List<Cell> cells = new ArrayList<>();
	
	@OneToMany(mappedBy = "church")
	private List<User> users = new ArrayList<>();
	
	
	public Church() {
		// TODO Auto-generated constructor stub
	}	
	
	public Church(Long id, String name, String email, String cnpj, String address, Integer number, String complement,
			String city, String state, String telFixo, String telCelular, Instant dateRegister, Instant dateFundation,
			String imgUrl) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.cnpj = cnpj;
		this.address = address;
		this.number = number;
		this.complement = complement;
		this.city = city;
		this.state = state;
		this.telFixo = telFixo;
		this.telCelular = telCelular;
		this.dateRegister = dateRegister;
		this.dateFundation = dateFundation;
		this.imgUrl = imgUrl;
	}	
	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTelFixo() {
		return telFixo;
	}

	public void setTelFixo(String telFixo) {
		this.telFixo = telFixo;
	}

	public String getTelCelular() {
		return telCelular;
	}

	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
		
	public Instant getDateRegister() {
		return dateRegister;
	}

	public void setDateRegister(Instant dateRegister) {
		this.dateRegister = dateRegister;
	}

	public Instant getDateFundation() {
		return dateFundation;
	}

	public void setDateFundation(Instant dateFundation) {
		this.dateFundation = dateFundation;
	}

	public List<Cell> getCells() {
		return cells;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Church other = (Church) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
	
}
